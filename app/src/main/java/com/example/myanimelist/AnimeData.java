package com.example.myanimelist;

import java.util.ArrayList;

public class AnimeData {
    private static String[] animeNames = {
            "Fullmetal Alchemist: Brotherhood",
            "Steins;Gate",
            "Hunter x Hunter (2011)",
            "Gintama°",
            "Ginga Eiyuu Densetsu",
            "Gintama'",
            "Shingeki no Kyojin Season 3 Part 2",
            "Shingeki no Kyojin: The Final Season",
            "Gintama': Enchousen",
            "3-gatsu no Lion 2nd Season"
    };

    private static String[] animeDetails = {
            "\"In order for something to be obtained, something of equal value must be lost.\"\n" +
                    "\n" +
                    "Alchemy is bound by this Law of Equivalent Exchange—something the young brothers Edward and Alphonse Elric only realize after attempting human transmutation: the one forbidden act of alchemy. They pay a terrible price for their transgression—Edward loses his left leg, Alphonse his physical body. It is only by the desperate sacrifice of Edward's right arm that he is able to affix Alphonse's soul to a suit of armor. Devastated and alone, it is the hope that they would both eventually return to their original bodies that gives Edward the inspiration to obtain metal limbs called \"automail\" and become a state alchemist, the Fullmetal Alchemist.\n" +
                    "\n" +
                    "Three years of searching later, the brothers seek the Philosopher's Stone, a mythical relic that allows an alchemist to overcome the Law of Equivalent Exchange. Even with military allies Colonel Roy Mustang, Lieutenant Riza Hawkeye, and Lieutenant Colonel Maes Hughes on their side, the brothers find themselves caught up in a nationwide conspiracy that leads them not only to the true nature of the elusive Philosopher's Stone, but their country's murky history as well. In between finding a serial killer and racing against time, Edward and Alphonse must ask themselves if what they are doing will make them human again... or take away their humanity.\n",
            "The self-proclaimed mad scientist Rintarou Okabe rents out a room in a rickety old building in Akihabara, where he indulges himself in his hobby of inventing prospective \"future gadgets\" with fellow lab members: Mayuri Shiina, his air-headed childhood friend, and Hashida Itaru, a perverted hacker nicknamed \"Daru.\" The three pass the time by tinkering with their most promising contraption yet, a machine dubbed the \"Phone Microwave,\" which performs the strange function of morphing bananas into piles of green gel.\n" +
                    "\n" +
                    "Though miraculous in itself, the phenomenon doesn't provide anything concrete in Okabe's search for a scientific breakthrough; that is, until the lab members are spurred into action by a string of mysterious happenings before stumbling upon an unexpected success—the Phone Microwave can send emails to the past, altering the flow of history.\n" +
                    "\n" +
                    "Adapted from the critically acclaimed visual novel by 5pb. and Nitroplus, Steins;Gate takes Okabe through the depths of scientific theory and practicality. Forced across the diverging threads of past and present, Okabe must shoulder the burdens that come with holding the key to the realm of time.",
            "Hunter x Hunter is set in a world where Hunters exist to perform all manner of dangerous tasks like capturing criminals and bravely searching for lost treasures in uncharted territories. Twelve-year-old Gon Freecss is determined to become the best Hunter possible in hopes of finding his father, who was a Hunter himself and had long ago abandoned his young son. However, Gon soon realizes the path to achieving his goals is far more challenging than he could have ever imagined.\n" +
                    "\n" +
                    "Along the way to becoming an official Hunter, Gon befriends the lively doctor-in-training Leorio, vengeful Kurapika, and rebellious ex-assassin Killua. To attain their own goals and desires, together the four of them take the Hunter Exam, notorious for its low success rate and high probability of death. Throughout their journey, Gon and his friends embark on an adventure that puts them through many hardships and struggles. They will meet a plethora of monsters, creatures, and characters—all while learning what being a Hunter truly means.",
            "Gintoki, Shinpachi, and Kagura return as the fun-loving but broke members of the Yorozuya team! Living in an alternate-reality Edo, where swords are prohibited and alien overlords have conquered Japan, they try to thrive on doing whatever work they can get their hands on. However, Shinpachi and Kagura still haven't been paid... Does Gin-chan really spend all that cash playing pachinko?\n" +
                    "\n" +
                    "Meanwhile, when Gintoki drunkenly staggers home one night, an alien spaceship crashes nearby. A fatally injured crew member emerges from the ship and gives Gintoki a strange, clock-shaped device, warning him that it is incredibly powerful and must be safeguarded. Mistaking it for his alarm clock, Gintoki proceeds to smash the device the next morning and suddenly discovers that the world outside his apartment has come to a standstill. With Kagura and Shinpachi at his side, he sets off to get the device fixed; though, as usual, nothing is ever that simple for the Yorozuya team.\n" +
                    "\n" +
                    "Filled with tongue-in-cheek humor and moments of heartfelt emotion, Gintama's fourth season finds Gintoki and his friends facing both their most hilarious misadventures and most dangerous crises yet.",
            "The 150-year-long stalemate between the two interstellar superpowers, the Galactic Empire and the Free Planets Alliance, comes to an end when a new generation of leaders arises: the idealistic military genius Reinhard von Lohengramm, and the FPA's reserved historian, Yang Wenli.\n" +
                    "\n" +
                    "While Reinhard climbs the ranks of the Empire with the aid of his childhood friend, Siegfried Kircheis, he must fight not only the war, but also the remnants of the crumbling Goldenbaum Dynasty in order to free his sister from the Kaiser and unify humanity under one genuine ruler. Meanwhile, on the other side of the galaxy, Yang—a strong supporter of democratic ideals—has to stand firm in his beliefs, despite the struggles of the FPA, and show his pupil, Julian Mintz, that autocracy is not the solution.\n" +
                    "\n" +
                    "As ideologies clash amidst the war's many casualties, the two strategic masterminds must ask themselves what the real reason behind their battle is.",
            "After a one-year hiatus, Shinpachi Shimura returns to Edo, only to stumble upon a shocking surprise: Gintoki and Kagura, his fellow Yorozuya members, have become completely different characters! Fleeing from the Yorozuya headquarters in confusion, Shinpachi finds that all the denizens of Edo have undergone impossibly extreme changes, in both appearance and personality. Most unbelievably, his sister Otae has married the Shinsengumi chief and shameless stalker Isao Kondou and is pregnant with their first child.\n" +
                    "\n" +
                    "Bewildered, Shinpachi agrees to join the Shinsengumi at Otae and Kondou's request and finds even more startling transformations afoot both in and out of the ranks of the the organization. However, discovering that Vice Chief Toushirou Hijikata has remained unchanged, Shinpachi and his unlikely Shinsengumi ally set out to return the city of Edo to how they remember it.\n" +
                    "\n" +
                    "With even more dirty jokes, tongue-in-cheek parodies, and shameless references, Gintama' follows the Yorozuya team through more of their misadventures in the vibrant, alien-filled world of Edo.",
            "Seeking to restore humanity’s diminishing hope, the Survey Corps embark on a mission to retake Wall Maria, where the battle against the merciless \"Titans\" takes the stage once again.\n" +
                    "\n" +
                    "Returning to the tattered Shiganshina District that was once his home, Eren Yeager and the Corps find the town oddly unoccupied by Titans. Even after the outer gate is plugged, they strangely encounter no opposition. The mission progresses smoothly until Armin Arlert, highly suspicious of the enemy's absence, discovers distressing signs of a potential scheme against them.\n" +
                    "\n" +
                    "Shingeki no Kyojin Season 3 Part 2 follows Eren as he vows to take back everything that was once his. Alongside him, the Survey Corps strive—through countless sacrifices—to carve a path towards victory and uncover the secrets locked away in the Yeager family's basement.",
            "With Eren and company now at the shoreline and the threat of Marley looming, what’s next for the Scouts and their quest to unravel the mysteries of the Titans, humanity, and more?",
            "While Gintoki Sakata was away, the Yorozuya found themselves a new leader: Kintoki, Gintoki's golden-haired doppelganger. In order to regain his former position, Gintoki will need the help of those around him, a troubling feat when no one can remember him! Between Kintoki and Gintoki, who will claim the throne as the main character?\n" +
                    "\n" +
                    "In addition, Yorozuya make a trip back down to red-light district of Yoshiwara to aid an elderly courtesan in her search for her long-lost lover. Although the district is no longer in chains beneath the earth's surface, the trio soon learn of the tragic backstories of Yoshiwara's inhabitants that still haunt them. With flashback after flashback, this quest has Yorozuya witnessing everlasting love and protecting it as best they can with their hearts and souls.\n" +
                    "\n" +
                    "Gintama': Enchousen includes moments of action-packed intensity along with their usual lighthearted, slapstick humor for Gintoki and his friends.\n",
            "Now in his second year of high school, Rei Kiriyama continues pushing through his struggles in the professional shogi world as well as his personal life. Surrounded by vibrant personalities at the shogi hall, the school club, and in the local community, his solitary shell slowly begins to crack. Among them are the three Kawamoto sisters—Akari, Hinata, and Momo—who forge an affectionate and familial bond with Rei. Through these ties, he realizes that everyone is burdened by their own emotional hardships and begins learning how to rely on others while supporting them in return.\n" +
                    "\n" +
                    "Nonetheless, the life of a professional is not easy. Between tournaments, championships, and title matches, the pressure mounts as Rei advances through the ranks and encounters incredibly skilled opponents. As he manages his relationships with those who have grown close to him, the shogi player continues to search for the reason he plays the game that defines his career.\n"

    };

    private static String[] animeScore = {
            "9.21",
            "9.12",
            "9.11",
            "9.11",
            "9.08",
            "9.08",
            "9.08",
            "9.06",
            "9.04",
            "9.01"
    };

    private static String[] animeEps = {
            "TV (64 eps)",
            "TV (24 eps)",
            "TV (51 eps)",
            "TV (148 eps)",
            "OVA (110 eps)",
            "TV (51 eps)",
            "TV (10 eps)",
            "TV (16 eps)",
            "TV (13 eps)",
            "TV (22 eps)"
    };

    private static String[] animeProds = {
            "Aniplex, Square Enix, Mainichi Broadcasting System, Studio Moriken",
            "Frontier Works, Media Factory, Movic, AT-X, Kadokawa Pictures Japan, Nitroplus",
            "TV Tokyo, Aniplex, Dentsu",
            "VAP, Nippon Television Network, Shueisha",
            "Kitty Films, K-Factory",
            "TV Tokyo, Aniplex, Dentsu, Trinity Sound, Miracle Robo, Studio Jack, Shueisha",
            "Production I.G, Dentsu, Mainichi Broadcasting System, Pony Canyon, Kodansha, Techno Sound, Pony Canyon Enterprise",
            "Production I.G, Dentsu, Mainichi Broadcasting System, Pony Canyon, Kodansha, Techno Sound, Pony Canyon Enterprise",
            "TV Tokyo, Aniplex, Dentsu, Shueisha, Miracle Bus",
            "Aniplex, Dentsu, NHK, Hakusensha, Asmik Ace, Toy's Factory"
    };

    private static String[] animeGenre = {
            "Action, Military, Adventure, Comedy, Drama, Magic, Fantasy, Shounen",
            "Thriller, Sci-Fi",
            "Action, Comedy, Historical, Parody, Samurai, Sci-Fi, Shounen",
            "Action, Adventure, Fantasy, Shounen, Super Power",
            "Military, Sci-Fi, Space, Drama",
            "Action, Sci-Fi, Comedy, Historical, Parody, Samurai, Shounen",
            "Action, Military, Mystery, Super Power, Drama, Fantasy, Shounen",
            "Action, Military, Mystery, Super Power, Drama, Fantasy, Shounen",
            "Action, Comedy, Historical, Parody, Samurai, Sci-Fi, Shounen",
            "Drama, Game, Seinen, Slice of Life"
    };

    private static int[] animeImages = {
            R.drawable.fullmetal,
            R.drawable.steins_gate,
            R.drawable.hunter_x_hunter,
            R.drawable.gintama_a,
            R.drawable.ged,
            R.drawable.gintama_b,
            R.drawable.snk_a,
            R.drawable.snk_b,
            R.drawable.gintama_c,
            R.drawable.gnl
    };

    static ArrayList<Anime> getListData() {
        ArrayList<Anime> list = new ArrayList<>();
        for (int position = 0; position < animeNames.length; position++) {
            Anime anime = new Anime();
            anime.setAnimeNames(animeNames[position]);
            anime.setAnimeDetails(animeDetails[position]);
            anime.setAnimeEps(animeEps[position]);
            anime.setAnimeGenre(animeGenre[position]);
            anime.setAnimeProds(animeProds[position]);
            anime.setAnimeScore(animeScore[position]);
            anime.setAnimeImages(animeImages[position]);
            list.add(anime);
        }
        return list;
    }
}
