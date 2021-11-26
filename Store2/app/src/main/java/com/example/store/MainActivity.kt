package com.example.store

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.GridLayoutManager
import com.example.store.ArticleClickListener
import com.example.store.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), ArticleClickListener
{
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateArticles()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 3)
            adapter = CardAdapter(articleList, mainActivity)
        }
    }
    override fun onClick(artcile: Article)
    {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(ARTICLE_ID_EXTRA, artcile.id)
        startActivity(intent)
    }

    private fun populateArticles ()
    {
        val article1 = Article(
            R.drawable.abtm,
            "Xiaomi",
            "Trottinette Électrique Pure Air Go - 2ème Génération ",
            "La nouvelle trottinette électrique Pure Air Go est destinée à un usage quotidien et par tous temps. La Pure Air Go supporte 120 kg de charge et a un moteur de 350 W à 3 modes de conduite, pour vous permettre d' explorer à votre guise. Avec ses 20 km d’autonomie, son châssis étanche du plus haut standing et ses pneus de 10 pouces anti-crevaisons, vous rejoindrez à coup sûr votre destination sans encombre. "
        )
        articleList.add(article1)

        val article2 = Article(
            R.drawable.tmom,
            "Cdiscount",
            "cable USB",
            "Marque Phonillico® parfaitement Compatible avec Huawei : P30, P30 LITE, P30 PRO, P20, P20 LITE, P20 PRO, P10, P9, P9 PLUS, MATE 20, MATE 20 LITE, MATE 20 PRO, MATE 10, MATE 10 PRO, MATE 9, MATE 9 PRO, HONOR VIEW 20, HONOR VIEW 10, HONOR PLAY, HONOR 1")

        articleList.add(article2)

        val article3 = Article(
            R.drawable.iewu,
            "Disney",
            "Disney Store Figurine Woody articulée parlante",
            "Les mains en l'air ! Sans shérif pour maintenir l'ordre, un coffre à jouets peut vite devenir ingérable ! Plus vrai que nature, Woody porte sa tenue emblématique et un chapeau amovible. Il devient même bavard en compagnie d'autres personnages.")
        articleList.add(article3)

        val article4 = Article(
            R.drawable.trlt,
            "Tokyo shop",
            "KATANA",
            "❤ Taille: pleine longueur 104 cm, longueur de la lame 70 cm, longueur du manche 25 cm, épaisseur de la lame 0,7 cm\n" +
                    "❤ Jouets pour enfants de plus de 14 ans ： Les lames en bambou sont plus sûres, sans danger, pour une plus grande durabilité.Spécial pour COSPLAY, collection pour les amateurs d'anime.\n" +
                    "Restauration détaillée\n" +
                    "❤La surface coupée est plate et incurvée, ce qui ne vous blessera pas les mains.\n" +
                    "❤ ASSURANCE DE LA QUALITÉ: Si vous avez des questions, veuillez nous contacter à temps, nous vous répondrons dans les 24 heures.")
        articleList.add(article4)

        val article5 = Article(
            R.drawable.ps5,
            "Playstation station",
            "PS5",
            "Rehaussez vos séances de jeu avec des chargements à la vitesse de l’éclair grâce au disque SSD ultrarapide, une meilleure immersion grâce au retour haptique, aux gâchettes adaptatives et à la technologie audio 3D, et l’incroyable catalogue de jeux PlayStation® nouvelle génération.\n" +
                    "\n" +
                    "La PS5 édition numérique est une version entièrement numérique de la console PS5, sans lecteur de disque. Ouvrez une session de votre compte PlayStation Network et rendez-vous dans la boutique PlayStation®Store pour acheter et télécharger les jeux."
        )


        articleList.add(article5)

        val article6 = Article(
            R.drawable.airpods,
            "APPlE",
            "Apple AirPods Pro avec boitier de charge - Blanc",
            "Autonomie prolongée, activation vocale de Siri et boîtier de charge sans fil en option. Les AirPods offrent une expérience d’écoute sans fil incroyable. Retirez-les de leur boîtier et ils fonctionnent tout de suite avec tous vos appareils. Portez-les à vos oreilles et ils se connectent immédiatement pour vous faire profiter d’un son de haute qualité parfaitement détaillé. Comme par magie.")
        articleList.add(article6)






        val article7 = Article(
            R.drawable.barca,
            "fcbarcelona",
            "Maillot third FC Barcelone 21/22",
            "Maillot third du FC Barcelone 21/22. Le résultat d'une création artistique avec de jeunes talents de Barcelone qui fait une réinterprétation créative des rayures traditionnelles du Barça. Inscriptions latérales avec le message “Nuestro Barça” (Notre Barça). Technologie Dri-FIT de Nike. « Move to Zero » est le nouvel engagement environnemental pris par Nike qui garantit l’utilisation d’au moins 75 % de fibres recyclées dans le but de réduire les émissions de carbone. Couleur: Bleu et grenat vif. \n" +
                    "\n" +
                    "Cette chemise est imprimée avec la typographie Play exclusive.\n" +
                    "Le délai de livraison pour le produit personnalisé est de 7 à 14 jours. \n" +
                    "Ce produit ne peut être échangé ou retourné.\n" +
                    "Aquest producte no admet canvis ni devolucions.")


        val article8 = Article(
            R.drawable.gpc,
            "GOOGLE",
            "GOOGLE PLAY CARD",
            "Toujours plus de divertissements sur votre appareil Android.\n" +
                    "Dans votre jeu mobile préféré sans carte de crédit avec une e-carte Google Play.\n" +
                    "Profitez de plus d'un million d'applications et de jeux pour Android sur Google Play, la plus grande plate-forme de jeux mobiles au monde. Utilisez une e-carte Google Play pour progresser dans vos jeux préférés tels que Clash Royale ou Pokémon GO, ou pour acheter les dernières nouveautés en matière de films, d'applications et plus encore. Aucune carte de crédit n'est requise, et les soldes des comptes n'expirent jamais. N'attendez plus, faites-vous plaisir ou offrez une e-carte Google Play dès aujourd'hui !\n" +
                    "Accédez instantanément au contenu du Google Play Store sur votre téléphone, votre tablette, votre ordinateur ou votre téléviseur. Commencez un épisode dans le train et finissez-le sur votre téléviseur en arrivant chez vous, écoutez votre playlist préférée sur n'importe quel appareil et conservez votre progression dans les jeux pour ne plus jamais avoir à repasser deux fois le même niveau. Avec Google Play, accédez à vos contenus sur tout type d'appareil, que ce soit sous Android ou iOS, via Chromecast ou encore sur le Web.")



        val article9 = Article(
            R.drawable.valhalla,
            "Ubisoft",
            "Nemesis Now Assassin's Creed Valhalla - Chope Logo Assassin's Creed Valhalla",
            "jeux, merchandising pop culture, viking\n" +
                    "chope à bière, marchandises fun et de fans, motif: uni\n" +
                    "mesures: taille standard\n" +
                    "le cadeau de noël parfait")


        val article10 = Article(
            R.drawable.pokemon,
            "Nintendo Switch",
            "Pokémon Diamant Etincelant ",
            "La génération qui a marqué l’histoire de la Nintendo DS s’offre un refonte totale sur Nintendo Switch\n" +
                    "Apprenti Dresseur dans la région de Sinnoh dominée par le Mont Couronné\n" +
                    "vous devez choisir votre premier allié parmi les iconiques Tortipouss, Ouisticram et Tiplouf")


        val article11 = Article(
            R.drawable.dot,
            "AMAZON",
            "Echo Dot (4e génération), Enceinte connectée avec horloge et Alexa, Blanc",
            "Découvrez Echo Dot avec horloge, notre enceinte connectée avec Alexa la plus populaire. Son design élégant et compact livre un son riche aux voix nettes et aux basses équilibrées.\n" +
                    "Idéal pour votre table de chevet : consultez l'heure, vos alarmes et vos minuteurs grâce à l'affichage LED. Touchez le dessus de l'appareil pour reporter une alarme.\n" +
                    "Prête à rendre service : demandez à Alexa de raconter une blague, jouer de la musique, répondre à des questions, lire les nouvelles, donner la météo, programmer des alarmes et bien plus.")

        val article12 = Article(
            R.drawable.crosair,
            "Corsair",
            "Corsair M55 PRO RGB",
            "Conception ambidextre polyvalente : jouez à votre meilleur niveau de n’importe quelle main en utilisant votre prise la plus confortable, que ce soit avec votre paume ou du bout des doigts\n" +
                    "La précision pour gagner : contrôlez votre gameplay grâce au capteur optique de 12 400 DPI pour un suivi de haute précision\n" +
                    "Poids de seulement 86 g : une construction incroyablement légère vous permet de jouer sans effort à votre meilleur niveau pendant des heures\n" +
                    "Construit pour durer : la construction durable dotée de switchs Omron certifiés pour 50 millions de clics et d’un câble tressé haut de gamme")





        articleList.add(article1)
        articleList.add(article2)
        articleList.add(article3)
        articleList.add(article4)
        articleList.add(article5)
        articleList.add(article6)
        articleList.add(article7)
        articleList.add(article8)
        articleList.add(article9)
        articleList.add(article10)
        articleList.add(article11)
        articleList.add(article12)

    }


}

