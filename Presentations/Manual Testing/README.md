# Manual Testing Notes
El proceso de prueba incluye actividades tales como planificar la prueba, analizar, diseñar, e implementar pruebas, informar el avance de los resultados de la prueba y evaluar la calidad de un testware.

- Verification: Process of evaluating steps which is followed up to development phase to determine whether they meet the specified requirements for that stage.
- Validation:  Process of evaluating product during of at the end of the development process to determine whether product meets specified requeriments.

## Objetivos Caracteristicos de la Prueba
- Evaluar productos tales como requisitos, historias de usuario, diseño y codigo
- Verificar el cumplimiento de todos los requisitos especificados
- Calidar si el objeto de prueba esta completo y funciona como los usuarios y otros implicados esperan
- Prevenir Defectos
- Encontrar fallos y defectos
- Cumplir con requisitos o normas contractuales, legales, o reglamentales, y/o verificar el cumplimiento de dichos requisitos o normas por parte del objeto de prueba.

- Prueba: La ejecucion de pruebas pueden mostrar fallos causados por defectos del software
- Depuración: Es la actividad de desarrollo que encuentra, analiza y corrige dichos defectos.

## Why Testing is important
Helping us reduce the risk of failures during the operation with this we can increase the product quality

## Aseguramiento de la Calidad y Proceso de Prueba
- Aseguramiento de la Calidad: Incluye todas las actividades que dirigen controlan una organizacion con respecto a la calidad, este se centra en el cumplimineto de procesos, cuando los procesos se llevan de forma correcta, los productos de trabajo creados son de mayor calidad, lo que contribuye a la prevencion de defectos.
- Procesos de Prueba: Estas apoyan el logro de niveles apropiados de calidad. Las actividades de prueba son parte del proceso general de desarrollo o manteniemiento  del software.

## Errores, Defectos y Fallos
- Una persona puede cometer un error, que puede llevar a la introduccion de un defecto lo cual va a producir un fallo en el sistema.
### Algunos errores pueden ser provocados por:
- Presion por falta de tiempo
- Confianza humana
- Participantes en el proyecto sin experiencia o pocos cualificados
- Falta de Comunicación
- Complejidad en el código, diseño, arquitectura
- Malentendidos acerca de las interfaces intersistemas
- Tecnologias nuevas 

## Defectos Causa Raiz y Efectos
Las causas raiz de los defectos son las acciones o condiciones mas tempranas que contribuyeron a provocar estos defectos. Se pueden analizar los defectos para identificar su causa raiz, con el proposito de reducir la ocurrencia de defectos similares. Con esto podemos conseguir mejoras en el proceso.
### Siete Principios de la Prueba
1. La prueba muestra la presencia de defectos, no su ausencia
2. La pruebas exhaustiva son imposibles
3. La prueba temprana o Desplazamiento a la izquierda ahorra tiempo y dinero
4. Los defectos se agrupan en modulos para identificar cual es el que contiene la mayoria de defectos
5. Cuidado con la paradoja del pesticida esto es crear o cambiar las pruebas y los datos de la prueba existente, y si es posible redactar nuevas pruebas. En algunos casos, como la pruebas de regresion automatizadas esta paradoja tiene un resultado beneficioso 
6. La prueba depende del contexto 
7. La ausencia de errores es una falacia

## Actividades y Tares de Prueba
Un proceso de prueba consiste en los siguientes grupos de actividades principales:

* Planificacion de la prueba 
* Monitorizacion y control de la prueba
* Analisis de la prueba
* Diseño de la prueba 
* Implementacion de la prueba
* Finalizacion de la prueba

Estas actividades pueden variar de un proyecto a otro y son compuestas por multiples tareas individuales. A menudo estas tareas son implementadas de manera interativa 

## Planificacion de la prueba
En esta se definen los objetivos y enfoque para cumplir la prueba dentro de las resticciones impuestas por el contexto de la prueba. Estos planes de prueba pueden ser revisados en funcion de la retroalimentacion de las actividades de monitorizacion y control.

## Monitorizacion y control de la prueba
La monitorizacion o seguimiento de la prueba es la comparacion continua del avance real con respecto al plan de prueba utilizando cualquier metrica de monitorizacion de la prueba definida en el plan de prueba.

## Analisis de la prueba
En esta fase se determina que debemos de probar con ello definir las condiciones de prueba asociadas y definir terminos de prueba medibles.
Algunas cosas a tomar en cuenta son:
1. Requisitos de negocio
2. Requisitos Funcionales
3. Requisitos de Sistema
4. Historia de Usuario
5. Documentos de Arquitectura de Sistema
6. La implementacion del componente o sistema en si, incluyendo codigo, metadatos de base de datos, consultas e interfaces.
7. Informes de analisis de riesgos, que pueden considerar aspectos funcionales, no funcionales y estructurales del componente o sistema.

Esta aplicacion de analisis de prueba en algunos casos produce condiciones de prueba que deben ser utilizadas como objetivos de prueba en los contratos de prueba. Los contratos de prueba son productos de trabajo caracteristicos en algunos tipos de prueba basadas en la experiencia. La identificacion de defectos durante el analisis de prueba es un beneficio potecialmente importante cuando no se utiliza ningun otro proceso de revision.

Estas actividades de analisis no solo verifican si los requisitos son consistentes, debidamente expresados y son completos, sino que tambien validan si los requisitos satisfacen adecuadamente la necesidad del cliente, usuarios, y otros implicados

## Diseño de Prueba


## Tecnicas de Diseño de Software

## Gestion de Riesgos

## Tipos de Pruebas 
### Dinamicas
### Estaticas

## Ciclo de Vida de los Defectos

## Estrategia de Prueba 
### Caracteristicas de las estrategias de prueba
### Objetivos de las estrategias de prueba

## Artefactos durante la vida de desarrollo del software

## TDD: Test Driven Development
Although TDD is a development technique, it can also be used for automation testing development

## BDD: Behavior Driven Development 
Is considered a best practice when it comes to automated testing as ait focuses on the behavior of the application and not on thinking about the implementation of the code 

# INVEST 
Is a widely accepted set of criteria, or checklist, to asssess the quality of a user story, A good user story should be:
- I: Independent  
- N: Negotiable
- V: Valuable
- E: Estimable
- S: Small
- T: Testeable

# Data Pooling 
Is a process where data sets coming from different sources are combined.
# Acronyms
- ALM: Aplication Lifecycle Management
- ATDD: Acceptance Test Driven Development
- BDD: Behavior Driven Development
- TDD: Test Driven Development 

# Keywords
- Test Analysis
- Test Execution Schedule
- Quality
- Root Cause
- Coverage
- Debugging
- Test Suite
- Test Monitoring
- Test Objective
- Testware (Test Product)
- Validation
- Verification