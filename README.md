# fgslogs
Java Swing application for viewing Florida Geological Survey (FGS) lithologic well logs

*Note: Development of this computer program (fgslogs) is not related to the original development of the FGSLOGS.EXE DOS program and is not associated with the Florida Geological Survey or the Florida Department of Environmental Protection.*

![ScreenShot](fgslogs_screenshot.png)

## Purpose

*fgslogs* is intended to be a modern day replacement for the DOS-based FGSLOGS.EXE program (available for download from the Florida Department of Environmental Protection at http://www.dep.state.fl.us/geology/gisdatamaps/litholog-temp.htm and shown running in DOSBox in the image below). It is coded in the Java programming language so as to be able to run on most modern platforms.

![ScreenShot](fgslogs_dos.png)

## Program Input

The FGS lithologic well log data is located in multiple ZIP files grouped by water management district on an FDEP website (http://publicfiles.dep.state.fl.us/FGS/WEB/lithologic/) and must be downloaded and unzipped in order to be opened by this program. Like the original DOS-based FGSLOGS.EXE, the DAT files should be unzipped and copied into the same directory in order to facilitate grouping and searching for the wells by county (this is the *directory* mode feature of the program); however, the files can exist separately and can be opened individually from any folder on the computer when using the *file* mode feature.

## Program Display/Output

The primary output is a Lithologic Well Log report that maintains close fidelity with the display format of the DOS-based FGSLOGS.EXE program (see DOSBox image above). The report can be printed to local or network printers configured on the computer and can be printed to PDF file (when available). The well log data can also be exported to multiple JSON files. Future versions of this program will take some liberty and explore more advanced visualization of the data.

## Project Type

This is a NetBeans Project.
