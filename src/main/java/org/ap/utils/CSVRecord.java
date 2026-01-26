package org.ap.utils;

public class CSVRecord
{
    private String[] headers;
    private String[] fields;
    public CSVRecord(String[] headers, String row)
    {
        this.headers=headers;
        this.fields=row.split(",");
        if ( headers.length != fields.length)
        {
        throw new RuntimeException("Column mismatch");
        }
    }

    public String get(String headerName)
    {
        int i=0;
        for(;i<headers.length;i++)
        {
            if (headers[i].equalsIgnoreCase(headerName))
                return this.fields[i];
        }
        return "No such header exists";
    }
}
