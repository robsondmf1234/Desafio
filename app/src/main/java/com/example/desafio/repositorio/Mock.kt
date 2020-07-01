package com.example.desafio.repositorio

import android.os.Parcelable
import com.example.desafio.R
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Filme(
    val id: Int,
    val imagemCapa: Int,
    val nota: String,
    val titulo: String,
    val categoria: String,
    val paisFilme: String,
    // val duracao:String,
    val descricao: String
) : Parcelable


class Mock {

    private val mListaFilme: List<Filme> = listOf(
        Filme(
            (1), R.drawable.avatar,
            "9", "Avatar", "Aventura", "Estados Unidos",
            """No exuberante mundo alienígena de Pandora vivem os Na'vi, seres que parecem ser
           primitivos, mas são altamente evoluídos. Como o ambiente do planeta"
           é tóxico, foram criados os avatares, corpos biológicos controlados pela
           mente humana que se movimentam livremente em Pandora. Jake Sully, um ex-fuzileiro
        """.trimIndent()
        ),
        Filme(
            (2), R.drawable.vingadores,
            "9.5", "Vingadores", "Acao", "Estados Unidos",
            """Vingadores ou Os Vingadores (The Avengers no original em inglês) são um grupo
               de super-heróis de história em quadrinhos publicados nos Estados Unidos pela 
               editora Marvel Comics. O grupo também aparece em adaptações da Marvel para cinema,
               desenho animado e jogos eletrônicos.
            """.trimIndent()
        ),
        Filme(
            (3), R.drawable.origem,
            "9.5", "A Origem", "Ficcao", "Estados Unidos",
            """Dom Cobb é um ladrão com a rara habilidade de roubar segredos do inconsciente,
            obtidos durante o estado de sono.Impedido de retornar para sua família, ele recebe 
            a oportunidade de se redimir ao realizar uma tarefa aparentemente impossível : plantar 
            uma ideia na mente do herdeiro de um império. Para realizar o crime perfeito, ele conta
            com a ajuda do parceiro Arthur, o discreto Eames e a arquiteta de sonhos Ariadne. Juntos,
            eles correm para que o inimigo não antecipe seus passos.
            """.trimIndent()
        ),
        Filme(
            (4), R.drawable.aesperadeummilagre,
            "8.5", "A espera de um milagre", "Drama", "Estados Unidos",
            """Um carcereiro tem um relacionamento incomum e comovente com um preso que está no corredor na morte:
            Coffey, um negro enorme, condenado por ter matado brutalmente duas gêmeas de nove anos. Ele tem tamanho
            e força para matar qualquer um, mas seu comportamento é completamente oposto à sua aparência. Além de ser simples,
            ingênuo e ter pavor do escuro, ele possui um dom sobrenatural. Com o passar do tempo, o carcereiro aprende que,
            às vezes, os milagres acontecem nos lug ares mais inesperados.
            """.trimIndent()
        ),
        Filme(
            (5), R.drawable.avatar,
            "9", "Avatar", "Aventura", "Estados Unidos",
            """No exuberante mundo alienígena de Pandora vivem os Na'vi, seres que parecem ser
           primitivos, mas são altamente evoluídos. Como o ambiente do planeta
           é tóxico, foram criados os avatares, corpos biológicos controlados pela
           mente humana que se movimentam livremente em Pandora. Jake Sully, um ex-fuzileiro
        """.trimIndent()
        ),
        Filme(
            (6), R.drawable.vingadores,
            "9.5", "Vingadores", "Acao", "Estados Unidos",
            """Vingadores ou Os Vingadores (The Avengers no original em inglês) são um grupo
               de super-heróis de história em quadrinhos publicados nos Estados Unidos pela 
               editora Marvel Comics. O grupo também aparece em adaptações da Marvel para cinema,
               desenho animado e jogos eletrônicos.
            """.trimIndent()
        ),
        Filme(
            (7), R.drawable.origem,
            "9.5", "A Origem", "Ficcao", "Estados Unidos",
            """Dom Cobb é um ladrão com a rara habilidade de roubar segredos do inconsciente,
            obtidos durante o estado de sono.Impedido de retornar para sua família, ele recebe 
            a oportunidade de se redimir ao realizar uma tarefa aparentemente impossível : plantar 
            uma ideia na mente do herdeiro de um império. Para realizar o crime perfeito, ele conta
            com a ajuda do parceiro Arthur, o discreto Eames e a arquiteta de sonhos Ariadne. Juntos,
            eles correm para que o inimigo não antecipe seus passos.
            """.trimIndent()
        ),
        Filme(
            (8), R.drawable.aesperadeummilagre,
            "8.5", "A espera de um milagre", "Drama", "Estados Unidos",
            """Um carcereiro tem um relacionamento incomum e comovente com um preso que está no corredor na morte:
            Coffey, um negro enorme, condenado por ter matado brutalmente duas gêmeas de nove anos. Ele tem tamanho
            e força para matar qualquer um, mas seu comportamento é completamente oposto à sua aparência. Além de ser simples,
            ingênuo e ter pavor do escuro, ele possui um dom sobrenatural. Com o passar do tempo, o carcereiro aprende que,
            às vezes, os milagres acontecem nos lug ares mais inesperados.
            """.trimIndent()
        ),
        Filme(
            (9), R.drawable.poderosochefao,
            "9", "O Poderoso Chefao", "Drama", "Estados Unidos",
            """Uma família mafiosa luta para estabelecer sua supremacia nos Estados Unidos
            depois da Segunda Guerra Mundial. Uma tentativa de assassinato deixa o chefão 
            Vito Corleone incapacitado e força os filhos Michael e Sonny a assumir os negócios.
            """.trimIndent()
        ),
        Filme(
            (10), R.drawable.superbad,
            "7.5", "Super Bad", "Comedia", "Estados Unidos",
            """Os estudantes adolescentes Seth e Evan têm grandes esperanças para uma 
            festa de formatura. Os adolescentes co-dependentes pretendem beber e conquistar garotas para que
            eles possam se tornar parte da multidão popular da escola, mas a ansiedade de 
            separação e dois policiais entediados complicam a auto-missão proclamada dos amigos.
            """.trimIndent()
        ),
        Filme(
            (11), R.drawable.origem,
            "9.5", "A Origem", "Ficcao", "Estados Unidos",
            """Dom Cobb é um ladrão com a rara habilidade de roubar segredos do inconsciente,
            obtidos durante o estado de sono.Impedido de retornar para sua família, ele recebe 
            a oportunidade de se redimir ao realizar uma tarefa aparentemente impossível : plantar 
            uma ideia na mente do herdeiro de um império. Para realizar o crime perfeito, ele conta
            com a ajuda do parceiro Arthur, o discreto Eames e a arquiteta de sonhos Ariadne. Juntos,
            eles correm para que o inimigo não antecipe seus passos.
            """.trimIndent()
        ),
        Filme(
            (12), R.drawable.aesperadeummilagre,
            "8.5", "A espera de um milagre", "Drama", "Estados Unidos",
            """Um carcereiro tem um relacionamento incomum e comovente com um preso que está no corredor na morte:
            Coffey, um negro enorme, condenado por ter matado brutalmente duas gêmeas de nove anos. Ele tem tamanho
            e força para matar qualquer um, mas seu comportamento é completamente oposto à sua aparência. Além de ser simples,
            ingênuo e ter pavor do escuro, ele possui um dom sobrenatural. Com o passar do tempo, o carcereiro aprende que,
            às vezes, os milagres acontecem nos lug ares mais inesperados.
            """.trimIndent()
        )
    )

    fun getListaFilmes(): List<Filme> {
        return mListaFilme
    }
}