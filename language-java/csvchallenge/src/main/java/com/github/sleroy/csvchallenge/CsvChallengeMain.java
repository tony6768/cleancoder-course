package com.github.sleroy.csvchallenge;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import org.supercsv.cellprocessor.ParseBigDecimal;
import org.supercsv.cellprocessor.ParseEnum;
import org.supercsv.cellprocessor.ParseInt;
import org.supercsv.cellprocessor.StrReplace;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.cellprocessor.time.ParseLocalDate;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.prefs.CsvPreference;

import com.github.sleroy.csvchallenge.bean.EnumItem;
import com.github.sleroy.csvchallenge.bean.EnumRegion;
import com.github.sleroy.csvchallenge.bean.Order;

/**
 * The Class CsvChallengeMain.
 */
public class CsvChallengeMain {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		String fileName = "SampleData.csv";
		try (ICsvBeanReader beanReader = new CsvBeanReader(
				new FileReader(new java.io.File("").getAbsolutePath() + File.separator + fileName),
				CsvPreference.STANDARD_PREFERENCE)) {

			// the header elements are used to map the values to the bean (names
			// must match)
			final String[] header = beanReader.getHeader(true);
			// erase characters not java compatible (space etc...)
			for (int i = 0; i <= header.length - 1; i++) {
				header[i] = header[i].replaceAll("[^a-zA-Z0-9]+", "");
			}
			final CellProcessor[] processors = getProcessors();
			List<Order> orders = new ArrayList<>();
			Order order;
			while ((order = beanReader.read(Order.class, header, processors)) != null) {
				orders.add(order);
			}
			
			//Compute the total amount of orders (Sum of the order totals)
			BigDecimal orderTotal = orders.stream()
			      .map(o -> o.getTotal()) // stream de bigdecimal (le total)
			      .reduce(BigDecimal.ZERO,BigDecimal::add); // identity : initial value, accumulator : function add
			System.out.println("Sum of the order totals: " + orderTotal);
			
			//Compute the average amount per order
			OptionalDouble averageAmount = orders.stream()
				      .map(o -> o.getTotal()) // stream de bigdecimal (le total)
				      .mapToDouble(BigDecimal::doubleValue).average();
			System.out.println("Average amount per order: "+ averageAmount);
			
			// Compute the average amount per order per trimester
			Map<Object, Double> avgOrderTrimester = 
					orders.stream()
					.collect(Collectors.groupingBy(o -> o.getOrderDate().getYear()+"-"+(1+(o.getOrderDate().getMonthValue()-1)/3), Collectors.averagingDouble(o -> o.getTotal().doubleValue())));
			System.out.println("average amount per order per trimester: " + avgOrderTrimester);
			
//			Lists the regions and the number of orders per region;
			Map<Object, Long> regionsAndOrder = orders.stream().collect(Collectors.groupingBy(o -> o.getRegion(), Collectors.counting()));
			System.out.println("regions and the number of orders per region: " + regionsAndOrder);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Gets the processors.
	 *
	 * @return the processors
	 */
	private static CellProcessor[] getProcessors() {
		final CellProcessor[] processors = new CellProcessor[] {
				new ParseLocalDate(DateTimeFormatter.ofPattern("M/d/yy")), // OrderDate
				new ParseEnum(EnumRegion.class), // Region
				new NotNull(), // Rep
				new StrReplace(" ", "", new ParseEnum(EnumItem.class)), // Item
				new ParseInt(), // Units
				new ParseBigDecimal(), // Unit Cost
				new ParseBigDecimal(), // Total
		};
		return processors;
	}

}
