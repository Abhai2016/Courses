package com.abhai.bridge.moviePrinterExample.formatters;

import com.abhai.bridge.moviePrinterExample.models.Detail;

import java.util.List;

public interface Formatter {
    public String format(String header, List<Detail> details);
}
