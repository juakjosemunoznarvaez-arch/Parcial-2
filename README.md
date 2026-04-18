# Parcial-2
@startuml

' ===== CLASE ABSTRACTA =====
abstract class Criatura {
    - nombre: String
    - salud: int
    - fuerza: int
    + atacar(objetivo: Criatura)
    + defender(daño: int)
    + estaViva(): boolean
    + getNombre(): String
    + getSalud(): int
}

' ===== INTERFACES =====
interface Volador {
    + volar()
    + aterrizar()
}

interface Magico {
    + lanzarHechizo()
    + aprenderHechizo()
}

' ===== CLASES =====
class Dragon {
    + atacar(objetivo: Criatura)
    + defender(daño: int)
    + volar()
    + aterrizar()
}

class Mago {
    + atacar(objetivo: Criatura)
    + defender(daño: int)
    + lanzarHechizo()
    + aprenderHechizo()
}

class Guerrero {
    - arma: Arma
    + atacar(objetivo: Criatura)
    + defender(daño: int)
}

class Arma {
    - dañoAdicional: int
    + atacarConArma(objetivo: Criatura)
    + getDañoAdicional(): int
}

class Batalla {
    + simularBatalla(c1: Criatura, c2: Criatura)
}

class Main {
    + main()
}

' ===== RELACIONES =====

' Herencia
Criatura <|-- Dragon
Criatura <|-- Mago
Criatura <|-- Guerrero

' Interfaces (CORREGIDO)
Dragon ..|> Volador
Mago ..|> Magico

' Composición
Guerrero *-- Arma

' Uso
Batalla --> Criatura
Main --> Batalla

@enduml

