import clases.Goomba
import clases.Mario
fun main(){
    var mario = Mario()
    /*for (i in 1..5){
            if(mario.isAlive){
                    mario.collision("Goomba")
                    println("Te quedan ${mario.getLives()}")
            }
            println("Te quedan ${mario.getLives()}")
    }*/
    mario.collision("star")
    /*val enemy = Enemy("Un enemigo",2)
    enemy.collision("Enemy")
    enemy.collision("Weapon")*/
    val enemy = Goomba("Un enemigo", 2)

    /*
    val enemy = Goomba()
    enemy.collision("Enemy")
    enemy.collision("Weapon")
    val koopa = Koopa()
    koopa.collision("Weapon")
    */

}

/*
APUNTES
Modificadores de acceso.
private: Accesible solo dentro de la clase que lo contiene.
protected: Tiene acceso dentro de la claase y por medio de las clases que heredan de este.
internal: Accesible entre modulos una serie de archivos compilados en conjunto.
public: Acceso global.

Getters y Setters.
Sirven para poder acceder a los atributos de otra clase debido a que se utilizaron modificadores de acceso.
Con get leemos los datos y con set podemos asignarlos.

Herencia
Una superclase (clase padre) puede heredar los atributos y metodos a una subclase (clase hijo) por encapsulamiento.
Dicho ecapsulamiento depende de los modificadores de acceso,
Una subclase solo puede pertenecer a una superclase.
Una super clase puede tener varias subclases.
*/

