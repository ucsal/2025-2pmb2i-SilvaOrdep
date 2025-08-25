package br.com.mariojp.solid.isp;

public class OfficeService {
    private final Printer printer;
    public OfficeService(Printer device){ this.printer = device; }
    public void printReport(String content){
        printer.print(content);
    }
}
