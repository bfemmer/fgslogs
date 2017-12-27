# fgslogs
Java Swing application for viewing FGS well data (lithologic) files

*Note: fgslogs is not related to the original FGSLOGS.EXE DOS program and is not associated with the Florida Geological Survey or the Florida Department of Environmental Protection (or any other organization, for that matter).*

![ScreenShot](fgslogs_screenshot.png)

## Purpose

*fgslogs* is intended to be a replacement for the DOS-based FGSLOGS.EXE program (available for download from the Florida Department of Environmental Protection at http://www.dep.state.fl.us/geology/gisdatamaps/litholog-temp.htm and shown running in DOSBox in the image below). As noted above, there is no relationship between this program and the DOS-based version. It is coded in java so as to be able to run on most platforms (those supported by a JRE)

![ScreenShot](fgslogs_dos.png)

## Program Input

The FGS lithologic well log data is located in multiple ZIP files grouped by water management district on an FDEP website (http://publicfiles.dep.state.fl.us/FGS/WEB/lithologic/) and must be downloaded and unzipped in order to be opened by this program. Like the original DOS-based FGSLOGS.EXE, the DAT files should be unzipped into the same directory in order to facilitate grouping and searching for the wells by county; however, the files can exist individually in, and be accessed from, any folder on the computer when using the *file* mode (versus *directory* mode).

## Program Display/Output

In the initial version of this program, the output display will maintain close fidelity with the display of the DOS-based FGSLOGS.EXE program (see DOSBox image above). The initial version will also have the capability to export the data as JSON files. Future versions of this program will take some liberty and explore more advanced visualization of the data.

## Project Type

This is a NetBeans Project.

## Current State of the Program

The program is usable (the source code builds and the software runs). There are a few bugs (which are currently in the process of being documented and fixed).
