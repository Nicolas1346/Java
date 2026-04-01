package com.mycompany.zologico;

class Zologico {

    public static void main(String[] args) {
        
        Gato c1 = new Gato();
        
        c1.nome = "Austaufo ";
        c1.idade = 79;
        c1.pedigree = "OA1852 ";
        
        System.out.print("Nome: " + c1.nome + " Idade: " + c1.idade + " Pedigree: " + c1.pedigree);
        
    }
}
