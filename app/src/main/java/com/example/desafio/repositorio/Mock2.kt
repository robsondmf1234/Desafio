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

    fun getListaFilmes(): List<Filme> = listOf(
        Filme(
            (1), R.drawable.avatar,
            "9", "Avatar", "Aventura", "Estados Unidos",
            "No exuberante mundo alienígena de Pandora vivem os Na'vi, seres que parecem ser primitivos, mas são altamente evoluídos. Como o ambiente do planeta é tóxico, foram criados os avatares, corpos biológicos controlados pela mente humana que se movimentam livremente em Pandora. Jake Sully, um ex-fuzileiro"
        ),
        Filme(
            (2), R.drawable.vingadores,
            "9.5", "Vingadores", "Acao", "Estados Unidos",
            "Vingadores ou Os Vingadores (The Avengers no original em inglês) são um grupo de super-heróis de história em quadrinhos publicados nos Estados Unidos pela editora Marvel Comics. O grupo também aparece em adaptações da Marvel para cinema,desenho animado e jogos eletrônicos."
        ),
        Filme(
            (3), R.drawable.origem,
            "9.5", "A Origem", "Ficcao", "Estados Unidos",
            "Dom Cobb é um ladrão com a rara habilidade de roubar segredos do inconsciente, obtidos durante o estado de sono.Impedido de retornar para sua família, ele recebe  a oportunidade de se redimir ao realizar uma tarefa aparentemente impossível : plantar  uma ideia na mente do herdeiro de um império. Para realizar o crime perfeito, ele conta com a ajuda do parceiro Arthur, o discreto Eames e a arquiteta de sonhos Ariadne. Juntos,eles correm para que o inimigo não antecipe seus passos."
        ),
        Filme(
            (4), R.drawable.aesperadeummilagre,
            "8.5", "A espera de um milagre", "Drama", "Estados Unidos",
            "Um carcereiro tem um relacionamento incomum e comovente com um preso que está no corredor na morte: Coffey, um negro enorme, condenado por ter matado brutalmente duas gêmeas de nove anos. Ele tem tamanho e força para matar qualquer um, mas seu comportamento é completamente oposto à sua aparência. Além de ser simples, ingênuo e ter pavor do escuro, ele possui um dom sobrenatural. Com o passar do tempo, o carcereiro aprende que, às vezes, os milagres acontecem nos lug ares mais inesperados."
        ),
        Filme(
            (5), R.drawable.indianajones,
            "7", "Indiana Jones", "Aventura", "Estados Unidos",
            "O arqueólogo Indiana Jones precisa encontrar a Arca da Aliança, uma relíquia bíblica que contém os dez mandamentos.Como o portador do artefato se torna invencível, os nazistas também vão fazer de tudo para adquirir esse precioso objeto."
        ),
        Filme(
            (6), R.drawable.johnwick,
            "8.5", "John Wick", "Acao", "Estados Unidos",
            "John Wick é um lendário assassino de aluguel aposentado, lidando com o luto após perder o grande amor de sua vida. Quando um gângster invade sua casa, mata seu cachorro e rouba seu carro, ele é forçado a voltar à ativa e inicia sua vingança."
        ),
        Filme(
            (7), R.drawable.alien,
            "8.5", "Alien", "Ficcao", "Estados Unidos",
            "Uma nave espacial, ao retornar para Terra, recebe estranhos sinais vindos de um asteroide. Enquanto a equipe investiga o local, um dos tripulantes é atacado por um misterioso ser. O que parecia ser um ataque isolado se transforma em um terror constante, pois o tripulante atacado levou para dentro da nave o embrião de um alienígena, que não para de crescer e tem como meta matar toda a tripulação."
        ),
        Filme(
            (8), R.drawable.titanic,
            "9.0", "Titanic", "Drama", "Estados Unidos",
            "Um artista pobre e uma jovem rica se conhecem e se apaixonam na fatídica jornada do Titanic, em 1912. Embora esteja noiva do arrogante herdeiro de uma siderúrgica, ajovem desafia sua família e amigos em busca do verdadeiro amor."
        ),
        Filme(
            (9), R.drawable.bohemia,
            "9", "Bohemia Rapsody", "Drama", "Estados Unidos",
            "Freddie Mercury, Brian May, Roger Taylor e John Deacon formam a banda de rock Queen em 1970. Quando o estilo de vida agitado de Mercury começa a sair de controle, o grupo precisa encontrar uma forma de lidar com o sucesso e os excessos de seu líder."
        ),
        Filme(
            (10), R.drawable.superbad,
            "7.5", "Super Bad", "Comedia", "Estados Unidos",
            "Os estudantes adolescentes Seth e Evan têm grandes esperanças para uma festa de formatura. Os adolescentes co-dependentes pretendem beber e conquistar garotas para que eles possam se tornar parte da multidão popular da escola, mas a ansiedade de separação e dois policiais entediados complicam a auto-missão proclamada dos amigos."
        ),
        Filme(
            (11), R.drawable.eofim,
            "8.5", "É o fim", "Comedia", "Estados Unidos",
            "Os grandes amigos Seth Rogen e Jay Baruchel vão em uma festa na casa do ator James Franco, que reuniu diversas celebridades no local, como Jonah Hill, Rihanna, Jason Segel e Emma Watson. Tudo corria bem até que um aparente terremoto se revela como sendo o dia do julgamento final. Rogen, Baruchel, Franco, Hill, Danny McBride e Craig Robinson acabam se vendo presos no local na torcida para que o mundo pare de acabar do lado de fora."
        ), Filme(
            (12), R.drawable.guardiaodasgalaxias,
            "9.0", "Guardiões das Galacias", "Comedia", "Estados Unidos",
            "Os Guardiões precisam lutar para manter sua recém descoberta família unida, enquanto descobrem os mistérios sobre o verdadeiro pai de Peter Quill."
        ), Filme(
            (13), R.drawable.sebebernaocase,
            "8.0", "Se Beber não case", "Comedia", "Estados Unidos",
            "Se Beber, Não Case. Quando Doug está prestes a se casar, seus amigos Phill e Stu decidem que a despedida de solteiro será inesquecível. Para isso, eles organizam uma viagem em que os três passarão uma noite juntos em Las Vegas, onde qualquer coisa pode acontecer."
        ), Filme(
            (14), R.drawable.poderosochefao,
            "9.0", "Poderoso Chefão", "Drama", "Estados Unidos",
            "Uma família mafiosa luta para estabelecer sua supremacia nos Estados Unidos depois da Segunda Guerra Mundial. Uma tentativa de assassinato deixa o chefão Vito Corleone incapacitado e força os filhos Michael e Sonny a assumir os negócios."
        )
    )


    fun getListaFiltradaFilmes(categoria: String): List<Filme> {

        //Filtrando os filmes pela categoria
        if (categoria == "Todos" || categoria == "") {
            return getListaFilmes()
        } else {
            return getListaFilmes().filter { it.categoria == categoria }
        }
    }
}