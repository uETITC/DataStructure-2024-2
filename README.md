# Estructura de Datos

[![Binder](https://mybinder.org/badge_logo.svg)](https://mybinder.org/v2/gh/uETITC/DataStructure-2024-2/main?labpath=Lessons)

This course is taught in java programming language. It is part of the courses offered by [ETITC](https://etitc.edu.co/) for the systems engineering program. All courses are stored in the [uETITC](https://uetitc.github.io/) GitHub organization.

## Tabla de Contenido (ToC)


```{tableofcontents}
```

## Docker

```
docker build -t sampleapp:v1 .
docker run -p 8081:80 sampleapp:v1
```

(execuingColab)=
## Executing Notebooks in Colab


::::{important}
If you work from Google [Google Colab](https://colab.research.google.com/) **you must** execute the following code block in every notebook, at beginning. Remember that the tutorial on how to configure the environment can be found in the first tutorial: [1. Intruduction To Java](https://github.com/uETITC/ProgrammingII-2024-2/blob/main/Lessons/1.%20IntroductionToJava.md#instalando-el-kernel-de-java). There are several ways and Google Colab is one of them.

  :::{code} python
  :class: dropdown
  %%sh
  %%capture
  # Install java kernel
  wget -q https://github.com/SpencerPark/IJava/releases/download/v1.3.0/ijava-1.3.0.zip
  unzip -q ijava-1.3.0.zip
  python install.py

  # Install proxy for the java kernel
  wget -qO- https://gist.github.com/SpencerPark/e2732061ad19c1afa4a33a58cb8f18a9/archive/b6cff2bf09b6832344e576ea1e4731f0fb3df10c.tar.gz | tar xvz --strip-components=1
  python install_ipc_proxy_kernel.py --kernel=java --implementation=ipc_proxy_kernel.py
  :::
  
::::

## Objective

{cite}`ydaniel,koffman,jamest,howtojava,Horstmann,Tanenbaum,concurrency,Goodrich,Cormen`
To present strategies for analysis, design, and programming of data structure allowing students to organize, manipulate, search and insert data efficiently in an application.

## Subject Learning Results (RAC)

At the end of the course the student will be able to:

**RAC1**: Define the basic concepts of data structure.

**RAC2**: Apply the suitable data structure to solve a given problem.

## Grades


```{list-table} Exams dates and percentages per period.
:header-rows: 1
:width: 50%
:name: examsDates

* - **Period**
  - **Porcentage**
  - **Exam Date**
* - First
  - 35%
  - 13/09/2024
* - Second
  - 35%
  - 25/10/2024
* - Final
  - 30%
  - 02/12/2024
```


For all periods the grade is divided into: Co-evaluation (10 %), self-evaluation (10 %), and teacher evaluation (80 %) which is divided into exams (40 %) and assignments (40 %). The first and second periods are 35 % of the final grade, while for the last period it is 30 %. In the first and second periods the exam consists of two tests: one practical (60 %) and the other theoretical (40 %). 

```{note}
You can practice and complement the course by solving programming problems in any of the following pages:

  - [Codeabbey](https://www.codeabbey.com/)
  - [Hackerrank](https://www.hackerrank.com/)
  - [LeetCode](https://leetcode.com/)

Each problem solved, that pass all the test created for the page, can be change by points. Very simple problems are not valid.
```


## Assigments

All assignments will be stored on [GitHub](https://github.com/) but will be uploaded for grading on [Campus Virtual](https://campusvirtualpes.etitc.edu.co/Edusuperior/).


## References

### Repositories

- [Intro-to-Java-Programming](https://github.com/jsquared21/Intro-to-Java-Programming)
- [Java-Programming-for-Beginners](https://github.com/PacktPublishing/Java-Programming-for-Beginners)
- [java-programming](https://github.com/angiejones/java-programming?tab=readme-ov-file)
- [Java-Programming](https://github.com/amir0320/Java-Programming)
- [Java-Programming-8th-Edition](https://github.com/mattsblack/Java-Programming-8th-Edition)
- [Java topic Github](https://github.com/topics/java)
- [Problem Solving with Algorithms and Data Structures using Python](https://runestone.academy/ns/books/published/pythonds/index.html)
- [Data-Structures-Algorithms-Java - indraantoor - Github](https://github.com/indraantoor/Data-Structures-Algorithms-Java/tree/master/Non%20Linear%20Data%20Structures/Trees)

### Codes

- [Introduction to Java Programming and Data Structures, Comprehensive Version, 12th Edition](https://media.pearsoncmg.com/ph/esm/ecs_liang_ijp_12/cw/content/source-code.php)
  
### Books

```{bibliography}
```

:::{important}
You can find all documents in the Google Drive folder [References](https://itceduco-my.sharepoint.com/:f:/g/personal/saguileran_itc_edu_co/Eledh23Sd41CnWAnmM3jALkBNHxwDXfiZ4CcmnRTa_ST3Q?e=Z1qPlS), to get acces you must enter with the institutional email.
:::