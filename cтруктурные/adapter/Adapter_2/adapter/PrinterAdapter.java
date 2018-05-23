package cтруктурные.adapter.Adapter_2.adapter;
import cтруктурные.adapter.Adapter_2.objects.Printer;

import java.util.List;


// адаптер, который совмещает желание клиента и возможности принтера
public class PrinterAdapter implements PageListPrinter{

    private Printer printer = new Printer();
    
    @Override
    public void print(List<String> list) {
        for (String text : list) {
            printer.print(text);            
        }
    }
 
}
