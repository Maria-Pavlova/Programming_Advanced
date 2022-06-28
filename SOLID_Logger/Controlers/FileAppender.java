package SOLID_Logger.Controlers;

import SOLID_Logger.Enums.ReportLevel;
import SOLID_Logger.Interfaces.File;
import SOLID_Logger.Interfaces.Layout;

public class FileAppender extends AbstractAppender {
    private File file;

    public FileAppender(ReportLevel reportLevel,Layout layout) {
        super(reportLevel,layout);
        this.file = new LogFile();
    }

    @Override
    protected String getType() {
        return "FileAppender" ;
    }

    @Override
    public void append(String date, ReportLevel reportLevel, String message) {
        String formatted = this.getLayout().format(date, reportLevel, message);
        this.file.write(formatted);
        super.incrementAppendCount();
    }

    @Override
    public String toString() {
        return super.toString() + ", File size: " + this.file.getSize();
    }
}
