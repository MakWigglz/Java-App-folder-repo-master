import com.yahoofinance.histquotes.HistoricalQuote;
import com.yahoofinance.histquotes.Interval;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class StockDataJava {

    public static void main(String[] args) throws IOException {
        String[] tickers = {"AAPL", "MSFT", "AMZN"};
        LocalDate now = LocalDate.now();
        LocalDate tenYearsAgo = now.minusYears(10);
        Date from = Date.from(tenYearsAgo.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date to = Date.from(now.atStartOfDay(ZoneId.systemDefault()).toInstant());

        XYSeriesCollection dataset = new XYSeriesCollection();

        for (String ticker : tickers) {
            List<HistoricalQuote> quotes = com.yahoofinance.HistoricalQuote.getHistoricalQuotes(ticker, from, to, Interval.DAILY);
            XYSeries series = new XYSeries(ticker);
            for (HistoricalQuote quote : quotes) {
                series.add(quote.getDate().getTime(), quote.getClose());
            }
            dataset.addSeries(series);
        }

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Stock Closing Prices (Last 10 Years)",
                "Date",
                "Price (USD)",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        JFrame frame = new JFrame("Stock Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ChartPanel chartPanel = new ChartPanel(chart);
        frame.add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }
}