# fgslogs
Java Swing application for viewing FGS well data (lithologic) files

*Note: fgslogs is not related to the original FGSLOGS.EXE DOS program and is not associated in any way with the Florida Geological Survey or the Florida Department of Environmental Protection (or any other organization, for that matter).*

![ScreenShot](fgslogs_screenshot.png)

## Purpose

*fgslogs* is intended to be a replacement for the DOS-based FGSLOGS.EXE program (available for download from the Florida Department of Environmental Protection at http://www.dep.state.fl.us/geology/gisdatamaps/litholog-temp.htm and shown running in DOSBox in the image below). As noted above, there is no relationship between this program and the DOS-based version (the program filename was reused for easier search). It is coded in java so as to be able to run on most platforms (those supported by a JRE)

![ScreenShot](fgslogs_dos.png)

## Program Input

The FGS well data is located in multiple ZIP files on an FDEP website (http://publicfiles.dep.state.fl.us/FGS/WEB/lithologic/) and must be downloaded and unzipped in order to be opened by this program. Unlike the original DOS-based FGSLOGS.EXE, which required the unzipped DAT files to be located in the same directory, the files can exist in, and be accessed from, any folder on the computer for this program.

## Program Display/Output

In the initial version of this program, the output display will maintain somewhat close fidelity with the display of the DOS-based FGSLOGS.EXE program (see DOSBox image above). Future versions of this program will take some liberty and explore more advanced visualization of the data.

## Project Type

This is a NetBeans Project.

## Current State of the Program

The program is usable (the source code builds and the software runs). There are a few bugs (which are currently in the process of being documented and fixed) and there are debug statements currently peppered throughout the code (which will be cleaned up). There are design changes I plan on implementing as well.
