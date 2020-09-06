package com.abhai.bridge.moviePrinterExample.printers;

import com.abhai.bridge.moviePrinterExample.models.Detail;
import com.abhai.bridge.moviePrinterExample.formatters.Formatter;

import java.util.List;

public abstract class Printer {
    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    abstract protected List<Detail> getDetails();
    abstract protected String getHeader();
}
