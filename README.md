# JHotDraw Preservation Commentaries

This Git repository is a preservation of the JHotDraw framework, created originally by Erich Gamma. This framework is often used as case study in software engineering research.

This repository contains all the available versions (so far) of JHotDraw, starting from 5.1 to 7.6. There are two branches in this repository:

* `original` contains all the original files of the JHotDraw project, including distributed binaries and JavaDoc-generated documentation, in its original directory structure.
* `clean` is where you can see this README file. This branch contains only the source files, non-generated documentation, external dependencies, and sample drawing files. Binary files (.class, .jar) are removed. The directories are restructured for familiarity and consistency. Due to the removal of javadoc-generated documentation, some links in other documentation files no longer works.

Original release versions are tagged according to their version numbers, e.g., `5.1`. "Cleaned" versions are tagged with additional `-clean` in the tag names, e.g., `5.1-clean`.

## JHotDraw version 5.1 (13 September 1997)

In addition to general changes described above, the clean version of 5.1 contains the following additional changes:

* The file `Architecture Overview.ppt` were replaced by a converted [`Architecture Overview.odp`](doc/documentation/Architecture Overview.odp) since the older PPT format can no longer be opened in recent versions of Microsoft Office.
* HTML files in the [`doc/documentation/'](doc/documentation/) directory are renamed for case sensitivity in accordance to how they are linked to each other.