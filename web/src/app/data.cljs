(ns app.data)
(def game-data
#:game-list{:games
            {#uuid "49b5473d-32f5-382b-943a-dda4a1491daf"
             {:game/id #uuid "49b5473d-32f5-382b-943a-dda4a1491daf",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2689,
                                                 :name "Action Queue"}
                    #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2011,
                                                 :name "Modular Board"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}
                    #:com.boardgamegeek.mechanic{:id 2016,
                                                 :name
                                                 "Secret Unit Deployment"}),
              :name "10' to Kill",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1040,
                                                 :name
                                                 "Murder/Mystery"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "174476",
              :languages (list "en"),
              :game/name "10' to Kill",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Qfxg7YCYBilmNvI7fi87Tg__thumb/img/cPxvlb5JSWowWHwXSpRmUj-tr8s=/fit-in/200x150/filters:strip_icc()/pic3723481.jpg"},
             #uuid "4a3e0096-1a08-379c-b4f9-1ca0070ea2f5"
             {:languages (list "cz"),
              :name "1989",
              :game/id #uuid "4a3e0096-1a08-379c-b4f9-1ca0070ea2f5",
              :game/name "1989"},
             #uuid "64581d49-5b7a-3952-b129-c64b56c406ed"
             {:languages (list "en"),
              :name "5 Seconds Rule",
              :game/id #uuid "64581d49-5b7a-3952-b129-c64b56c406ed",
              :game/name "5 Seconds Rule"},
             #uuid "4080e14f-b40a-3b33-98cf-83612aaecf76"
             {:languages (list "cz"),
              :name "7 Divu sveta duel [7 wonders duel]",
              :game/id #uuid "4080e14f-b40a-3b33-98cf-83612aaecf76",
              :game/name "7 Divu sveta duel [7 wonders duel]"},
             #uuid "00dbe22a-358d-364c-aa3e-6da841b451dc"
             {:game/id #uuid "00dbe22a-358d-364c-aa3e-6da841b451dc",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2839,
                                                 :name
                                                 "Action Retrieval"}
                    #:com.boardgamegeek.mechanic{:id 2850,
                                                 :name "Events"}
                    #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}
                    #:com.boardgamegeek.mechanic{:id 2082,
                                                 :name
                                                 "Worker Placement"}),
              :name "A castle for all seasons",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1029,
                                                 :name "City Building"}
                    #:com.boardgamegeek.category{:id 1035,
                                                 :name "Medieval"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "38386",
              :languages (list "en"),
              :game/name "A Castle for All Seasons",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/HEHduHVfdLULQHoWLu-Sqw__thumb/img/HnBxzNEHY0vivRABnTIRmBR_aPU=/fit-in/200x150/filters:strip_icc()/pic400762.jpg"},
             #uuid "f8283731-6cf2-3086-8140-494037314bf5"
             {:game/id #uuid "f8283731-6cf2-3086-8140-494037314bf5",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Hra o Truny Pobocnik krale",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "205610",
              :languages (list "cz"),
              :game/name "A Game of Thrones: Hand of the King",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/eKmDyXnsFmnzF5cuv32hjA__thumb/img/bugAzct3L9TIYkuie8jbj49rT7g=/fit-in/200x150/filters:strip_icc()/pic3122395.jpg"},
             #uuid "6d8aa71d-1531-3019-ac35-ea2463485268"
             {:languages (list "cz"),
              :name "AZ Quiz",
              :game/id #uuid "6d8aa71d-1531-3019-ac35-ea2463485268",
              :game/name "AZ Quiz"},
             #uuid "780cd613-d706-3945-8ef3-6d59c16c2312"
             {:languages (list "en"),
              :name "Abraca what",
              :game/id #uuid "780cd613-d706-3945-8ef3-6d59c16c2312",
              :game/name "Abraca what"},
             #uuid "993ca650-a85e-3e69-b8f7-eaa4809c4862"
             {:game/id #uuid "993ca650-a85e-3e69-b8f7-eaa4809c4862",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2910,
                                                 :name "Investment"}
                    #:com.boardgamegeek.mechanic{:id 2900,
                                                 :name "Market"}
                    #:com.boardgamegeek.mechanic{:id 2940,
                                                 :name "Square Grid"}
                    #:com.boardgamegeek.mechanic{:id 2005,
                                                 :name "Stock Holding"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}
                    #:com.boardgamegeek.mechanic{:id 2874,
                                                 :name
                                                 "Victory Points as a Resource"}),
              :name "Acquire",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1086,
                                                 :name
                                                 "Territory Building"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 90,
              :com.boardgamegeek.boardgame/id "5",
              :languages (list "en"),
              :game/name "Acquire",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/3C--kJRhi6kTPHsr9dNaWw__thumb/img/EQqszaHS3n6XplVVGQfTZtGc8fE=/fit-in/200x150/filters:strip_icc()/pic3299296.jpg"},
             #uuid "d496a066-c36e-3570-99d1-9eedec118dee"
             {:game/id #uuid "d496a066-c36e-3570-99d1-9eedec118dee",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Across Africa",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1022,
                                                 :name "Adventure"}
                    #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}
                    #:com.boardgamegeek.category{:id 1094,
                                                 :name "Educational"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "183472",
              :languages (list "en"),
              :game/name "Across Africa",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/vGWn49wquxCTXEgHxCvdcA__thumb/img/naI1UxX_PLFhzMoeW8aTQN2Ajug=/fit-in/200x150/filters:strip_icc()/pic2659340.jpg"},
             #uuid "abe1a4aa-bcd0-3440-8bb5-a57f0dcc37ac"
             {:game/id #uuid "abe1a4aa-bcd0-3440-8bb5-a57f0dcc37ac",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2001,
                                                 :name "Action Points"}
                    #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2871,
                                                 :name "Kill Steal"}),
              :name "Adrenaline",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}
                    #:com.boardgamegeek.category{:id 1047,
                                                 :name "Miniatures"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}
                    #:com.boardgamegeek.category{:id 1101,
                                                 :name
                                                 "Video Game Theme"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "202408",
              :languages (list "en"),
              :game/name "Adrenaline",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/TiNI7bUCR2RPFMlvKEC9TQ__thumb/img/nnWEA6jjVsxPSuEC_Ooph9kzO_g=/fit-in/200x150/filters:strip_icc()/pic3476604.jpg"},
             #uuid "d82b1470-bb05-3f45-86cb-1e51d8455a3d"
             {:game/id #uuid "d82b1470-bb05-3f45-86cb-1e51d8455a3d",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2847,
                                                 :name
                                                 "Advantage Token"}
                    #:com.boardgamegeek.mechanic{:id 2903,
                                                 :name
                                                 "Automatic Resource Growth"}
                    #:com.boardgamegeek.mechanic{:id 2984,
                                                 :name "Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2043,
                                                 :name "Enclosure"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2914,
                                                 :name
                                                 "Increase Value of Unchosen Resources"}
                    #:com.boardgamegeek.mechanic{:id 2819,
                                                 :name
                                                 "Solo / Solitaire Game"}
                    #:com.boardgamegeek.mechanic{:id 2829,
                                                 :name
                                                 "Turn Order: Claim Action"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}
                    #:com.boardgamegeek.mechanic{:id 2082,
                                                 :name
                                                 "Worker Placement"}),
              :name "Agricola",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1013,
                                                 :name "Farming"}),
              :com.boardgamegeek.boardgame/max-play-time 150,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "31260",
              :languages (list "cz"),
              :game/name "Agricola",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/dDDo2Hexl80ucK1IlqTk-g__thumb/img/GHGdnCfeysoP_34gLnofJcNivW8=/fit-in/200x150/filters:strip_icc()/pic831744.jpg"},
             #uuid "af0c5e41-309d-3a83-afb7-76f7378381b2"
             {:game/id #uuid "af0c5e41-309d-3a83-afb7-76f7378381b2",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2910,
                                                 :name "Investment"}
                    #:com.boardgamegeek.mechanic{:id 2081,
                                                 :name
                                                 "Network and Route Building"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2005,
                                                 :name
                                                 "Stock Holding"}),
              :name "Airlines Europe",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 2650,
                                                 :name
                                                 "Aviation / Flight"}
                    #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}),
              :com.boardgamegeek.boardgame/max-play-time 75,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 75,
              :com.boardgamegeek.boardgame/id "90419",
              :languages (list "cz" "de"),
              :game/name "Airlines Europe",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/MWSJ6c001o3HAk00qek9Rw__thumb/img/ZgcRUnCdSNZZyCnpBBs1ST5ESwE=/fit-in/200x150/filters:strip_icc()/pic975416.jpg"},
             #uuid "effdb9ce-6c5d-34df-b1b8-9d7069c8e0fb"
             {:game/id #uuid "effdb9ce-6c5d-34df-b1b8-9d7069c8e0fb",
              :com.boardgamegeek.boardgame/min-players 4,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2073,
                                                 :name "Acting"}
                    #:com.boardgamegeek.mechanic{:id 2078,
                                                 :name
                                                 "Point to Point Movement"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}),
              :name "Alias",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1031,
                                                 :name "Racing"}
                    #:com.boardgamegeek.category{:id 1027,
                                                 :name "Trivia"}
                    #:com.boardgamegeek.category{:id 1025,
                                                 :name "Word Game"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 12,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "3818",
              :languages (list "en"),
              :game/name "Alias",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/b5ku0ffAvzeBydiOUDVELw__thumb/img/hG6aNU1hiiXwopQ6XexCM_q9aRI=/fit-in/200x150/filters:strip_icc()/pic451300.jpg"},
             #uuid "110f4e5f-593e-3ca2-819e-29dab8ad6f55"
             {:game/id #uuid "110f4e5f-593e-3ca2-819e-29dab8ad6f55",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2018,
                                                 :name
                                                 "Campaign / Battle Card Driven"}),
              :name "Allies Realm of Wonder",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "182172",
              :game/name "Allies: Realm of Wonder",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/bGm33oVfySVB-XraX-eO4Q__thumb/img/xofGdDpiE2Ll-bnaiOxWunMK5uE=/fit-in/200x150/filters:strip_icc()/pic2728113.jpg"},
             #uuid "46abbae9-5fbc-3520-9ed2-16c2901bdbae"
             {:languages (list "cz"),
              :name "Andor",
              :game/id #uuid "46abbae9-5fbc-3520-9ed2-16c2901bdbae",
              :game/name "Andor"},
             #uuid "01c751b5-3d59-3358-a6e3-3ab7ddceb42f"
             {:game/id #uuid "01c751b5-3d59-3358-a6e3-3ab7ddceb42f",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2028,
                                                 :name
                                                 "Role Playing"}),
              :name "Animal suspect",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "156461",
              :languages (list "en" "fr"),
              :game/name "Animal Suspect",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/h8Q9KnX4hTGSEelmx_d7Fw__thumb/img/J_5RAm0xK7FOVwGwYxPS9XtkXsQ=/fit-in/200x150/filters:strip_icc()/pic1958135.jpg"},
             #uuid "0746ccba-be89-3d2f-a4b6-af590e489ff0"
             {:game/id #uuid "0746ccba-be89-3d2f-a4b6-af590e489ff0",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2906,
                                                 :name
                                                 "I Cut, You Choose"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Animals on Board",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "191572",
              :languages (list "cz" "en"),
              :game/name "Animals on Board",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/NLgUgFH88DJogE-16PPFsw__thumb/img/CuInp1YTUxTZlrIi3TMTcUwQcKs=/fit-in/200x150/filters:strip_icc()/pic2845593.jpg"},
             #uuid "cbed48f7-5fef-3645-9ebc-db33807e504c"
             {:game/id #uuid "cbed48f7-5fef-3645-9ebc-db33807e504c",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2060,
                                                 :name
                                                 "Pattern Recognition"}
                    #:com.boardgamegeek.mechanic{:id 2991,
                                                 :name
                                                 "Speed Matching"}),
              :name "Anomia",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}
                    #:com.boardgamegeek.category{:id 1027,
                                                 :name "Trivia"}
                    #:com.boardgamegeek.category{:id 1025,
                                                 :name "Word Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "67877",
              :languages (list "en"),
              :game/name "Anomia",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/OvOpd-Lhl7t3h9fF_qi6lQ__thumb/img/002NO49Pl3-9dPUj43StWt0SS2c=/fit-in/200x150/filters:strip_icc()/pic2527529.jpg"},
             #uuid "e3a13cf1-2d4f-3a6a-9791-62315cf53ba2"
             {:game/id #uuid "e3a13cf1-2d4f-3a6a-9791-62315cf53ba2",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2046,
                                                 :name "Area Movement"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2813,
                                                 :name "Rondel"}),
              :name "Antike Duellum",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1050,
                                                 :name "Ancient"}
                    #:com.boardgamegeek.category{:id 1015,
                                                 :name "Civilization"}
                    #:com.boardgamegeek.category{:id 1086,
                                                 :name
                                                 "Territory Building"}),
              :com.boardgamegeek.boardgame/max-play-time 75,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 75,
              :com.boardgamegeek.boardgame/id "104955",
              :languages (list "de" "en"),
              :game/name "Antike Duellum",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/zwhI40_3em8zJjrmbT6TLQ__thumb/img/Tzl4gVEbeokaDg0MlJQw_9tHvB0=/fit-in/200x150/filters:strip_icc()/pic1282841.jpg"},
             #uuid "ac19727b-672c-352f-b393-c52a81b055cb"
             {:game/id #uuid "ac19727b-672c-352f-b393-c52a81b055cb",
              :com.boardgamegeek.boardgame/min-players 4,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2865,
                                                 :name "Player Judge"}
                    #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}),
              :name "Apples to Apples",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 10,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "74",
              :languages (list "en"),
              :game/name "Apples to Apples",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/S5GzB_f2Re3kEDoSxqG5Ew__thumb/img/kJ1JQ_d9xEZ00sJ1dLvwyQYiQUA=/fit-in/200x150/filters:strip_icc()/pic213515.jpg"},
             #uuid "109a021a-56f4-3223-ae04-902a1f40db16"
             {:game/id #uuid "109a021a-56f4-3223-ae04-902a1f40db16",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2046,
                                                 :name "Area Movement"}
                    #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2078,
                                                 :name
                                                 "Point to Point Movement"}
                    #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Archmage",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}
                    #:com.boardgamegeek.category{:id 1120,
                                                 :name
                                                 "Print & Play"}),
              :com.boardgamegeek.boardgame/max-play-time 360,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 360,
              :com.boardgamegeek.boardgame/id "63072",
              :languages (list "en"),
              :game/name "ArchMage",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/COo1f6uDP89xUU2s94Onqg__thumb/img/l0kYMdxShODYCnewDFYljQGtp20=/fit-in/200x150/filters:strip_icc()/pic616853.jpg"},
             #uuid "492b7750-c3e8-3055-a93b-6745391300a6"
             {:game/id #uuid "492b7750-c3e8-3055-a93b-6745391300a6",
              :com.boardgamegeek.boardgame/min-players 2,
              :name "Aristocracy",
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "104423",
              :languages (list "en"),
              :game/name "Aristocracy"},
             #uuid "28e54304-62fc-38c9-9b76-058878323d57"
             {:game/id #uuid "28e54304-62fc-38c9-9b76-058878323d57",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}
                    #:com.boardgamegeek.mechanic{:id 2028,
                                                 :name "Role Playing"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Arkham Horror",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1022,
                                                 :name "Adventure"}
                    #:com.boardgamegeek.category{:id 1024,
                                                 :name "Horror"}
                    #:com.boardgamegeek.category{:id 1093,
                                                 :name "Novel-based"}),
              :com.boardgamegeek.boardgame/max-play-time 180,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 180,
              :com.boardgamegeek.boardgame/id "34",
              :languages (list "cz"),
              :game/name "Arkham Horror",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/AhS53CO05pBagyr9EfRazg__thumb/img/vkAI2JcO2v2Y_pO1Fi5shUGzCxc=/fit-in/200x150/filters:strip_icc()/pic5747491.jpg"},
             #uuid "7ca15329-76d2-3582-a841-424d17ec0f0b"
             {:game/id #uuid "7ca15329-76d2-3582-a841-424d17ec0f0b",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2078,
                                                 :name
                                                 "Point to Point Movement"}),
              :name "Around the world in 80 days",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1093,
                                                 :name "Novel-based"}
                    #:com.boardgamegeek.category{:id 1031,
                                                 :name "Racing"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "414",
              :languages (list "en"),
              :game/name "Around the World in 80 Days",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/mXes1H5HlEcb0VRFObYcJQ__thumb/img/yUatX2NYK46nUosAvEyjdb9xjEo=/fit-in/200x150/filters:strip_icc()/pic664642.jpg"},
             #uuid "a408c9e7-3639-3621-b65f-1f8aeea37b18"
             {:game/id #uuid "a408c9e7-3639-3621-b65f-1f8aeea37b18",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2008,
                                                 :name "Trading"}
                    #:com.boardgamegeek.mechanic{:id 2017,
                                                 :name "Voting"}),
              :name "Article 27",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1026,
                                                 :name "Negotiation"}
                    #:com.boardgamegeek.category{:id 1001,
                                                 :name "Political"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "113293",
              :languages (list "en"),
              :game/name "Article 27: The UN Security Council Game",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/kyB2tDm5oTwjXzG_H0UW6g__thumb/img/1xOJs8f92Rvn_y00wPfhq8JeiXI=/fit-in/200x150/filters:strip_icc()/pic1309420.jpg"},
             #uuid "edbf5fa9-4b8b-3458-ace1-fe46640503a1"
             {:game/id #uuid "edbf5fa9-4b8b-3458-ace1-fe46640503a1",
              :com.boardgamegeek.boardgame/min-players 4,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}),
              :name "Articulate",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1025,
                                                 :name "Word Game"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "6541",
              :languages (list "en"),
              :game/name "Articulate!",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/BOvTyp_E-3UXcWpD9bVYog__thumb/img/CqwJb6xbDjdfVlIrNK3PjRXEn3A=/fit-in/200x150/filters:strip_icc()/pic5885634.jpg"},
             #uuid "7d9e8262-8714-332c-9ca9-ac68c68596b5"
             {:game/id #uuid "7d9e8262-8714-332c-9ca9-ac68c68596b5",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Artifact stack",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1022,
                                                 :name "Adventure"}
                    #:com.boardgamegeek.category{:id 1050,
                                                 :name "Ancient"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1020,
                                                 :name "Exploration"}),
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "236556",
              :languages (list "en"),
              :game/name "Artifact Stack",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/0q6H2VDztoXvH5H7nBQAnQ__thumb/img/PN2vWRy9uhQc1FAxFPMF4OXzruM=/fit-in/200x150/filters:strip_icc()/pic3769855.jpg"},
             #uuid "358a9cb1-8677-3a1b-90ac-1c8d6ffa6288"
             {:languages (list "en"),
              :name "Ashes Rise of the Pheonixborn",
              :game/id #uuid "358a9cb1-8677-3a1b-90ac-1c8d6ffa6288",
              :game/name "Ashes Rise of the Pheonixborn"},
             #uuid "da7d7bb0-2a43-3cd7-8ea7-21c4eb8ae388"
             {:game/id #uuid "da7d7bb0-2a43-3cd7-8ea7-21c4eb8ae388",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 3002,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2008,
                                                 :name "Trading"}),
              :name "Awkward Guests",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 1064,
                                                 :name
                                                 "Movies / TV / Radio theme"}
                    #:com.boardgamegeek.category{:id 1040,
                                                 :name
                                                 "Murder/Mystery"}),
              :com.boardgamegeek.boardgame/max-play-time 75,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "188866",
              :languages (list "en"),
              :game/name "Awkward Guests",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Awopfw5_5Qyh-7YcSbtudA__thumb/img/HHn3So0Mum6VZliDmEnB2LwfeQ0=/fit-in/200x150/filters:strip_icc()/pic4870482.jpg"},
             #uuid "79a39a92-dda9-376e-b337-e86bdbbc3864"
             {:game/id #uuid "79a39a92-dda9-376e-b337-e86bdbbc3864",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2046,
                                                 :name "Area Movement"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2863,
                                                 :name
                                                 "Minimap Resolution"}
                    #:com.boardgamegeek.mechanic{:id 2853,
                                                 :name
                                                 "Stat Check Resolution"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}),
              :name "Axis and Allies",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1019,
                                                 :name "Wargame"}
                    #:com.boardgamegeek.category{:id 1049,
                                                 :name
                                                 "World War II"}),
              :com.boardgamegeek.boardgame/max-play-time 180,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 180,
              :com.boardgamegeek.boardgame/id "98",
              :languages (list "en"),
              :game/name "Axis & Allies",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/pWUe-w4DpXdcmH6GqbZqCw__thumb/img/T03oThwiFNU19-9XppxmcQ7_rMs=/fit-in/200x150/filters:strip_icc()/pic24006.jpg"},
             #uuid "582d2648-b634-3370-a31e-bef979dab3f3"
             {:game/id #uuid "582d2648-b634-3370-a31e-bef979dab3f3",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2875,
                                                 :name
                                                 "End Game Bonuses"}
                    #:com.boardgamegeek.mechanic{:id 2048,
                                                 :name
                                                 "Pattern Building"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}
                    #:com.boardgamegeek.mechanic{:id 2829,
                                                 :name
                                                 "Turn Order: Claim Action"}),
              :name "Azul",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1028,
                                                 :name "Puzzle"}
                    #:com.boardgamegeek.category{:id 1070,
                                                 :name "Renaissance"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "230802",
              :game/name "Azul",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/tz19PfklMdAdjxV9WArraA__thumb/img/debo694HgBaIBeNGyxu1ELUbQGA=/fit-in/200x150/filters:strip_icc()/pic3718275.jpg"},
             #uuid "5af4832c-3c6d-3e4b-883d-4fbba7190317"
             {:game/id #uuid "5af4832c-3c6d-3e4b-883d-4fbba7190317",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2891,
                                                 :name "Hidden Roles"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}
                    #:com.boardgamegeek.mechanic{:id 2870,
                                                 :name
                                                 "Re-rolling and Locking"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Bang: The Dice Game",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1055,
                                                 :name "American West"}
                    #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "143741",
              :languages (list "cz"),
              :game/name "BANG! The Dice Game",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/BLTFau1Ue-gjX6geQdYrjQ__thumb/img/IijBpyOQC760F6XIw34WT0ePqe4=/fit-in/200x150/filters:strip_icc()/pic2909713.jpg"},
             #uuid "2e89598e-c81e-39d5-bae2-aee451063265"
             {:game/id #uuid "2e89598e-c81e-39d5-bae2-aee451063265",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2847,
                                                 :name
                                                 "Advantage Token"}
                    #:com.boardgamegeek.mechanic{:id 2014,
                                                 :name
                                                 "Betting and Bluffing"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}
                    #:com.boardgamegeek.mechanic{:id 2939,
                                                 :name
                                                 "Track Movement"}),
              :name "Backgammon",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "2397",
              :game/name "Backgammon",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/_6HVCuGni6NunlrSje0ySQ__thumb/img/FS7YID4DgqMBppP0nhyG52MP7Xk=/fit-in/200x150/filters:strip_icc()/pic1361122.jpg"},
             #uuid "bb8434ca-528e-3b5f-bfc5-5eebbe2c00a0"
             {:game/id #uuid "bb8434ca-528e-3b5f-bfc5-5eebbe2c00a0",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}),
              :name "Bananagrams",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}
                    #:com.boardgamegeek.category{:id 1025,
                                                 :name "Word Game"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "27225",
              :languages (list "en"),
              :game/name "Bananagrams",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/1QjYPI4bXx4OUMJPlrsNBA__thumb/img/nC_gG-4CYy7VBfYez2qSfTkU2ik=/fit-in/200x150/filters:strip_icc()/pic2463443.jpg"},
             #uuid "526e6774-4f0b-3073-9ec1-7c191c62d24c"
             {:languages (list "cz"),
              :name "Bang",
              :game/id #uuid "526e6774-4f0b-3073-9ec1-7c191c62d24c",
              :game/name "Bang"},
             #uuid "24380876-a0ae-3b46-a8c6-a092619bef37"
             {:languages (list "cz"),
              :name "Bang Duel",
              :game/id #uuid "24380876-a0ae-3b46-a8c6-a092619bef37",
              :game/name "Bang Duel"},
             #uuid "3be646fb-70d6-3079-b0a7-35b697a011c8"
             {:languages (list "cz"),
              :name "Bang Mesto Duchu",
              :game/id #uuid "3be646fb-70d6-3079-b0a7-35b697a011c8",
              :game/name "Bang Mesto Duchu",
              :com.boardgamegeek.boardgame/id "147918"},
             #uuid "d8ebf6a0-f01a-377d-82c8-e903e801973b"
             {:name "Barracuda",
              :game/id #uuid "d8ebf6a0-f01a-377d-82c8-e903e801973b",
              :game/name "Barracuda",
              :com.boardgamegeek.boardgame/id "47307",
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/ByH9-4VoBOrYHrZ6on8IKQ__thumb/img/6CauS6bPub0en7IPxfYY3P38Jso=/fit-in/200x150/filters:strip_icc()/pic512503.jpg",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"})},
             #uuid "a0969dfc-5294-3b41-82bf-220e859197db"
             {:game/id #uuid "a0969dfc-5294-3b41-82bf-220e859197db",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2001,
                                                 :name "Action Points"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}),
              :name "Bears vs. Babies",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1116,
                                                 :name
                                                 "Comic Book / Strip"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "211534",
              :languages (list "en"),
              :game/name "Bears vs Babies",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/iJpO2VOezeMXuclGqR_mXg__thumb/img/GrVBkH_kUoL5lszRkFTOZFMCEVg=/fit-in/200x150/filters:strip_icc()/pic3231155.png"},
             #uuid "3e302b86-f47c-3d22-9b4d-c253439d9970"
             {:game/id #uuid "3e302b86-f47c-3d22-9b4d-c253439d9970",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2689,
                                                 :name "Action Queue"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}),
              :name "Beasty Bar",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "165950",
              :languages (list "cz" "en"),
              :game/name "Beasty Bar",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/7_y1dbU5GCYhIRBCO0q7rg__thumb/img/WiuNMDiiM38EHOAdW5MB1ldlEJM=/fit-in/200x150/filters:strip_icc()/pic2241067.jpg"},
             #uuid "941e3f4a-24d8-3841-8144-e9db47d6f92b"
             {:game/id #uuid "941e3f4a-24d8-3841-8144-e9db47d6f92b",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}),
              :name "Beasty Bar 3: Born to be Wild",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "286657",
              :game/name "Beasty Bar 3: Born to Be Wild",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/e_en-vwHgXusEclcKWS4bg__thumb/img/x3iJI8QoTkK7Ptp_N_tq3-bpb5E=/fit-in/200x150/filters:strip_icc()/pic4909349.jpg"},
             #uuid "660cb8dd-c782-3542-8db8-9e1dc61af856"
             {:game/id #uuid "660cb8dd-c782-3542-8db8-9e1dc61af856",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}),
              :name "Beasty Bar New Beasts in Town",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "181617",
              :languages (list "cz" "en"),
              :game/name "Beasty Bar: New Beasts in Town",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/fKOPzIhkT_wVhZWvq267sQ__thumb/img/ULXgCaaXwTKJDhHncpI1acXOQLk=/fit-in/200x150/filters:strip_icc()/pic2672397.jpg"},
             #uuid "c413a292-7a46-3ea3-aa4d-896b4b1e78e0"
             {:game/id #uuid "c413a292-7a46-3ea3-aa4d-896b4b1e78e0",
              :com.boardgamegeek.boardgame/min-players 2,
              :name "Bed Bugs",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1032,
                                                 :name
                                                 "Action / Dexterity"}
                    #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}),
              :com.boardgamegeek.boardgame/max-play-time 10,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "8486",
              :languages (list "en"),
              :game/name "Bed Bugs",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Z1xhttA6vW5rvCK5I32OKg__thumb/img/xBSbnbvzTDYqOwgt-l1hklMax6A=/fit-in/200x150/filters:strip_icc()/pic35248.jpg"},
             #uuid "0f2e7cd3-2595-3b1b-b656-cb103be3e521"
             {:game/id #uuid "0f2e7cd3-2595-3b1b-b656-cb103be3e521",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Belle of the Ball",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "139897",
              :languages (list "en"),
              :game/name "Belle of the Ball",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/JMVcMUrZC-K3DjeuHFXhjw__thumb/img/uPIXh-8lRCEdmN6Np3Ze_XbW86I=/fit-in/200x150/filters:strip_icc()/pic4593784.jpg"},
             #uuid "6f074a1d-f38a-33df-b9d8-d724a8ed3410"
             {:languages (list "en"),
              :name "Between 2 Cities",
              :game/id #uuid "6f074a1d-f38a-33df-b9d8-d724a8ed3410",
              :game/name "Between 2 Cities"},
             #uuid "3c213740-1920-3b32-acb4-a2877cd7aa17"
             {:game/id #uuid "3c213740-1920-3b32-acb4-a2877cd7aa17",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2027,
                                                 :name "Storytelling"}
                    #:com.boardgamegeek.mechanic{:id 2017,
                                                 :name "Voting"}),
              :name "Billionaire Banshee",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1101,
                                                 :name
                                                 "Video Game Theme"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 15,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "158564",
              :languages (list "en"),
              :game/name "Billionaire Banshee",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Pe8iAvlyTOzVINQRdFdcig__thumb/img/iXmFA-7_cNegyHs8nKD4rTv2O1k=/fit-in/200x150/filters:strip_icc()/pic2729693.png"},
             #uuid "51a7df93-adb9-3cee-bc0c-05f7dc89f774"
             {:languages (list "cz"),
              :name "Blafuj / Cockroach Poker",
              :game/id #uuid "51a7df93-adb9-3cee-bc0c-05f7dc89f774",
              :game/name "Blafuj / Cockroach Poker"},
             #uuid "c180dcbb-f5dd-3cdf-acb3-dfe83bc594ec"
             {:game/id #uuid "c180dcbb-f5dd-3cdf-acb3-dfe83bc594ec",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2001,
                                                 :name "Action Points"}
                    #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2046,
                                                 :name "Area Movement"}
                    #:com.boardgamegeek.mechanic{:id 2984,
                                                 :name "Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}),
              :name "Blood Rage",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}
                    #:com.boardgamegeek.category{:id 1047,
                                                 :name "Miniatures"}
                    #:com.boardgamegeek.category{:id 1082,
                                                 :name "Mythology"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "170216",
              :languages (list "cz"),
              :game/name "Blood Rage",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/HkZSJfQnZ3EpS214xtuplg__thumb/img/NLhVdU8xazrgS5dA6nVCYmN2DNI=/fit-in/200x150/filters:strip_icc()/pic2439223.jpg"},
             #uuid "def6402b-3a6f-30cb-aeb3-63cd5cefb20d"
             {:game/id #uuid "def6402b-3a6f-30cb-aeb3-63cd5cefb20d",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2048,
                                                 :name
                                                 "Pattern Building"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "BluePrints",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "140933",
              :languages (list "en"),
              :game/name "Blueprints",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/yj0dJI3pFauW-EU9Vg6OZw__thumb/img/TVG6p598iOhPeDZuVWy6QCTzOi4=/fit-in/200x150/filters:strip_icc()/pic1877243.jpg"},
             #uuid "bf684d42-7071-39ee-809d-514bc5ca241a"
             {:game/id #uuid "bf684d42-7071-39ee-809d-514bc5ca241a",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}),
              :name "Bomb Arena",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "208145",
              :languages (list "en"),
              :game/name "Bomb Arena",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/JY8Q5GbG2aa4257QVuCQTw__thumb/img/IvRKbdnGi50C_HHIWu1VD0i3VYA=/fit-in/200x150/filters:strip_icc()/pic3175138.jpg"},
             #uuid "be01908f-633f-35da-be89-80701db8ed25"
             {:game/id #uuid "be01908f-633f-35da-be89-80701db8ed25",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2014,
                                                 :name
                                                 "Betting and Bluffing"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2875,
                                                 :name
                                                 "End Game Bonuses"}
                    #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}
                    #:com.boardgamegeek.mechanic{:id 2939,
                                                 :name
                                                 "Track Movement"}
                    #:com.boardgamegeek.mechanic{:id 2897,
                                                 :name
                                                 "Variable Set-up"}),
              :name "Camel Up",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}
                    #:com.boardgamegeek.category{:id 1031,
                                                 :name "Racing"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "153938",
              :languages (list "de" "en"),
              :game/name "Camel Up",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/1ph2jVOD1MudR1fK1nkwwA__thumb/img/TVCsLhF3KMZkFs6oLJkS37njE_s=/fit-in/200x150/filters:strip_icc()/pic2031446.png"},
             #uuid "7c1ada9b-f78c-379d-a6a7-b3018581aab9"
             {:game/id #uuid "7c1ada9b-f78c-379d-a6a7-b3018581aab9",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}),
              :name "Can’t stop",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "41",
              :languages (list "en"),
              :game/name "Can't Stop",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/JZpo3AnyFH4TqxKWFSFKGQ__thumb/img/KxfmwuPAgmmNACBQkxIaYUxKdLI=/fit-in/200x150/filters:strip_icc()/pic1046518.jpg"},
             #uuid "a4a4e5f6-a7ab-31b8-8ec1-0983b264ed4b"
             {:languages (list "en"),
              :name "Captain Dice",
              :game/id #uuid "a4a4e5f6-a7ab-31b8-8ec1-0983b264ed4b",
              :game/name "Captain Dice"},
             #uuid "06c5d6ce-c062-3ac0-bd43-6186b663fc10"
             {:game/id #uuid "06c5d6ce-c062-3ac0-bd43-6186b663fc10",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2967,
                                                 :name
                                                 "Hidden Movement"}
                    #:com.boardgamegeek.mechanic{:id 2039,
                                                 :name "Line Drawing"}
                    #:com.boardgamegeek.mechanic{:id 2831,
                                                 :name "Real-Time"}
                    #:com.boardgamegeek.mechanic{:id 2028,
                                                 :name "Role Playing"}
                    #:com.boardgamegeek.mechanic{:id 2016,
                                                 :name
                                                 "Secret Unit Deployment"}
                    #:com.boardgamegeek.mechanic{:id 2070,
                                                 :name "Simulation"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}),
              :name "Captain Sonar",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}
                    #:com.boardgamegeek.category{:id 1008,
                                                 :name "Nautical"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "171131",
              :languages (list "cz" "en"),
              :game/name "Captain Sonar",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/eVy9IyAVtzzKv2VvPHFPbA__thumb/img/RavsPCF6el7VEaVR1OG5M2ZGCrk=/fit-in/200x150/filters:strip_icc()/pic3013621.png"},
             #uuid "06e9bd9c-0975-32da-acdf-2b1942d57f1e"
             {:game/id #uuid "06e9bd9c-0975-32da-acdf-2b1942d57f1e",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2959,
                                                 :name "Map Addition"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}),
              :name "Carcassonne",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1029,
                                                 :name "City Building"}
                    #:com.boardgamegeek.category{:id 1035,
                                                 :name "Medieval"}
                    #:com.boardgamegeek.category{:id 1086,
                                                 :name
                                                 "Territory Building"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "822",
              :game/name "Carcassonne",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Z3upN53-fsVPUDimN9SpOA__thumb/img/_C5pWATlaq3uS8u7IlFb0WMi_ak=/fit-in/200x150/filters:strip_icc()/pic2337577.jpg"},
             #uuid "7e7fdd38-98cc-3f0f-a059-308e820a2013"
             {:game/id #uuid "7e7fdd38-98cc-3f0f-a059-308e820a2013",
              :com.boardgamegeek.boardgame/min-players 4,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2865,
                                                 :name "Player Judge"}
                    #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}),
              :name "Cards against Humanity",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 1118,
                                                 :name
                                                 "Mature / Adult"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1120,
                                                 :name
                                                 "Print & Play"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 30,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "50381",
              :languages (list "cz" "en"),
              :game/name "Cards Against Humanity",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/nYLrPiI9gnvlrwOrKQ4_CA__thumb/img/fIhQLjWueNPYZhCZ_LzjAIhPm5U=/fit-in/200x150/filters:strip_icc()/pic2909692.jpg"},
             #uuid "890488d0-a370-30a4-9788-a44754330b27"
             {:game/id #uuid "890488d0-a370-30a4-9788-a44754330b27",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2984,
                                                 :name "Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Obludárium",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "231484",
              :languages (list "cz"),
              :game/name "Carnival of Monsters",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/epQCPLfMbtaKiXmz7uz4PA__thumb/img/b1rgSddValol8h1Ock8s_9peBPc=/fit-in/200x150/filters:strip_icc()/pic4856068.jpg"},
             #uuid "8ec8175e-8c92-3f65-a885-97c16ca93454"
             {:languages (list "cz"),
              :name "Carovny Klobouk",
              :game/id #uuid "8ec8175e-8c92-3f65-a885-97c16ca93454",
              :game/name "Carovny Klobouk"},
             #uuid "59ccf897-4368-3ab7-ae8e-0ac969872f6e"
             {:game/id #uuid "59ccf897-4368-3ab7-ae8e-0ac969872f6e",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Kočíčí Klub",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "228504",
              :languages (list "cz"),
              :game/name "Cat Lady",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/tnx6ExxyUmIlga9tFSrR6g__thumb/img/jHvb__-N4QCSB8rhTKXzCxWOWcU=/fit-in/200x150/filters:strip_icc()/pic3864115.jpg"},
             #uuid "48309f49-6981-3784-80f4-f8b7cff15c98"
             {:game/id #uuid "48309f49-6981-3784-80f4-f8b7cff15c98",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2026,
                                                 :name "Hexagon Grid"}
                    #:com.boardgamegeek.mechanic{:id 2902,
                                                 :name "Income"}
                    #:com.boardgamegeek.mechanic{:id 2011,
                                                 :name "Modular Board"}
                    #:com.boardgamegeek.mechanic{:id 2081,
                                                 :name
                                                 "Network and Route Building"}
                    #:com.boardgamegeek.mechanic{:id 2876,
                                                 :name "Race"}
                    #:com.boardgamegeek.mechanic{:id 2909,
                                                 :name
                                                 "Random Production"}
                    #:com.boardgamegeek.mechanic{:id 2008,
                                                 :name "Trading"}
                    #:com.boardgamegeek.mechanic{:id 2897,
                                                 :name
                                                 "Variable Set-up"}),
              :name "Osadnici z Katanu",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1026,
                                                 :name "Negotiation"}),
              :com.boardgamegeek.boardgame/max-play-time 120,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "13",
              :languages (list "cz"),
              :game/name "Catan",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/W3Bsga_uLP9kO91gZ7H8yw__thumb/img/8a9HeqFydO7Uun_le9bXWPnidcA=/fit-in/200x150/filters:strip_icc()/pic2419375.jpg"},
             #uuid "d9878711-9bbd-343b-bb79-ba45904cc23c"
             {:game/id #uuid "d9878711-9bbd-343b-bb79-ba45904cc23c",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}
                    #:com.boardgamegeek.mechanic{:id 2082,
                                                 :name
                                                 "Worker Placement"}
                    #:com.boardgamegeek.mechanic{:id 2935,
                                                 :name
                                                 "Worker Placement with Dice Workers"}),
              :name "Cavern Tavern",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}),
              :com.boardgamegeek.boardgame/max-play-time 120,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "189067",
              :languages (list "en"),
              :game/name "Cavern Tavern",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/NdCwfRORG5oLaDBmQeOOaQ__thumb/img/jeGf0ItclxtK4YeTWrBlBCe8Qt4=/fit-in/200x150/filters:strip_icc()/pic3020188.png"},
             #uuid "7b6a839b-181c-3d7e-a88a-1115d8a027c2"
             {:languages (list "cz"),
              :name "Caverna",
              :game/id #uuid "7b6a839b-181c-3d7e-a88a-1115d8a027c2",
              :game/name "Caverna"},
             #uuid "dd86edfc-d85e-3039-9399-5c282a2e3524"
             {:game/id #uuid "dd86edfc-d85e-3039-9399-5c282a2e3524",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}),
              :name "Celestia",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1113,
                                                 :name
                                                 "Space Exploration"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "130853",
              :game/name "Celestia",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/npqKJbeLXejp0j2ECQ5huA__thumb/img/ur42OT9MelTa6X3lPbnwN5WG-iU=/fit-in/200x150/filters:strip_icc()/pic1475228.png"},
             #uuid "595f5c4f-c267-303b-adf4-1333c70a9460"
             {:game/id #uuid "595f5c4f-c267-303b-adf4-1333c70a9460",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2060,
                                                 :name
                                                 "Pattern Recognition"}),
              :name "Cha Dango",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1120,
                                                 :name "Print & Play"}
                    #:com.boardgamegeek.category{:id 1028,
                                                 :name "Puzzle"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}),
              :com.boardgamegeek.boardgame/max-play-time 25,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "181694",
              :languages (list "en"),
              :game/name "Cha dango",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/1NJNf0z5guEZ2L713YNzPw__thumb/img/fMswkQDBdqiVpfiPOIAA6FY7PLo=/fit-in/200x150/filters:strip_icc()/pic4791211.jpg"},
             #uuid "1a30c214-a750-3e08-97aa-c85a7fa01368"
             {:game/id #uuid "1a30c214-a750-3e08-97aa-c85a7fa01368",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Chameleon",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "4187",
              :languages (list "en"),
              :game/name "Chameleon",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Mq4HaM5jARaNQ_jrTnGfnA__thumb/img/cRlXz4uT63-BkyRJIJX-0vKywKo=/fit-in/200x150/filters:strip_icc()/pic13110.jpg"},
             #uuid "30c12229-f508-341c-9680-149dbdf88523"
             {:game/id #uuid "30c12229-f508-341c-9680-149dbdf88523",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2946,
                                                 :name
                                                 "Pattern Movement"}
                    #:com.boardgamegeek.mechanic{:id 2940,
                                                 :name "Square Grid"}
                    #:com.boardgamegeek.mechanic{:id 2861,
                                                 :name
                                                 "Static Capture"}),
              :name "Checkers",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1116,
                                                 :name
                                                 "Comic Book / Strip"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "2083",
              :game/name "Checkers",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/S4IBcWYhlbn51_5f0EIR4g__thumb/img/wxqQxa2--TclJY8n8hzMGXzk1sI=/fit-in/200x150/filters:strip_icc()/pic113720.jpg"},
             #uuid "0727c24e-c484-3017-9850-a0e366a7dd42"
             {:game/id #uuid "0727c24e-c484-3017-9850-a0e366a7dd42",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2946,
                                                 :name
                                                 "Pattern Movement"}
                    #:com.boardgamegeek.mechanic{:id 2940,
                                                 :name "Square Grid"}
                    #:com.boardgamegeek.mechanic{:id 2861,
                                                 :name
                                                 "Static Capture"}),
              :name "Chess",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "171",
              :game/name "Chess",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/0-DjGBOko6RV8zg5ejhYIg__thumb/img/kjtoinSrkYV0HZleXMxkJzZwS8k=/fit-in/200x150/filters:strip_icc()/pic260745.jpg"},
             #uuid "f821ee04-f104-3d22-96a6-9bab12eb4c28"
             {:game/id #uuid "f821ee04-f104-3d22-96a6-9bab12eb4c28",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}),
              :name "Kureci olympiada",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1045,
                                                 :name "Memory"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "3570",
              :languages (list "cz" "de"),
              :game/name "Chicken Cha Cha Cha",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/ZxGfy7AR2mjrKVDiDVJoBw__thumb/img/8oLfdlwvjgqVlU4tZXSSnPyUwi0=/fit-in/200x150/filters:strip_icc()/pic406697.jpg"},
             #uuid "e0dfaae0-12bd-33ef-94b1-4c34842456b4"
             {:game/id #uuid "e0dfaae0-12bd-33ef-94b1-4c34842456b4",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}
                    #:com.boardgamegeek.mechanic{:id 2829,
                                                 :name
                                                 "Turn Order: Claim Action"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}
                    #:com.boardgamegeek.mechanic{:id 2082,
                                                 :name
                                                 "Worker Placement"}
                    #:com.boardgamegeek.mechanic{:id 2933,
                                                 :name
                                                 "Worker Placement, Different Worker Types"}),
              :name "Chimera Station",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "163642",
              :languages (list "de" "it"),
              :game/name "Chimera Station",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/1CiJrEhD6UpRNFNIy-1R5g__thumb/img/ptY_o-lbmIVvqtbFRRERIODbetk=/fit-in/200x150/filters:strip_icc()/pic3160959.jpg"},
             #uuid "09e49bb6-1f03-33a3-bfbe-8937e2e031e8"
             {:game/id #uuid "09e49bb6-1f03-33a3-bfbe-8937e2e031e8",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2043,
                                                 :name "Enclosure"}
                    #:com.boardgamegeek.mechanic{:id 2902,
                                                 :name "Income"}
                    #:com.boardgamegeek.mechanic{:id 2910,
                                                 :name "Investment"}
                    #:com.boardgamegeek.mechanic{:id 2915,
                                                 :name "Negotiation"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}
                    #:com.boardgamegeek.mechanic{:id 2008,
                                                 :name "Trading"}
                    #:com.boardgamegeek.mechanic{:id 2874,
                                                 :name
                                                 "Victory Points as a Resource"}),
              :name "Chinatown",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1029,
                                                 :name "City Building"}
                    #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1026,
                                                 :name "Negotiation"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "47",
              :languages (list "de" "en"),
              :game/name "Chinatown",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/QnIOe-1wb8_zuxglKjAwOQ__thumb/img/CyDOXyRu7MHfn2ZS9pb9XmOStv0=/fit-in/200x150/filters:strip_icc()/pic2037509.png"},
             #uuid "99102149-c730-3271-a928-b7549ce07a13"
             {:game/id #uuid "99102149-c730-3271-a928-b7549ce07a13",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Chupacabra",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1024,
                                                 :name "Horror"}
                    #:com.boardgamegeek.category{:id 1082,
                                                 :name "Mythology"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "27738",
              :languages (list "en"),
              :game/name "Chupacabra",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/i_thTasR2InYawFGKTyrQg__thumb/img/HtsO-YF_-I5ufs1CtfNF9DcJG7w=/fit-in/200x150/filters:strip_icc()/pic184563.jpg"},
             #uuid "5b349ead-c3fb-374b-bb6c-47fcc3843355"
             {:game/id #uuid "5b349ead-c3fb-374b-bb6c-47fcc3843355",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2838,
                                                 :name
                                                 "Action Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2902,
                                                 :name "Income"}
                    #:com.boardgamegeek.mechanic{:id 2836,
                                                 :name "Lose a Turn"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2833,
                                                 :name
                                                 "Turn Order: Role Order"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Citadela deluxe",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1029,
                                                 :name "City Building"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1035,
                                                 :name "Medieval"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "205398",
              :languages (list "cz"),
              :game/name "Citadels",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/sHd0jkZZLDgixHjAXtn7kA__thumb/img/HB0Z5D7uwBjf1lCCPjMck-5VP9A=/fit-in/200x150/filters:strip_icc()/pic3119514.jpg"},
             #uuid "fb48a85b-84e9-312b-985b-de09b2c0b29f"
             {:game/id #uuid "fb48a85b-84e9-312b-985b-de09b2c0b29f",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 3002,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}
                    #:com.boardgamegeek.mechanic{:id 2940,
                                                 :name "Square Grid"}),
              :name "Clue",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1064,
                                                 :name
                                                 "Movies / TV / Radio theme"}
                    #:com.boardgamegeek.category{:id 1040,
                                                 :name
                                                 "Murder/Mystery"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "1294",
              :languages (list "en"),
              :game/name "Clue",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/owlmDA10KegcwPaapY5auw__thumb/img/73FO0H7pORdum5ZexMXyrjLhpVU=/fit-in/200x150/filters:strip_icc()/pic5146918.png"},
             #uuid "24a04d97-a632-349a-b9b1-bb49af1a096a"
             {:game/id #uuid "24a04d97-a632-349a-b9b1-bb49af1a096a",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2893,
                                                 :name
                                                 "Communication Limits"}
                    #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}),
              :name "Codenames",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1081,
                                                 :name
                                                 "Spies/Secret Agents"}
                    #:com.boardgamegeek.category{:id 1025,
                                                 :name "Word Game"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "178900",
              :game/name "Codenames",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/F_KDEu0GjdClml8N7c8Imw__thumb/img/yl8iXxSNwguMeg3KkmfFO9SMVVc=/fit-in/200x150/filters:strip_icc()/pic2582929.jpg"},
             #uuid "c56337cc-54ed-3e22-8b76-d1092f67310c"
             {:game/id #uuid "c56337cc-54ed-3e22-8b76-d1092f67310c",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2893,
                                                 :name
                                                 "Communication Limits"}
                    #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}),
              :name "Krycí Jména: Duet",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1081,
                                                 :name
                                                 "Spies/Secret Agents"}
                    #:com.boardgamegeek.category{:id 1025,
                                                 :name "Word Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 99,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "224037",
              :languages (list "cz"),
              :game/name "Codenames: Duet",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/0d1EaMVmAiIBROI2QstFSQ__thumb/img/J-thZd7Pbbh1CE8QHcvEE4w8FBE=/fit-in/200x150/filters:strip_icc()/pic3596681.jpg"},
             #uuid "c7b74e13-dff8-3831-98f4-1d81198c1337"
             {:game/id #uuid "c7b74e13-dff8-3831-98f4-1d81198c1337",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2893,
                                                 :name
                                                 "Communication Limits"}
                    #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}),
              :name "Codenames Pictures",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1081,
                                                 :name
                                                 "Spies/Secret Agents"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "198773",
              :languages (list "cz" "en"),
              :game/name "Codenames: Pictures",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Q2u-Nk68Wb1iLjxh_dfsIg__thumb/img/6-1EOESE196KVKw4xOJ5rge56j0=/fit-in/200x150/filters:strip_icc()/pic3476592.jpg"},
             #uuid "d9f82ac3-bc24-3fa7-8292-3fff745ff105"
             {:languages (list "en"),
              :name "Cohort",
              :game/id #uuid "d9f82ac3-bc24-3fa7-8292-3fff745ff105",
              :game/name "Cohort"},
             #uuid "7d1c07ba-7b59-3e65-b308-f82e4f02765e"
             {:game/id #uuid "7d1c07ba-7b59-3e65-b308-f82e4f02765e",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2001,
                                                 :name "Action Points"}
                    #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2046,
                                                 :name "Area Movement"}
                    #:com.boardgamegeek.mechanic{:id 2018,
                                                 :name
                                                 "Campaign / Battle Card Driven"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}),
              :name "Colonialism",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1001,
                                                 :name "Political"}
                    #:com.boardgamegeek.category{:id 2710,
                                                 :name
                                                 "Post-Napoleonic"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 90,
              :com.boardgamegeek.boardgame/id "67917",
              :languages (list "en"),
              :game/name "Colonialism",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/7L38HEji9NCO7l8vJGPNpA__thumb/img/Bil3fnBYfH2sksgWXG6w7-MmRuk=/fit-in/200x150/filters:strip_icc()/pic1613797.jpg"},
             #uuid "08cddb57-6c00-3836-9593-a0b04fd84141"
             {:game/id #uuid "08cddb57-6c00-3836-9593-a0b04fd84141",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Coloretto",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "5782",
              :languages (list "cz" "de" "en"),
              :game/name "Coloretto",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Z_C3ujE0BcRpbQjDd1Vatg__thumb/img/40jfO9cNXB20z1fm6FfSkGf5qVQ=/fit-in/200x150/filters:strip_icc()/pic149765.jpg"},
             #uuid "e8bffbf9-2f40-3bce-837e-bd9538b19c58"
             {:game/id #uuid "e8bffbf9-2f40-3bce-837e-bd9538b19c58",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}
                    #:com.boardgamegeek.mechanic{:id 2082,
                                                 :name
                                                 "Worker Placement"}),
              :name "Colors of Paris",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 2710,
                                                 :name
                                                 "Post-Napoleonic"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 40,
              :com.boardgamegeek.boardgame/id "269160",
              :languages (list "en" "ne"),
              :game/name "Colors of Paris",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/j16Xrf08-toGYZ04HqLoNw__thumb/img/xaIYrg5FuSjX6VRLLd3yL2fcyz4=/fit-in/200x150/filters:strip_icc()/pic4804321.jpg"},
             #uuid "935b4085-0cd3-3875-abe0-2996fb99980b"
             {:game/id #uuid "935b4085-0cd3-3875-abe0-2996fb99980b",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}
                    #:com.boardgamegeek.mechanic{:id 2017,
                                                 :name "Voting"}),
              :name "Color Brain",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1027,
                                                 :name "Trivia"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 12,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "223742",
              :languages (list "en"),
              :game/name "Colour Brain",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/M3KJfjJVOGA6x0LuMgfVWA__thumb/img/BXLhWVUfFkVhEV6BbEa18JOA_a8=/fit-in/200x150/filters:strip_icc()/pic4219953.jpg"},
             #uuid "d0c13971-6116-34f0-ba4f-9f6b16e7b130"
             {:languages (list "en"),
              :name "Commissioner Victor",
              :game/id #uuid "d0c13971-6116-34f0-ba4f-9f6b16e7b130",
              :game/name "Commissioner Victor"},
             #uuid "9353a118-c201-398a-83cc-6d58ccb38f02"
             {:game/id #uuid "9353a118-c201-398a-83cc-6d58ccb38f02",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2839,
                                                 :name
                                                 "Action Retrieval"}
                    #:com.boardgamegeek.mechanic{:id 2847,
                                                 :name
                                                 "Advantage Token"}
                    #:com.boardgamegeek.mechanic{:id 2924,
                                                 :name
                                                 "Auction: Dutch"}
                    #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2664,
                                                 :name
                                                 "Deck, Bag, and Pool Building"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2947,
                                                 :name
                                                 "Movement Points"}
                    #:com.boardgamegeek.mechanic{:id 2078,
                                                 :name
                                                 "Point to Point Movement"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2897,
                                                 :name
                                                 "Variable Set-up"}),
              :name "Concordia",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1050,
                                                 :name "Ancient"}
                    #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1008,
                                                 :name "Nautical"}),
              :com.boardgamegeek.boardgame/max-play-time 100,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 100,
              :com.boardgamegeek.boardgame/id "124361",
              :game/name "Concordia",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/CzwSm8i7tkLz6cBnrILZBg__thumb/img/ESPSltYYSFK-aJw6jOTdQrJGpOc=/fit-in/200x150/filters:strip_icc()/pic3453267.jpg"},
             #uuid "fd3be4f0-d310-39a4-86b8-03524d064ee6"
             {:name "Connect 4 / Quattro",
              :game/id #uuid "fd3be4f0-d310-39a4-86b8-03524d064ee6",
              :game/name "Connect 4 / Quattro"},
             #uuid "0e7278cd-a02a-3c04-86dc-c75a4df34eb2"
             {:game/id #uuid "0e7278cd-a02a-3c04-86dc-c75a4df34eb2",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name
                                                 "Dice Rolling"}),
              :name "Container",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}
                    #:com.boardgamegeek.category{:id 1088,
                                                 :name
                                                 "Industry / Manufacturing"}),
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/id "23463",
              :game/name "Container",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Ci0_OdQ-189r4QjQ_ylWcg__thumb/img/IrzG3AhYwSIeoahynhIV1Ou3ucA=/fit-in/200x150/filters:strip_icc()/pic4821859.jpg"},
             #uuid "701ae3e6-c75d-3e66-ab6a-b255f6fade83"
             {:name "Cortex",
              :game/id #uuid "701ae3e6-c75d-3e66-ab6a-b255f6fade83",
              :game/name "Cortex"},
             #uuid "c8ccad85-82a3-3865-8ad8-a3487faedffb"
             {:game/id #uuid "c8ccad85-82a3-3865-8ad8-a3487faedffb",
              :com.boardgamegeek.boardgame/min-players 2,
              :name "Cortex Geo",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "203266",
              :game/name "Cortex Challenge GEO",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/29gZEF3-jNTJ90wSSAATGw__thumb/img/t2UqBSLQXpKNhyoOvpNPE97d51Q=/fit-in/200x150/filters:strip_icc()/pic3190835.jpg"},
             #uuid "2f266ba4-d63b-34be-8400-6b95a3442ff9"
             {:languages (list "en"),
              :name "Cosmic Enounter",
              :game/id #uuid "2f266ba4-d63b-34be-8400-6b95a3442ff9",
              :game/name "Cosmic Enounter"},
             #uuid "dfa418bd-eebc-3c3f-96b6-edaf5e3c4d89"
             {:game/id #uuid "dfa418bd-eebc-3c3f-96b6-edaf5e3c4d89",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2689,
                                                 :name "Action Queue"}
                    #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2011,
                                                 :name "Modular Board"}
                    #:com.boardgamegeek.mechanic{:id 2965,
                                                 :name "Multiple Maps"}
                    #:com.boardgamegeek.mechanic{:id 2953,
                                                 :name
                                                 "Programmed Movement"}
                    #:com.boardgamegeek.mechanic{:id 2948,
                                                 :name
                                                 "Resource to Move"}
                    #:com.boardgamegeek.mechanic{:id 2003,
                                                 :name
                                                 "Rock-Paper-Scissors"}
                    #:com.boardgamegeek.mechanic{:id 2892,
                                                 :name
                                                 "Roles with Asymmetric Information"}
                    #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "crazy karts",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 1031,
                                                 :name "Racing"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "195518",
              :game/name "Crazy Karts",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/tuz1paociIFCwki_tfN5pg__thumb/img/ZDIypgSQtMDsqbZVCKf3dcDT8sI=/fit-in/200x150/filters:strip_icc()/pic2935361.jpg"},
             #uuid "cf06db18-725b-36dc-8e9c-5246b40aae01"
             {:game/id #uuid "cf06db18-725b-36dc-8e9c-5246b40aae01",
              :com.boardgamegeek.boardgame/min-players 2,
              :name "Crazy Turf",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1031,
                                                 :name "Racing"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "209258",
              :game/name "Crazy Turf",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/BJ7g-5ZBaOcdTg2Uv3T08A__thumb/img/f84XeqVja0Y7bZDoA4G69MY1ooA=/fit-in/200x150/filters:strip_icc()/pic3186921.jpg"},
             #uuid "30933bc2-a19f-3124-9a19-d7b8facdbeeb"
             {:game/id #uuid "30933bc2-a19f-3124-9a19-d7b8facdbeeb",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}),
              :name "Crooks",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1033,
                                                 :name "Mafia"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "111172",
              :game/name "Crooks",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Ddg1cTH9VaLE4aErYjrr0Q__thumb/img/4WGwUngVtEleBc8MuqU4y6mv6kw=/fit-in/200x150/filters:strip_icc()/pic2844726.jpg"},
             #uuid "accf9b44-d60e-36aa-ab3e-293a0e91aed0"
             {:game/id #uuid "accf9b44-d60e-36aa-ab3e-293a0e91aed0",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Cubirds",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "245476",
              :languages (list "en"),
              :game/name "CuBirds",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Q7gnq4qbG73YRprMOicBEQ__thumb/img/-wmmOu7yKFsC89jw5VKqF79AuAw=/fit-in/200x150/filters:strip_icc()/pic4261952.png"},
             #uuid "76a33f97-02f4-3a7e-ada3-46bd2544ae02"
             {:game/id #uuid "76a33f97-02f4-3a7e-ada3-46bd2544ae02",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name
                                                 "Dice Rolling"}),
              :name "Bluff You",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 5,
              :com.boardgamegeek.boardgame/id "201842",
              :languages (list "en"),
              :game/name "Cup of Bluff",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/6sE8yku7XsFyQyb8felYxQ__thumb/img/NhYaVD4IDB4mHOfwnkJEH7xaLBc=/fit-in/200x150/filters:strip_icc()/pic3051680.jpg"},
             #uuid "f72af12f-4736-3bde-84b0-ca91070cf43c"
             {:game/id #uuid "f72af12f-4736-3bde-84b0-ca91070cf43c",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2891,
                                                 :name "Hidden Roles"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}),
              :name "Dany",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "265381",
              :languages (list "en" "fr"),
              :game/name "DANY",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/15ZfT3y5Wndrg7Cxp8BAYg__thumb/img/kJTC0OB3o0_4WwrTPCIFuycpULw=/fit-in/200x150/filters:strip_icc()/pic4465422.jpg"},
             #uuid "648ffc7a-6dd1-39e8-a7f5-7ecb69cc4066"
             {:game/id #uuid "648ffc7a-6dd1-39e8-a7f5-7ecb69cc4066",
              :com.boardgamegeek.boardgame/min-players 2,
              :name "Decrypto",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1025,
                                                 :name "Word Game"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "65952",
              :languages (list "en"),
              :game/name "Decrypto",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/WVGtlwI8Sp0HH4OGozuenA__thumb/img/5Q1OYKZK7_KgwaMZP6eeCUBuwWI=/fit-in/200x150/filters:strip_icc()/pic802013.jpg"},
             #uuid "054f1270-bf79-32f9-825a-96880e800c9f"
             {:game/id #uuid "054f1270-bf79-32f9-825a-96880e800c9f",
              :com.boardgamegeek.boardgame/min-players 2,
              :name "The Endless River",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1032,
                                                 :name
                                                 "Action / Dexterity"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "165797",
              :game/name "Der unendliche Fluss",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/fZdfrPgGqjK-Brsrq7B_hg__thumb/img/OaZhWO7VcHKOg6h8xYOrMagcm7c=/fit-in/200x150/filters:strip_icc()/pic2238168.png"},
             #uuid "86f0bb77-105e-3136-98ae-4837a11ed606"
             {:game/id #uuid "86f0bb77-105e-3136-98ae-4837a11ed606",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2001,
                                                 :name "Action Points"}
                    #:com.boardgamegeek.mechanic{:id 2046,
                                                 :name "Area Movement"}
                    #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}),
              :name "Detective: City of Angels",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1040,
                                                 :name
                                                 "Murder/Mystery"}),
              :com.boardgamegeek.boardgame/max-play-time 150,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "218074",
              :languages (list "en"),
              :game/name "Detective: City of Angels",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/xWdK1lL-2ZTdzBZGYjjqkw__thumb/img/wl_YxOhd-S6QbpyHAQZGhV109rw=/fit-in/200x150/filters:strip_icc()/pic3469246.jpg"},
             #uuid "ef81a392-af64-3668-81ff-2c3b7736919f"
             {:game/id #uuid "ef81a392-af64-3668-81ff-2c3b7736919f",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2081,
                                                 :name
                                                 "Network and Route Building"}
                    #:com.boardgamegeek.mechanic{:id 2008,
                                                 :name "Trading"}),
              :name "Osadnici z Katanu Junior",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1026,
                                                 :name "Negotiation"}
                    #:com.boardgamegeek.category{:id 1090,
                                                 :name "Pirates"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "27766",
              :languages (list "cz"),
              :game/name "Die Siedler von Catan: Junior",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/-wW5iAnqudxpqGmT4YIQ7g__thumb/img/9qS-yi0nySdtOqGzy5a_jsGxEp4=/fit-in/200x150/filters:strip_icc()/pic266168.jpg"},
             #uuid "69895ff2-b990-3611-827e-f4f7fd32eb8a"
             {:game/id #uuid "69895ff2-b990-3611-827e-f4f7fd32eb8a",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2876,
                                                 :name "Race"}
                    #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}
                    #:com.boardgamegeek.mechanic{:id 2027,
                                                 :name "Storytelling"}
                    #:com.boardgamegeek.mechanic{:id 2866,
                                                 :name
                                                 "Targeted Clues"}
                    #:com.boardgamegeek.mechanic{:id 2017,
                                                 :name "Voting"}),
              :name "Dixit",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "39856",
              :game/name "Dixit",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/uSgzS-SClISqDkYRCdUq6g__thumb/img/iLgQV17c4xezI4ZeN_hmue_jh40=/fit-in/200x150/filters:strip_icc()/pic3483909.jpg"},
             #uuid "664d0a6d-1ba3-3b2b-961f-16ce489ff406"
             {:game/id #uuid "664d0a6d-1ba3-3b2b-961f-16ce489ff406",
              :com.boardgamegeek.boardgame/min-players 3,
              :name "Knatsel",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "172164",
              :languages (list "de"),
              :game/name "Dohdles!",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/IXkDic7NjvYnhnb1rgSEIw__thumb/img/pNZbuy9ya2IDGgGPmVKuE2Y_dCQ=/fit-in/200x150/filters:strip_icc()/pic2606161.jpg"},
             #uuid "b2980c72-2a1a-3e7a-b030-3718ce5491d8"
             {:game/id #uuid "b2980c72-2a1a-3e7a-b030-3718ce5491d8",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2664,
                                                 :name
                                                 "Deck, Bag, and Pool Building"}
                    #:com.boardgamegeek.mechanic{:id 2901,
                                                 :name
                                                 "Delayed Purchase"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}
                    #:com.boardgamegeek.mechanic{:id 2897,
                                                 :name
                                                 "Variable Set-up"}),
              :name "Dominion",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1035,
                                                 :name "Medieval"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "36218",
              :languages (list "cz" "en"),
              :game/name "Dominion",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/j6iQpZ4XkemZP07HNCODBA__thumb/img/B2u2ghwlmI_qsUtCwuvcbnBcIqU=/fit-in/200x150/filters:strip_icc()/pic394356.jpg"},
             #uuid "48788b6f-7e50-3fbb-b1a8-772c4139b77a"
             {:game/id #uuid "48788b6f-7e50-3fbb-b1a8-772c4139b77a",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}),
              :name "Don’t Drop the Soap",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1118,
                                                 :name
                                                 "Mature / Adult"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "32687",
              :languages (list "en"),
              :game/name "Don't Drop the Soap",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/LESe-G9vSHtXgFJ5XdJh9w__thumb/img/-0kHTzUikTs-oNfj-JP-RtCesPs=/fit-in/200x150/filters:strip_icc()/pic294901.jpg"},
             #uuid "3ed6a2fa-a80b-3140-9878-53dd29c238b8"
             {:game/id #uuid "3ed6a2fa-a80b-3140-9878-53dd29c238b8",
              :com.boardgamegeek.boardgame/min-players 4,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}),
              :name "Doppelgänger",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "162777",
              :languages (list "en"),
              :game/name "Doppelgänger",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/VUP_YfIMAMRbTqW7Az_z7w__thumb/img/yag9GSN6xhlvxKtphyYsJpmK_Go=/fit-in/200x150/filters:strip_icc()/pic3893983.jpg"},
             #uuid "12218694-0010-31cc-a245-a502b7ed4b19"
             {:game/id #uuid "12218694-0010-31cc-a245-a502b7ed4b19",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2012,
                                                 :name
                                                 "Auction/Bidding"}
                    #:com.boardgamegeek.mechanic{:id 2014,
                                                 :name
                                                 "Betting and Bluffing"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2958,
                                                 :name
                                                 "Moving Multiple Units"}
                    #:com.boardgamegeek.mechanic{:id 2876,
                                                 :name "Race"}
                    #:com.boardgamegeek.mechanic{:id 2939,
                                                 :name
                                                 "Track Movement"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Rivalove",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1031,
                                                 :name "Racing"}
                    #:com.boardgamegeek.category{:id 1038,
                                                 :name "Sports"}),
              :com.boardgamegeek.boardgame/max-play-time 40,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "215311",
              :languages (list "cz"),
              :game/name "Downforce",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/c74C-NVJHuMVxt6A_j2TsA__thumb/img/OUdT3uFyqBBzN7q9ZDFN6WBiecU=/fit-in/200x150/filters:strip_icc()/pic3432548.png"},
             #uuid "4d77e635-44ee-324b-b8e1-1cd07bd913a4"
             {:game/id #uuid "4d77e635-44ee-324b-b8e1-1cd07bd913a4",
              :com.boardgamegeek.boardgame/min-players 2,
              :name "Drop it",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1032,
                                                 :name
                                                 "Action / Dexterity"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "244916",
              :languages (list "cz"),
              :game/name "Drop It",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/kkF3MJrPU-byzAlFbxGYew__thumb/img/y0YSRjiGXFEawazsYFmVVoD3Q94=/fit-in/200x150/filters:strip_icc()/pic3958813.jpg"},
             #uuid "a93478e2-7d6a-36e5-8e4e-8b4c3f632b0c"
             {:languages (list "en"),
              :name "Dude and More Dude",
              :game/id #uuid "a93478e2-7d6a-36e5-8e4e-8b4c3f632b0c",
              :game/name "Dude and More Dude"},
             #uuid "ffbd4d36-9e2e-3949-8c47-2403ba1b4e8a"
             {:game/id #uuid "ffbd4d36-9e2e-3949-8c47-2403ba1b4e8a",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2906,
                                                 :name
                                                 "I Cut, You Choose"}
                    #:com.boardgamegeek.mechanic{:id 2902,
                                                 :name "Income"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Duelosaur Island",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "247236",
              :languages (list "en"),
              :game/name "Duelosaur Island",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/paSj18K2b6r2pH-ax37mNA__thumb/img/EpqB5JtMfimf3pZNDc93Tbk8IXo=/fit-in/200x150/filters:strip_icc()/pic4194135.png"},
             #uuid "ea25ad16-dccd-378f-afde-9dae72c6b4d9"
             {:game/id #uuid "ea25ad16-dccd-378f-afde-9dae72c6b4d9",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2012,
                                                 :name
                                                 "Auction/Bidding"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}
                    #:com.boardgamegeek.mechanic{:id 2082,
                                                 :name
                                                 "Worker Placement"}),
              :name "Priserky z podzemí",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 90,
              :com.boardgamegeek.boardgame/id "97207",
              :languages (list "cz"),
              :game/name "Dungeon Petz",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/7JjAm9RM8E2pbu5KCCbsTQ__thumb/img/vySdmxWBad2T5Xrylxv-jYukFmU=/fit-in/200x150/filters:strip_icc()/pic1103979.jpg"},
             #uuid "de3493ea-6e7c-3152-9c99-22e9e501faf8"
             {:game/id #uuid "de3493ea-6e7c-3152-9c99-22e9e501faf8",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2078,
                                                 :name
                                                 "Point to Point Movement"}
                    #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Dust",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1047,
                                                 :name "Miniatures"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}
                    #:com.boardgamegeek.category{:id 1019,
                                                 :name "Wargame"}),
              :com.boardgamegeek.boardgame/max-play-time 180,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "29109",
              :game/name "Dust",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/qvQEYh6nblN0xGi7J1qYkw__thumb/img/BYCvJ8YyMoMM1QtCn64nMs5-HYM=/fit-in/200x150/filters:strip_icc()/pic280668.jpg"},
             #uuid "bf515360-5eca-32d5-ac9d-fb620b905619"
             {:game/id #uuid "bf515360-5eca-32d5-ac9d-fb620b905619",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2046,
                                                 :name "Area Movement"}
                    #:com.boardgamegeek.mechanic{:id 2924,
                                                 :name
                                                 "Auction: Dutch"}
                    #:com.boardgamegeek.mechanic{:id 2932,
                                                 :name
                                                 "Auction: Dutch Priority"}
                    #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Eight minute empire",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1086,
                                                 :name
                                                 "Territory Building"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 8,
              :com.boardgamegeek.boardgame/id "131366",
              :languages (list "cz"),
              :game/name "Eight-Minute Empire",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/HKj7MIw-zV-AmQ7PfoltRg__thumb/img/W0WHf_M-Dq-xO3yfzVA4USbjcgY=/fit-in/200x150/filters:strip_icc()/pic1443212.jpg"},
             #uuid "434949a6-89e3-3ba2-8e67-412edc26c71f"
             {:game/id #uuid "434949a6-89e3-3ba2-8e67-412edc26c71f",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}),
              :name "El capitan",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1032,
                                                 :name
                                                 "Action / Dexterity"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1045,
                                                 :name "Memory"}
                    #:com.boardgamegeek.category{:id 1090,
                                                 :name "Pirates"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "178937",
              :game/name "El Capitan",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/06VFwFZb99qkd_2yFy480w__thumb/img/xN-XYFKDwdHSpOXRVcasm7H3iWE=/fit-in/200x150/filters:strip_icc()/pic3488237.jpg"},
             #uuid "35af2b0c-b093-3e74-8ed4-e7589938e8ac"
             {:game/id #uuid "35af2b0c-b093-3e74-8ed4-e7589938e8ac",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2078,
                                                 :name
                                                 "Point to Point Movement"}
                    #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}),
              :name "Enigma",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "9607",
              :game/name "Enigma",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/6Yy5wNTGLy6o3GyGHSaCog__thumb/img/eO5w9imJtJVe0T2XiYbQZkw3JNo=/fit-in/200x150/filters:strip_icc()/pic39888.jpg"},
             #uuid "cd19fd52-bf5e-3ad5-8ccf-0d6664374368"
             {:game/id #uuid "cd19fd52-bf5e-3ad5-8ccf-0d6664374368",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}),
              :name "Epic Spell Wars: Panic at the Pleasure Palace",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "248075",
              :languages (list "en"),
              :game/name
              "Epic Spell Wars of the Battle Wizards: Panic at the Pleasure Palace",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/nu23MbouJDmxGBPPKTHuqA__thumb/img/Y_0D4-J2-Kfds6ML28Oowo-pLnQ=/fit-in/200x150/filters:strip_icc()/pic4025218.jpg"},
             #uuid "280a5f64-7a78-3590-8dd0-81f7136e31b5"
             {:languages (list "en"),
              :name "Epic Spell Wars: Duel at Mt. Skullzfyre",
              :game/id #uuid "280a5f64-7a78-3590-8dd0-81f7136e31b5",
              :game/name "Epic Spell Wars: Duel at Mt. Skullzfyre"},
             #uuid "73fdae1a-b0ca-3e78-b23e-a4a7101cd9e4"
             {:game/id #uuid "73fdae1a-b0ca-3e78-b23e-a4a7101cd9e4",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}
                    #:com.boardgamegeek.mechanic{:id 2027,
                                                 :name
                                                 "Storytelling"}),
              :name "Once there was",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1045,
                                                 :name "Memory"}
                    #:com.boardgamegeek.category{:id 1082,
                                                 :name "Mythology"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "61664",
              :game/name "Erzähl doch mal...",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/5MaIJSDiE8jPkem-IVTonw__thumb/img/7guypUB7sZml3stBxx7UlOLiJ4Y=/fit-in/200x150/filters:strip_icc()/pic706519.jpg"},
             #uuid "34c99f3a-1325-32c3-865d-f7e597f25a8d"
             {:game/id #uuid "34c99f3a-1325-32c3-865d-f7e597f25a8d",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2055,
                                                 :name
                                                 "Paper-and-Pencil"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}
                    #:com.boardgamegeek.mechanic{:id 2028,
                                                 :name "Role Playing"}
                    #:com.boardgamegeek.mechanic{:id 2819,
                                                 :name
                                                 "Solo / Solitaire Game"}
                    #:com.boardgamegeek.mechanic{:id 2027,
                                                 :name
                                                 "Storytelling"}),
              :name "Escape the Dark Castle",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1022,
                                                 :name "Adventure"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1024,
                                                 :name "Horror"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "227456",
              :languages (list "en"),
              :game/name "Escape the Dark Castle",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/d4MkgAvJOaJPVjxr6R9rKQ__thumb/img/fbbmrfibmcgPqNDbruBOE4-uTkc=/fit-in/200x150/filters:strip_icc()/pic5004159.jpg"},
             #uuid "42f0d762-a858-3dbb-b64d-dde4f6a4fc6d"
             {:game/id #uuid "42f0d762-a858-3dbb-b64d-dde4f6a4fc6d",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name
                                                 "Dice Rolling"}),
              :name "Evolution",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1036,
                                                 :name "Prehistoric"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "1080",
              :game/name "Evolution",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/L3BZMXWaOX9zZXyGedHDyQ__thumb/img/3bQoh-EJxL03Qq6wA0dbVAQrhSQ=/fit-in/200x150/filters:strip_icc()/pic279884.jpg"},
             #uuid "f072aeb8-c5dc-3eb7-9f65-6c8ab7d359a9"
             {:game/id #uuid "f072aeb8-c5dc-3eb7-9f65-6c8ab7d359a9",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2070,
                                                 :name "Simulation"}),
              :name "Evolution the beginning",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1094,
                                                 :name "Educational"}
                    #:com.boardgamegeek.category{:id 1084,
                                                 :name "Environmental"}
                    #:com.boardgamegeek.category{:id 1036,
                                                 :name "Prehistoric"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "201248",
              :languages (list "en"),
              :game/name "Evolution: The Beginning",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/1rvefz1PSj1c3wC1UIGgnQ__thumb/img/hEcG7RPDUc5M7VsZcOqUMJQaNhM=/fit-in/200x150/filters:strip_icc()/pic3042047.jpg"},
             #uuid "9d8b1773-e579-34ae-9aae-3e3c82f764ce"
             {:game/id #uuid "9d8b1773-e579-34ae-9aae-3e3c82f764ce",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}),
              :name "Exit: The abandoned cabin",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1028,
                                                 :name "Puzzle"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}),
              :com.boardgamegeek.boardgame/max-play-time 120,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "203420",
              :languages (list "en"),
              :game/name "Exit: The Game – The Abandoned Cabin",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/r7cZVZMpP28w3-JQ-EYY7g__thumb/img/_XH-DqIVWOmaNX9P3CxNt9OpOQ4=/fit-in/200x150/filters:strip_icc()/pic3332426.jpg"},
             #uuid "165261a9-0183-3e53-be82-ccc197c354b8"
             {:game/id #uuid "165261a9-0183-3e53-be82-ccc197c354b8",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 3000,
                                                 :name "Hot Potato"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}),
              :name "Exploding Kittens",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1116,
                                                 :name
                                                 "Comic Book / Strip"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "172225",
              :languages (list "en"),
              :game/name "Exploding Kittens",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/N8bL53-pRU7zaXDTrEaYrw__thumb/img/3tH4pIc1Udzkd0tXc6MgVQ59BC0=/fit-in/200x150/filters:strip_icc()/pic2691976.png"},
             #uuid "a389677b-6118-3815-84fe-c1e75f38984c"
             {:game/id #uuid "a389677b-6118-3815-84fe-c1e75f38984c",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}),
              :name "Exploding Kittens NSFW",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1116,
                                                 :name
                                                 "Comic Book / Strip"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 1118,
                                                 :name
                                                 "Mature / Adult"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "172242",
              :languages (list "en"),
              :game/name "Exploding Kittens: NSFW Deck",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/q1fHQMYtU-aajQKTYDlx7w__thumb/img/Az8jEnRuHEbXSn2TWVO4i2rE6ZQ=/fit-in/200x150/filters:strip_icc()/pic2815278.jpg"},
             #uuid "cace91df-d6f2-36fc-a98a-6fa5cde7357d"
             {:game/id #uuid "cace91df-d6f2-36fc-a98a-6fa5cde7357d",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}),
              :name "Fantastic Park",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "218576",
              :languages (list "en"),
              :game/name "Fantastic Park",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/JWcDDlku6rMkVBPIzfM2xw__thumb/img/8fkElPvZEiOI0jqNOTarXybAQhQ=/fit-in/200x150/filters:strip_icc()/pic3375149.png"},
             #uuid "ebe3d298-d25e-3110-8e34-1c079e9455d9"
             {:game/id #uuid "ebe3d298-d25e-3110-8e34-1c079e9455d9",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Fantasy realms",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "223040",
              :languages (list "en"),
              :game/name "Fantasy Realms",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/A7IOpPt-lHrMYsbRmxXWdQ__thumb/img/XoD3fXgApfY7-dfYyFeE6FVkbfY=/fit-in/200x150/filters:strip_icc()/pic6177962.jpg"},
             #uuid "7faaa1de-90c9-3f60-a58e-46fae6daf77c"
             {:game/id #uuid "7faaa1de-90c9-3f60-a58e-46fae6daf77c",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2027,
                                                 :name
                                                 "Storytelling"}),
              :name "Farben",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}),
              :com.boardgamegeek.boardgame/max-play-time 75,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "259005",
              :languages (list "de" "en"),
              :game/name "Farben",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/bdtFnbOHc1TpBYtBq3gLGg__thumb/img/G4IZYxp25z-N9UklBdLsA1sQQiw=/fit-in/200x150/filters:strip_icc()/pic4319287.jpg"},
             #uuid "ca5622cb-e7ba-31f7-95df-551ad1bbe80f"
             {:game/id #uuid "ca5622cb-e7ba-31f7-95df-551ad1bbe80f",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2060,
                                                 :name
                                                 "Pattern Recognition"}),
              :name "Fast Flip",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "194088",
              :game/name "Fast Flip",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/6YTV87TX0uU8gEcQr0p9aw__thumb/img/scLBO4mhJF2lrx9tEEBjcpOzsII=/fit-in/200x150/filters:strip_icc()/pic2904691.jpg"},
             #uuid "06ac533c-6f03-39a8-ae86-a6c373df20f3"
             {:game/id #uuid "06ac533c-6f03-39a8-ae86-a6c373df20f3",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Faulpelz",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "153388",
              :game/name "Faulpelz",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/h-Fzhf0SGeicPwTtS6wRcA__thumb/img/eTDFdl4FA791dm3zSWAFOyeS9iU=/fit-in/200x150/filters:strip_icc()/pic1892559.jpg"},
             #uuid "cedb275c-f7e8-3cf1-9073-41cff22af498"
             {:name "Fifty Shades of Grey",
              :game/id #uuid "cedb275c-f7e8-3cf1-9073-41cff22af498",
              :game/name "Fifty Shades of Grey"},
             #uuid "b8f4ece4-3fa5-3fc3-9f1d-a34aec906149"
             {:game/id #uuid "b8f4ece4-3fa5-3fc3-9f1d-a34aec906149",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name
                                                 "Card Drafting"}),
              :name "Find the Animals",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "40837",
              :game/name "Finde die Tiere!",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/ZsLp6eTL2-jnuAR8VjXp2w__thumb/img/DeFarGFET0ejB6QhmkExlJjmWeA=/fit-in/200x150/filters:strip_icc()/pic445108.jpg"},
             #uuid "91a5169d-5877-3642-9a52-54c4f01655da"
             {:game/id #uuid "91a5169d-5877-3642-9a52-54c4f01655da",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}),
              :name "Fleets the pleiad conflict",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}
                    #:com.boardgamegeek.category{:id 1019,
                                                 :name "Wargame"}),
              :com.boardgamegeek.boardgame/max-play-time 120,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 120,
              :com.boardgamegeek.boardgame/id "156750",
              :languages (list "en"),
              :game/name "Fleets: The Pleiad Conflict",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/pRAsGuQyvNiRSbIS5v_jqQ__thumb/img/sC8Tdln7ubDVsd6YBvmZpDL26oQ=/fit-in/200x150/filters:strip_icc()/pic2263070.jpg"},
             #uuid "d55cb47e-7f6c-3de3-afe9-3acfd3bd09af"
             {:game/id #uuid "d55cb47e-7f6c-3de3-afe9-3acfd3bd09af",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2013,
                                                 :name
                                                 "Commodity Speculation"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2082,
                                                 :name
                                                 "Worker Placement"}),
              :name "Fools Gold",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1020,
                                                 :name "Exploration"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "132758",
              :languages (list "en"),
              :game/name "Fool's Gold",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/6hx-Td6GomNJL7J-Czd0Kg__thumb/img/FIF2g8gPLHOYRNeC8Vz-g5i7YDE=/fit-in/200x150/filters:strip_icc()/pic1800625.jpg"},
             #uuid "027df389-a20d-3cbe-886e-a91e5b10d58a"
             {:game/id #uuid "027df389-a20d-3cbe-886e-a91e5b10d58a",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2001,
                                                 :name "Action Points"}
                    #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}
                    #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2960,
                                                 :name "Map Reduction"}
                    #:com.boardgamegeek.mechanic{:id 2011,
                                                 :name "Modular Board"}
                    #:com.boardgamegeek.mechanic{:id 2007,
                                                 :name
                                                 "Pick-up and Deliver"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2819,
                                                 :name
                                                 "Solo / Solitaire Game"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Forbidden Island",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1022,
                                                 :name "Adventure"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "65244",
              :languages (list "en"),
              :game/name "Forbidden Island",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/JgAkEBUaiHOsOS94iRMs2w__thumb/img/5aPR8-KMbgucI_XkPE2PJaMQQsg=/fit-in/200x150/filters:strip_icc()/pic646458.jpg"},
             #uuid "886937cd-0285-3aad-834d-f6e5bd1d1dfb"
             {:languages (list "en"),
              :name "Fox in the Forest",
              :game/id #uuid "886937cd-0285-3aad-834d-f6e5bd1d1dfb",
              :game/name "Fox in the Forest"},
             #uuid "2752fdce-7879-3086-8e8e-2a54c21ee999"
             {:game/id #uuid "2752fdce-7879-3086-8e8e-2a54c21ee999",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2001,
                                                 :name "Action Points"}
                    #:com.boardgamegeek.mechanic{:id 2048,
                                                 :name
                                                 "Pattern Building"}
                    #:com.boardgamegeek.mechanic{:id 2876,
                                                 :name "Race"}),
              :name "Frankenstein",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1024,
                                                 :name "Horror"}
                    #:com.boardgamegeek.category{:id 1093,
                                                 :name "Novel-based"}
                    #:com.boardgamegeek.category{:id 1028,
                                                 :name "Puzzle"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "19030",
              :languages (list "en"),
              :game/name "Frankenstein",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/TFT3zgvVAx8U4BcDY9P5iA__thumb/img/waFGtDnsbNDB5_zgFBH6VSpG-eM=/fit-in/200x150/filters:strip_icc()/pic302246.jpg"},
             #uuid "34946d54-6d22-3af0-afdb-e795b8de802b"
             {:game/id #uuid "34946d54-6d22-3af0-afdb-e795b8de802b",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2016,
                                                 :name
                                                 "Secret Unit Deployment"}),
              :name "Fugitive",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1098,
                                                 :name "Number"}
                    #:com.boardgamegeek.category{:id 1081,
                                                 :name
                                                 "Spies/Secret Agents"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 5,
              :com.boardgamegeek.boardgame/id "197443",
              :languages (list "en"),
              :game/name "Fugitive",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Jeukp3NUs-u6i3SuF-yE4A__thumb/img/1cw7pZbdLk2bBFh-tjkwzZXwgmw=/fit-in/200x150/filters:strip_icc()/pic3481216.png"},
             #uuid "ebb7a837-d8f1-3d0c-a149-24e17e4005dc"
             {:game/id #uuid "ebb7a837-d8f1-3d0c-a149-24e17e4005dc",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}),
              :name "Fuji flush",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1098,
                                                 :name "Number"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "203430",
              :game/name "Fuji Flush",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/mobPzHA7UwgwiGzr2EVW9g__thumb/img/rQmbjRFo3DZhq7ufK3K1UwDI0x0=/fit-in/200x150/filters:strip_icc()/pic3086849.jpg"},
             #uuid "d76c9788-f173-3fff-9b13-9ced6ab67c4a"
             {:game/id #uuid "d76c9788-f173-3fff-9b13-9ced6ab67c4a",
              :com.boardgamegeek.boardgame/min-players 2,
              :name "Full Moon",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}),
              :com.boardgamegeek.boardgame/max-play-time 10,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "136523",
              :languages (list "en"),
              :game/name "Full Moon",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/QX1mkUrYWBeih3nfeP36sg__thumb/img/3gDOQSXQBBKWcyu5Bl4MQVpGLkw=/fit-in/200x150/filters:strip_icc()/pic1534029.jpg"},
             #uuid "642edb7f-7af6-3c4b-8b07-5ac20dcba0b9"
             {:languages (list "de" "en"),
              :name "Fungi / morells",
              :game/id #uuid "642edb7f-7af6-3c4b-8b07-5ac20dcba0b9",
              :game/name "Fungi / morells"},
             #uuid "7873a90e-ea1b-3b3b-8ca8-4820dc662976"
             {:game/id #uuid "7873a90e-ea1b-3b3b-8ca8-4820dc662976",
              :com.boardgamegeek.boardgame/min-players 5,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Game of Thrones: Oathbreaker",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1001,
                                                 :name "Political"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "275530",
              :languages (list "en"),
              :game/name "Game of Thrones: Oathbreaker",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/C3gHLeIl8333KBy1OOEyzw__thumb/img/4tQdfs8vggC32L-ZnbqfpC4-XD4=/fit-in/200x150/filters:strip_icc()/pic4635232.jpg"},
             #uuid "9ecf0011-c0af-37eb-a590-f247005f0399"
             {:game/id #uuid "9ecf0011-c0af-37eb-a590-f247005f0399",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2915,
                                                 :name "Negotiation"}
                    #:com.boardgamegeek.mechanic{:id 2858,
                                                 :name
                                                 "Prisoner's Dilemma"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Hra o Truny Zelezny Trun",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1064,
                                                 :name
                                                 "Movies / TV / Radio theme"}
                    #:com.boardgamegeek.category{:id 1026,
                                                 :name "Negotiation"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "204837",
              :languages (list "cz"),
              :game/name "Game of Thrones: The Iron Throne",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/t9LtCL9_aSDliHPxHFNNeg__thumb/img/9EF6xEaV7AuEB9YCPC3FiSBpL1E=/fit-in/200x150/filters:strip_icc()/pic3109099.jpg"},
             #uuid "af89834e-3251-3aa9-a464-74b8d24a5091"
             {:game/id #uuid "af89834e-3251-3aa9-a464-74b8d24a5091",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2048,
                                                 :name
                                                 "Pattern Building"}),
              :name "Game of Trains",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1028,
                                                 :name "Puzzle"}
                    #:com.boardgamegeek.category{:id 1034,
                                                 :name "Trains"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "180602",
              :languages (list "de" "en"),
              :game/name "Game of Trains",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/CawgoeUEMFS4f14Iix9Exg__thumb/img/OYsku3__TTw8fiFYEWlhUBT7nIU=/fit-in/200x150/filters:strip_icc()/pic2608713.png"},
             #uuid "0aba0975-5e75-3a94-8bfe-fd86797f7ce8"
             {:game/id #uuid "0aba0975-5e75-3a94-8bfe-fd86797f7ce8",
              :com.boardgamegeek.boardgame/min-players 5,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2913,
                                                 :name "Bribery"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}
                    #:com.boardgamegeek.mechanic{:id 2017,
                                                 :name "Voting"}),
              :name "Gentleman’s deal",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1026,
                                                 :name "Negotiation"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 9,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "205776",
              :languages (list "en"),
              :game/name "Gentleman's Deal",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/HJQGrFfsjbbCKykXE8brrA__thumb/img/LpJQFC8s55wuwWpAbogSUQxELck=/fit-in/200x150/filters:strip_icc()/pic3160826.jpg"},
             #uuid "6b13ea3b-f083-34f2-adf3-f3dba030f1ef"
             {:game/id #uuid "6b13ea3b-f083-34f2-adf3-f3dba030f1ef",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}),
              :name "Germania Magna",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1050,
                                                 :name "Ancient"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1019,
                                                 :name "Wargame"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "182050",
              :languages (list "en"),
              :game/name "Germania Magna: Border in Flames",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Oer5u8dNIo9y2ncEMIljGQ__thumb/img/sN9Px7o3oogpKe_1qe4glWujOv0=/fit-in/200x150/filters:strip_icc()/pic3130233.png"},
             #uuid "b150a64b-6e6b-3e4b-8784-e6bc946f1fc1"
             {:game/id #uuid "b150a64b-6e6b-3e4b-8784-e6bc946f1fc1",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name
                                                 "Dice Rolling"}),
              :name "Giraffun",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "213358",
              :game/name "Giraf'Fun",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/22l0MMlmBatAMaxsIwZ-ew__thumb/img/KfT4gfFaMBqkLUeNd-grasK1fCo=/fit-in/200x150/filters:strip_icc()/pic3304372.jpg"},
             #uuid "35474b73-b019-37a7-b3d6-ee8eb6df3f8c"
             {:game/id #uuid "35474b73-b019-37a7-b3d6-ee8eb6df3f8c",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2073,
                                                 :name "Acting"}
                    #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}
                    #:com.boardgamegeek.mechanic{:id 2038,
                                                 :name "Singing"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}),
              :name "Glimpse",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 40,
              :com.boardgamegeek.boardgame/max-players 99,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "201595",
              :languages (list "en"),
              :game/name "Glimpse",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Oo_huFZJtGQVBkhOOeYr1Q__thumb/img/fPW0sy9y9Q7qdntQTeaMdqFFhpg=/fit-in/200x150/filters:strip_icc()/pic3192493.jpg"},
             #uuid "4c2d3b0e-9fbd-3faa-9fed-724910231a39"
             {:game/id #uuid "4c2d3b0e-9fbd-3faa-9fed-724910231a39",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2689,
                                                 :name "Action Queue"}
                    #:com.boardgamegeek.mechanic{:id 2048,
                                                 :name
                                                 "Pattern Building"}),
              :name "Globe twister",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1020,
                                                 :name "Exploration"}
                    #:com.boardgamegeek.category{:id 1028,
                                                 :name "Puzzle"}
                    #:com.boardgamegeek.category{:id 1097,
                                                 :name "Travel"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "257924",
              :languages (list "cz" "de" "en" "fr"),
              :game/name "Globe Twister",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/sFcxNCKHiiqjQdBSo4O1Hg__thumb/img/LJpave2uTNe9UgAaehNAD3gK71Q=/fit-in/200x150/filters:strip_icc()/pic4261553.jpg"},
             #uuid "b1ea21fb-2177-3fed-af81-0a3967e76069"
             {:game/id #uuid "b1ea21fb-2177-3fed-af81-0a3967e76069",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 3001,
                                                 :name "Layering"}
                    #:com.boardgamegeek.mechanic{:id 2836,
                                                 :name "Lose a Turn"}
                    #:com.boardgamegeek.mechanic{:id 2027,
                                                 :name "Storytelling"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}),
              :name "Gloom",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1024,
                                                 :name "Horror"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "12692",
              :languages (list "en"),
              :game/name "Gloom",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/jD7_Ir8gL_9AXC-wjnqjHg__thumb/img/wWqmoercFrbIFjS1FloZFTZddcE=/fit-in/200x150/filters:strip_icc()/pic2080481.jpg"},
             #uuid "c8835178-b83e-3ef2-84d6-ed36804309c8"
             {:languages (list "lagoonies"),
              :name "Glupsch geister",
              :game/id #uuid "c8835178-b83e-3ef2-84d6-ed36804309c8",
              :game/name "Glupsch geister"},
             #uuid "5f075ae3-e1f9-3038-abb8-c4632991f96f"
             {:game/id #uuid "5f075ae3-e1f9-3038-abb8-c4632991f96f",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2043,
                                                 :name "Enclosure"}
                    #:com.boardgamegeek.mechanic{:id 2940,
                                                 :name "Square Grid"}),
              :name "Go",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}),
              :com.boardgamegeek.boardgame/max-play-time 180,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "188",
              :game/name "Go",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/6qAiZwWxSSKP2kFcA80cZg__thumb/img/COT5I3D_0dKWrSRHChb-SnQl3Zc=/fit-in/200x150/filters:strip_icc()/pic1728832.jpg"},
             #uuid "ad117101-b1d8-35b7-b02b-d335db512e5e"
             {:game/id #uuid "ad117101-b1d8-35b7-b02b-d335db512e5e",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2048,
                                                 :name
                                                 "Pattern Building"}),
              :name "Hura Zmrzlina",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1032,
                                                 :name
                                                 "Action / Dexterity"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "217553",
              :languages (list "cz"),
              :game/name "Go Go Gelato!",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/970IA1qF--JQB4C-SAiX-w__thumb/img/WiZooxvVjFDpelW4XsliMXTl8OM=/fit-in/200x150/filters:strip_icc()/pic3363675.jpg"},
             #uuid "bd4049a7-2730-31a1-bbc9-4a077d75facc"
             {:game/id #uuid "bd4049a7-2730-31a1-bbc9-4a077d75facc",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2060,
                                                 :name
                                                 "Pattern Recognition"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}),
              :name "Gobbit",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1032,
                                                 :name
                                                 "Action / Dexterity"}
                    #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "132620",
              :languages (list "cz" "fr"),
              :game/name "Gobbit",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/bMWoFNQFesjs64shTr-ObA__thumb/img/0EsCUEryLNYdObPJzB2SRNUo0yQ=/fit-in/200x150/filters:strip_icc()/pic4819194.png"},
             #uuid "e2257f79-e77e-34b7-87b1-a0924290c7f3"
             {:game/id #uuid "e2257f79-e77e-34b7-87b1-a0924290c7f3",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}),
              :name "Goblins inc.",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1088,
                                                 :name
                                                 "Industry / Manufacturing"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "110524",
              :languages (list "en"),
              :game/name "Goblins, Inc.",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/y-7XKqyWHh3sE5N86EBUfA__thumb/img/UtLa49EALZ2DVwSgsR9Ku5hE6hU=/fit-in/200x150/filters:strip_icc()/pic1415862.jpg"},
             #uuid "2ffb14ad-8e1d-3f3c-9df9-133b523d8287"
             {:languages (list "cz"),
              :name "Goblíci jedlíci / Gobblet Gobblers",
              :game/id #uuid "2ffb14ad-8e1d-3f3c-9df9-133b523d8287",
              :game/name "Goblíci jedlíci / Gobblet Gobblers"},
             #uuid "3cad23d1-2f51-3a7b-8a51-4c256db8638d"
             {:game/id #uuid "3cad23d1-2f51-3a7b-8a51-4c256db8638d",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2028,
                                                 :name
                                                 "Role Playing"}),
              :name "Going Postal",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "292795",
              :languages (list "en"),
              :game/name "Going Postal",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Q8xKywi0R2rvrsXgS1Ay0Q__thumb/img/a-VLo5gnnZdBt3cgrsowjnqsSUM=/fit-in/200x150/filters:strip_icc()/pic5080591.jpg"},
             #uuid "61751dfb-a841-3676-aa92-97d75c9a9f56"
             {:game/id #uuid "61751dfb-a841-3676-aa92-97d75c9a9f56",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2012,
                                                 :name
                                                 "Auction/Bidding"}
                    #:com.boardgamegeek.mechanic{:id 2930,
                                                 :name
                                                 "Auction: Dexterity"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Going going gone",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1032,
                                                 :name
                                                 "Action / Dexterity"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "144761",
              :languages (list "en"),
              :game/name "Going, Going, GONE!",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/LSWJQZ4t6_Re_iz3SMv2-w__thumb/img/vrodOnKIbdD7T5oJdV5AsrRuhHk=/fit-in/200x150/filters:strip_icc()/pic1742682.jpg"},
             #uuid "7fe2ec37-f762-3f17-b6c0-cc2b097adead"
             {:game/id #uuid "7fe2ec37-f762-3f17-b6c0-cc2b097adead",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2876,
                                                 :name "Race"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}),
              :name "Goosebumps the board game",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1064,
                                                 :name
                                                 "Movies / TV / Radio theme"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 35,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "189657",
              :languages (list "en"),
              :game/name "Goosebumps: The Board Game",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/j082xJe0y4t_diBc8InuXw__thumb/img/5QrDwoPafDRBrrRhY5Y2WzitOjY=/fit-in/200x150/filters:strip_icc()/pic2809741.jpg"},
             #uuid "5aa42acb-56e5-3325-acc3-e39be2b450a1"
             {:game/id #uuid "5aa42acb-56e5-3325-acc3-e39be2b450a1",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2819,
                                                 :name
                                                 "Solo / Solitaire Game"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}
                    #:com.boardgamegeek.mechanic{:id 2009,
                                                 :name
                                                 "Trick-taking"}),
              :name "Gorus Maximus",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "253756",
              :languages (list "en"),
              :game/name "Gorus Maximus",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/gXQ4IAIpBejz3N1LPpreMg__thumb/img/gVozjy2zCuvg2EHYkJxxUDfm8BY=/fit-in/200x150/filters:strip_icc()/pic4146552.jpg"},
             #uuid "e5c528dd-2ba9-3a89-ac17-c427f0c00414"
             {:game/id #uuid "e5c528dd-2ba9-3a89-ac17-c427f0c00414",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2664,
                                                 :name
                                                 "Deck, Bag, and Pool Building"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2911,
                                                 :name "Ownership"}
                    #:com.boardgamegeek.mechanic{:id 2078,
                                                 :name
                                                 "Point to Point Movement"}
                    #:com.boardgamegeek.mechanic{:id 2813,
                                                 :name "Rondel"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2939,
                                                 :name
                                                 "Track Movement"}
                    #:com.boardgamegeek.mechanic{:id 2897,
                                                 :name
                                                 "Variable Set-up"}),
              :name "Great western trail",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1055,
                                                 :name "American West"}
                    #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}),
              :com.boardgamegeek.boardgame/max-play-time 150,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 75,
              :com.boardgamegeek.boardgame/id "193738",
              :languages (list "cz" "en"),
              :game/name "Great Western Trail",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/gDn7AhrDlmfCLSz9ZqoNFQ__thumb/img/0pt6XrFHTXpNetwMo9rdY7PdhfQ=/fit-in/200x150/filters:strip_icc()/pic5988511.jpg"},
             #uuid "c9e680a4-40fb-3a3e-bc38-6556dd90712b"
             {:game/id #uuid "c9e680a4-40fb-3a3e-bc38-6556dd90712b",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2689,
                                                 :name "Action Queue"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Gretchinz",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1031,
                                                 :name "Racing"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "239951",
              :languages (list "en"),
              :game/name "Gretchinz!",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Dv7p-wFsyKbRwlWo8FObwQ__thumb/img/Tl69LY5QGCOVt7Ygg9pJ1aacaEg=/fit-in/200x150/filters:strip_icc()/pic3856833.jpg"},
             #uuid "a9957800-b641-3919-9ff6-ca11f1c233c4"
             {:game/id #uuid "a9957800-b641-3919-9ff6-ca11f1c233c4",
              :com.boardgamegeek.boardgame/min-players 3,
              :name "Guess What",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1032,
                                                 :name
                                                 "Action / Dexterity"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "142103",
              :game/name "Guess What!",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/kMaXgIDf-AQzYEM9Roo8jw__thumb/img/axTBuQdbroN7PMk4HQtGaxLDw6I=/fit-in/200x150/filters:strip_icc()/pic1699333.png"},
             #uuid "bb2b867a-583d-3e72-adf5-e81bf22baea4"
             {:game/id #uuid "bb2b867a-583d-3e72-adf5-e81bf22baea4",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2689,
                                                 :name "Action Queue"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}
                    #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}),
              :name "Hunger the show",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "219670",
              :languages (list "en"),
              :game/name "HUNGER: The Show",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/0PlLZN729gkNyyYB7M264Q__thumb/img/OjtXDO3gita_jOZkYdj62C-rH70=/fit-in/200x150/filters:strip_icc()/pic3532789.jpg"},
             #uuid "e8d2a59c-f315-3860-9608-b04f893cbc93"
             {:game/id #uuid "e8d2a59c-f315-3860-9608-b04f893cbc93",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2875,
                                                 :name
                                                 "End Game Bonuses"}
                    #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}),
              :name "Hadara",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1029,
                                                 :name "City Building"}
                    #:com.boardgamegeek.category{:id 1015,
                                                 :name
                                                 "Civilization"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "269144",
              :languages (list "cz"),
              :game/name "Hadara",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/17wJNXSBYuVmKryV9lEKsQ__thumb/img/nVMvEWrTFCoOE9Y3tqFLelkjYWw=/fit-in/200x150/filters:strip_icc()/pic5099398.jpg"},
             #uuid "0a995f25-bdf2-358f-bf5a-93e22c9aa05b"
             {:game/id #uuid "0a995f25-bdf2-358f-bf5a-93e22c9aa05b",
              :com.boardgamegeek.boardgame/min-players 5,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}
                    #:com.boardgamegeek.mechanic{:id 2814,
                                                 :name "Traitor Game"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Hail Hydra",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1116,
                                                 :name
                                                 "Comic Book / Strip"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1081,
                                                 :name
                                                 "Spies/Secret Agents"}),
              :com.boardgamegeek.boardgame/max-play-time 75,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 40,
              :com.boardgamegeek.boardgame/id "256877",
              :languages (list "en"),
              :game/name "Hail Hydra",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/vqVPJtDgFGrU4UUpygn19w__thumb/img/HlRZwWhjdliHGnxY2x7-pkj-1I8=/fit-in/200x150/filters:strip_icc()/pic4233915.jpg"},
             #uuid "f98b9f16-c08f-3903-9b7f-80481ccce0d0"
             {:game/id #uuid "f98b9f16-c08f-3903-9b7f-80481ccce0d0",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2026,
                                                 :name "Hexagon Grid"}
                    #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}),
              :name "Halali",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "1130",
              :game/name "Halali",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/DB9K9asuaH7Na3AKH2G5dg__thumb/img/kQGmAAkgT5J7ZLgUAxldNxeA1vg=/fit-in/200x150/filters:strip_icc()/pic14240.jpg"},
             #uuid "81cc0f79-3609-346a-8dde-65ed1c9f3c3a"
             {:game/id #uuid "81cc0f79-3609-346a-8dde-65ed1c9f3c3a",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2893,
                                                 :name
                                                 "Communication Limits"}
                    #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Hanabi",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1045,
                                                 :name "Memory"}),
              :com.boardgamegeek.boardgame/max-play-time 25,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 25,
              :com.boardgamegeek.boardgame/id "98778",
              :game/name "Hanabi",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/JDVksMwfcqoem1k_xtZrOA__thumb/img/amCeCcEKhYGbVtDvpvIMnu3qTg0=/fit-in/200x150/filters:strip_icc()/pic2007286.jpg"},
             #uuid "4846597b-0309-3cd6-9f05-12f43edf2faf"
             {:game/id #uuid "4846597b-0309-3cd6-9f05-12f43edf2faf",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}),
              :name "Happy pigs",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1013,
                                                 :name "Farming"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "156138",
              :languages (list "en"),
              :game/name "Happy Pigs",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/gbUdxyfnt-P2i2fmPixN_Q__thumb/img/iIQwlVdbR6VMj5R6-Wi25LKTI0c=/fit-in/200x150/filters:strip_icc()/pic2830958.jpg"},
             #uuid "e29fbec4-4c71-3519-8e93-582b67df86f4"
             {:game/id #uuid "e29fbec4-4c71-3519-8e93-582b67df86f4",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}),
              :name "Šťastný candát",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}),
              :com.boardgamegeek.boardgame/max-play-time 2,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 2,
              :com.boardgamegeek.boardgame/id "194626",
              :languages (list "cz"),
              :game/name "Happy Salmon",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/m0fTHQRSHztlpHsCzR9iAw__thumb/img/EA1AyifbIZB00-p569p0p7cBi5U=/fit-in/200x150/filters:strip_icc()/pic2913980.png"},
             #uuid "d9ff8a5f-72de-3a40-99bd-301e426485bd"
             {:game/id #uuid "d9ff8a5f-72de-3a40-99bd-301e426485bd",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2048,
                                                 :name
                                                 "Pattern Building"}
                    #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}),
              :name "Haru ichiban",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1028,
                                                 :name "Puzzle"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "165662",
              :languages (list "en"),
              :game/name "Haru Ichiban",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/sOwpuouKdVSYmpz9oIJv_g__thumb/img/nwsGruWd-5XPmYPY3RG72-MsQ6g=/fit-in/200x150/filters:strip_icc()/pic2678962.jpg"},
             #uuid "5aac7681-3d33-3350-b4e8-43d1ae9b29e3"
             {:game/id #uuid "5aac7681-3d33-3350-b4e8-43d1ae9b29e3",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name
                                                 "Dice Rolling"}),
              :name "Hat trick",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "11153",
              :game/name "Hat Trick",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Ur5TMXRKUNod-fjT6GoWWg__thumb/img/vNtveDGyNhKtuvZaDrfGXftu-SA=/fit-in/200x150/filters:strip_icc()/pic46136.jpg"},
             #uuid "826863b8-1605-33a8-9169-91ebcb89712b"
             {:game/id #uuid "826863b8-1605-33a8-9169-91ebcb89712b",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2026,
                                                 :name "Hexagon Grid"}
                    #:com.boardgamegeek.mechanic{:id 2960,
                                                 :name "Map Reduction"}
                    #:com.boardgamegeek.mechanic{:id 2011,
                                                 :name
                                                 "Modular Board"}),
              :name "Hey that’s my fish",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "8203",
              :game/name "Hey, That's My Fish!",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/CR2jXsbmCdhDYo2zI6cJFQ__thumb/img/6jjUgJWbOMUZ4JIEqJF0MzP6tO8=/fit-in/200x150/filters:strip_icc()/pic1004115.jpg"},
             #uuid "434338bc-9501-334b-adbf-2b3752e9e231"
             {:game/id #uuid "434338bc-9501-334b-adbf-2b3752e9e231",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2043,
                                                 :name "Enclosure"}
                    #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2026,
                                                 :name "Hexagon Grid"}
                    #:com.boardgamegeek.mechanic{:id 2964,
                                                 :name "Pieces as Map"}
                    #:com.boardgamegeek.mechanic{:id 3005,
                                                 :name "Slide/Push"}
                    #:com.boardgamegeek.mechanic{:id 2944,
                                                 :name
                                                 "Three Dimensional Movement"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}),
              :name "Hive Pocket",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "154597",
              :languages (list "de" "en"),
              :game/name "Hive Pocket",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/4DffKExiPihIf9T_AqkPCQ__thumb/img/0EuD6uQ0lLAb2jtY6YC0EduW7Gw=/fit-in/200x150/filters:strip_icc()/pic1299877.png"},
             #uuid "08b3b128-c196-3b26-bc2f-d0e5523bc940"
             {:game/id #uuid "08b3b128-c196-3b26-bc2f-d0e5523bc940",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2027,
                                                 :name "Storytelling"}
                    #:com.boardgamegeek.mechanic{:id 2082,
                                                 :name
                                                 "Worker Placement"}),
              :name "Holding on",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 2145,
                                                 :name "Medical"}
                    #:com.boardgamegeek.category{:id 1045,
                                                 :name "Memory"}
                    #:com.boardgamegeek.category{:id 1040,
                                                 :name
                                                 "Murder/Mystery"}
                    #:com.boardgamegeek.category{:id 1028,
                                                 :name "Puzzle"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "245444",
              :languages (list "en"),
              :game/name "Holding On: The Troubled Life of Billy Kerr",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/lKHrfnNpblE-ZoqiAt8RUw__thumb/img/mg863nmqfO4wjGxV1EqqaxhLzOg=/fit-in/200x150/filters:strip_icc()/pic4177569.jpg"},
             #uuid "2fe5b306-b8a0-3e8b-becf-b4a37cf52717"
             {:game/id #uuid "2fe5b306-b8a0-3e8b-becf-b4a37cf52717",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2082,
                                                 :name
                                                 "Worker Placement"}),
              :name "Holmes Sherlock and Mycroft",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1093,
                                                 :name "Novel-based"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "174078",
              :languages (list "en"),
              :game/name "Holmes: Sherlock & Mycroft",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/EAUE93YGXVFJW1FwftPRgw__thumb/img/4ByVnF3DSfQTxwsUMPRmDMQrWFA=/fit-in/200x150/filters:strip_icc()/pic2431481.jpg"},
             #uuid "0d22fe23-de11-3728-9634-4b0114313a9f"
             {:languages (list "en"),
              :name "Home Stretch",
              :game/id #uuid "0d22fe23-de11-3728-9634-4b0114313a9f",
              :game/name "Home Stretch"},
             #uuid "dd1bf333-48e3-3cde-80c2-6fb824ec3563"
             {:game/id #uuid "dd1bf333-48e3-3cde-80c2-6fb824ec3563",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2060,
                                                 :name
                                                 "Pattern Recognition"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Honba za Pokladem",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1084,
                                                 :name "Environmental"}
                    #:com.boardgamegeek.category{:id 1098,
                                                 :name "Number"}
                    #:com.boardgamegeek.category{:id 1027,
                                                 :name "Trivia"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 0,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "131414",
              :languages (list "cz"),
              :game/name "Honba za pokladem",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/u0c2qcKFO-CZXW7mTA7k1Q__thumb/img/1OWhhlIs8NwGCbW4NUkjkSgIi34=/fit-in/200x150/filters:strip_icc()/pic1436457.jpg"},
             #uuid "af493a90-a6e6-31a5-966e-beed6fcfe1b4"
             {:game/id #uuid "af493a90-a6e6-31a5-966e-beed6fcfe1b4",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2079,
                                                 :name
                                                 "Variable Phase Order"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}
                    #:com.boardgamegeek.mechanic{:id 2082,
                                                 :name
                                                 "Worker Placement"}),
              :name "Hospital Rush",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 2145,
                                                 :name "Medical"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "119265",
              :languages (list "en"),
              :game/name "Hospital Rush",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/rVWdEN9wzXzz2goU5xeXkQ__thumb/img/sC7xAly_TzGn1l7kNuYQvEpoVqw=/fit-in/200x150/filters:strip_icc()/pic2218972.jpg"},
             #uuid "d803129a-da52-3403-b88a-1331f9bf89b1"
             {:languages (list "cz"),
              :name "Hospodský kvíz",
              :game/id #uuid "d803129a-da52-3403-b88a-1331f9bf89b1",
              :game/name "Hospodský kvíz"},
             #uuid "a6092dda-9d9f-3b45-b148-b73eb5da724a"
             {:game/id #uuid "a6092dda-9d9f-3b45-b148-b73eb5da724a",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2028,
                                                 :name "Role Playing"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Hound",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "255632",
              :languages (list "en"),
              :game/name "Hound",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/7zHXxwcHjq2Yp2woQkk2DA__thumb/img/keVJuY3uTOGRPtKIs8R66mXQcJ4=/fit-in/200x150/filters:strip_icc()/pic4334234.jpg"},
             #uuid "0d600bac-e4d6-3227-b4bf-b0d9fee001c6"
             {:languages (list "cz"),
              :name "Hravé kroužky",
              :game/id #uuid "0d600bac-e4d6-3227-b4bf-b0d9fee001c6",
              :game/name "Hravé kroužky"},
             #uuid "1b3840b0-b70d-31c1-be70-014c8537dbba"
             {:game/id #uuid "1b3840b0-b70d-31c1-be70-014c8537dbba",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}),
              :name "Hugo",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1022,
                                                 :name "Adventure"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1064,
                                                 :name
                                                 "Movies / TV / Radio theme"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "23435",
              :game/name "Hugo",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/ERhkAfrYHD-jpsBf1L9mTQ__thumb/img/flSO_ro1ATTQw5EaCkeaSqa8UvE=/fit-in/200x150/filters:strip_icc()/pic165694.jpg"},
             #uuid "bcfc2af4-495d-3023-83ab-12fb1057166f"
             {:game/id #uuid "bcfc2af4-495d-3023-83ab-12fb1057166f",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2048,
                                                 :name
                                                 "Pattern Building"}),
              :name "Hvezdokupy",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1098,
                                                 :name "Number"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "187538",
              :languages (list "cz"),
              :game/name "Hvězdokupy: Hra plná hvězd",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/dpuO8gjLSm0R6EJRpCaF3w__thumb/img/E2XFve6QnxBMsib3rraDVxuPvKw=/fit-in/200x150/filters:strip_icc()/pic2740107.jpg"},
             #uuid "6da53f25-b27b-3c31-8b0d-3928dc46f469"
             {:game/id #uuid "6da53f25-b27b-3c31-8b0d-3928dc46f469",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2048,
                                                 :name
                                                 "Pattern Building"}
                    #:com.boardgamegeek.mechanic{:id 2060,
                                                 :name
                                                 "Pattern Recognition"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}),
              :name "Hypergrid",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "209206",
              :game/name "Hypergrid",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/wDAL9LJQ1GoiRXeGQ9fnaw__thumb/img/ro9Zk2Fj6Ou8JR_S3uDmkVwELi8=/fit-in/200x150/filters:strip_icc()/pic3184914.jpg"},
             #uuid "c693b4c3-9720-303a-836a-8f25b4da698a"
             {:languages (list "cz"),
              :name "I Know: Hit list",
              :game/id #uuid "c693b4c3-9720-303a-836a-8f25b4da698a",
              :game/name "I Know: Hit list"},
             #uuid "aff8862a-8fba-39a6-86f4-ef02a3a228f9"
             {:game/id #uuid "aff8862a-8fba-39a6-86f4-ef02a3a228f9",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2046,
                                                 :name "Area Movement"}
                    #:com.boardgamegeek.mechanic{:id 2860,
                                                 :name "Flicking"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}),
              :name "Ice Cool",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1032,
                                                 :name
                                                 "Action / Dexterity"}
                    #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "177524",
              :game/name "ICECOOL",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/jvfSbTGin9ZUioW4Rpi4Pw__thumb/img/b6he0ibAdBGM7T_lj918HG1aSbg=/fit-in/200x150/filters:strip_icc()/pic2937209.png"},
             #uuid "b4991e13-f466-39b4-be16-56909272f1cc"
             {:game/id #uuid "b4991e13-f466-39b4-be16-56909272f1cc",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2081,
                                                 :name
                                                 "Network and Route Building"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Illuminati",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 1026,
                                                 :name "Negotiation"}
                    #:com.boardgamegeek.category{:id 1001,
                                                 :name "Political"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}),
              :com.boardgamegeek.boardgame/max-play-time 180,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "28",
              :languages (list "en"),
              :game/name "Illuminati",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/ea8y04WKGgdQkFy1Pbw9tA__thumb/img/eph2ZknTAhhs-A8ij76DJbhzjrs=/fit-in/200x150/filters:strip_icc()/pic1320091.jpg"},
             #uuid "e74ac58d-7a69-3b4b-9cff-6dc08fd9f434"
             {:languages (list "en"),
              :name "Isle of Skye",
              :game/id #uuid "e74ac58d-7a69-3b4b-9cff-6dc08fd9f434",
              :game/name "Isle of Skye"},
             #uuid "0ef8f876-d62a-3535-ae28-410454e3634b"
             {:game/id #uuid "0ef8f876-d62a-3535-ae28-410454e3634b",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2912,
                                                 :name "Contracts"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2011,
                                                 :name "Modular Board"}
                    #:com.boardgamegeek.mechanic{:id 2081,
                                                 :name
                                                 "Network and Route Building"}
                    #:com.boardgamegeek.mechanic{:id 2007,
                                                 :name
                                                 "Pick-up and Deliver"}
                    #:com.boardgamegeek.mechanic{:id 2876,
                                                 :name "Race"}
                    #:com.boardgamegeek.mechanic{:id 2897,
                                                 :name
                                                 "Variable Set-up"}
                    #:com.boardgamegeek.mechanic{:id 2082,
                                                 :name
                                                 "Worker Placement"}),
              :name "Istanbul",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 40,
              :com.boardgamegeek.boardgame/id "148949",
              :languages (list "cz"),
              :game/name "Istanbul",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/PHH9Mreen2sBcxV6ZsE3ew__thumb/img/Vzpg3sdeAbCy0IxSAoh1aH9nvDE=/fit-in/200x150/filters:strip_icc()/pic1885326.jpg"},
             #uuid "984c20a2-ad28-3167-b8ae-fcef61acbced"
             {:game/id #uuid "984c20a2-ad28-3167-b8ae-fcef61acbced",
              :com.boardgamegeek.boardgame/min-players 4,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}),
              :name "It dies with me",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 10,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "246709",
              :languages (list "en"),
              :game/name "It Dies With Me",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/DWMT6FxLomGvgYzfKJTuKw__thumb/img/C6-AyY0PP5fFzG1eDyVcWCwHd1g=/fit-in/200x150/filters:strip_icc()/pic4466127.jpg"},
             #uuid "d701c31b-be98-3228-af7f-aaebd4cb0455"
             {:game/id #uuid "d701c31b-be98-3228-af7f-aaebd4cb0455",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}),
              :name "Itchy Monkey",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "249404",
              :languages (list "en"),
              :game/name "Itchy Monkey",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/ZxA13WeYt4YN6UdzBg_R1Q__thumb/img/f1Dgcax5BCbGgSAX4FEWjNB-AhY=/fit-in/200x150/filters:strip_icc()/pic4275085.jpg"},
             #uuid "e4b769db-2a42-392d-b311-b02c3545d07d"
             {:game/id #uuid "e4b769db-2a42-392d-b311-b02c3545d07d",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2987,
                                                 :name
                                                 "Hidden Victory Points"}
                    #:com.boardgamegeek.mechanic{:id 2900,
                                                 :name "Market"}
                    #:com.boardgamegeek.mechanic{:id 2823,
                                                 :name
                                                 "Score-and-Reset Game"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Jaipur",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "54043",
              :languages (list "fr"),
              :game/name "Jaipur",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/_LTujSe_o16nvjDC-J0seA__thumb/img/82vhODfpxIT03BzW4NkisJ5Unzs=/fit-in/200x150/filters:strip_icc()/pic5100947.jpg"},
             #uuid "1add2eb4-1fca-39b2-a15b-4a7d68571409"
             {:game/id #uuid "1add2eb4-1fca-39b2-a15b-4a7d68571409",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2876,
                                                 :name "Race"}
                    #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}
                    #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}),
              :name "Jamaica",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1008,
                                                 :name "Nautical"}
                    #:com.boardgamegeek.category{:id 1090,
                                                 :name "Pirates"}
                    #:com.boardgamegeek.category{:id 1031,
                                                 :name "Racing"}
                    #:com.boardgamegeek.category{:id 1011,
                                                 :name
                                                 "Transportation"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "28023",
              :game/name "Jamaica",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/SxSm7BW1LYTPd8LxGi07MQ__thumb/img/GrmR2FBxm0O7LK3CVkcPxooXARw=/fit-in/200x150/filters:strip_icc()/pic1502119.jpg"},
             #uuid "647e229b-c07b-3419-a641-254ed8b96dbd"
             {:game/id #uuid "647e229b-c07b-3419-a641-254ed8b96dbd",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2865,
                                                 :name "Player Judge"}
                    #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}),
              :name "Joking Hazard",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1116,
                                                 :name
                                                 "Comic Book / Strip"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 1118,
                                                 :name
                                                 "Mature / Adult"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 10,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "193621",
              :languages (list "en"),
              :game/name "Joking Hazard",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/U1C1mLc1wLXixz2e77AJpQ__thumb/img/gw-rdELuykYGGUSGA2xV2OAATnw=/fit-in/200x150/filters:strip_icc()/pic5885666.jpg"},
             #uuid "18594966-e721-3762-8ad4-b4cc663db0b9"
             {:game/id #uuid "18594966-e721-3762-8ad4-b4cc663db0b9",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2046,
                                                 :name "Area Movement"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2837,
                                                 :name "Interrupts"}
                    #:com.boardgamegeek.mechanic{:id 2871,
                                                 :name "Kill Steal"}
                    #:com.boardgamegeek.mechanic{:id 2016,
                                                 :name
                                                 "Secret Unit Deployment"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Judge Dredd: Helter Skelter",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1116,
                                                 :name
                                                 "Comic Book / Strip"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}
                    #:com.boardgamegeek.category{:id 1047,
                                                 :name "Miniatures"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "275034",
              :languages (list "en"),
              :game/name "Judge Dredd: Helter Skelter",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/voQGyVEKCWsh-EfbjdnDCA__thumb/img/YgMuh3DbFOp8k2FqPWNkxEbJ0SE=/fit-in/200x150/filters:strip_icc()/pic4973077.jpg"},
             #uuid "a5d7ddea-2e79-3a0f-b248-95af3f6223d4"
             {:game/id #uuid "a5d7ddea-2e79-3a0f-b248-95af3f6223d4",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}),
              :name "Jungle Brunch",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "130907",
              :game/name "Jungle Brunch",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/oRyH1goh93mCNr1m0bMLtA__thumb/img/WdokDmJ4wy1iQtfbVtSzaTVU_bo=/fit-in/200x150/filters:strip_icc()/pic1422658.jpg"},
             #uuid "f18187e7-f398-32f0-b73e-625e848d8333"
             {:game/id #uuid "f18187e7-f398-32f0-b73e-625e848d8333",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name
                                                 "Dice Rolling"}),
              :name "Jungle race",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1031,
                                                 :name "Racing"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "14616",
              :languages (list "en"),
              :game/name "Jungle Race",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/WOx_B6WTWG9Pmn0S1-6bgQ__thumb/img/UfQc3KADnR_X34kclxhkAPafeQg=/fit-in/200x150/filters:strip_icc()/pic2105293.jpg"},
             #uuid "6db176b1-017b-3430-a362-e2d6ee99cc67"
             {:game/id #uuid "6db176b1-017b-3430-a362-e2d6ee99cc67",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2999,
                                                 :name "Bingo"}
                    #:com.boardgamegeek.mechanic{:id 2984,
                                                 :name "Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2906,
                                                 :name
                                                 "I Cut, You Choose"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}
                    #:com.boardgamegeek.mechanic{:id 2876,
                                                 :name "Race"}
                    #:com.boardgamegeek.mechanic{:id 2821,
                                                 :name
                                                 "Single Loser Game"}
                    #:com.boardgamegeek.mechanic{:id 2988,
                                                 :name
                                                 "Stacking and Balancing"}),
              :name "Junk Art",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1032,
                                                 :name
                                                 "Action / Dexterity"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "193042",
              :languages (list "cz"),
              :game/name "Junk Art",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/5VDnpX_3ykgCjTJSmHdfCA__thumb/img/LLHF9t1MxB0m-NBe_C9cxAyIslA=/fit-in/200x150/filters:strip_icc()/pic2884509.jpg"},
             #uuid "e9e59065-5acd-3d1d-876b-8cb866541534"
             {:game/id #uuid "e9e59065-5acd-3d1d-876b-8cb866541534",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2893,
                                                 :name
                                                 "Communication Limits"}
                    #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}),
              :name "Just One",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1025,
                                                 :name "Word Game"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 7,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "254640",
              :languages (list "en"),
              :game/name "Just One",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/qKcKjHpzAvLddwBhyindag__thumb/img/HhZu2qLp9wyX9PNgvmDE8_hCl-0=/fit-in/200x150/filters:strip_icc()/pic4268499.jpg"},
             #uuid "d94472e2-8880-369b-b2f2-d1d3b83960c6"
             {:game/id #uuid "d94472e2-8880-369b-b2f2-d1d3b83960c6",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2081,
                                                 :name
                                                 "Network and Route Building"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}),
              :name "Kahuna",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}),
              :com.boardgamegeek.boardgame/max-play-time 40,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "394",
              :game/name "Kahuna",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/UdhhVlmQihMbvlNSvY1lUA__thumb/img/bc5NxkspfUfPskxlC30SxlwNyxs=/fit-in/200x150/filters:strip_icc()/pic2606165.jpg"},
             #uuid "83f7cd22-e2a0-3e46-b9ba-4358004dc75f"
             {:game/id #uuid "83f7cd22-e2a0-3e46-b9ba-4358004dc75f",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name
                                                 "Grid Movement"}),
              :name "Kaleva",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}
                    #:com.boardgamegeek.category{:id 1082,
                                                 :name "Mythology"}),
              :com.boardgamegeek.boardgame/max-players 0,
              :com.boardgamegeek.boardgame/id "182174",
              :game/name "Kaleva",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/sdnIpVpAqsZyckQmnql0fg__thumb/img/5-NmFZcvHYLlSIpIVeEiE73_v4o=/fit-in/200x150/filters:strip_icc()/pic2634113.jpg"},
             #uuid "2293c663-d1bc-3701-9a53-009f457c6940"
             {:game/id #uuid "2293c663-d1bc-3701-9a53-009f457c6940",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2048,
                                                 :name
                                                 "Pattern Building"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2829,
                                                 :name
                                                 "Turn Order: Claim Action"}
                    #:com.boardgamegeek.mechanic{:id 2082,
                                                 :name
                                                 "Worker Placement"}),
              :name "Kanagawa",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "200147",
              :languages (list "en"),
              :game/name "Kanagawa",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Rr2JrRztCFzzikJ9YL5-Dw__thumb/img/x9MtKEQlcQ_jS-5AVMeZ28NOC0s=/fit-in/200x150/filters:strip_icc()/pic3105168.jpg"},
             #uuid "909332ae-bc74-34a4-8cd5-4ea30edd7930"
             {:game/id #uuid "909332ae-bc74-34a4-8cd5-4ea30edd7930",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2912,
                                                 :name "Contracts"}
                    #:com.boardgamegeek.mechanic{:id 2664,
                                                 :name
                                                 "Deck, Bag, and Pool Building"}),
              :name "Kashgar",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "143175",
              :languages (list "de"),
              :game/name "Kashgar: Merchants of the Silk Road",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/wEcuixeJMR4e1Jj85qRvWA__thumb/img/262Z59cV9FNpYczcYBOaAIKmgFc=/fit-in/200x150/filters:strip_icc()/pic3697855.jpg"},
             #uuid "e369d9fd-2ab5-3455-9298-16db19e37fd4"
             {:game/id #uuid "e369d9fd-2ab5-3455-9298-16db19e37fd4",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}),
              :name "Kerala",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 3,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "31154",
              :languages (list "en"),
              :game/name "Kerala",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/XiiLyFXVcd8iDmXZbTssfw__thumb/img/ffJlDKp1rIRm9TDj4ApwpNYaqJk=/fit-in/200x150/filters:strip_icc()/pic1064029.png"},
             #uuid "1c585f7b-4a5b-3e81-abe0-97ce17218168"
             {:game/id #uuid "1c585f7b-4a5b-3e81-abe0-97ce17218168",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2689,
                                                 :name "Action Queue"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Kharnage",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}
                    #:com.boardgamegeek.category{:id 1035,
                                                 :name "Medieval"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "194196",
              :languages (list "en"),
              :game/name "Kharnage",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Pp3N1Ai0QMzKcU7XVlLnEA__thumb/img/XNWruCF2upZHUFlcVL_88lnnPW4=/fit-in/200x150/filters:strip_icc()/pic3372416.jpg"},
             #uuid "d8b5d495-0030-372f-8b5b-3131d1bcddc1"
             {:languages (list "en"),
              :name "Kill Dr. Lucky",
              :game/id #uuid "d8b5d495-0030-372f-8b5b-3131d1bcddc1",
              :game/name "Kill Dr. Lucky"},
             #uuid "c9135569-60ba-391a-a44b-1d8f95a4eb93"
             {:game/id #uuid "c9135569-60ba-391a-a44b-1d8f95a4eb93",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}),
              :name "Kilt Castle",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "205826",
              :languages (list "en"),
              :game/name "Kilt Castle",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/ZwHGdOOym-ZlS8mR1oa9Vg__thumb/img/GUyr4p7NCEVWBB2O0Y5J0kr9JBw=/fit-in/200x150/filters:strip_icc()/pic3126011.jpg"},
             #uuid "b1127074-659b-3102-907a-25a0473a3e98"
             {:game/id #uuid "b1127074-659b-3102-907a-25a0473a3e98",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2689,
                                                 :name "Action Queue"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}
                    #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}),
              :name "Quibbit",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1031,
                                                 :name "Racing"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "209849",
              :game/name "King Frog",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/CRNr-IjANGmnMly93P9_lw__thumb/img/C85uPMQ3exnB5lhL8JPZ4GWj5jc=/fit-in/200x150/filters:strip_icc()/pic3648641.png"},
             #uuid "1b2a1ef5-4042-3ba6-826b-7d8fe796f7ba"
             {:game/id #uuid "1b2a1ef5-4042-3ba6-826b-7d8fe796f7ba",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2046,
                                                 :name "Area Movement"}
                    #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2856,
                                                 :name
                                                 "Die Icon Resolution"}
                    #:com.boardgamegeek.mechanic{:id 2886,
                                                 :name
                                                 "King of the Hill"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}
                    #:com.boardgamegeek.mechanic{:id 2870,
                                                 :name
                                                 "Re-rolling and Locking"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}),
              :name "King of New York",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}
                    #:com.boardgamegeek.category{:id 1064,
                                                 :name
                                                 "Movies / TV / Radio theme"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}),
              :com.boardgamegeek.boardgame/max-play-time 40,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 40,
              :com.boardgamegeek.boardgame/id "160499",
              :languages (list "en"),
              :game/name "King of New York",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/FGekxht_r5xqt8oSmQ9HZg__thumb/img/DBoMebkqbcyZWJVLC5MRbF-YbnU=/fit-in/200x150/filters:strip_icc()/pic2407103.jpg"},
             #uuid "e1d04b1f-1d94-3006-958a-ee81242dab6d"
             {:game/id #uuid "e1d04b1f-1d94-3006-958a-ee81242dab6d",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2856,
                                                 :name
                                                 "Die Icon Resolution"}
                    #:com.boardgamegeek.mechanic{:id 2886,
                                                 :name
                                                 "King of the Hill"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}
                    #:com.boardgamegeek.mechanic{:id 2870,
                                                 :name
                                                 "Re-rolling and Locking"}),
              :name "King of Tokyo",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}
                    #:com.boardgamegeek.category{:id 1064,
                                                 :name
                                                 "Movies / TV / Radio theme"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "70323",
              :languages (list "cz" "en"),
              :game/name "King of Tokyo",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/m_RzXpHURC0_xLkvRSR_sw__thumb/img/OfgWmkGJj5BgOO0zFHEtP5CHfbU=/fit-in/200x150/filters:strip_icc()/pic3043734.jpg"},
             #uuid "22b3df14-e100-33a6-a098-e396cb523d6a"
             {:game/id #uuid "22b3df14-e100-33a6-a098-e396cb523d6a",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2956,
                                                 :name "Chaining"}
                    #:com.boardgamegeek.mechanic{:id 2043,
                                                 :name "Enclosure"}
                    #:com.boardgamegeek.mechanic{:id 2026,
                                                 :name "Hexagon Grid"}
                    #:com.boardgamegeek.mechanic{:id 2011,
                                                 :name "Modular Board"}
                    #:com.boardgamegeek.mechanic{:id 2897,
                                                 :name
                                                 "Variable Set-up"}),
              :name "Kingdom Builder",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1035,
                                                 :name "Medieval"}
                    #:com.boardgamegeek.category{:id 1086,
                                                 :name
                                                 "Territory Building"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "107529",
              :game/name "Kingdom Builder",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/kJOP_BICVX-88sKqFRh9PQ__thumb/img/KwrWpSRncnCE0cEldldyVQ-0Cdk=/fit-in/200x150/filters:strip_icc()/pic1152359.jpg"},
             #uuid "843ecaf0-bb25-3a67-af63-f8a4bc3708a3"
             {:game/id #uuid "843ecaf0-bb25-3a67-af63-f8a4bc3708a3",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}),
              :name "Kingdomino",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1029,
                                                 :name "City Building"}
                    #:com.boardgamegeek.category{:id 1035,
                                                 :name "Medieval"}
                    #:com.boardgamegeek.category{:id 1086,
                                                 :name
                                                 "Territory Building"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "204583",
              :languages (list "cz"),
              :game/name "Kingdomino",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/3h9W8BfB_rltQ48EBmHliw__thumb/img/RGpbcY90eBcNLXbHLMBwLrr2uzo=/fit-in/200x150/filters:strip_icc()/pic3132685.png"},
             #uuid "114f738d-8858-3e7b-9fdc-41ddb2758725"
             {:game/id #uuid "114f738d-8858-3e7b-9fdc-41ddb2758725",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}
                    #:com.boardgamegeek.mechanic{:id 2008,
                                                 :name "Trading"}
                    #:com.boardgamegeek.mechanic{:id 2009,
                                                 :name
                                                 "Trick-taking"}),
              :name "King’s struggle",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1035,
                                                 :name "Medieval"}
                    #:com.boardgamegeek.category{:id 1026,
                                                 :name "Negotiation"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "253568",
              :languages (list "en"),
              :game/name "Kings' Struggle",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/ZQI6aR6IcK_EJHCufesE4A__thumb/img/gY4LOjIxf29hE5mceE0auAgR1Cg=/fit-in/200x150/filters:strip_icc()/pic4139916.jpg"},
             #uuid "3b11574d-ac04-3356-aa1c-eb3ac5ef4c6f"
             {:languages (list "cz"),
              :name "Kmotr / Godfather",
              :game/id #uuid "3b11574d-ac04-3356-aa1c-eb3ac5ef4c6f",
              :game/name "Kmotr / Godfather"},
             #uuid "a673ace7-74a3-384d-823b-f8131295d6d1"
             {:languages (list "en"),
              :name "Koba yakawa",
              :game/id #uuid "a673ace7-74a3-384d-823b-f8131295d6d1",
              :game/name "Koba yakawa"},
             #uuid "f0343033-f91c-3c5a-9064-4138ea33af2f"
             {:languages (list "cz"),
              :name "Kocka Karla",
              :game/id #uuid "f0343033-f91c-3c5a-9064-4138ea33af2f",
              :game/name "Kocka Karla"},
             #uuid "938351d5-c89e-32e0-af3b-73d217217b14"
             {:languages (list "cz"),
              :name "Kohouti namluvy",
              :game/id #uuid "938351d5-c89e-32e0-af3b-73d217217b14",
              :game/name "Kohouti namluvy"},
             #uuid "4d4c8a37-4103-35eb-b414-672ae3f8ea83"
             {:languages (list "ru"),
              :name "Kosta Pyaha",
              :game/id #uuid "4d4c8a37-4103-35eb-b414-672ae3f8ea83",
              :game/name "Kosta Pyaha"},
             #uuid "61f2c08e-b43e-3b4f-80bd-d988013ee49b"
             {:name "Kumo",
              :game/id #uuid "61f2c08e-b43e-3b4f-80bd-d988013ee49b",
              :game/name "Kumo"},
             #uuid "6a99a492-a63d-3ef4-a946-1cdbf945a66a"
             {:game/id #uuid "6a99a492-a63d-3ef4-a946-1cdbf945a66a",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2078,
                                                 :name
                                                 "Point to Point Movement"}),
              :name "Kung Fu",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}),
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/id "17442",
              :game/name "Kung Fu",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/f3Cn4GZRQ5q9JwBOVYUDlg__thumb/img/cwT18Dr8XcStsDfnILK29D_wOpI=/fit-in/200x150/filters:strip_icc()/pic75405.jpg"},
             #uuid "ed2baf70-63da-3cbe-9737-466f5a29fe95"
             {:game/id #uuid "ed2baf70-63da-3cbe-9737-466f5a29fe95",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2001,
                                                 :name "Action Points"}
                    #:com.boardgamegeek.mechanic{:id 2013,
                                                 :name
                                                 "Commodity Speculation"}
                    #:com.boardgamegeek.mechanic{:id 2008,
                                                 :name "Trading"}),
              :name "L.L.A.M.A.",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1015,
                                                 :name "Civilization"}
                    #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1026,
                                                 :name "Negotiation"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}
                    #:com.boardgamegeek.category{:id 1086,
                                                 :name
                                                 "Territory Building"}
                    #:com.boardgamegeek.category{:id 1101,
                                                 :name
                                                 "Video Game Theme"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 90,
              :com.boardgamegeek.boardgame/id "18051",
              :languages (list "cz"),
              :game/name "L.L.A.M.A.",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/DIlvdiqrtsThyG-zrbcoaQ__thumb/img/PHwqvNIPyequuc8a1SBCiJ9cSdQ=/fit-in/200x150/filters:strip_icc()/pic385756.jpg"},
             #uuid "90f166e5-27c4-3684-8865-0a7d63773ce7"
             {:game/id #uuid "90f166e5-27c4-3684-8865-0a7d63773ce7",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name
                                                 "Dice Rolling"}),
              :name "Left Center Right",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 12,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "3522",
              :languages (list "en"),
              :game/name "LCR",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/wuS6NwGsDEThQlf12vVBxA__thumb/img/DQ99drs5cEMSyflPM7jV0dhZhjY=/fit-in/200x150/filters:strip_icc()/pic155138.jpg"},
             #uuid "a58b4cee-88af-34f8-9ad6-839f132388f0"
             {:languages (list "en"),
              :name "LOTR card game",
              :game/id #uuid "a58b4cee-88af-34f8-9ad6-839f132388f0",
              :game/name "LOTR card game"},
             #uuid "aecc77c6-bfad-3a88-b455-19b8d2c86bc8"
             {:game/id #uuid "aecc77c6-bfad-3a88-b455-19b8d2c86bc8",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2961,
                                                 :name
                                                 "Map Deformation"}
                    #:com.boardgamegeek.mechanic{:id 2011,
                                                 :name "Modular Board"}
                    #:com.boardgamegeek.mechanic{:id 2081,
                                                 :name
                                                 "Network and Route Building"}
                    #:com.boardgamegeek.mechanic{:id 2078,
                                                 :name
                                                 "Point to Point Movement"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}),
              :name "Labyrinth",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1059,
                                                 :name "Maze"}
                    #:com.boardgamegeek.category{:id 1028,
                                                 :name "Puzzle"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "1219",
              :languages (list "de" "en" "fr"),
              :game/name "Labyrinth",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/R1BmYXFbv-7UyNWQEb6PUg__thumb/img/sLhPl5N5Ed0JpeNqdr1q9kK_0Ew=/fit-in/200x150/filters:strip_icc()/pic2773940.jpg"},
             #uuid "5f955ad8-59ca-3215-9cab-4fa839d2a033"
             {:game/id #uuid "5f955ad8-59ca-3215-9cab-4fa839d2a033",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2014,
                                                 :name
                                                 "Betting and Bluffing"}
                    #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}),
              :name "Lady Alice",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "126912",
              :languages (list "en" "fr"),
              :game/name "Lady Alice",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/6FMrU00_0KHRoVw1hA8eog__thumb/img/LJTPIpdTnlqOO8jH2GGMFBi9Upg=/fit-in/200x150/filters:strip_icc()/pic1431498.jpg"},
             #uuid "0eabf8b7-0bee-38f4-bfd2-cd9ef3624d39"
             {:game/id #uuid "0eabf8b7-0bee-38f4-bfd2-cd9ef3624d39",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Le Fantome de l’Opera",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1054,
                                                 :name "Music"}
                    #:com.boardgamegeek.category{:id 1093,
                                                 :name "Novel-based"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "145645",
              :languages (list "en" "fr"),
              :game/name "Le Fantôme de l'Opéra",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/L4Of6W3yhhjYgmUjH2FDpQ__thumb/img/_evRWSRlE2VrjLu5XCxlayW0qmI=/fit-in/200x150/filters:strip_icc()/pic1726671.jpg"},
             #uuid "d99574a4-a1a2-3d19-96ca-d4f5094dca65"
             {:name "Legendary Encounters",
              :game/id #uuid "d99574a4-a1a2-3d19-96ca-d4f5094dca65",
              :game/name "Legendary Encounters"},
             #uuid "9a6c960c-a513-3563-bb1f-1783f1aece80"
             {:game/id #uuid "9a6c960c-a513-3563-bb1f-1783f1aece80",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2060,
                                                 :name
                                                 "Pattern Recognition"}),
              :name "Let’s Drink",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1032,
                                                 :name
                                                 "Action / Dexterity"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}),
              :com.boardgamegeek.boardgame/max-play-time 25,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "261251",
              :languages (list "en"),
              :game/name "Let's Drink",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/A2uEWD8yMEdnNMih_DDRNQ__thumb/img/Ix5MpioQ4dnNkvYeu9yUVQwKDCw=/fit-in/200x150/filters:strip_icc()/pic5002036.jpg"},
             #uuid "4921b8e8-521a-3a27-9aac-936218a067c7"
             {:game/id #uuid "4921b8e8-521a-3a27-9aac-936218a067c7",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2893,
                                                 :name
                                                 "Communication Limits"}
                    #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}),
              :name "Letter Jam",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1025,
                                                 :name "Word Game"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "275467",
              :languages (list "en"),
              :game/name "Letter Jam",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/kBZGJlIqir1I_EVCr2nDbg__thumb/img/mSl669ndQnGcsmKfe0Yppc1XvbI=/fit-in/200x150/filters:strip_icc()/pic4853794.jpg"},
             #uuid "ae9fa216-d3c0-3682-9657-bc2cb71eaa11"
             {:game/id #uuid "ae9fa216-d3c0-3682-9657-bc2cb71eaa11",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2048,
                                                 :name
                                                 "Pattern Building"}
                    #:com.boardgamegeek.mechanic{:id 2988,
                                                 :name
                                                 "Stacking and Balancing"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}),
              :name "Bild it",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1032,
                                                 :name
                                                 "Action / Dexterity"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "132497",
              :languages (list "lift it"),
              :game/name "Lift it!",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Q_R2gkpJwV-oKNey6eeIcQ__thumb/img/BbmMGq1NLQwWJXrsV-mNs98X3zY=/fit-in/200x150/filters:strip_icc()/pic2568580.jpg"},
             #uuid "5a156002-5793-338e-9399-def9bfd7eca6"
             {:game/id #uuid "5a156002-5793-338e-9399-def9bfd7eca6",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2048,
                                                 :name
                                                 "Pattern Building"}),
              :name "Ligretto",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}),
              :com.boardgamegeek.boardgame/max-play-time 10,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "943",
              :game/name "Ligretto",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/BQ6UyXXeivndO4F9Hu8CHw__thumb/img/2dXMh9HI7oiLw7ZGeLcrwfXLtjI=/fit-in/200x150/filters:strip_icc()/pic1306961.jpg"},
             #uuid "53b40008-e2e5-3189-9b82-fd0ba46405e3"
             {:languages (list "en"),
              :name "Little Monster who came to tea",
              :game/id #uuid "53b40008-e2e5-3189-9b82-fd0ba46405e3",
              :game/name "Little Monster who came to tea"},
             #uuid "39af5c41-5927-3dde-8a75-10397211dcda"
             {:game/id #uuid "39af5c41-5927-3dde-8a75-10397211dcda",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2078,
                                                 :name
                                                 "Point to Point Movement"}
                    #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}),
              :name "Loch Ness",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "77076",
              :game/name "Loch Ness",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/ircfsOW-o8JsIH32Rdb5dg__thumb/img/ZhX_r9YSxxQYWhZ8fnaRw_7EHUo=/fit-in/200x150/filters:strip_icc()/pic775371.jpg"},
             #uuid "cd27a171-5aac-359b-82a4-8a86ed2000c0"
             {:game/id #uuid "cd27a171-5aac-359b-82a4-8a86ed2000c0",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2046,
                                                 :name "Area Movement"}
                    #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2007,
                                                 :name
                                                 "Pick-up and Deliver"}),
              :name "Longhorn",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1055,
                                                 :name "American West"}
                    #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1011,
                                                 :name
                                                 "Transportation"}),
              :com.boardgamegeek.boardgame/max-play-time 80,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 80,
              :com.boardgamegeek.boardgame/id "22460",
              :languages (list "en"),
              :game/name "Longhorn",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Eaudm6F4BQY8pXe06vle_A__thumb/img/leiaNCoFjDnW3S_1PSShVHu2xbM=/fit-in/200x150/filters:strip_icc()/pic117266.jpg"},
             #uuid "b4f52f37-41db-379b-94e2-3b8911f49401"
             {:languages (list "cz"),
              :name "Looney Quest",
              :game/id #uuid "b4f52f37-41db-379b-94e2-3b8911f49401",
              :game/name "Looney Quest"},
             #uuid "59bab2ff-b0ef-386f-8db8-ef439320a47e"
             {:game/id #uuid "59bab2ff-b0ef-386f-8db8-ef439320a47e",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}
                    #:com.boardgamegeek.mechanic{:id 2831,
                                                 :name "Real-Time"}),
              :name "Looping Louie",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1032,
                                                 :name
                                                 "Action / Dexterity"}
                    #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 2650,
                                                 :name
                                                 "Aviation / Flight"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1072,
                                                 :name "Electronic"}
                    #:com.boardgamegeek.category{:id 1064,
                                                 :name
                                                 "Movies / TV / Radio theme"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}),
              :com.boardgamegeek.boardgame/max-play-time 10,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "327",
              :languages (list "en"),
              :game/name "Loopin' Louie",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/e9CWevSJC03NzLybnCKEVQ__thumb/img/vQZYNWt9xSZez7NCoMB5Lz9yBdY=/fit-in/200x150/filters:strip_icc()/pic4025029.png"},
             #uuid "423cb589-88be-336d-ada8-9817b5fe519e"
             {:game/id #uuid "423cb589-88be-336d-ada8-9817b5fe519e",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2046,
                                                 :name "Area Movement"}
                    #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2857,
                                                 :name
                                                 "Card Play Conflict Resolution"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2819,
                                                 :name
                                                 "Solo / Solitaire Game"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}
                    #:com.boardgamegeek.mechanic{:id 2082,
                                                 :name
                                                 "Worker Placement"}),
              :name "Lords of Hellas",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1050,
                                                 :name "Ancient"}
                    #:com.boardgamegeek.category{:id 1047,
                                                 :name "Miniatures"}
                    #:com.boardgamegeek.category{:id 1082,
                                                 :name "Mythology"}
                    #:com.boardgamegeek.category{:id 1086,
                                                 :name
                                                 "Territory Building"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "222509",
              :languages (list "cz"),
              :game/name "Lords of Hellas",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/iOqSO4vRZFp4MqEKXDXEIw__thumb/img/o7KVJlL45wZxunl0wwwJjqTPl3s=/fit-in/200x150/filters:strip_icc()/pic3592207.jpg"},
             #uuid "35b5c110-f2b0-3562-ae79-b51bd6300690"
             {:game/id #uuid "35b5c110-f2b0-3562-ae79-b51bd6300690",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Lost cities board game",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1022,
                                                 :name "Adventure"}
                    #:com.boardgamegeek.category{:id 1020,
                                                 :name "Exploration"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "42487",
              :game/name "Lost Cities: The Board Game",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/d-LqrhWAEuIxdEL6DoR2Jg__thumb/img/rI67HKTBZTdqbKaKNiJiowWLWfo=/fit-in/200x150/filters:strip_icc()/pic4597093.jpg"},
             #uuid "deaefe4b-599d-3d42-982f-b0bef3bbb3d3"
             {:game/id #uuid "deaefe4b-599d-3d42-982f-b0bef3bbb3d3",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2079,
                                                 :name
                                                 "Variable Phase Order"}),
              :name "Lost Temple",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1022,
                                                 :name "Adventure"}
                    #:com.boardgamegeek.category{:id 1020,
                                                 :name "Exploration"}
                    #:com.boardgamegeek.category{:id 1031,
                                                 :name "Racing"}),
              :com.boardgamegeek.boardgame/max-play-time 40,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 40,
              :com.boardgamegeek.boardgame/id "102835",
              :languages (list "en"),
              :game/name "Lost Temple",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/YNxToYNXkHIehCztt96sRA__thumb/img/SkLjpQ3lEdyJHuetTe30xED439c=/fit-in/200x150/filters:strip_icc()/pic1045956.jpg"},
             #uuid "a6480b1c-62dd-3ceb-9f94-fb57c823691e"
             {:game/id #uuid "a6480b1c-62dd-3ceb-9f94-fb57c823691e",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2819,
                                                 :name
                                                 "Solo / Solitaire Game"}),
              :name "Lux Aeterna",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}),
              :com.boardgamegeek.boardgame/max-play-time 12,
              :com.boardgamegeek.boardgame/max-players 1,
              :com.boardgamegeek.boardgame/min-play-time 6,
              :com.boardgamegeek.boardgame/id "282439",
              :languages (list "en"),
              :game/name "Lux Aeterna",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/VpYduL29qLwCNEGMs7soGg__thumb/img/PYXqqR1dkD-eaAJdXo0_LXFFDa0=/fit-in/200x150/filters:strip_icc()/pic4945956.jpg"},
             #uuid "b7dd6050-6cb3-352e-9363-36450ff12ddc"
             {:game/id #uuid "b7dd6050-6cb3-352e-9363-36450ff12ddc",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2026,
                                                 :name "Hexagon Grid"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}),
              :name "Majesty",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1032,
                                                 :name
                                                 "Action / Dexterity"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}
                    #:com.boardgamegeek.category{:id 1120,
                                                 :name "Print & Play"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 5,
              :com.boardgamegeek.boardgame/id "172893",
              :languages (list "cz"),
              :game/name "MAJESTY",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/QFUG6olcmjf1HuOuGGsYpw__thumb/img/NcluPj7hQTHfW-ZM404n-u6SGiI=/fit-in/200x150/filters:strip_icc()/pic2401712.png"},
             #uuid "792a15e4-87a1-362b-8199-5789db4c3b0a"
             {:game/id #uuid "792a15e4-87a1-362b-8199-5789db4c3b0a",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2005,
                                                 :name
                                                 "Stock Holding"}),
              :name "Crunch",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "65204",
              :languages (list "en"),
              :game/name "MASU"},
             #uuid "d8ac8dc4-6760-3f12-96c2-e3420b291781"
             {:game/id #uuid "d8ac8dc4-6760-3f12-96c2-e3420b291781",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2909,
                                                 :name
                                                 "Random Production"}),
              :name "Machi Koro",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1029,
                                                 :name "City Building"}
                    #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "143884",
              :languages (list "cz" "de"),
              :game/name "Machi Koro",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/_lI2eUDHfesfe5SswJiFAg__thumb/img/tCTP0XMMmsAfNqzb0iYmp0b-YUc=/fit-in/200x150/filters:strip_icc()/pic4783831.png"},
             #uuid "47a720fb-24ff-320b-99ab-77739da99a5a"
             {:game/id #uuid "47a720fb-24ff-320b-99ab-77739da99a5a",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2909,
                                                 :name
                                                 "Random Production"}),
              :name "Machi Koro Bright Lights, Big City",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1029,
                                                 :name "City Building"}
                    #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "205494",
              :languages (list "en"),
              :game/name "Machi Koro: Bright Lights, Big City",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/e9Z1IOX7_HwspCzP54prPg__thumb/img/hw04Z1zdSvxIV7REA5pryXVqZas=/fit-in/200x150/filters:strip_icc()/pic3119592.png"},
             #uuid "227fed4b-25cc-316a-b15e-6c9a064702db"
             {:game/id #uuid "227fed4b-25cc-316a-b15e-6c9a064702db",
              :com.boardgamegeek.boardgame/min-players 6,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2028,
                                                 :name "Role Playing"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Mafia de cuba",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1033,
                                                 :name "Mafia"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 12,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "176558",
              :languages (list "en"),
              :game/name "Mafia de Cuba",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/nvdogXld5bIr8uXIq2M-uA__thumb/img/j82wTfCvi4Cjq3Pa3aJDLS1nuRw=/fit-in/200x150/filters:strip_icc()/pic2519675.jpg"},
             #uuid "1ceaeab6-397f-308a-b02e-6652106f2fbd"
             {:game/id #uuid "1ceaeab6-397f-308a-b02e-6652106f2fbd",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2057,
                                                 :name
                                                 "Chit-Pull System"}),
              :name "Majority Rules",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1001,
                                                 :name "Political"}),
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/id "41628",
              :languages (list "en"),
              :game/name "Majority Rules",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/ynZ--2v9bdc4TIWpAs57_g__thumb/img/Fd32l5WNDYHUNrE6rJ5kSTbYZIo=/fit-in/200x150/filters:strip_icc()/pic4798299.jpg"},
             #uuid "43f3a349-eec8-3b6a-9947-777f90811c90"
             {:game/id #uuid "43f3a349-eec8-3b6a-9947-777f90811c90",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2048,
                                                 :name
                                                 "Pattern Building"}),
              :name "Manno monster",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}),
              :com.boardgamegeek.boardgame/max-play-time 25,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 25,
              :com.boardgamegeek.boardgame/id "144416",
              :languages (list "de"),
              :game/name "Manno Monster",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/1F6vYgRF_j4Z07AbfwjwlQ__thumb/img/WIwHzTE61haoGpogRmYC2vRFaDE=/fit-in/200x150/filters:strip_icc()/pic1708405.jpg"},
             #uuid "3980f7ea-079b-3741-a713-8494f6bcbb9a"
             {:game/id #uuid "3980f7ea-079b-3741-a713-8494f6bcbb9a",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2912,
                                                 :name "Contracts"}
                    #:com.boardgamegeek.mechanic{:id 2875,
                                                 :name
                                                 "End Game Bonuses"}
                    #:com.boardgamegeek.mechanic{:id 2850,
                                                 :name "Events"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2902,
                                                 :name "Income"}
                    #:com.boardgamegeek.mechanic{:id 2947,
                                                 :name
                                                 "Movement Points"}
                    #:com.boardgamegeek.mechanic{:id 2851,
                                                 :name
                                                 "Narrative Choice / Paragraph"}
                    #:com.boardgamegeek.mechanic{:id 2078,
                                                 :name
                                                 "Point to Point Movement"}
                    #:com.boardgamegeek.mechanic{:id 2822,
                                                 :name
                                                 "Scenario / Mission / Campaign Game"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2819,
                                                 :name
                                                 "Solo / Solitaire Game"}
                    #:com.boardgamegeek.mechanic{:id 2005,
                                                 :name "Stock Holding"}
                    #:com.boardgamegeek.mechanic{:id 2884,
                                                 :name
                                                 "Sudden Death Ending"}
                    #:com.boardgamegeek.mechanic{:id 2849,
                                                 :name
                                                 "Tech Trees / Tech Tracks"}
                    #:com.boardgamegeek.mechanic{:id 2939,
                                                 :name
                                                 "Track Movement"}
                    #:com.boardgamegeek.mechanic{:id 2897,
                                                 :name
                                                 "Variable Set-up"}),
              :name "Maracaibo",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1020,
                                                 :name "Exploration"}
                    #:com.boardgamegeek.category{:id 1090,
                                                 :name "Pirates"}),
              :com.boardgamegeek.boardgame/max-play-time 120,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "276025",
              :languages (list "en"),
              :game/name "Maracaibo",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/rMNa0k05zMdKgSEp26Q3Tw__thumb/img/lVlnhYyxlZb3WuKZJHLoJcFHEjs=/fit-in/200x150/filters:strip_icc()/pic4917407.jpg"},
             #uuid "3384a03c-665a-3116-a474-cf5d4406c85a"
             {:game/id #uuid "3384a03c-665a-3116-a474-cf5d4406c85a",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2007,
                                                 :name
                                                 "Pick-up and Deliver"}
                    #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2008,
                                                 :name "Trading"}),
              :name "Marco Polo",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1022,
                                                 :name "Adventure"}
                    #:com.boardgamegeek.category{:id 1052,
                                                 :name "Arabian"}
                    #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1020,
                                                 :name "Exploration"}
                    #:com.boardgamegeek.category{:id 1011,
                                                 :name
                                                 "Transportation"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "2280",
              :languages (list "cz"),
              :game/name "Marco Polo",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/kphUeoUqMXHrVGbSgFEk0w__thumb/img/e8-7eDIBCZysiUW607XANuXfY6E=/fit-in/200x150/filters:strip_icc()/pic20540.jpg"},
             #uuid "eab3ae9a-3d28-3df8-affc-d917c97d7195"
             {:game/id #uuid "eab3ae9a-3d28-3df8-affc-d917c97d7195",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2073,
                                                 :name "Acting"}
                    #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}),
              :name "Masquerade",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 12,
              :com.boardgamegeek.boardgame/min-play-time 90,
              :com.boardgamegeek.boardgame/id "8644",
              :languages (list "cz"),
              :game/name "Masquerade",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/p1qMG3b0Do2BXkahQhxQhQ__thumb/img/UId86MhgXlzheSSDUMXyYd5vp8I=/fit-in/200x150/filters:strip_icc()/pic1215445.jpg"},
             #uuid "133c22e7-c259-3256-a323-5b88f0b6a645"
             {:game/id #uuid "133c22e7-c259-3256-a323-5b88f0b6a645",
              :com.boardgamegeek.boardgame/min-players 5,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}
                    #:com.boardgamegeek.mechanic{:id 2017,
                                                 :name "Voting"}),
              :name "Mayday Mayday",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 2650,
                                                 :name
                                                 "Aviation / Flight"}
                    #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}),
              :com.boardgamegeek.boardgame/max-play-time 25,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 25,
              :com.boardgamegeek.boardgame/id "142924",
              :languages (list "en"),
              :game/name "Mayday!Mayday!",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Souny15gpklxNkWsZiW9wA__thumb/img/G-dqBFDgzZHi6Oy2iQVP6nXeHOY=/fit-in/200x150/filters:strip_icc()/pic2243928.jpg"},
             #uuid "12fd071d-60ce-3146-b555-655882920638"
             {:languages (list "cz" "en"),
              :name "McJohnnys",
              :game/id #uuid "12fd071d-60ce-3146-b555-655882920638",
              :game/name "McJohnnys"},
             #uuid "e8f7e1a7-0eb6-3e44-aee0-11dff550f9ee"
             {:game/id #uuid "e8f7e1a7-0eb6-3e44-aee0-11dff550f9ee",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2001,
                                                 :name "Action Points"}
                    #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2012,
                                                 :name
                                                 "Auction/Bidding"}
                    #:com.boardgamegeek.mechanic{:id 2016,
                                                 :name
                                                 "Secret Unit Deployment"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}
                    #:com.boardgamegeek.mechanic{:id 2017,
                                                 :name "Voting"}),
              :name "Mea Culpa",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 1118,
                                                 :name
                                                 "Mature / Adult"}
                    #:com.boardgamegeek.category{:id 1035,
                                                 :name "Medieval"}
                    #:com.boardgamegeek.category{:id 1115,
                                                 :name "Religious"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 90,
              :com.boardgamegeek.boardgame/id "203624",
              :languages (list "de" "en"),
              :game/name "Mea Culpa",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/yXU6z6pl-Kkn7KRUpiCKiw__thumb/img/rdeSRR98yXhlvfaprZbPjgTIQTE=/fit-in/200x150/filters:strip_icc()/pic3108106.jpg"},
             #uuid "87f8a6ab-85c9-3ed3-b02b-4ea641ad4bb5"
             {:game/id #uuid "87f8a6ab-85c9-3ed3-b02b-4ea641ad4bb5",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2893,
                                                 :name
                                                 "Communication Limits"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}),
              :name "Medium",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1025,
                                                 :name "Word Game"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "242529",
              :languages (list "en"),
              :game/name "Medium",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/gaiG9Iv8S3G6ppC5AKlNIQ__thumb/img/85q4rpTU8rQy3n0-agc3YUjda4o=/fit-in/200x150/filters:strip_icc()/pic4912833.png"},
             #uuid "fcbd772e-48c4-307d-bd3b-e13b37a82f5e"
             {:game/id #uuid "fcbd772e-48c4-307d-bd3b-e13b37a82f5e",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2046,
                                                 :name "Area Movement"}
                    #:com.boardgamegeek.mechanic{:id 2012,
                                                 :name
                                                 "Auction/Bidding"}
                    #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Epix",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1035,
                                                 :name "Medieval"}
                    #:com.boardgamegeek.category{:id 1086,
                                                 :name
                                                 "Territory Building"}
                    #:com.boardgamegeek.category{:id 1019,
                                                 :name "Wargame"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "165657",
              :game/name "Melee",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/S4ru-E2eXhpaJBX1WQOxeQ__thumb/img/zLMYjsqpHZkWNtlOVuQlMeHZ48k=/fit-in/200x150/filters:strip_icc()/pic2564896.jpg"},
             #uuid "d88a6b63-1a1c-36ea-95d1-2d05210eb706"
             {:game/id #uuid "d88a6b63-1a1c-36ea-95d1-2d05210eb706",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}
                    #:com.boardgamegeek.mechanic{:id 2989,
                                                 :name
                                                 "Physical Removal"}
                    #:com.boardgamegeek.mechanic{:id 2988,
                                                 :name
                                                 "Stacking and Balancing"}),
              :name "Menara",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1032,
                                                 :name
                                                 "Action / Dexterity"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "244608",
              :languages (list "en"),
              :game/name "Menara",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/qRwLtZZDhIT1wPD8qjCEUA__thumb/img/M7GGgc8cAX5AiTfdC8U4AieR6VQ=/fit-in/200x150/filters:strip_icc()/pic3944407.jpg"},
             #uuid "530b622e-6e90-30f4-b806-d0cbf74102a5"
             {:game/id #uuid "530b622e-6e90-30f4-b806-d0cbf74102a5",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2046,
                                                 :name "Area Movement"}
                    #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2028,
                                                 :name "Role Playing"}
                    #:com.boardgamegeek.mechanic{:id 2027,
                                                 :name "Storytelling"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Mice and Mystics",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1022,
                                                 :name "Adventure"}
                    #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1020,
                                                 :name "Exploration"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}
                    #:com.boardgamegeek.category{:id 1047,
                                                 :name "Miniatures"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "124708",
              :languages (list "en"),
              :game/name "Mice and Mystics",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/pZFrbWXBzrkxqOotg05D9Q__thumb/img/nrgg_ID3yq1r5dZ6iWe4de3GW6E=/fit-in/200x150/filters:strip_icc()/pic1312072.jpg"},
             #uuid "4ab65803-6f4f-3742-85c3-84b863fed5c2"
             {:game/id #uuid "4ab65803-6f4f-3742-85c3-84b863fed5c2",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2081,
                                                 :name
                                                 "Network and Route Building"}
                    #:com.boardgamegeek.mechanic{:id 2813,
                                                 :name "Rondel"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}),
              :name "MileStones",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1086,
                                                 :name
                                                 "Territory Building"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "117914",
              :game/name "Milestones",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/tP2C-DDjV10zGqZFDwXcxA__thumb/img/9Klfq9ORCU3904fVqh9DiJXHDRQ=/fit-in/200x150/filters:strip_icc()/pic1336176.jpg"},
             #uuid "58fb7a8c-d0f1-36b0-b1f5-b7091fbb0ba0"
             {:game/id #uuid "58fb7a8c-d0f1-36b0-b1f5-b7091fbb0ba0",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}),
              :name "Mille Bornes",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1031,
                                                 :name "Racing"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "590",
              :languages (list "en"),
              :game/name "Mille Bornes",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/kzLZY_DHTh-hBcqXP34a5w__thumb/img/82b4hCqE8tTLkwexnLrp3ubGU_c=/fit-in/200x150/filters:strip_icc()/pic4330533.jpg"},
             #uuid "903d8dd1-63cb-3a8b-bcfa-23261d6598b2"
             {:game/id #uuid "903d8dd1-63cb-3a8b-bcfa-23261d6598b2",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2001,
                                                 :name "Action Points"}
                    #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2011,
                                                 :name "Modular Board"}
                    #:com.boardgamegeek.mechanic{:id 2081,
                                                 :name
                                                 "Network and Route Building"}),
              :name "Mined Out",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1020,
                                                 :name "Exploration"}),
              :com.boardgamegeek.boardgame/max-play-time 50,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "212348",
              :languages (list "en"),
              :game/name "Mined Out!",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/k33VoKTDM-E5iIMwv6flxA__thumb/img/buyKl6WQgvzisWu_k7djrizjqew=/fit-in/200x150/filters:strip_icc()/pic3267967.jpg"},
             #uuid "fbccf9d3-dd4b-3e43-954e-9fafac2763ae"
             {:game/id #uuid "fbccf9d3-dd4b-3e43-954e-9fafac2763ae",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}),
              :name "Mmm…",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "172507",
              :languages (list "cz"),
              :game/name "Mmm!",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/V_nDKd8bFLwCu4ttyuWJrg__thumb/img/Djv6DavegF7YoX7YrwZlgHr1mgY=/fit-in/200x150/filters:strip_icc()/pic2498158.jpg"},
             #uuid "dce6433a-bef0-3dff-a22e-433b721bfc14"
             {:game/id #uuid "dce6433a-bef0-3dff-a22e-433b721bfc14",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2689,
                                                 :name "Action Queue"}
                    #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2664,
                                                 :name
                                                 "Deck, Bag, and Pool Building"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2910,
                                                 :name "Investment"}
                    #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}
                    #:com.boardgamegeek.mechanic{:id 2005,
                                                 :name "Stock Holding"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}
                    #:com.boardgamegeek.mechanic{:id 2082,
                                                 :name
                                                 "Worker Placement"}),
              :name "Mombasa",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}),
              :com.boardgamegeek.boardgame/max-play-time 150,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 75,
              :com.boardgamegeek.boardgame/id "172386",
              :languages (list "cz"),
              :game/name "Mombasa",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/VceWk5QVkgIp6rWDl5qHKQ__thumb/img/_4ZkvkgZey9R2OJOw_TqF426Qew=/fit-in/200x150/filters:strip_icc()/pic2611318.jpg"},
             #uuid "4d6bfce7-c3d0-3def-8625-e405087939ed"
             {:game/id #uuid "4d6bfce7-c3d0-3def-8625-e405087939ed",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2012,
                                                 :name
                                                 "Auction/Bidding"}
                    #:com.boardgamegeek.mechanic{:id 2902,
                                                 :name "Income"}
                    #:com.boardgamegeek.mechanic{:id 2904,
                                                 :name "Loans"}
                    #:com.boardgamegeek.mechanic{:id 2836,
                                                 :name "Lose a Turn"}
                    #:com.boardgamegeek.mechanic{:id 2911,
                                                 :name "Ownership"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}
                    #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2005,
                                                 :name "Stock Holding"}
                    #:com.boardgamegeek.mechanic{:id 2939,
                                                 :name
                                                 "Track Movement"}
                    #:com.boardgamegeek.mechanic{:id 2008,
                                                 :name "Trading"}),
              :name "Monopoly",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1026,
                                                 :name "Negotiation"}),
              :com.boardgamegeek.boardgame/max-play-time 180,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "1406",
              :game/name "Monopoly",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/9nGoBZ0MRbi6rdH47sj2Qg__thumb/img/ezXcyEsHhS9iRxmuGe8SmiLLXlM=/fit-in/200x150/filters:strip_icc()/pic5786795.jpg"},
             #uuid "db5ac01b-b987-3006-8f5a-61d4142920ec"
             {:game/id #uuid "db5ac01b-b987-3006-8f5a-61d4142920ec",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2008,
                                                 :name "Trading"}),
              :name "Monopoly Cheaters Edition",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}),
              :com.boardgamegeek.boardgame/max-play-time 180,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "254617",
              :game/name "Monopoly Cheaters Edition",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/78dZB2GPUrjMXQyOnqZ65Q__thumb/img/mOJbxy0j7TRHx4epykdoyKNDEOA=/fit-in/200x150/filters:strip_icc()/pic4187117.jpg"},
             #uuid "0663d3ee-2750-30d4-ad83-aa74a59c87ce"
             {:game/id #uuid "0663d3ee-2750-30d4-ad83-aa74a59c87ce",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2012,
                                                 :name
                                                 "Auction/Bidding"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}
                    #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2008,
                                                 :name "Trading"}),
              :name "Monopoly Jackpot",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1026,
                                                 :name "Negotiation"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "201890",
              :game/name "Monopoly Jackpot",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/30x4ifcezQlEXStSK3vSRg__thumb/img/GmvSu2Qd5T1r6JZRj73DgBOQcsY=/fit-in/200x150/filters:strip_icc()/pic3262276.jpg"},
             #uuid "f8049db2-d889-3677-984e-4e2ce41de578"
             {:game/id #uuid "f8049db2-d889-3677-984e-4e2ce41de578",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2012,
                                                 :name
                                                 "Auction/Bidding"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}
                    #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2008,
                                                 :name "Trading"}),
              :name "Monopoly 80th Anniversary Edition",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1026,
                                                 :name "Negotiation"}),
              :com.boardgamegeek.boardgame/max-play-time 180,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "173637",
              :game/name "Monopoly:  80th Anniversary Edition",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/IiL8FBqK_BcuikjRZKezIQ__thumb/img/Dy7RlFc6nDFo5Re95Rkci6-lfNI=/fit-in/200x150/filters:strip_icc()/pic2427080.jpg"},
             #uuid "042103e1-8bdd-3157-aceb-cca413d78f3b"
             {:game/id #uuid "042103e1-8bdd-3157-aceb-cca413d78f3b",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}),
              :name "Monopoly Here & Now World Edition",
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "191133",
              :game/name "Monopoly: Here & Now World Edition",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/TYGyseP1SBvcdORtpwx0vg__thumb/img/wbpOBl1ywZoz8W7o5Kb1nwfIBwE=/fit-in/200x150/filters:strip_icc()/pic2830269.jpg"},
             #uuid "23767cbb-cceb-3686-8a59-f0250c57a1d9"
             {:game/id #uuid "23767cbb-cceb-3686-8a59-f0250c57a1d9",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2012,
                                                 :name
                                                 "Auction/Bidding"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}
                    #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2008,
                                                 :name "Trading"}),
              :name "Monopoly Limerick Edition",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1026,
                                                 :name "Negotiation"}),
              :com.boardgamegeek.boardgame/max-play-time 120,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 120,
              :com.boardgamegeek.boardgame/id "300801",
              :game/name "Monopoly: Limerick Edition",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/8ILfC2W174MxPrA2wfaifw__thumb/img/ZntaNB4_2mPPc6fibqDq2vhVaaY=/fit-in/200x150/filters:strip_icc()/pic5216777.jpg"},
             #uuid "b17747c8-2344-37e0-af25-4c86481d8b35"
             {:game/id #uuid "b17747c8-2344-37e0-af25-4c86481d8b35",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2013,
                                                 :name
                                                 "Commodity Speculation"}
                    #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}),
              :name "Monopoly Ultimate Banking",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1072,
                                                 :name "Electronic"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "207167",
              :game/name "Monopoly: Ultimate Banking",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/tCcB6q7RjB-LcszCG1TCfQ__thumb/img/Dw1stW35naEWBlMLHVG8h_P0HJU=/fit-in/200x150/filters:strip_icc()/pic3188674.jpg"},
             #uuid "1309682a-fbd4-3c2b-89cb-11c7d8048013"
             {:game/id #uuid "1309682a-fbd4-3c2b-89cb-11c7d8048013",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2018,
                                                 :name
                                                 "Campaign / Battle Card Driven"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2011,
                                                 :name
                                                 "Modular Board"}),
              :name "Monstrous",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1032,
                                                 :name
                                                 "Action / Dexterity"}
                    #:com.boardgamegeek.category{:id 1050,
                                                 :name "Ancient"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1082,
                                                 :name "Mythology"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 10,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "164775",
              :languages (list "en"),
              :game/name "Monstrous",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/eF724u6DJlXUFnc3hBKrGQ__thumb/img/y_SRAOIaniPmZBiQ59OYNRJYOec=/fit-in/200x150/filters:strip_icc()/pic3297444.jpg"},
             #uuid "cb6afc25-1c32-38b1-bfe0-1c3f8797a9ea"
             {:game/id #uuid "cb6afc25-1c32-38b1-bfe0-1c3f8797a9ea",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name
                                                 "Dice Rolling"}),
              :name "Monstrum",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}),
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/id "127426",
              :languages (list "cz"),
              :game/name "Monstrum",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/CV7xiLrZo8rHdjD8yBVbvw__thumb/img/z3I-welI7QeetRLaOzYAD90_YV4=/fit-in/200x150/filters:strip_icc()/pic1365924.jpg"},
             #uuid "e923a27a-48cd-3c06-a494-d0fa119478a8"
             {:game/id #uuid "e923a27a-48cd-3c06-a494-d0fa119478a8",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2001,
                                                 :name "Action Points"}
                    #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2011,
                                                 :name
                                                 "Modular Board"}),
              :name "MoonQuake Escape",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "175516",
              :languages (list "en"),
              :game/name "MoonQuake Escape",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/S48n6sA2U93zwrKDdXKkfw__thumb/img/w1IrqbOXxzyjc99CRxea_dQCRfc=/fit-in/200x150/filters:strip_icc()/pic2829035.jpg"},
             #uuid "1fdd0d64-7a70-3a2d-93b1-bbf278454b32"
             {:game/id #uuid "1fdd0d64-7a70-3a2d-93b1-bbf278454b32",
              :com.boardgamegeek.boardgame/min-players 5,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2915,
                                                 :name "Negotiation"}
                    #:com.boardgamegeek.mechanic{:id 2017,
                                                 :name "Voting"}),
              :name "Moral Dilemma",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 1118,
                                                 :name
                                                 "Mature / Adult"}
                    #:com.boardgamegeek.category{:id 1026,
                                                 :name "Negotiation"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 20,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "167715",
              :languages (list "en"),
              :game/name "Moral Dilemma",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Mooqmdf2jP38oavcfZ5RDg__thumb/img/AZfnJTdnFGCWh78YAUZdE_decKc=/fit-in/200x150/filters:strip_icc()/pic3262426.jpg"},
             #uuid "3b726f01-748c-32b9-ac65-408fdb259e18"
             {:game/id #uuid "3b726f01-748c-32b9-ac65-408fdb259e18",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2012,
                                                 :name
                                                 "Auction/Bidding"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2048,
                                                 :name
                                                 "Pattern Building"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}),
              :name "Mozaika",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1050,
                                                 :name "Ancient"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "25567",
              :languages (list "de" "en" "pl"),
              :game/name "Mozaika",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/7VSlBiPWlFGBPm2niiWbCg__thumb/img/im70JKZmGxABdYDJdcATPg9axT4=/fit-in/200x150/filters:strip_icc()/pic344437.jpg"},
             #uuid "39458645-fcb9-368d-81b6-ad23bbed69cf"
             {:game/id #uuid "39458645-fcb9-368d-81b6-ad23bbed69cf",
              :com.boardgamegeek.boardgame/min-players 3,
              :name "Mr. Face",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "267945",
              :languages (list "de" "en" "fr" "it"),
              :game/name "Mr. Face",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/uBBBtbjmKDGJilb7bn9r8Q__thumb/img/pReg8AZr5HMH4uRg5SRjKrO30-w=/fit-in/200x150/filters:strip_icc()/pic5797033.png"},
             #uuid "51c249b0-90c8-3a66-8732-f796a82e5382"
             {:game/id #uuid "51c249b0-90c8-3a66-8732-f796a82e5382",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2961,
                                                 :name
                                                 "Map Deformation"}
                    #:com.boardgamegeek.mechanic{:id 2011,
                                                 :name
                                                 "Modular Board"}),
              :name "Mr Jack Pocket",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1040,
                                                 :name
                                                 "Murder/Mystery"}
                    #:com.boardgamegeek.category{:id 2710,
                                                 :name
                                                 "Post-Napoleonic"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "72287",
              :languages (list "en" "fr"),
              :game/name "Mr. Jack Pocket",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/nd44m6n6ykDCsHVt4wcEcQ__thumb/img/wpEJcfEdHyXDW1Kh3xbevgW2JuA=/fit-in/200x150/filters:strip_icc()/pic1519530.jpg"},
             #uuid "6e8ce4f2-3cc4-37b8-9002-721e44843aaf"
             {:game/id #uuid "6e8ce4f2-3cc4-37b8-9002-721e44843aaf",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Munchkin",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}),
              :com.boardgamegeek.boardgame/max-play-time 120,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "1927",
              :languages (list "cz" "en"),
              :game/name "Munchkin",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/J-ts3MW0UhDzs621TR6cog__thumb/img/8hVkpMC5pDLr6ARI_4gI4N3aF5M=/fit-in/200x150/filters:strip_icc()/pic1871016.jpg"},
             #uuid "e3ff49f1-3a4e-3be2-9c80-51385adc499c"
             {:game/id #uuid "e3ff49f1-3a4e-3be2-9c80-51385adc499c",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2893,
                                                 :name
                                                 "Communication Limits"}
                    #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}
                    #:com.boardgamegeek.mechanic{:id 2866,
                                                 :name
                                                 "Targeted Clues"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}
                    #:com.boardgamegeek.mechanic{:id 2017,
                                                 :name "Voting"}),
              :name "Muse",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 12,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "234396",
              :languages (list "cz"),
              :game/name "Muse",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/6gDD73LSCMrr7ab1LHCXCg__thumb/img/YmT4zvKoAkhx62AGUdeylS7mQig=/fit-in/200x150/filters:strip_icc()/pic3719954.jpg"},
             #uuid "6322ea9d-5e70-3e8c-89a6-0e261275b1d1"
             {:game/id #uuid "6322ea9d-5e70-3e8c-89a6-0e261275b1d1",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2048,
                                                 :name
                                                 "Pattern Building"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Musee",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "163056",
              :languages (list "en"),
              :game/name "Musée",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/S6dzLYuwDsYvzreZ8UAapg__thumb/img/fjXBTIZGJYt1vCcuHjLjaB3GuLs=/fit-in/200x150/filters:strip_icc()/pic2088837.jpg"},
             #uuid "46df0476-0eb0-30b7-92cd-7703972c5f1a"
             {:game/id #uuid "46df0476-0eb0-30b7-92cd-7703972c5f1a",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2060,
                                                 :name
                                                 "Pattern Recognition"}),
              :name "My Booty",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1032,
                                                 :name
                                                 "Action / Dexterity"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1090,
                                                 :name "Pirates"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "221083",
              :languages (list "en"),
              :game/name "My Booty!",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/coC-QGCrRZgx-O73RwTnzQ__thumb/img/33WbZE6k9Ju-LfhygSRmw1JYMgw=/fit-in/200x150/filters:strip_icc()/pic3433568.jpg"},
             #uuid "baf9b7dd-749d-37d7-888f-c84d255e682f"
             {:game/id #uuid "baf9b7dd-749d-37d7-888f-c84d255e682f",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2864,
                                                 :name
                                                 "Force Commitment"}
                    #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2007,
                                                 :name
                                                 "Pick-up and Deliver"}
                    #:com.boardgamegeek.mechanic{:id 2819,
                                                 :name
                                                 "Solo / Solitaire Game"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}),
              :name "My little Scythe",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1020,
                                                 :name "Exploration"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}
                    #:com.boardgamegeek.category{:id 1104,
                                                 :name "Math"}
                    #:com.boardgamegeek.category{:id 1047,
                                                 :name "Miniatures"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "226320",
              :languages (list "en"),
              :game/name "My Little Scythe",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/EhXCpSR6ambdYuKbrej3UQ__thumb/img/3znFvjc6uN6rossizk5I5eOr4Rk=/fit-in/200x150/filters:strip_icc()/pic4134810.jpg"},
             #uuid "df4c4520-3102-33f1-9a51-ee304c193f23"
             {:game/id #uuid "df4c4520-3102-33f1-9a51-ee304c193f23",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Mystic scrolls",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}),
              :com.boardgamegeek.boardgame/max-play-time 25,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "198455",
              :languages (list "en"),
              :game/name "Mystic ScROLLS",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/9cwjyRGj3SBDeJyO17p2Qw__thumb/img/IZBiEizOIxVgTnXkVbgaxg-wY1g=/fit-in/200x150/filters:strip_icc()/pic3174074.jpg"},
             #uuid "2bc22d15-7e2b-3a2d-aaaa-46fe0f8945e2"
             {:game/id #uuid "2bc22d15-7e2b-3a2d-aaaa-46fe0f8945e2",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2664,
                                                 :name
                                                 "Deck, Bag, and Pool Building"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}),
              :name "Mythotopia",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1035,
                                                 :name "Medieval"}
                    #:com.boardgamegeek.category{:id 1082,
                                                 :name "Mythology"}
                    #:com.boardgamegeek.category{:id 1086,
                                                 :name
                                                 "Territory Building"}
                    #:com.boardgamegeek.category{:id 1019,
                                                 :name "Wargame"}),
              :com.boardgamegeek.boardgame/max-play-time 120,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "133632",
              :languages (list "en"),
              :game/name "Mythotopia",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Pk-IBl84HBPZWZQgQWkCpQ__thumb/img/a3sfzRClZ7sfj4Jyq6SJ8TdCQto=/fit-in/200x150/filters:strip_icc()/pic2257592.jpg"},
             #uuid "704d0598-6340-3c49-b5b5-9d0fcf54e1f3"
             {:game/id #uuid "704d0598-6340-3c49-b5b5-9d0fcf54e1f3",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2011,
                                                 :name "Modular Board"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2082,
                                                 :name
                                                 "Worker Placement"}),
              :name "New Corp Order",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1001,
                                                 :name "Political"}
                    #:com.boardgamegeek.category{:id 1081,
                                                 :name
                                                 "Spies/Secret Agents"}
                    #:com.boardgamegeek.category{:id 1086,
                                                 :name
                                                 "Territory Building"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 25,
              :com.boardgamegeek.boardgame/id "232478",
              :languages (list "en"),
              :game/name "New Corp Order",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/UJL9d_WpRk3jvdEWO5incA__thumb/img/E5cfhNNliCz4XpMXDejzmZ8llRE=/fit-in/200x150/filters:strip_icc()/pic4026118.jpg"},
             #uuid "36f8c047-0a0d-34e8-920b-337b779969ab"
             {:game/id #uuid "36f8c047-0a0d-34e8-920b-337b779969ab",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2912,
                                                 :name "Contracts"}
                    #:com.boardgamegeek.mechanic{:id 2984,
                                                 :name "Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2082,
                                                 :name
                                                 "Worker Placement"}),
              :name "Noctiluca",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "269752",
              :languages (list "cz"),
              :game/name "Noctiluca",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/qQGBX-BW4SOuQMdm7pjZQg__thumb/img/3Q3aYBEbblKxEUU8HutRqydWcLU=/fit-in/200x150/filters:strip_icc()/pic4766236.jpg"},
             #uuid "07f37b38-2b05-392e-91fd-d4e76cc7fbf0"
             {:game/id #uuid "07f37b38-2b05-392e-91fd-d4e76cc7fbf0",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2012,
                                                 :name
                                                 "Auction/Bidding"}
                    #:com.boardgamegeek.mechanic{:id 2005,
                                                 :name
                                                 "Stock Holding"}),
              :name "North American Railways",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1034,
                                                 :name "Trains"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "191438",
              :languages (list "en"),
              :game/name "North American Railways",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/EhFHGbpihB7KBNEuDe0bJw__thumb/img/EydatDnC9as4K-Oiel7ujVS8oSk=/fit-in/200x150/filters:strip_icc()/pic3847804.png"},
             #uuid "5af83e31-96bf-39f4-80f3-1f2e1a6c9afe"
             {:game/id #uuid "5af83e31-96bf-39f4-80f3-1f2e1a6c9afe",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}),
              :name "OMG",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 1082,
                                                 :name "Mythology"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "181245",
              :languages (list "en"),
              :game/name "OMG",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/nLpk3zLehjGSiWo76Oo9Yg__thumb/img/jrztxp2Re5S7ouhTSGyBdxnhjIc=/fit-in/200x150/filters:strip_icc()/pic2605033.jpg"},
             #uuid "17b41f7f-4de8-3fe3-be7f-91fc18e29b8a"
             {:game/id #uuid "17b41f7f-4de8-3fe3-be7f-91fc18e29b8a",
              :com.boardgamegeek.boardgame/min-players 4,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}),
              :name "Obscenity",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 16,
              :com.boardgamegeek.boardgame/min-play-time 25,
              :com.boardgamegeek.boardgame/id "243671",
              :languages (list "en"),
              :game/name "Obscenity: A Shameless Adult Party Game",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/ezwhC52nLtbLDWwUYZlSZw__thumb/img/0J0jjINFUJ09Zk6XK4G_mW8SGpA=/fit-in/200x150/filters:strip_icc()/pic4373949.jpg"},
             #uuid "6f243f7a-f0d3-3ed7-8572-4782675ddb75"
             {:game/id #uuid "6f243f7a-f0d3-3ed7-8572-4782675ddb75",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}),
              :name "Octorage",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1024,
                                                 :name "Horror"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "279016",
              :languages (list "de" "en" "fr"),
              :game/name "Octorage",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/2TESBkMZ8CC9IAjMMwTqtA__thumb/img/9wpesj7ruvzdenelqzrkmRAFS-A=/fit-in/200x150/filters:strip_icc()/pic4715194.png"},
             #uuid "b75229d9-66a3-3ee4-86f4-e1e5f353d9a4"
             {:game/id #uuid "b75229d9-66a3-3ee4-86f4-e1e5f353d9a4",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2689,
                                                 :name "Action Queue"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Boží Zboží",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1035,
                                                 :name "Medieval"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "183840",
              :game/name "Oh My Goods!",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/nYIjEKh_0nYX48uD_tLawA__thumb/img/MCnURatf0lFmNOVLYEjABfN_uVY=/fit-in/200x150/filters:strip_icc()/pic3032677.jpg"},
             #uuid "e7c82f28-5b8e-3311-8519-a3cfa713dec3"
             {:game/id #uuid "e7c82f28-5b8e-3311-8519-a3cfa713dec3",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Oink",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "5693",
              :game/name "Oink!",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/rhYdI6Oimeyfxs3JIGrpYw__thumb/img/0m8qHIbPqKIgAlJuByP3D7vEBq8=/fit-in/200x150/filters:strip_icc()/pic870993.jpg"},
             #uuid "a2cce669-b64c-31e7-9afb-63f03c696fee"
             {:game/id #uuid "a2cce669-b64c-31e7-9afb-63f03c696fee",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2048,
                                                 :name
                                                 "Pattern Building"}),
              :name "Okiya",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}),
              :com.boardgamegeek.boardgame/max-play-time 10,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "125311",
              :game/name "Okiya",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/a86BdUaCSfIqygVvStXsGQ__thumb/img/jAV9bZYZln9N21DaKOXWRp0e8vA=/fit-in/200x150/filters:strip_icc()/pic3711392.png"},
             #uuid "f46ff3af-0204-348e-9bd0-c1f668f82128"
             {:game/id #uuid "f46ff3af-0204-348e-9bd0-c1f668f82128",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}),
              :name "Om nom nom",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "147305",
              :languages (list "en"),
              :game/name "Om Nom Nom",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/DckIF9e9le75ev9CRNS0_w__thumb/img/0qeLCHolAAG6LGvq9-V0MHrCtTs=/fit-in/200x150/filters:strip_icc()/pic1765949.png"},
             #uuid "20263815-62ac-3093-af3d-0f4a0f0538bb"
             {:game/id #uuid "20263815-62ac-3093-af3d-0f4a0f0538bb",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2891,
                                                 :name "Hidden Roles"}
                    #:com.boardgamegeek.mechanic{:id 2028,
                                                 :name "Role Playing"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}
                    #:com.boardgamegeek.mechanic{:id 2017,
                                                 :name "Voting"}),
              :name "One Night Revolution",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1026,
                                                 :name "Negotiation"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}
                    #:com.boardgamegeek.category{:id 1081,
                                                 :name
                                                 "Spies/Secret Agents"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 10,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "176361",
              :languages (list "en"),
              :game/name "One Night Revolution",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/0SFLHa5hNmtdL0LpqCN2kA__thumb/img/DBscKuzoek17BGUcjPLVgQeoNTc=/fit-in/200x150/filters:strip_icc()/pic2513302.jpg"},
             #uuid "bddc24af-3739-3b8e-bfcb-17b4a25b7153"
             {:game/id #uuid "bddc24af-3739-3b8e-bfcb-17b4a25b7153",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2891,
                                                 :name "Hidden Roles"}
                    #:com.boardgamegeek.mechanic{:id 2028,
                                                 :name "Role Playing"}
                    #:com.boardgamegeek.mechanic{:id 2892,
                                                 :name
                                                 "Roles with Asymmetric Information"}
                    #:com.boardgamegeek.mechanic{:id 2814,
                                                 :name "Traitor Game"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}
                    #:com.boardgamegeek.mechanic{:id 2017,
                                                 :name "Voting"}),
              :name "One night ultimate werewolf",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1024,
                                                 :name "Horror"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 10,
              :com.boardgamegeek.boardgame/max-players 10,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "147949",
              :languages (list "en"),
              :game/name "One Night Ultimate Werewolf",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/KLDb0vR3w8mfaHgIGF0gHw__thumb/img/ZgQsHsvdxXZr4DbMGUBSTArBp3o=/fit-in/200x150/filters:strip_icc()/pic1809823.jpg"},
             #uuid "189f9b13-158d-379b-9440-05b9bc24a356"
             {:game/id #uuid "189f9b13-158d-379b-9440-05b9bc24a356",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2011,
                                                 :name "Modular Board"}
                    #:com.boardgamegeek.mechanic{:id 2028,
                                                 :name "Role Playing"}
                    #:com.boardgamegeek.mechanic{:id 2814,
                                                 :name "Traitor Game"}
                    #:com.boardgamegeek.mechanic{:id 2017,
                                                 :name "Voting"}),
              :name "One week ultimate werewolf",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1024,
                                                 :name "Horror"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 7,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "252197",
              :languages (list "en"),
              :game/name "One Week Ultimate Werewolf",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Aw0CZqg-LgYK5YjVE6HReg__thumb/img/JmdwqeYZC4n1RHpTRwSLJ9kx46c=/fit-in/200x150/filters:strip_icc()/pic4119482.jpg"},
             #uuid "0dd28a2a-30d5-3d29-97ba-3e8bfa086f0f"
             {:languages (list "cz"),
              :name "Opraski Scenski Historie",
              :game/id #uuid "0dd28a2a-30d5-3d29-97ba-3e8bfa086f0f",
              :game/name "Opraski Scenski Historie"},
             #uuid "da846ac4-d725-3d51-8667-b8ab69c960fb"
             {:languages (list "cz"),
              :name "Original nebo Kopie?",
              :game/id #uuid "da846ac4-d725-3d51-8667-b8ab69c960fb",
              :game/name "Original nebo Kopie?"},
             #uuid "a4eb9598-b375-3f22-8363-e0295ac2f5f2"
             {:game/id #uuid "a4eb9598-b375-3f22-8363-e0295ac2f5f2",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2876,
                                                 :name "Race"}
                    #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}
                    #:com.boardgamegeek.mechanic{:id 2861,
                                                 :name
                                                 "Static Capture"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}),
              :name "Clovece nezlob se",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1116,
                                                 :name
                                                 "Comic Book / Strip"}
                    #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}
                    #:com.boardgamegeek.category{:id 1064,
                                                 :name
                                                 "Movies / TV / Radio theme"}
                    #:com.boardgamegeek.category{:id 1093,
                                                 :name "Novel-based"}
                    #:com.boardgamegeek.category{:id 1031,
                                                 :name "Racing"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "2136",
              :languages (list "cz"),
              :game/name "Pachisi",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/45Nb6goQqvPHD9hOut0ntg__thumb/img/ZtUXrh9wko9BQ3QLCMw9mU9Fjpw=/fit-in/200x150/filters:strip_icc()/pic516869.jpg"},
             #uuid "4a734354-588a-3c87-bd6f-48f09c3e691f"
             {:languages (list "en"),
              :name "Pan Am the game",
              :game/id #uuid "4a734354-588a-3c87-bd6f-48f09c3e691f",
              :game/name "Pan Am the game"},
             #uuid "d5380d3b-56d5-3783-a863-1af12c39f5c7"
             {:game/id #uuid "d5380d3b-56d5-3783-a863-1af12c39f5c7",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2001,
                                                 :name "Action Points"}
                    #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2078,
                                                 :name
                                                 "Point to Point Movement"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2008,
                                                 :name "Trading"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Pandemic",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 2145,
                                                 :name "Medical"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "30549",
              :languages (list "cz"),
              :game/name "Pandemic",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/S3ybV1LAp-8SnHIXLLjVqA__thumb/img/oqViRj6nVxK3m36NluTxU1PZkrk=/fit-in/200x150/filters:strip_icc()/pic1534148.jpg"},
             #uuid "41e6fb49-794a-3928-bc31-b058fc3f832d"
             {:languages (list "en"),
              :name "Pandemic Cthulu",
              :game/id #uuid "41e6fb49-794a-3928-bc31-b058fc3f832d",
              :game/name "Pandemic Cthulu"},
             #uuid "c1fa67fc-99a3-39a4-962b-ba099f84d11c"
             {:game/id #uuid "c1fa67fc-99a3-39a4-962b-ba099f84d11c",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2060,
                                                 :name
                                                 "Pattern Recognition"}),
              :name "Panic Lab",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1028,
                                                 :name "Puzzle"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 10,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "121073",
              :languages (list "cz"),
              :game/name "Panic Lab",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/LzsXWOG6ZA6x6TqB5H6F1g__thumb/img/1Mop0yzpQddJj3MF7Q_cC3y-P6Y=/fit-in/200x150/filters:strip_icc()/pic3488252.jpg"},
             #uuid "c6dab445-bf7e-39be-b4cb-6f22ae7e715a"
             {:languages (list "cz"),
              :name "Panic Mansion / Shaky Manor",
              :game/id #uuid "c6dab445-bf7e-39be-b4cb-6f22ae7e715a",
              :game/name "Panic Mansion / Shaky Manor"},
             #uuid "44de8c27-9942-39ca-997c-57ff932fc882"
             {:game/id #uuid "44de8c27-9942-39ca-997c-57ff932fc882",
              :com.boardgamegeek.boardgame/min-players 4,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2073,
                                                 :name "Acting"}
                    #:com.boardgamegeek.mechanic{:id 2078,
                                                 :name
                                                 "Point to Point Movement"}
                    #:com.boardgamegeek.mechanic{:id 2028,
                                                 :name "Role Playing"}
                    #:com.boardgamegeek.mechanic{:id 2027,
                                                 :name "Storytelling"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}),
              :name "Party Alias",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1031,
                                                 :name "Racing"}
                    #:com.boardgamegeek.category{:id 1027,
                                                 :name "Trivia"}
                    #:com.boardgamegeek.category{:id 1025,
                                                 :name "Word Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 24,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "43530",
              :languages (list "cz" "en"),
              :game/name "Party Alias",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/15IJm-xtFo5DlVC0I_KEVQ__thumb/img/OW1wylQIh-ly_SJY4mnF8TODfEQ=/fit-in/200x150/filters:strip_icc()/pic517373.jpg"},
             #uuid "275ef384-7d59-3c1c-8625-ec7a6d5208b6"
             {:languages (list "en"),
              :name "Pass Ack Words",
              :game/id #uuid "275ef384-7d59-3c1c-8625-ec7a6d5208b6",
              :game/name "Pass Ack Words"},
             #uuid "1cdae507-3b8e-324b-9d32-0d5c541166f3"
             {:game/id #uuid "1cdae507-3b8e-324b-9d32-0d5c541166f3",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2948,
                                                 :name
                                                 "Resource to Move"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2082,
                                                 :name
                                                 "Worker Placement"}),
              :name "Passing through Petra",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1050,
                                                 :name "Ancient"}
                    #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "257966",
              :languages (list "en"),
              :game/name "Passing Through Petra",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/q1cUKr4tuljXipsdemYUAw__thumb/img/Z1R49jE15RcqNQoUqHcBCg1s2aU=/fit-in/200x150/filters:strip_icc()/pic4257243.png"},
             #uuid "33e20383-3807-3414-869c-7a3907d40b75"
             {:game/id #uuid "33e20383-3807-3414-869c-7a3907d40b75",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2001,
                                                 :name "Action Points"}
                    #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2914,
                                                 :name
                                                 "Increase Value of Unchosen Resources"}
                    #:com.boardgamegeek.mechanic{:id 2900,
                                                 :name "Market"}
                    #:com.boardgamegeek.mechanic{:id 2070,
                                                 :name "Simulation"}),
              :name "Pax Renaissance",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1094,
                                                 :name "Educational"}
                    #:com.boardgamegeek.category{:id 2725,
                                                 :name "Pike and Shot"}
                    #:com.boardgamegeek.category{:id 1115,
                                                 :name "Religious"}
                    #:com.boardgamegeek.category{:id 1070,
                                                 :name "Renaissance"}),
              :com.boardgamegeek.boardgame/max-play-time 120,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "198953",
              :languages (list "en"),
              :game/name "Pax Renaissance",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/gIHITIenJOCIsO_vQNEE0w__thumb/img/68iODGupr7JuYEYiDofNJzxgEzM=/fit-in/200x150/filters:strip_icc()/pic3009233.jpg"},
             #uuid "e9de6ee3-1f19-36e8-bdf0-3b24bacd02cc"
             {:game/id #uuid "e9de6ee3-1f19-36e8-bdf0-3b24bacd02cc",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2987,
                                                 :name
                                                 "Hidden Victory Points"}
                    #:com.boardgamegeek.mechanic{:id 2900,
                                                 :name "Market"}
                    #:com.boardgamegeek.mechanic{:id 2060,
                                                 :name
                                                 "Pattern Recognition"}
                    #:com.boardgamegeek.mechanic{:id 2884,
                                                 :name
                                                 "Sudden Death Ending"}
                    #:com.boardgamegeek.mechanic{:id 2082,
                                                 :name
                                                 "Worker Placement"}),
              :name "Pax: Transhumanity",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}),
              :com.boardgamegeek.boardgame/max-play-time 150,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "257732",
              :languages (list "en"),
              :game/name "Pax Transhumanity",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/XAoUk8N75v876foIA84JcQ__thumb/img/YEDpAIVtEwxz2cLPiysN9i9G6uo=/fit-in/200x150/filters:strip_icc()/pic4250726.jpg"},
             #uuid "f750d160-d009-3c96-a630-eff035abfd6c"
             {:game/id #uuid "f750d160-d009-3c96-a630-eff035abfd6c",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2012,
                                                 :name
                                                 "Auction/Bidding"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Peanut club",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "254846",
              :languages (list "en" "fr"),
              :game/name "Peanut Club",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/78_kYPImvhOVARKfNtEnSA__thumb/img/snNlushutBIx-VCwYt-zzQlHos8=/fit-in/200x150/filters:strip_icc()/pic4360500.jpg"},
             #uuid "a4c50ca7-7a49-3873-a656-5ba52bc56488"
             {:game/id #uuid "a4c50ca7-7a49-3873-a656-5ba52bc56488",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}),
              :name "Pechvogel",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "257074",
              :languages (list "de" "en"),
              :game/name "Pechvogel",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/HhomgrTG2FJKqCy4AfRUhQ__thumb/img/N13b1u3XxFvTKu32m4bWtZQ87qQ=/fit-in/200x150/filters:strip_icc()/pic4242837.jpg"},
             #uuid "5aeb1f62-f6cd-396d-881c-07d58b82f143"
             {:languages (list "cz"),
              :name "Penguins",
              :game/id #uuid "5aeb1f62-f6cd-396d-881c-07d58b82f143",
              :game/name "Penguins"},
             #uuid "eb9bd23b-c056-3a5d-a53d-78b2dcbd15ae"
             {:game/id #uuid "eb9bd23b-c056-3a5d-a53d-78b2dcbd15ae",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2055,
                                                 :name
                                                 "Paper-and-Pencil"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Penk",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "255697",
              :languages (list "en"),
              :game/name "Penk!",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/iIbjyUdVK00hELkxyeQDfg__thumb/img/P1ZoTqVtKDO3UIZKkPKyejTIyxs=/fit-in/200x150/filters:strip_icc()/pic4206098.png"},
             #uuid "c6dfc763-4e0a-33ee-b4b9-efe1ce4f82b3"
             {:game/id #uuid "c6dfc763-4e0a-33ee-b4b9-efe1ce4f82b3",
              :com.boardgamegeek.boardgame/min-players 5,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}
                    #:com.boardgamegeek.mechanic{:id 2017,
                                                 :name "Voting"}),
              :name "Personally Incorrect",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 1118,
                                                 :name
                                                 "Mature / Adult"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 10,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "140840",
              :languages (list "en"),
              :game/name "Personally Incorrect",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/FBctEY9fJtIrk4hqbwhg2A__thumb/img/roixdL_YFGr5s0ati2grORqEagk=/fit-in/200x150/filters:strip_icc()/pic3206168.png"},
             #uuid "edfa15bc-3235-3696-aaad-09e432fc6662"
             {:game/id #uuid "edfa15bc-3235-3696-aaad-09e432fc6662",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2689,
                                                 :name "Action Queue"}
                    #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name
                                                 "Grid Movement"}),
              :name "Pick & Pack",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "26235",
              :languages (list "en"),
              :game/name "Pick & Pack",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/a8KesoKoDuAZNaNt09sYyg__thumb/img/VLDrGFFey_y2PJiTmzlSMB38r6s=/fit-in/200x150/filters:strip_icc()/pic226509.jpg"},
             #uuid "b11ddc7e-1671-30bd-a2dc-89dd757508d4"
             {:game/id #uuid "b11ddc7e-1671-30bd-a2dc-89dd757508d4",
              :com.boardgamegeek.boardgame/min-players 4,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2039,
                                                 :name "Line Drawing"}
                    #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}),
              :name "Pictures",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 12,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "98026",
              :languages (list "en"),
              :game/name "Pictures",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/2ksVi_M5sLws57Y5dmZVOA__thumb/img/Ytcky0xrJF3bHzfIWmhZolI97RQ=/fit-in/200x150/filters:strip_icc()/pic991829.jpg"},
             #uuid "f81386ae-7767-3f93-a560-c78df55109bb"
             {:game/id #uuid "f81386ae-7767-3f93-a560-c78df55109bb",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}
                    #:com.boardgamegeek.mechanic{:id 2870,
                                                 :name
                                                 "Re-rolling and Locking"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Piratske Kostky",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}
                    #:com.boardgamegeek.category{:id 1090,
                                                 :name "Pirates"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "117663",
              :languages (list "cz"),
              :game/name "Piraten kapern",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/ASvNr8Z7n4uuXiIeKTCpjA__thumb/img/yFj9eUDNMh0UrCugHmxPouZoaM8=/fit-in/200x150/filters:strip_icc()/pic5755894.jpg"},
             #uuid "f6be0578-56d6-30b6-ad51-8713fc8f260a"
             {:game/id #uuid "f6be0578-56d6-30b6-ad51-8713fc8f260a",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Pocket Madness",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "201920",
              :languages (list "en"),
              :game/name "Pocket Madness",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/6v8uO3HPOV1xMT9HlrUn6A__thumb/img/9ntOmLX333OuntfZ1uXoyyi8Co8=/fit-in/200x150/filters:strip_icc()/pic3171191.png"},
             #uuid "d18a26f4-6f25-37b2-a861-2147cf47cf18"
             {:game/id #uuid "d18a26f4-6f25-37b2-a861-2147cf47cf18",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2893,
                                                 :name
                                                 "Communication Limits"}
                    #:com.boardgamegeek.mechanic{:id 2831,
                                                 :name "Real-Time"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}),
              :name "Poetry for Neanderthals",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1036,
                                                 :name "Prehistoric"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}
                    #:com.boardgamegeek.category{:id 1025,
                                                 :name "Word Game"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 12,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "312786",
              :languages (list "en"),
              :game/name "Poetry for Neanderthals",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/CDlBjXSPT-3Zyrj8ENBkvQ__thumb/img/0ON18UcLepuwPLhwkRtRUjhvAZ8=/fit-in/200x150/filters:strip_icc()/pic5702797.jpg"},
             #uuid "54b141a9-4bee-378e-b867-fd1d4729f014"
             {:game/id #uuid "54b141a9-4bee-378e-b867-fd1d4729f014",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Zbodni Salát",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "274960",
              :languages (list "cz"),
              :game/name "Point Salad",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Xy0W9NtEpX0EVjwgxO3IEA__thumb/img/1gKeE2_50dXcL03gH3cEU-Ixj6c=/fit-in/200x150/filters:strip_icc()/pic4621571.png"},
             #uuid "e1405ecf-c37a-3cdf-9bc0-46ca9df2e685"
             {:game/id #uuid "e1405ecf-c37a-3cdf-9bc0-46ca9df2e685",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2008,
                                                 :name "Trading"}),
              :name "Ponzi Scheme",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "180899",
              :languages (list "en"),
              :game/name "Ponzi Scheme",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/XrXpHvoeiA_cC1Caye1B7Q__thumb/img/z5CKVkv0-T3vFAikANagen7sjwE=/fit-in/200x150/filters:strip_icc()/pic5100985.jpg"},
             #uuid "db6d2f3a-d731-3ddd-9e97-4b857d9ac065"
             {:game/id #uuid "db6d2f3a-d731-3ddd-9e97-4b857d9ac065",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2009,
                                                 :name
                                                 "Trick-taking"}),
              :name "Port Royal",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "565",
              :languages (list "cz" "en"),
              :game/name "Port Royal",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/YieNLWVLKMERmrEosQsKOA__thumb/img/Vd8kb9AT204KNdE5GXBBK7JQL7g=/fit-in/200x150/filters:strip_icc()/pic248213.jpg"},
             #uuid "cba95a42-c53b-3c6f-bf3d-df9bf10a4069"
             {:languages (list "en"),
              :name "Profanity",
              :game/id #uuid "cba95a42-c53b-3c6f-bf3d-df9bf10a4069",
              :game/name "Profanity"},
             #uuid "f7625727-1129-3703-96c0-442c8ac00dae"
             {:game/id #uuid "f7625727-1129-3703-96c0-442c8ac00dae",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2838,
                                                 :name
                                                 "Action Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2875,
                                                 :name
                                                 "End Game Bonuses"}
                    #:com.boardgamegeek.mechanic{:id 2843,
                                                 :name "Follow"}
                    #:com.boardgamegeek.mechanic{:id 2987,
                                                 :name
                                                 "Hidden Victory Points"}
                    #:com.boardgamegeek.mechanic{:id 2914,
                                                 :name
                                                 "Increase Value of Unchosen Resources"}
                    #:com.boardgamegeek.mechanic{:id 2828,
                                                 :name
                                                 "Turn Order: Progressive"}
                    #:com.boardgamegeek.mechanic{:id 2079,
                                                 :name
                                                 "Variable Phase Order"}),
              :name "Puerto Rico",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1029,
                                                 :name "City Building"}
                    #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1013,
                                                 :name "Farming"}),
              :com.boardgamegeek.boardgame/max-play-time 150,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 90,
              :com.boardgamegeek.boardgame/id "3076",
              :languages (list "cz"),
              :game/name "Puerto Rico",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/QFiIRd2kimaMqTyWsX0aUg__thumb/img/5fLo89ChZH6Wzukk36bhZ-EpBS0=/fit-in/200x150/filters:strip_icc()/pic158548.jpg"},
             #uuid "4fce228a-9d44-32fe-ac24-659f263ee51e"
             {:game/id #uuid "4fce228a-9d44-32fe-ac24-659f263ee51e",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2012,
                                                 :name
                                                 "Auction/Bidding"}),
              :name "QE",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "209136",
              :languages (list "en"),
              :game/name "Q.E.",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/taTddHmWN-n7BZbKWsmsKQ__thumb/img/V9sMeg-nlSiTMj4bFviRLBlY50E=/fit-in/200x150/filters:strip_icc()/pic4116760.jpg"},
             #uuid "e5279fe2-9e7a-313b-9b5d-e2d1f6a1e8db"
             {:game/id #uuid "e5279fe2-9e7a-313b-9b5d-e2d1f6a1e8db",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2940,
                                                 :name "Square Grid"}),
              :name "Quoridor",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1059,
                                                 :name "Maze"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "624",
              :game/name "Quoridor",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/I1YNAhee09mryaqfEo8MwA__thumb/img/9TJaxgoMUkiMhAGSYM8-0o1ICpg=/fit-in/200x150/filters:strip_icc()/pic3488232.jpg"},
             #uuid "b86c48fe-3ed8-3b4e-9369-6d3957a9d311"
             {:name "Quorridor",
              :game/id #uuid "b86c48fe-3ed8-3b4e-9369-6d3957a9d311",
              :game/name "Quorridor"},
             #uuid "b7c512a7-a3f4-35d4-a416-c10bffb57bb4"
             {:game/id #uuid "b7c512a7-a3f4-35d4-a416-c10bffb57bb4",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2048,
                                                 :name
                                                 "Pattern Building"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}),
              :name "Qwirkle",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "25669",
              :game/name "Qwirkle",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/k7zHj8j_a6uUAtXUt5Fvuw__thumb/img/APPui4zwBuwAIHXSTW6UxYcY6Ow=/fit-in/200x150/filters:strip_icc()/pic309353.jpg"},
             #uuid "67e88af3-f2d3-3953-9be7-c1b26fefe183"
             {:languages (list "en"),
              :name "Railroad Ink",
              :game/id #uuid "67e88af3-f2d3-3953-9be7-c1b26fefe183",
              :game/name "Railroad Ink"},
             #uuid "e56eb8fb-70f3-368a-b45d-dec1e25f35aa"
             {:languages (list "en"),
              :name "Railroad ink",
              :game/id #uuid "e56eb8fb-70f3-368a-b45d-dec1e25f35aa",
              :game/name "Railroad ink"},
             #uuid "5e611ca2-e99d-358f-adc6-f3f7bcfb3ad5"
             {:game/id #uuid "5e611ca2-e99d-358f-adc6-f3f7bcfb3ad5",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Pozvednete Cise",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 1045,
                                                 :name "Memory"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 12,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "202732",
              :languages (list "cz"),
              :game/name "Raise Your Goblets",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/M-QMEFRd2LkfyiXt6YFbwg__thumb/img/p4xMVTX4wWReahsdAE7hMgeP6uk=/fit-in/200x150/filters:strip_icc()/pic3132188.jpg"},
             #uuid "11a2b6fb-2a70-314c-b249-9d7b509352e5"
             {:game/id #uuid "11a2b6fb-2a70-314c-b249-9d7b509352e5",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2046,
                                                 :name "Area Movement"}
                    #:com.boardgamegeek.mechanic{:id 2012,
                                                 :name
                                                 "Auction/Bidding"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}),
              :name "Realm of Wonder",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1022,
                                                 :name "Adventure"}
                    #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}
                    #:com.boardgamegeek.category{:id 1020,
                                                 :name "Exploration"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "162580",
              :game/name "Realm of Wonder",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/e0pz2fI8Hr8DGKcDskSwbQ__thumb/img/v1T8ZkbbCbLw8o3KQXhNEaUxebY=/fit-in/200x150/filters:strip_icc()/pic2204281.jpg"},
             #uuid "c64e760d-cd41-31b1-9626-a196593146fa"
             {:game/id #uuid "c64e760d-cd41-31b1-9626-a196593146fa",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2897,
                                                 :name
                                                 "Variable Set-up"}),
              :name "Red 7",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1098,
                                                 :name "Number"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 5,
              :com.boardgamegeek.boardgame/id "161417",
              :languages (list "cz"),
              :game/name "Red7",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/7zH6Kt5ebWEixjDGmHweNA__thumb/img/PVkJyJhCtzo1ZwKO4iuRaqUyKJc=/fit-in/200x150/filters:strip_icc()/pic2247258.png"},
             #uuid "edc4787a-b55f-39c5-ab40-a99f7c1a0c80"
             {:game/id #uuid "edc4787a-b55f-39c5-ab40-a99f7c1a0c80",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}),
              :name "Hledá se Hrdina",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "135116",
              :languages (list "cz"),
              :game/name "Rent a Hero",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/pnhx0DJsrkz1VfDU7c3Wtg__thumb/img/y1ksV-fuU5rQWuv4wzZEz_KolZs=/fit-in/200x150/filters:strip_icc()/pic2932852.jpg"},
             #uuid "ad09b2d4-8b28-31c6-8e5a-2bf421f7f2f2"
             {:game/id #uuid "ad09b2d4-8b28-31c6-8e5a-2bf421f7f2f2",
              :com.boardgamegeek.boardgame/min-players 2,
              :name "Revolution",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1069,
                                                 :name
                                                 "Modern Warfare"}),
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/id "38118",
              :languages (list "de"),
              :game/name "Revolution",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/piMBdZjr9l82WAJuRwmLHg__thumb/img/bBfNJcCvAJWnQPfP4hgbJSyo9xM=/fit-in/200x150/filters:strip_icc()/pic1448389.jpg"},
             #uuid "ba776ee9-9ebc-3521-9d9d-ce1c6a702748"
             {:languages (list "en"),
              :name "Rick & Morty: Totall Rickall",
              :game/id #uuid "ba776ee9-9ebc-3521-9d9d-ce1c6a702748",
              :game/name "Rick & Morty: Totall Rickall"},
             #uuid "8acfd5b8-b774-39c4-a04c-29420e5631c0"
             {:game/id #uuid "8acfd5b8-b774-39c4-a04c-29420e5631c0",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2001,
                                                 :name "Action Points"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Rick and Morty: The Ricks must be Crazy",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1064,
                                                 :name
                                                 "Movies / TV / Radio theme"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "241731",
              :languages (list "en"),
              :game/name
              "Rick and Morty: The Ricks Must Be Crazy Multiverse Game",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/I1fNtBe8tCMt_6qcn6D-EA__thumb/img/WRQIfu_klm9X1XGOU3ssXnHA_fM=/fit-in/200x150/filters:strip_icc()/pic3880225.png"},
             #uuid "e6d5c2ee-6c34-370d-b344-30cc5ee8a749"
             {:game/id #uuid "e6d5c2ee-6c34-370d-b344-30cc5ee8a749",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2046,
                                                 :name "Area Movement"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}),
              :name "Risk: Game of Thrones",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1064,
                                                 :name
                                                 "Movies / TV / Radio theme"}
                    #:com.boardgamegeek.category{:id 1086,
                                                 :name
                                                 "Territory Building"}
                    #:com.boardgamegeek.category{:id 1019,
                                                 :name "Wargame"}),
              :com.boardgamegeek.boardgame/max-play-time 240,
              :com.boardgamegeek.boardgame/max-players 7,
              :com.boardgamegeek.boardgame/min-play-time 120,
              :com.boardgamegeek.boardgame/id "179719",
              :languages (list "en"),
              :game/name "Risk: Game of Thrones",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/UNici3J_3qZIYeEapfaLpg__thumb/img/omzrXKLCEvYqZR8Kf0zeSZbRw3g=/fit-in/200x150/filters:strip_icc()/pic2568573.jpg"},
             #uuid "3da3ce69-4e95-3c15-beec-5d9ec2078260"
             {:game/id #uuid "3da3ce69-4e95-3c15-beec-5d9ec2078260",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}),
              :name "Robinson Crusoe",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1093,
                                                 :name "Novel-based"}),
              :com.boardgamegeek.boardgame/max-play-time 10,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "51319",
              :languages (list "cz"),
              :game/name "Robinson Crusoe",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/5i7RNi6o-1THM0zPKE3obg__thumb/img/vL7T-0G-KxMNZQg-uWTNEOOnPkE=/fit-in/200x150/filters:strip_icc()/pic528291.jpg"},
             #uuid "c3fea04b-2042-3a0f-ab59-e7cedee3e1bf"
             {:languages (list "en"),
              :name "Rock, Paper, Wizard",
              :game/id #uuid "c3fea04b-2042-3a0f-ab59-e7cedee3e1bf",
              :game/name "Rock, Paper, Wizard"},
             #uuid "7d9f1d6a-539f-3506-a533-6d5ff7e5df57"
             {:game/id #uuid "7d9f1d6a-539f-3506-a533-6d5ff7e5df57",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}),
              :name "Rolit",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "8243",
              :languages (list "en"),
              :game/name "Rolit",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/wymI6qRpGHF-hD1Y34QbkA__thumb/img/6dj4-736Cf1IgqnR_PgTkvQTe5s=/fit-in/200x150/filters:strip_icc()/pic336560.jpg"},
             #uuid "200327ec-e2f1-3904-9057-9c80de5c3e0f"
             {:languages (list "en"),
              :name "Rome & Carthrage",
              :game/id #uuid "200327ec-e2f1-3904-9057-9c80de5c3e0f",
              :game/name "Rome & Carthrage"},
             #uuid "f77b4d34-54f4-37eb-8a5b-6d8df9e0f66d"
             {:game/id #uuid "f77b4d34-54f4-37eb-8a5b-6d8df9e0f66d",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2689,
                                                 :name "Action Queue"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}),
              :name "Royals",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "154495",
              :game/name "Royals",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/6HtTciyZmT8d_RnDlIOlAg__thumb/img/0dDXrkV7wcVHdzbHuZtf-SC21NM=/fit-in/200x150/filters:strip_icc()/pic1917555.png"},
             #uuid "431d180f-b4d4-35f3-8c95-96ad5a7267d6"
             {:game/id #uuid "431d180f-b4d4-35f3-8c95-96ad5a7267d6",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2940,
                                                 :name "Square Grid"}),
              :name "Sabotage",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "1142",
              :languages (list "en"),
              :game/name "Sabotage",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/t0qDsOOT4Yb8XPBLI3c4TA__thumb/img/l-xrZRw-_tORXb9LfkeWLY4a_Z4=/fit-in/200x150/filters:strip_icc()/pic301507.jpg"},
             #uuid "af817d47-9021-3806-800d-7ef8dab08024"
             {:game/id #uuid "af817d47-9021-3806-800d-7ef8dab08024",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2891,
                                                 :name "Hidden Roles"}
                    #:com.boardgamegeek.mechanic{:id 2959,
                                                 :name "Map Addition"}
                    #:com.boardgamegeek.mechanic{:id 2081,
                                                 :name
                                                 "Network and Route Building"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}
                    #:com.boardgamegeek.mechanic{:id 2814,
                                                 :name
                                                 "Traitor Game"}),
              :name "Saboteur",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1020,
                                                 :name "Exploration"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 10,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "9220",
              :game/name "Saboteur",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/0vJwP6NGa7GHPZKC3gplUw__thumb/img/B3j-is62fP09eHP34uFG_gsxNQs=/fit-in/200x150/filters:strip_icc()/pic3989824.jpg"},
             #uuid "bb7745e6-fe51-351f-843c-5012bd13d334"
             {:game/id #uuid "bb7745e6-fe51-351f-843c-5012bd13d334",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2081,
                                                 :name
                                                 "Network and Route Building"}),
              :name "Saboteur: The Duel",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1020,
                                                 :name "Exploration"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "168215",
              :languages (list "cz"),
              :game/name "Saboteur: The Duel",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/2HQMz_qehqPHAsn12h-o4w__thumb/img/BZJsX4-a803QfAn9_uvfx2mj4vE=/fit-in/200x150/filters:strip_icc()/pic3989510.png"},
             #uuid "1fff84e0-9d09-3677-a846-84f01c21b161"
             {:game/id #uuid "1fff84e0-9d09-3677-a846-84f01c21b161",
              :com.boardgamegeek.boardgame/min-players 4,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}
                    #:com.boardgamegeek.mechanic{:id 2814,
                                                 :name "Traitor Game"}
                    #:com.boardgamegeek.mechanic{:id 2017,
                                                 :name "Voting"}),
              :name "Salem 1692",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1120,
                                                 :name
                                                 "Print & Play"}),
              :com.boardgamegeek.boardgame/max-play-time 35,
              :com.boardgamegeek.boardgame/max-players 12,
              :com.boardgamegeek.boardgame/min-play-time 25,
              :com.boardgamegeek.boardgame/id "175549",
              :languages (list "en"),
              :game/name "Salem 1692",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/xUurReSy2Amlx4hGj1fPvQ__thumb/img/IiiUFNDZKGNNDls_AhD0-DE7Ba0=/fit-in/200x150/filters:strip_icc()/pic4204062.jpg"},
             #uuid "113e202b-52db-3631-b4c4-7027d1edccf5"
             {:game/id #uuid "113e202b-52db-3631-b4c4-7027d1edccf5",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2013,
                                                 :name
                                                 "Commodity Speculation"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2011,
                                                 :name "Modular Board"}
                    #:com.boardgamegeek.mechanic{:id 2007,
                                                 :name
                                                 "Pick-up and Deliver"}
                    #:com.boardgamegeek.mechanic{:id 2948,
                                                 :name
                                                 "Resource to Move"}
                    #:com.boardgamegeek.mechanic{:id 2939,
                                                 :name
                                                 "Track Movement"}
                    #:com.boardgamegeek.mechanic{:id 2082,
                                                 :name
                                                 "Worker Placement"}),
              :name "Santiago de Cuba",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}),
              :com.boardgamegeek.boardgame/max-play-time 75,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 40,
              :com.boardgamegeek.boardgame/id "104347",
              :languages (list "en"),
              :game/name "Santiago de Cuba",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/v4Rk-agCbbmMNo3vUQ1IcA__thumb/img/470q2hMMP1V-75tKqU7OBh6WzjU=/fit-in/200x150/filters:strip_icc()/pic1918128.jpg"},
             #uuid "20b16954-6c66-3536-b816-f13d464da44c"
             {:game/id #uuid "20b16954-6c66-3536-b816-f13d464da44c",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2009,
                                                 :name
                                                 "Trick-taking"}),
              :name "Sarkophag",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "181955",
              :languages (list "de"),
              :game/name "Sarkophag",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/wBTmZnUA9cR1Cme1LePceg__thumb/img/7cYYnDb4nLN8EtBpOR9oMvrORyk=/fit-in/200x150/filters:strip_icc()/pic2617439.jpg"},
             #uuid "655dd7fb-2048-304d-ac0f-6a354ff76bc2"
             {:game/id #uuid "655dd7fb-2048-304d-ac0f-6a354ff76bc2",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2055,
                                                 :name
                                                 "Paper-and-Pencil"}),
              :name "Scattergories",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}
                    #:com.boardgamegeek.category{:id 1025,
                                                 :name "Word Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "2381",
              :languages (list "en"),
              :game/name "Scattergories",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/eIL4hvMb7ZPgizc7BZOh-g__thumb/img/sx0XxYqv0FtsIp-RoW-5C42sLOc=/fit-in/200x150/filters:strip_icc()/pic4994410.jpg"},
             #uuid "a65fe9b8-99d0-317b-9c91-7b969001669d"
             {:game/id #uuid "a65fe9b8-99d0-317b-9c91-7b969001669d",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Skol ty Skoty!",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "372",
              :languages (list "cz"),
              :game/name "Schotten Totten",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/69mwXe7c6HNYmT6S35Y4zg__thumb/img/97DW-2XWDrSSkgy3XnUJ7f7tLiQ=/fit-in/200x150/filters:strip_icc()/pic2932872.jpg"},
             #uuid "e261ac28-9c39-30db-81d4-e7551f8b4fe6"
             {:game/id #uuid "e261ac28-9c39-30db-81d4-e7551f8b4fe6",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}),
              :name "Scopa",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1045,
                                                 :name "Memory"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "15889",
              :game/name "Scopa",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/CGdqzoYIqmcWmVVnNtbrGw__thumb/img/k6VnPZink59LA3xjUdtZSTmjXzs=/fit-in/200x150/filters:strip_icc()/pic1517475.jpg"},
             #uuid "645ab7f6-09eb-3401-988d-97cd930668c1"
             {:game/id #uuid "645ab7f6-09eb-3401-988d-97cd930668c1",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2967,
                                                 :name
                                                 "Hidden Movement"}
                    #:com.boardgamegeek.mechanic{:id 2078,
                                                 :name
                                                 "Point to Point Movement"}
                    #:com.boardgamegeek.mechanic{:id 2016,
                                                 :name
                                                 "Secret Unit Deployment"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}),
              :name "Scotland Yard",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1097,
                                                 :name "Travel"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "438",
              :languages (list "en"),
              :game/name "Scotland Yard",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/NbHZjHmQcA5_TenhVJtJ3w__thumb/img/BfD9cR1-u_qNUNNZ2i4Bg8XKYhg=/fit-in/200x150/filters:strip_icc()/pic4527702.jpg"},
             #uuid "77933845-adf8-3758-a686-a08ea46f015e"
             {:game/id #uuid "77933845-adf8-3758-a686-a08ea46f015e",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2875,
                                                 :name
                                                 "End Game Bonuses"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2940,
                                                 :name "Square Grid"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}),
              :name "Scrabble",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1025,
                                                 :name "Word Game"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 90,
              :com.boardgamegeek.boardgame/id "320",
              :languages (list "en"),
              :game/name "Scrabble",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/mVmmntn2oQd0PfFrWBvwIQ__thumb/img/RUmuGCB40FQH0en0R2nrcsSO7DE=/fit-in/200x150/filters:strip_icc()/pic404651.jpg"},
             #uuid "6b1a6c6e-487e-334f-97cf-8b0efad2f3f9"
             {:name "Scracker",
              :game/id #uuid "6b1a6c6e-487e-334f-97cf-8b0efad2f3f9",
              :game/name "Scracker"},
             #uuid "ba290158-1610-3e16-94fa-7dedd0ef5e08"
             {:game/id #uuid "ba290158-1610-3e16-94fa-7dedd0ef5e08",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2857,
                                                 :name
                                                 "Card Play Conflict Resolution"}
                    #:com.boardgamegeek.mechanic{:id 2864,
                                                 :name
                                                 "Force Commitment"}
                    #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2026,
                                                 :name "Hexagon Grid"}
                    #:com.boardgamegeek.mechanic{:id 2886,
                                                 :name
                                                 "King of the Hill"}
                    #:com.boardgamegeek.mechanic{:id 2947,
                                                 :name
                                                 "Movement Points"}
                    #:com.boardgamegeek.mechanic{:id 2851,
                                                 :name
                                                 "Narrative Choice / Paragraph"}
                    #:com.boardgamegeek.mechanic{:id 2819,
                                                 :name
                                                 "Solo / Solitaire Game"}
                    #:com.boardgamegeek.mechanic{:id 2849,
                                                 :name
                                                 "Tech Trees / Tech Tracks"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Scythe",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}
                    #:com.boardgamegeek.category{:id 1047,
                                                 :name "Miniatures"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}
                    #:com.boardgamegeek.category{:id 1086,
                                                 :name
                                                 "Territory Building"}),
              :com.boardgamegeek.boardgame/max-play-time 115,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 90,
              :com.boardgamegeek.boardgame/id "169786",
              :game/name "Scythe",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/7k_nOxpO9OGIjhLq2BUZdA__thumb/img/eQ69OEDdjYjfKg6q5Navee87skU=/fit-in/200x150/filters:strip_icc()/pic3163924.jpg"},
             #uuid "5b444b22-2047-3124-af08-48687f72a6b5"
             {:game/id #uuid "5b444b22-2047-3124-af08-48687f72a6b5",
              :com.boardgamegeek.boardgame/min-players 5,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2891,
                                                 :name "Hidden Roles"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}
                    #:com.boardgamegeek.mechanic{:id 2814,
                                                 :name "Traitor Game"}
                    #:com.boardgamegeek.mechanic{:id 2017,
                                                 :name "Voting"}),
              :name "Secret Hitler",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1001,
                                                 :name "Political"}
                    #:com.boardgamegeek.category{:id 1120,
                                                 :name
                                                 "Print & Play"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 10,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "188834",
              :game/name "Secret Hitler",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/rAQ3hIXoH6xDcj41v9iqCg__thumb/img/xA2T7PiwN3Z8pwAksicoCOA1tf0=/fit-in/200x150/filters:strip_icc()/pic5164305.jpg"},
             #uuid "7cd74735-c2f6-352d-8428-474bc1b6b386"
             {:name "Settlers of Catan",
              :game/id #uuid "7cd74735-c2f6-352d-8428-474bc1b6b386",
              :game/name "Settlers of Catan"},
             #uuid "7b9a4759-a742-301f-b458-f4ef2d8368da"
             {:name "Settlers of Catan Jr.",
              :game/id #uuid "7b9a4759-a742-301f-b458-f4ef2d8368da",
              :game/name "Settlers of Catan Jr."},
             #uuid "7bd8e302-1270-3448-8815-58d1f6da0834"
             {:game/id #uuid "7bd8e302-1270-3448-8815-58d1f6da0834",
              :com.boardgamegeek.boardgame/min-players 2,
              :name "Sheep dog",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "255609",
              :languages (list "en"),
              :game/name "Sheep Dog",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/klhlFwH-ZF6OUUBxXcQ5xQ__thumb/img/9INQR0kOX6NGHmDnVO1XTEEdm_o=/fit-in/200x150/filters:strip_icc()/pic4334235.jpg"},
             #uuid "01f7b705-9b33-3897-969b-343e8a6e682e"
             {:game/id #uuid "01f7b705-9b33-3897-969b-343e8a6e682e",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2014,
                                                 :name
                                                 "Betting and Bluffing"}
                    #:com.boardgamegeek.mechanic{:id 2913,
                                                 :name "Bribery"}
                    #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2915,
                                                 :name "Negotiation"}
                    #:com.boardgamegeek.mechanic{:id 2028,
                                                 :name "Role Playing"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Sheriff of Nottingham",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 1035,
                                                 :name "Medieval"}
                    #:com.boardgamegeek.category{:id 1026,
                                                 :name "Negotiation"}
                    #:com.boardgamegeek.category{:id 1093,
                                                 :name "Novel-based"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "157969",
              :languages (list "en"),
              :game/name "Sheriff of Nottingham",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/BBgLFKUzr6tcKtlIM2JSFw__thumb/img/JD5L_XrtkaKINUj8ILZqFMGcTsE=/fit-in/200x150/filters:strip_icc()/pic2075830.jpg"},
             #uuid "d20adb03-0a94-319b-9d04-188d5cad9da6"
             {:languages (list "en"),
              :name "Sherlock holmes consulting detective",
              :game/id #uuid "d20adb03-0a94-319b-9d04-188d5cad9da6",
              :game/name "Sherlock holmes consulting detective"},
             #uuid "5610f650-22c6-3571-bffa-cfd6a9d68b2a"
             {:game/id #uuid "5610f650-22c6-3571-bffa-cfd6a9d68b2a",
              :com.boardgamegeek.boardgame/min-players 4,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2073,
                                                 :name "Acting"}
                    #:com.boardgamegeek.mechanic{:id 2866,
                                                 :name
                                                 "Targeted Clues"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}),
              :name "Shifty Eyed Spies",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1081,
                                                 :name
                                                 "Spies/Secret Agents"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "232830",
              :languages (list "en"),
              :game/name "Shifty Eyed Spies",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/J8GvDIigfMdxT9MoMHR01Q__thumb/img/EWVfiXLL6HFexzDlxXNU_Q386sI=/fit-in/200x150/filters:strip_icc()/pic4372703.jpg"},
             #uuid "6e6f4eb8-c896-3609-ae50-49ede7fbf6ad"
             {:game/id #uuid "6e6f4eb8-c896-3609-ae50-49ede7fbf6ad",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2048,
                                                 :name
                                                 "Pattern Building"}),
              :name "Sh*t Happens",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "196379",
              :languages (list "en"),
              :game/name "Shit Happens",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/d1RGD6HdWfX6loyZU23DDw__thumb/img/1inAKM--jeX28TP2lvvP27HxeKs=/fit-in/200x150/filters:strip_icc()/pic3303204.jpg"},
             #uuid "3992d652-f81d-3e86-bd6e-2e685cb351a3"
             {:game/id #uuid "3992d652-f81d-3e86-bd6e-2e685cb351a3",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2664,
                                                 :name
                                                 "Deck, Bag, and Pool Building"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Shuffle Heroes",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}
                    #:com.boardgamegeek.category{:id 1024,
                                                 :name "Horror"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "177542",
              :languages (list "en"),
              :game/name "Shuffle Heroes",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/6hK_G51Chsas-ciJjHFLIQ__thumb/img/fUkHaTverNSEjaL3rVwjFXiLRMQ=/fit-in/200x150/filters:strip_icc()/pic2527161.png"},
             #uuid "a2a3a034-7f0f-301a-8473-dd54dca2462e"
             {:game/id #uuid "a2a3a034-7f0f-301a-8473-dd54dca2462e",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}
                    #:com.boardgamegeek.mechanic{:id 2082,
                                                 :name
                                                 "Worker Placement"}),
              :name "Silk",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1013,
                                                 :name "Farming"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "255037",
              :languages (list "en"),
              :game/name "Silk",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/09W9RVgQH3iczXgNpc4t4A__thumb/img/7Gnu1fAzXwPA83uqNtMtd5fobvo=/fit-in/200x150/filters:strip_icc()/pic4232947.jpg"},
             #uuid "c59a448e-a61e-3dad-871d-f3bc7ebe6774"
             {:game/id #uuid "c59a448e-a61e-3dad-871d-f3bc7ebe6774",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Skull",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}
                    #:com.boardgamegeek.category{:id 1038,
                                                 :name "Sports"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "67466",
              :languages (list "en"),
              :game/name "Skull",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/4FvrOFxgPqlGmO56WS08dg__thumb/img/-DGFjUF0NHZo-6U4lcmE46utf-E=/fit-in/200x150/filters:strip_icc()/pic744864.jpg"},
             #uuid "b172271f-a27d-3300-9b46-7f9825f0727e"
             {:game/id #uuid "b172271f-a27d-3300-9b46-7f9825f0727e",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Sly Dice",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "180599",
              :languages (list "en"),
              :game/name "Sly Dice",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/IZb7Sf1s_auwNn3ayfVB2Q__thumb/img/LxewU81q9qZcteJPHyhuegZxgmo=/fit-in/200x150/filters:strip_icc()/pic2653414.png"},
             #uuid "d5fd1c48-4bc6-3542-8805-4964fab16e05"
             {:game/id #uuid "d5fd1c48-4bc6-3542-8805-4964fab16e05",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2046,
                                                 :name "Area Movement"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2914,
                                                 :name
                                                 "Increase Value of Unchosen Resources"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}
                    #:com.boardgamegeek.mechanic{:id 2897,
                                                 :name
                                                 "Variable Set-up"}
                    #:com.boardgamegeek.mechanic{:id 2874,
                                                 :name
                                                 "Victory Points as a Resource"}),
              :name "Small world",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}
                    #:com.boardgamegeek.category{:id 1086,
                                                 :name
                                                 "Territory Building"}),
              :com.boardgamegeek.boardgame/max-play-time 80,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 40,
              :com.boardgamegeek.boardgame/id "40692",
              :languages (list "en"),
              :game/name "Small World",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/aoPM07XzoceB-RydLh08zA__thumb/img/o3Bw9heVDJRgPYlI_PksCvLAgnM=/fit-in/200x150/filters:strip_icc()/pic428828.jpg"},
             #uuid "568da493-2833-3009-ad26-7108e0683081"
             {:game/id #uuid "568da493-2833-3009-ad26-7108e0683081",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}),
              :name "Desítka",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1027,
                                                 :name "Trivia"}),
              :com.boardgamegeek.boardgame/max-play-time 120,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "241590",
              :languages (list "cz"),
              :game/name "Smart10",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/pwa0lKfmlE4PvFo-YVxrLQ__thumb/img/4RXK5M7g8_GRW_2HjyLdTjS3_fw=/fit-in/200x150/filters:strip_icc()/pic4945756.jpg"},
             #uuid "2e994ee0-a8fc-32ef-a229-a0d74edf07cf"
             {:game/id #uuid "2e994ee0-a8fc-32ef-a229-a0d74edf07cf",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2857,
                                                 :name
                                                 "Card Play Conflict Resolution"}
                    #:com.boardgamegeek.mechanic{:id 3004,
                                                 :name
                                                 "Deck Construction"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}
                    #:com.boardgamegeek.mechanic{:id 2897,
                                                 :name
                                                 "Variable Set-up"}),
              :name "Smash-UP",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 1090,
                                                 :name "Pirates"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}
                    #:com.boardgamegeek.category{:id 2481,
                                                 :name "Zombies"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "122522",
              :languages (list "en"),
              :game/name "Smash Up",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/c1DOHkXD35OcqfPoxoSXlA__thumb/img/kdzBzdj4prsoztFNEFZ6eWv1RVI=/fit-in/200x150/filters:strip_icc()/pic1269874.jpg"},
             #uuid "cd9b3130-0865-3759-962d-9c3eab8d03f4"
             {:game/id #uuid "cd9b3130-0865-3759-962d-9c3eab8d03f4",
              :com.boardgamegeek.boardgame/min-players 2,
              :name "Snake Oil",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}),
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/id "19285",
              :languages (list "en"),
              :game/name "Snake Oil",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/BauWTfEUjkjxdpwtPHMLXQ__thumb/img/SfkJjYEvCG5AQ1tOeZZVFEVfSuA=/fit-in/200x150/filters:strip_icc()/pic88607.jpg"},
             #uuid "b7ae6819-447d-36c3-bb6a-0e7dbe5c17ce"
             {:languages (list "cz"),
              :name "Sneci Zavody",
              :game/id #uuid "b7ae6819-447d-36c3-bb6a-0e7dbe5c17ce",
              :game/name "Sneci Zavody"},
             #uuid "0f797b16-678f-32d3-af6d-84b6d8f6ad20"
             {:name "Soq",
              :game/id #uuid "0f797b16-678f-32d3-af6d-84b6d8f6ad20",
              :game/name "Soq"},
             #uuid "6b35d568-0483-3a28-a965-30b88e49b9f5"
             {:game/id #uuid "6b35d568-0483-3a28-a965-30b88e49b9f5",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2060,
                                                 :name
                                                 "Pattern Recognition"}),
              :name "Space Bowl",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}
                    #:com.boardgamegeek.category{:id 1113,
                                                 :name
                                                 "Space Exploration"}),
              :com.boardgamegeek.boardgame/max-play-time 35,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 25,
              :com.boardgamegeek.boardgame/id "287580",
              :languages (list "en"),
              :game/name "Space Bowl",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/f_VqSLk0LsED8c53A0V6_w__thumb/img/lUi45L_gzordC8q1PAWncdYZSqc=/fit-in/200x150/filters:strip_icc()/pic4919382.jpg"},
             #uuid "6fe19369-f217-3b8c-a477-7fca8a743df4"
             {:game/id #uuid "6fe19369-f217-3b8c-a477-7fca8a743df4",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2860,
                                                 :name "Flicking"}
                    #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2011,
                                                 :name "Modular Board"}
                    #:com.boardgamegeek.mechanic{:id 2048,
                                                 :name
                                                 "Pattern Building"}
                    #:com.boardgamegeek.mechanic{:id 2060,
                                                 :name
                                                 "Pattern Recognition"}
                    #:com.boardgamegeek.mechanic{:id 2953,
                                                 :name
                                                 "Programmed Movement"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}
                    #:com.boardgamegeek.mechanic{:id 2870,
                                                 :name
                                                 "Re-rolling and Locking"}
                    #:com.boardgamegeek.mechanic{:id 2831,
                                                 :name "Real-Time"}
                    #:com.boardgamegeek.mechanic{:id 2822,
                                                 :name
                                                 "Scenario / Mission / Campaign Game"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Space Cadets",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1032,
                                                 :name
                                                 "Action / Dexterity"}
                    #:com.boardgamegeek.category{:id 1028,
                                                 :name "Puzzle"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}
                    #:com.boardgamegeek.category{:id 1113,
                                                 :name
                                                 "Space Exploration"}),
              :com.boardgamegeek.boardgame/max-play-time 120,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "123096",
              :languages (list "en"),
              :game/name "Space Cadets",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/YTPL0ZG_8Y4EQfiCXZzvrg__thumb/img/2gOYyhKR6WH8EuemztSCMQvqNbo=/fit-in/200x150/filters:strip_icc()/pic1362404.jpg"},
             #uuid "1c1ad4ae-57a5-38c9-8c80-666849f4eeec"
             {:game/id #uuid "1c1ad4ae-57a5-38c9-8c80-666849f4eeec",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name
                                                 "Dice Rolling"}),
              :name "Spaghetti",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1032,
                                                 :name
                                                 "Action / Dexterity"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}),
              :com.boardgamegeek.boardgame/max-play-time 5,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 5,
              :com.boardgamegeek.boardgame/id "60794",
              :game/name "Spaghetti"},
             #uuid "106facbb-305a-30f4-afe6-9fe69cfadbdc"
             {:game/id #uuid "106facbb-305a-30f4-afe6-9fe69cfadbdc",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2967,
                                                 :name
                                                 "Hidden Movement"}
                    #:com.boardgamegeek.mechanic{:id 2947,
                                                 :name
                                                 "Movement Points"}
                    #:com.boardgamegeek.mechanic{:id 2846,
                                                 :name
                                                 "Once-Per-Game Abilities"}
                    #:com.boardgamegeek.mechanic{:id 2016,
                                                 :name
                                                 "Secret Unit Deployment"}
                    #:com.boardgamegeek.mechanic{:id 2940,
                                                 :name "Square Grid"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Specter ops",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}
                    #:com.boardgamegeek.category{:id 1047,
                                                 :name "Miniatures"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}
                    #:com.boardgamegeek.category{:id 1081,
                                                 :name
                                                 "Spies/Secret Agents"}),
              :com.boardgamegeek.boardgame/max-play-time 120,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "155624",
              :languages (list "en"),
              :game/name "Specter Ops",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/lVFArtZrwFEDo23sDcSMEg__thumb/img/pky3rb47HJv8jcNPjV3jbDB7o4c=/fit-in/200x150/filters:strip_icc()/pic2486481.jpg"},
             #uuid "bdc861dc-6b29-3561-92f7-d53f184e07fc"
             {:game/id #uuid "bdc861dc-6b29-3561-92f7-d53f184e07fc",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2013,
                                                 :name
                                                 "Commodity Speculation"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2005,
                                                 :name
                                                 "Stock Holding"}),
              :name "Speculation",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "1036",
              :languages (list "en"),
              :game/name "Speculation",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/DIOqNWsW565yd3hPNun2UQ__thumb/img/8Bu2i8e03TSByVt95QUy4NoIxpQ=/fit-in/200x150/filters:strip_icc()/pic4029529.jpg"},
             #uuid "2c11257f-a438-3f75-8fac-459a4275e4c1"
             {:game/id #uuid "2c11257f-a438-3f75-8fac-459a4275e4c1",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2048,
                                                 :name
                                                 "Pattern Building"}),
              :name "Speed Dice",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}
                    #:com.boardgamegeek.category{:id 1025,
                                                 :name "Word Game"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "191473",
              :game/name "Speed Dice",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/ShmaBebkwhHnhMoi5favDg__thumb/img/o_ZrVDn3s01Pg50FuWNfjYHLkRM=/fit-in/200x150/filters:strip_icc()/pic2834183.jpg"},
             #uuid "88857068-79d6-3142-9e20-b8c7fd8b986d"
             {:game/id #uuid "88857068-79d6-3142-9e20-b8c7fd8b986d",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2978,
                                                 :name "Grid Coverage"}
                    #:com.boardgamegeek.mechanic{:id 2048,
                                                 :name
                                                 "Pattern Building"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}),
              :name "Spring Meadow",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1028,
                                                 :name "Puzzle"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "253684",
              :languages (list "en"),
              :game/name "Spring Meadow",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/RyoXSs5ukUtep7WbiWqTLg__thumb/img/Ev9hcbV_yI-PKaRqY8ZZSVLJpPY=/fit-in/200x150/filters:strip_icc()/pic4149719.jpg"},
             #uuid "d8d090ed-62f4-3521-8f53-6cd65960c06e"
             {:game/id #uuid "d8d090ed-62f4-3521-8f53-6cd65960c06e",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}),
              :name "Spy",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1081,
                                                 :name
                                                 "Spies/Secret Agents"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "9201",
              :languages (list "en"),
              :game/name "Spy",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/5fO7faqykFXDWbcuj0THZQ__thumb/img/mPXjz6iHNP3uyuYzCAA33AETHXo=/fit-in/200x150/filters:strip_icc()/pic38682.jpg"},
             #uuid "dee45e08-5103-32ec-93b7-17d391b64576"
             {:game/id #uuid "dee45e08-5103-32ec-93b7-17d391b64576",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2073,
                                                 :name "Acting"}
                    #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2028,
                                                 :name "Role Playing"}
                    #:com.boardgamegeek.mechanic{:id 2892,
                                                 :name
                                                 "Roles with Asymmetric Information"}
                    #:com.boardgamegeek.mechanic{:id 2866,
                                                 :name
                                                 "Targeted Clues"}
                    #:com.boardgamegeek.mechanic{:id 2814,
                                                 :name "Traitor Game"}
                    #:com.boardgamegeek.mechanic{:id 2017,
                                                 :name "Voting"}),
              :name "Spyfall",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1081,
                                                 :name
                                                 "Spies/Secret Agents"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "166384",
              :languages (list "en"),
              :game/name "Spyfall",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Ehx72XRdSeQHISVXcZVnHg__thumb/img/sPJVWjzGcEpiseZGdoD6HNR9nRI=/fit-in/200x150/filters:strip_icc()/pic2453926.jpg"},
             #uuid "4615cd89-6ac7-3867-a94c-ceb0a15a7b13"
             {:game/id #uuid "4615cd89-6ac7-3867-a94c-ceb0a15a7b13",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2932,
                                                 :name
                                                 "Auction: Dutch Priority"}
                    #:com.boardgamegeek.mechanic{:id 2850,
                                                 :name "Events"}
                    #:com.boardgamegeek.mechanic{:id 2902,
                                                 :name "Income"}
                    #:com.boardgamegeek.mechanic{:id 2082,
                                                 :name
                                                 "Worker Placement"}),
              :name "Spyrium",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1029,
                                                 :name "City Building"}
                    #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1088,
                                                 :name
                                                 "Industry / Manufacturing"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}),
              :com.boardgamegeek.boardgame/max-play-time 75,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 75,
              :com.boardgamegeek.boardgame/id "137269",
              :languages (list "en"),
              :game/name "Spyrium",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/ze4QFonaGDFj9QTapBQYlg__thumb/img/opVobJGfklKTacqs512ty9kq5QE=/fit-in/200x150/filters:strip_icc()/pic1808509.jpg"},
             #uuid "9cf42701-85ad-3877-9a0f-cf57a5acf172"
             {:game/id #uuid "9cf42701-85ad-3877-9a0f-cf57a5acf172",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name
                                                 "Grid Movement"}),
              :name "Squadro",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "245222",
              :game/name "Squadro",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/WnpSuWccYdjrLDaAqaDCPw__thumb/img/eA6wQK1rtkYLUEk_9Viq940QGpM=/fit-in/200x150/filters:strip_icc()/pic4210130.jpg"},
             #uuid "51817160-093d-3773-957a-662779bebec9"
             {:game/id #uuid "51817160-093d-3773-957a-662779bebec9",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}),
              :name "Squirrel rush",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "199690",
              :languages (list "en"),
              :game/name "Squirrel Rush",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/rAh8TQNb6ZIelgmaonDPUQ__thumb/img/q7g0f8h4SWc9dLkbd5A9g7jLAcg=/fit-in/200x150/filters:strip_icc()/pic3018118.jpg"},
             #uuid "56be7020-8ac5-312f-9c02-a912103646d9"
             {:game/id #uuid "56be7020-8ac5-312f-9c02-a912103646d9",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Star Flux",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}),
              :com.boardgamegeek.boardgame/max-play-time 40,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "102104",
              :languages (list "en"),
              :game/name "Star Fluxx",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/4rafBr5oDBZVSzN7ije3ZA__thumb/img/Pfr3nT9aYUJC6kEy0PArEeONLpM=/fit-in/200x150/filters:strip_icc()/pic1059779.jpg"},
             #uuid "7f5c4b62-c9ec-3866-8ad6-598ebab4623a"
             {:game/id #uuid "7f5c4b62-c9ec-3866-8ad6-598ebab4623a",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2001,
                                                 :name "Action Points"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2026,
                                                 :name "Hexagon Grid"}
                    #:com.boardgamegeek.mechanic{:id 2011,
                                                 :name "Modular Board"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}),
              :name "Star Trek Fleet Captains",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}
                    #:com.boardgamegeek.category{:id 1047,
                                                 :name "Miniatures"}
                    #:com.boardgamegeek.category{:id 1064,
                                                 :name
                                                 "Movies / TV / Radio theme"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}
                    #:com.boardgamegeek.category{:id 1113,
                                                 :name
                                                 "Space Exploration"}),
              :com.boardgamegeek.boardgame/max-play-time 120,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 90,
              :com.boardgamegeek.boardgame/id "79127",
              :languages (list "en"),
              :game/name "Star Trek: Fleet Captains",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/UqnetX2v84p9ZMpzB8GiDw__thumb/img/2MTCJvG13SbBcF92yo-4wuGuY10=/fit-in/200x150/filters:strip_icc()/pic1081488.jpg"},
             #uuid "5f04dffc-be2c-351d-adf5-f41fb7084b4e"
             {:game/id #uuid "5f04dffc-be2c-351d-adf5-f41fb7084b4e",
              :com.boardgamegeek.boardgame/min-players 4,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}
                    #:com.boardgamegeek.mechanic{:id 2028,
                                                 :name "Role Playing"}
                    #:com.boardgamegeek.mechanic{:id 2027,
                                                 :name "Storytelling"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}),
              :name "Stay away",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1024,
                                                 :name "Horror"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 12,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "158392",
              :languages (list "en"),
              :game/name "Stay Away!",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/oQjTzwZ07k7K32ix42v9vQ__thumb/img/craD998lI9Qp7TYfQS9TrOnif1k=/fit-in/200x150/filters:strip_icc()/pic3494983.png"},
             #uuid "9db165b4-98ba-3935-9f4e-a7bd23beb693"
             {:game/id #uuid "9db165b4-98ba-3935-9f4e-a7bd23beb693",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2016,
                                                 :name
                                                 "Secret Unit Deployment"}
                    #:com.boardgamegeek.mechanic{:id 2940,
                                                 :name "Square Grid"}
                    #:com.boardgamegeek.mechanic{:id 2897,
                                                 :name
                                                 "Variable Set-up"}),
              :name "Stratego",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}
                    #:com.boardgamegeek.category{:id 1045,
                                                 :name "Memory"}
                    #:com.boardgamegeek.category{:id 1051,
                                                 :name "Napoleonic"}
                    #:com.boardgamegeek.category{:id 1019,
                                                 :name "Wargame"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "1917",
              :languages (list "en"),
              :game/name "Stratego",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/O3JZyf9nB_2tGl4jpj8SPw__thumb/img/Yo80CtI2QTxVEXDWvjhkc6iYsMo=/fit-in/200x150/filters:strip_icc()/pic25644.jpg"},
             #uuid "761cd5e5-55ee-39c8-b789-0273d2493fe8"
             {:game/id #uuid "761cd5e5-55ee-39c8-b789-0273d2493fe8",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2008,
                                                 :name "Trading"}),
              :name "Osadnici z Katanu Rychla karetni hra",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1029,
                                                 :name
                                                 "City Building"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "91534",
              :languages (list "cz"),
              :game/name "Struggle for Catan",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/odRECA_s_wJWJnFHovbb0g__thumb/img/CPhroaAPBNta7BCp1M69h8ArEKs=/fit-in/200x150/filters:strip_icc()/pic3063589.jpg"},
             #uuid "12e2d12e-9e19-33ad-b08e-22ab8cc8eac5"
             {:game/id #uuid "12e2d12e-9e19-33ad-b08e-22ab8cc8eac5",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2001,
                                                 :name "Action Points"}
                    #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2959,
                                                 :name "Map Addition"}
                    #:com.boardgamegeek.mechanic{:id 2011,
                                                 :name "Modular Board"}
                    #:com.boardgamegeek.mechanic{:id 2078,
                                                 :name
                                                 "Point to Point Movement"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Sub Terra",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1022,
                                                 :name "Adventure"}
                    #:com.boardgamegeek.category{:id 1020,
                                                 :name "Exploration"}
                    #:com.boardgamegeek.category{:id 1024,
                                                 :name "Horror"}
                    #:com.boardgamegeek.category{:id 1059,
                                                 :name "Maze"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "204472",
              :languages (list "en"),
              :game/name "Sub Terra",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/47Z9FcLD20NDHdRYUaF_XA__thumb/img/I6Uog8mnrK4MgjiQlIMGcrQ01r8=/fit-in/200x150/filters:strip_icc()/pic3904427.png"},
             #uuid "f5c8ba24-2c49-3844-8721-5cf4e518c90f"
             {:languages (list "en"),
              :name "Subterra",
              :game/id #uuid "f5c8ba24-2c49-3844-8721-5cf4e518c90f",
              :game/name "Subterra"},
             #uuid "875b8289-de41-3672-8c92-95b6a689ff43"
             {:languages (list "en" "pl"),
              :name "Suits, the",
              :game/id #uuid "875b8289-de41-3672-8c92-95b6a689ff43",
              :game/name "Suits, the"},
             #uuid "cb4c3448-07c8-36e6-8cbd-28f45339be1d"
             {:game/id #uuid "cb4c3448-07c8-36e6-8cbd-28f45339be1d",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2001,
                                                 :name "Action Points"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Summoner Wars",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "58281",
              :languages (list "en"),
              :game/name "Summoner Wars",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/EWi-utp09EIJnwia_o_Taw__thumb/img/vEFkO1QccS2LQpL7fgX7-v1hZhg=/fit-in/200x150/filters:strip_icc()/pic5152378.png"},
             #uuid "9db68b1a-dbc5-3564-ab25-1023e94227a1"
             {:game/id #uuid "9db68b1a-dbc5-3564-ab25-1023e94227a1",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}),
              :name "Super Cats",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "279014",
              :languages (list "en" "fr"),
              :game/name "Super Cats",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/j_0yzmqFtLEZpepIneoYFA__thumb/img/LFz_HWvWH1OkQs8E5jw1NReuQuQ=/fit-in/200x150/filters:strip_icc()/pic4715181.png"},
             #uuid "ff75a7b6-d946-39dc-b9cf-69635113e6f4"
             {:game/id #uuid "ff75a7b6-d946-39dc-b9cf-69635113e6f4",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Super Farmer: The Card Game",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1013,
                                                 :name "Farming"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "286147",
              :languages (list "en" "pl"),
              :game/name "Super Farmer: The Card Game",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/PAedUfUJ5gW0vtNfGHDVAg__thumb/img/mSf3m6Gb7F5mHCTUJghR52DVMhM=/fit-in/200x150/filters:strip_icc()/pic4966239.png"},
             #uuid "653e0f82-5aec-3cf2-86d0-4422c6b2f8cd"
             {:languages (list "cz"),
              :name "SuperSpion / Spyfall",
              :game/id #uuid "653e0f82-5aec-3cf2-86d0-4422c6b2f8cd",
              :game/name "SuperSpion / Spyfall"},
             #uuid "edcee0da-2a9f-3e86-ab60-5a78ad6f26ee"
             {:game/id #uuid "edcee0da-2a9f-3e86-ab60-5a78ad6f26ee",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}),
              :name "Supervillain this galaxy is mine",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "223573",
              :languages (list "en"),
              :game/name "Supervillain: This Galaxy Is Mine!",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/m6WHe0nNunrTTKwvYJyyFg__thumb/img/ttRdI77V230dCPyC3AlxrNbI_Ms=/fit-in/200x150/filters:strip_icc()/pic3488140.jpg"},
             #uuid "2c63539a-a2a5-3415-b3d7-89edc773ac8b"
             {:game/id #uuid "2c63539a-a2a5-3415-b3d7-89edc773ac8b",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2984,
                                                 :name "Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2875,
                                                 :name
                                                 "End Game Bonuses"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}),
              :name "Sushi Go!",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "133473",
              :game/name "Sushi Go!",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/EPdI2KbLVtpGWLgL_eJLFg__thumb/img/6fDvIObIG-oxTDWNaf8l9mchWMk=/fit-in/200x150/filters:strip_icc()/pic5885690.jpg"},
             #uuid "d80578d7-99b8-36c3-84e7-da04814b80f5"
             {:game/id #uuid "d80578d7-99b8-36c3-84e7-da04814b80f5",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2016,
                                                 :name
                                                 "Secret Unit Deployment"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2008,
                                                 :name "Trading"}),
              :name "Sweet Nose",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1050,
                                                 :name "Ancient"}
                    #:com.boardgamegeek.category{:id 1098,
                                                 :name "Number"}
                    #:com.boardgamegeek.category{:id 1120,
                                                 :name
                                                 "Print & Play"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "179548",
              :languages (list "en"),
              :game/name "Sweet Nose",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Mxns4HExaB42Rdj0Rm9eag__thumb/img/zQ-ZXDJNtoRvd6FPu98KURcaEJ4=/fit-in/200x150/filters:strip_icc()/pic3052668.jpg"},
             #uuid "51c77b26-5d4b-3952-ac93-fa7002f8a379"
             {:game/id #uuid "51c77b26-5d4b-3952-ac93-fa7002f8a379",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2962,
                                                 :name
                                                 "Move Through Deck"}
                    #:com.boardgamegeek.mechanic{:id 2851,
                                                 :name
                                                 "Narrative Choice / Paragraph"}
                    #:com.boardgamegeek.mechanic{:id 2027,
                                                 :name "Storytelling"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Time Stories",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1022,
                                                 :name "Adventure"}
                    #:com.boardgamegeek.category{:id 1118,
                                                 :name
                                                 "Mature / Adult"}
                    #:com.boardgamegeek.category{:id 1028,
                                                 :name "Puzzle"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 90,
              :com.boardgamegeek.boardgame/id "146508",
              :languages (list "cz"),
              :game/name "T.I.M.E Stories",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/XmwCsjQ3C1Ul53ZN2o8Q-Q__thumb/img/tTU1YVtab-cN5gCdagINowvVA2g=/fit-in/200x150/filters:strip_icc()/pic2617634.png"},
             #uuid "309ea4eb-582b-3fb9-93ca-87fd54016d3e"
             {:game/id #uuid "309ea4eb-582b-3fb9-93ca-87fd54016d3e",
              :com.boardgamegeek.boardgame/min-players 4,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2893,
                                                 :name
                                                 "Communication Limits"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}),
              :name "Taboo",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}
                    #:com.boardgamegeek.category{:id 1025,
                                                 :name "Word Game"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 10,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "1111",
              :languages (list "en"),
              :game/name "Taboo",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/e8wVvax1VqQkgCu_AST5Aw__thumb/img/liOKssTUHRIIVYERQgyHSNK33Qk=/fit-in/200x150/filters:strip_icc()/pic212946.jpg"},
             #uuid "1e78ea48-893a-3f8e-91e2-01c9ff0e706e"
             {:game/id #uuid "1e78ea48-893a-3f8e-91e2-01c9ff0e706e",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2060,
                                                 :name
                                                 "Pattern Recognition"}),
              :name "Taco Cat Goat Cheese Pizza",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "253664",
              :languages (list "en"),
              :game/name "Taco Cat Goat Cheese Pizza",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Huss90M3Dw69vZKsl6COaw__thumb/img/FT3OeUFrnFGZXukJbHNX9bcvQvY=/fit-in/200x150/filters:strip_icc()/pic5197313.png"},
             #uuid "b8909580-a299-3ec5-848c-548f38510b72"
             {:game/id #uuid "b8909580-a299-3ec5-848c-548f38510b72",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}),
              :name "Tri mala prasatka",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}
                    #:com.boardgamegeek.category{:id 1093,
                                                 :name "Novel-based"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "135649",
              :languages (list "cz"),
              :game/name "Tales & Games: The Three Little Pigs",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/rdSKRuh85xv6MmHBn9-aUQ__thumb/img/uog0ckrEef5Y140153OlcSn6Dqw=/fit-in/200x150/filters:strip_icc()/pic1701673.jpg"},
             #uuid "f00e2b92-434d-31e6-8a25-1b16618b5ab5"
             {:game/id #uuid "f00e2b92-434d-31e6-8a25-1b16618b5ab5",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2689,
                                                 :name "Action Queue"}
                    #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}),
              :name "Team up",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1088,
                                                 :name
                                                 "Industry / Manufacturing"}
                    #:com.boardgamegeek.category{:id 1011,
                                                 :name
                                                 "Transportation"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "235511",
              :languages (list "en"),
              :game/name "Team UP!",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/6hqatvV_uhGWebNPWzj4lA__thumb/img/Ja6pyHziaDDIi_2_jRCXUGNKWm0=/fit-in/200x150/filters:strip_icc()/pic3788130.jpg"},
             #uuid "2b110ae1-40c3-3594-bdfa-8a5bfe402f8b"
             {:game/id #uuid "2b110ae1-40c3-3594-bdfa-8a5bfe402f8b",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}),
              :name "Tension",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1032,
                                                 :name
                                                 "Action / Dexterity"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}),
              :com.boardgamegeek.boardgame/max-play-time 10,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "1595",
              :languages (list "en"),
              :game/name "Tension",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/OzApxKxeNDjcEsM889qLog__thumb/img/wThBOcdWzhZDF9QAheswm6Go9v0=/fit-in/200x150/filters:strip_icc()/pic363584.jpg"},
             #uuid "66437274-239d-371f-a5d1-71102dca56e3"
             {:languages (list "en"),
              :name "Tension Master",
              :game/id #uuid "66437274-239d-371f-a5d1-71102dca56e3",
              :game/name "Tension Master"},
             #uuid "ccfd0e0f-749f-3a3a-a9cc-7c01a70ea5fd"
             {:languages (list "cz"),
              :name "Teraformace Marsu",
              :game/id #uuid "ccfd0e0f-749f-3a3a-a9cc-7c01a70ea5fd",
              :game/name "Teraformace Marsu"},
             #uuid "9c557202-449d-3095-b805-89c2e6e0fe50"
             {:game/id #uuid "9c557202-449d-3095-b805-89c2e6e0fe50",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2014,
                                                 :name
                                                 "Betting and Bluffing"}),
              :name "Zeme",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1094,
                                                 :name "Educational"}
                    #:com.boardgamegeek.category{:id 1027,
                                                 :name "Trivia"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "153507",
              :languages (list "terra"),
              :game/name "Terra",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/oisIhweNPvYGrTounfOr_A__thumb/img/CAOGSfBBkYezI4bVVyAP1fwv1ww=/fit-in/200x150/filters:strip_icc()/pic2566394.jpg"},
             #uuid "e154f5ce-d498-3840-a559-661a996d4d09"
             {:game/id #uuid "e154f5ce-d498-3840-a559-661a996d4d09",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2664,
                                                 :name
                                                 "Deck, Bag, and Pool Building"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Terra Evolution Tree of life",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1094,
                                                 :name "Educational"}
                    #:com.boardgamegeek.category{:id 1036,
                                                 :name "Prehistoric"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "111426",
              :game/name "Terra Evolution: Tree of Life",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/kYK_QyuZLxPCEnYo0VoH9A__thumb/img/iM5YOwWPk2BGRfhb-fRp5gU_cGI=/fit-in/200x150/filters:strip_icc()/pic2621857.jpg"},
             #uuid "0071dfa9-ec41-35e2-befc-ecbe183ff272"
             {:game/id #uuid "0071dfa9-ec41-35e2-befc-ecbe183ff272",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2875,
                                                 :name
                                                 "End Game Bonuses"}
                    #:com.boardgamegeek.mechanic{:id 2026,
                                                 :name "Hexagon Grid"}
                    #:com.boardgamegeek.mechanic{:id 2902,
                                                 :name "Income"}
                    #:com.boardgamegeek.mechanic{:id 2914,
                                                 :name
                                                 "Increase Value of Unchosen Resources"}
                    #:com.boardgamegeek.mechanic{:id 2081,
                                                 :name
                                                 "Network and Route Building"}
                    #:com.boardgamegeek.mechanic{:id 2849,
                                                 :name
                                                 "Tech Trees / Tech Tracks"}
                    #:com.boardgamegeek.mechanic{:id 2830,
                                                 :name
                                                 "Turn Order: Pass Order"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}
                    #:com.boardgamegeek.mechanic{:id 2897,
                                                 :name
                                                 "Variable Set-up"}
                    #:com.boardgamegeek.mechanic{:id 2874,
                                                 :name
                                                 "Victory Points as a Resource"}),
              :name "Terra Mystica",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1015,
                                                 :name "Civilization"}
                    #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1086,
                                                 :name
                                                 "Territory Building"}),
              :com.boardgamegeek.boardgame/max-play-time 150,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "120677",
              :languages (list "cz"),
              :game/name "Terra Mystica",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/bre12I1YiXkZr7elvriz4A__thumb/img/GW-ip0dfeAee7KQqJ04SRZxF1lg=/fit-in/200x150/filters:strip_icc()/pic5375624.jpg"},
             #uuid "f944b1ee-72e5-3ea8-832f-4eaf0dde6f09"
             {:game/id #uuid "f944b1ee-72e5-3ea8-832f-4eaf0dde6f09",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2984,
                                                 :name "Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2875,
                                                 :name
                                                 "End Game Bonuses"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2026,
                                                 :name "Hexagon Grid"}
                    #:com.boardgamegeek.mechanic{:id 2902,
                                                 :name "Income"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2819,
                                                 :name
                                                 "Solo / Solitaire Game"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}
                    #:com.boardgamegeek.mechanic{:id 2828,
                                                 :name
                                                 "Turn Order: Progressive"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Terraforming Mars",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1084,
                                                 :name "Environmental"}
                    #:com.boardgamegeek.category{:id 1088,
                                                 :name
                                                 "Industry / Manufacturing"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}
                    #:com.boardgamegeek.category{:id 1113,
                                                 :name
                                                 "Space Exploration"}
                    #:com.boardgamegeek.category{:id 1086,
                                                 :name
                                                 "Territory Building"}),
              :com.boardgamegeek.boardgame/max-play-time 120,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 120,
              :com.boardgamegeek.boardgame/id "167791",
              :languages (list "cz"),
              :game/name "Terraforming Mars",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/wg9oOLcsKvDesSUdZQ4rxw__thumb/img/BTxqxgYay5tHJfVoJ2NF5g43_gA=/fit-in/200x150/filters:strip_icc()/pic3536616.jpg"},
             #uuid "3ca4bbbb-2ab4-3ee4-85af-cd73036a4cd3"
             {:game/id #uuid "3ca4bbbb-2ab4-3ee4-85af-cd73036a4cd3",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2009,
                                                 :name
                                                 "Trick-taking"}),
              :name "Strife",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1055,
                                                 :name "American West"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "225482",
              :game/name "Texas Showdown",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/1a0gtaIzqd3GSHbOf5gW3w__thumb/img/fFypu_tK6nMkxDMic_v8rKyFwjw=/fit-in/200x150/filters:strip_icc()/pic3914023.jpg"},
             #uuid "458d2163-a348-30c3-a4ad-8792fa32645c"
             {:game/id #uuid "458d2163-a348-30c3-a4ad-8792fa32645c",
              :com.boardgamegeek.boardgame/min-players 3,
              :name "To je Otázka!",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "226322",
              :languages (list "cz"),
              :game/name "That's a Question!",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/MTGTksYC45yzbOB-UJdBTw__thumb/img/Pe10KxKTwYWeK_Ikgu0YJEsDdkk=/fit-in/200x150/filters:strip_icc()/pic3643950.jpg"},
             #uuid "8881688f-f717-3852-a5df-d3c7386562d1"
             {:game/id #uuid "8881688f-f717-3852-a5df-d3c7386562d1",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2082,
                                                 :name
                                                 "Worker Placement"}),
              :name "The Ancient World",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1050,
                                                 :name "Ancient"}
                    #:com.boardgamegeek.category{:id 1015,
                                                 :name "Civilization"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 90,
              :com.boardgamegeek.boardgame/id "147253",
              :languages (list "en"),
              :game/name "The Ancient World",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/-trgBZRA5P4kk86FQuuI-A__thumb/img/OMIhsFac59AYy7QyiDbsVgFxQHs=/fit-in/200x150/filters:strip_icc()/pic1951629.jpg"},
             #uuid "1bd17795-c173-3c75-9489-8343917b819a"
             {:game/id #uuid "1bd17795-c173-3c75-9489-8343917b819a",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2689,
                                                 :name "Action Queue"}
                    #:com.boardgamegeek.mechanic{:id 2012,
                                                 :name
                                                 "Auction/Bidding"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}),
              :name "The Boldest",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1022,
                                                 :name "Adventure"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "261529",
              :languages (list "en"),
              :game/name "The Boldest",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/2igp3-QEN6v2tZm-MwrEPA__thumb/img/l9Z4TQVVnEQomKQUoIqcL8_50eY=/fit-in/200x150/filters:strip_icc()/pic4328782.jpg"},
             #uuid "0d794c9d-d65b-3e94-8ce2-fe8020a2a53c"
             {:game/id #uuid "0d794c9d-d65b-3e94-8ce2-fe8020a2a53c",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2850,
                                                 :name "Events"}
                    #:com.boardgamegeek.mechanic{:id 2005,
                                                 :name "Stock Holding"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}
                    #:com.boardgamegeek.mechanic{:id 2017,
                                                 :name "Voting"}),
              :name "The Boss",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1026,
                                                 :name "Negotiation"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 90,
              :com.boardgamegeek.boardgame/id "7152",
              :game/name "The Boss",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/dHMkSe5cOAeWRg3wt8nh1A__thumb/img/jqfFM_x3vq7z9B8WlitYmE99dKM=/fit-in/200x150/filters:strip_icc()/pic579157.jpg"},
             #uuid "595f02eb-d247-3d88-95e4-06800f89e71a"
             {:game/id #uuid "595f02eb-d247-3d88-95e4-06800f89e71a",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2893,
                                                 :name
                                                 "Communication Limits"}
                    #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2822,
                                                 :name
                                                 "Scenario / Mission / Campaign Game"}
                    #:com.boardgamegeek.mechanic{:id 2009,
                                                 :name
                                                 "Trick-taking"}),
              :name "Odysea Společne k devate planetě",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1016,
                                                 :name
                                                 "Science Fiction"}
                    #:com.boardgamegeek.category{:id 1113,
                                                 :name
                                                 "Space Exploration"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "284083",
              :languages (list "cz"),
              :game/name "The Crew: The Quest for Planet Nine",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/98LnQShydr11OBKS46xY-Q__thumb/img/et-fnuozyOdBOVL-5kSS3_7I8fw=/fit-in/200x150/filters:strip_icc()/pic5687013.jpg"},
             #uuid "af9c7e15-a449-3e77-9dcf-1fed9a676d1f"
             {:game/id #uuid "af9c7e15-a449-3e77-9dcf-1fed9a676d1f",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2011,
                                                 :name "Modular Board"}
                    #:com.boardgamegeek.mechanic{:id 2007,
                                                 :name
                                                 "Pick-up and Deliver"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2008,
                                                 :name "Trading"}),
              :name "The Dutch East Indies",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1020,
                                                 :name "Exploration"}
                    #:com.boardgamegeek.category{:id 1008,
                                                 :name "Nautical"}
                    #:com.boardgamegeek.category{:id 1090,
                                                 :name "Pirates"}
                    #:com.boardgamegeek.category{:id 1011,
                                                 :name
                                                 "Transportation"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "216907",
              :languages (list "en"),
              :game/name "The Dutch East Indies",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/6G4EVaT-g7WNPYHTA0EN7w__thumb/img/PjnIyuxU6v1SXddh0B4LDuKI2JY=/fit-in/200x150/filters:strip_icc()/pic3373286.jpg"},
             #uuid "5e679cbb-17a6-3355-9ddc-017e474ea5a9"
             {:game/id #uuid "5e679cbb-17a6-3355-9ddc-017e474ea5a9",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2847,
                                                 :name
                                                 "Advantage Token"}
                    #:com.boardgamegeek.mechanic{:id 2046,
                                                 :name "Area Movement"}
                    #:com.boardgamegeek.mechanic{:id 2014,
                                                 :name
                                                 "Betting and Bluffing"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2016,
                                                 :name
                                                 "Secret Unit Deployment"}
                    #:com.boardgamegeek.mechanic{:id 2884,
                                                 :name
                                                 "Sudden Death Ending"}
                    #:com.boardgamegeek.mechanic{:id 2826,
                                                 :name
                                                 "Turn Order: Stat-Based"}),
              :name "The Fog of War",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1049,
                                                 :name
                                                 "World War II"}),
              :com.boardgamegeek.boardgame/max-play-time 120,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 90,
              :com.boardgamegeek.boardgame/id "197439",
              :languages (list "en"),
              :game/name "The Fog of War",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/9UBE2IUYwJj0qzK-pF2EAw__thumb/img/Btsp1uK6EpiZe46DOalt_TZeKcI=/fit-in/200x150/filters:strip_icc()/pic3116180.jpg"},
             #uuid "62326243-6ea0-3ce1-aef6-c1d285dbdc80"
             {:game/id #uuid "62326243-6ea0-3ce1-aef6-c1d285dbdc80",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}
                    #:com.boardgamegeek.mechanic{:id 2070,
                                                 :name "Simulation"}),
              :name "The Game of Life",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1072,
                                                 :name "Electronic"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "2921",
              :languages (list "en"),
              :game/name "The Game of Life",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/c4S2XDRb_DCYCAV-ZAzDpg__thumb/img/tAejWvDTc-mXjX2euOrJwaXP2Y8=/fit-in/200x150/filters:strip_icc()/pic288405.jpg"},
             #uuid "72b0f8c3-5245-35e0-9a66-484200882d79"
             {:languages (list "cz"),
              :name "The Godfather",
              :game/id #uuid "72b0f8c3-5245-35e0-9a66-484200882d79",
              :game/name "The Godfather"},
             #uuid "d8b44a4f-28ae-353d-adeb-b3fd26fc143b"
             {:game/id #uuid "d8b44a4f-28ae-353d-adeb-b3fd26fc143b",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2893,
                                                 :name
                                                 "Communication Limits"}
                    #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2962,
                                                 :name
                                                 "Move Through Deck"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "The Grizzled",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1065,
                                                 :name "World War I"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "171668",
              :languages (list "en"),
              :game/name "The Grizzled",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/5JuQCtSAeSZpAL3WgWdwow__thumb/img/XcI-3g0sVumt8DsaMaBGrwftIRw=/fit-in/200x150/filters:strip_icc()/pic3719610.png"},
             #uuid "72e2061f-c210-3f0c-bdd2-68d09fb15b98"
             {:game/id #uuid "72e2061f-c210-3f0c-bdd2-68d09fb15b98",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2912,
                                                 :name "Contracts"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2984,
                                                 :name "Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2875,
                                                 :name
                                                 "End Game Bonuses"}
                    #:com.boardgamegeek.mechanic{:id 2978,
                                                 :name "Grid Coverage"}
                    #:com.boardgamegeek.mechanic{:id 2947,
                                                 :name
                                                 "Movement Points"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2819,
                                                 :name
                                                 "Solo / Solitaire Game"}
                    #:com.boardgamegeek.mechanic{:id 2940,
                                                 :name "Square Grid"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}
                    #:com.boardgamegeek.mechanic{:id 2939,
                                                 :name
                                                 "Track Movement"}
                    #:com.boardgamegeek.mechanic{:id 2826,
                                                 :name
                                                 "Turn Order: Stat-Based"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "The Magnificent",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}
                    #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "283863",
              :languages (list "en"),
              :game/name "The Magnificent",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/6pci74DWc7U7XuwkfpEu2Q__thumb/img/K-X_5jjTMmesaFzFUoFOZu5p_AU=/fit-in/200x150/filters:strip_icc()/pic4871117.jpg"},
             #uuid "134c5416-16b9-3118-a547-774f6df7bbcd"
             {:game/id #uuid "134c5416-16b9-3118-a547-774f6df7bbcd",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2893,
                                                 :name
                                                 "Communication Limits"}
                    #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}),
              :name "The Mind",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1098,
                                                 :name "Number"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "244992",
              :languages (list "en"),
              :game/name "The Mind",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/q_JGK291hrhnhiRB0667oA__thumb/img/PUrzEmTo5kOcK5BOb4cbOOcH86I=/fit-in/200x150/filters:strip_icc()/pic3979766.png"},
             #uuid "af472b73-df4f-3397-a8c7-31a328913353"
             {:game/id #uuid "af472b73-df4f-3397-a8c7-31a328913353",
              :com.boardgamegeek.boardgame/min-players 5,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2885,
                                                 :name "Finale Ending"}
                    #:com.boardgamegeek.mechanic{:id 2891,
                                                 :name "Hidden Roles"}
                    #:com.boardgamegeek.mechanic{:id 2892,
                                                 :name
                                                 "Roles with Asymmetric Information"}
                    #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}
                    #:com.boardgamegeek.mechanic{:id 2814,
                                                 :name "Traitor Game"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}
                    #:com.boardgamegeek.mechanic{:id 2017,
                                                 :name "Voting"}),
              :name "Avalon: The Resistance",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1035,
                                                 :name "Medieval"}
                    #:com.boardgamegeek.category{:id 1026,
                                                 :name "Negotiation"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1081,
                                                 :name
                                                 "Spies/Secret Agents"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 10,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "128882",
              :languages (list "en"),
              :game/name "The Resistance: Avalon",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/LPa6rsGcv8S0-OeNjCOAEQ__thumb/img/RKui79VjUbQAzTWaPu44ytupzDs=/fit-in/200x150/filters:strip_icc()/pic1398895.jpg"},
             #uuid "5140d848-4910-3017-8f45-c2851658966b"
             {:game/id #uuid "5140d848-4910-3017-8f45-c2851658966b",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}
                    #:com.boardgamegeek.mechanic{:id 2082,
                                                 :name
                                                 "Worker Placement"}),
              :name "The River",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1020,
                                                 :name "Exploration"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "257759",
              :languages (list "en"),
              :game/name "The River",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/ZmxO1MJdYqWHsVGuy2elPw__thumb/img/BmmJISWrgSPXfvc8-IEtSgbkwcM=/fit-in/200x150/filters:strip_icc()/pic4283642.png"},
             #uuid "928c51b9-1ca6-3be5-b2f1-e665e90fab70"
             {:game/id #uuid "928c51b9-1ca6-3be5-b2f1-e665e90fab70",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}),
              :name "The Rose King",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1035,
                                                 :name "Medieval"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "201",
              :languages (list "en"),
              :game/name "The Rose King",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/vfFy_HLiBNLxptwxFDMmDg__thumb/img/CJ8yTQu3kt8o4ZwF5ZbMJWDj564=/fit-in/200x150/filters:strip_icc()/pic2855891.jpg"},
             #uuid "ebb89386-c539-37db-b4a7-972b931256f7"
             {:game/id #uuid "ebb89386-c539-37db-b4a7-972b931256f7",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2012,
                                                 :name
                                                 "Auction/Bidding"}
                    #:com.boardgamegeek.mechanic{:id 2932,
                                                 :name
                                                 "Auction: Dutch Priority"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "The Speicherstadt",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "66505",
              :languages (list "en"),
              :game/name "The Speicherstadt",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/x1EVKCtIP_tFTH8h5kvXog__thumb/img/8n5m3ZjWQfD-uwM7hOEyqS_93I4=/fit-in/200x150/filters:strip_icc()/pic686491.jpg"},
             #uuid "cf3b2299-3275-32a1-bcc3-40c64f229538"
             {:languages (list "cz"),
              :name "Through the ages",
              :game/id #uuid "cf3b2299-3275-32a1-bcc3-40c64f229538",
              :game/name "Through the ages"},
             #uuid "f945232e-faca-3164-a579-88d416e62368"
             {:game/id #uuid "f945232e-faca-3164-a579-88d416e62368",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2001,
                                                 :name "Action Points"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2016,
                                                 :name
                                                 "Secret Unit Deployment"}),
              :name "Thunder and Lightning",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1082,
                                                 :name "Mythology"}),
              :com.boardgamegeek.boardgame/max-play-time 40,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 40,
              :com.boardgamegeek.boardgame/id "191963",
              :languages (list "en"),
              :game/name "Thunder & Lightning",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/n7PdJgrMXAIAh6fdCE2caw__thumb/img/NrHBSxGDuZZKskX6HMi0TfqJHuU=/fit-in/200x150/filters:strip_icc()/pic2849820.jpg"},
             #uuid "a09707a5-88fc-32fa-b544-8afa929496ab"
             {:languages (list "en"),
              :name "Thunderstone Advance",
              :game/id #uuid "a09707a5-88fc-32fa-b544-8afa929496ab",
              :game/name "Thunderstone Advance"},
             #uuid "7b1d9fe4-27bb-3db5-af9b-89f0785afc59"
             {:game/id #uuid "7b1d9fe4-27bb-3db5-af9b-89f0785afc59",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2912,
                                                 :name "Contracts"}
                    #:com.boardgamegeek.mechanic{:id 2875,
                                                 :name
                                                 "End Game Bonuses"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2081,
                                                 :name
                                                 "Network and Route Building"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Ticket to Ride",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1034,
                                                 :name "Trains"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "9209",
              :game/name "Ticket to Ride",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/ZWJg0dCdrWHxVnc0eFXK8w__thumb/img/a9rsFV6KR0aun8GobhRU16aU8Kc=/fit-in/200x150/filters:strip_icc()/pic38668.jpg"},
             #uuid "90a300ed-ea38-3514-b744-0c43440fa4b3"
             {:game/id #uuid "90a300ed-ea38-3514-b744-0c43440fa4b3",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2883,
                                                 :name "Connections"}
                    #:com.boardgamegeek.mechanic{:id 2875,
                                                 :name
                                                 "End Game Bonuses"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2081,
                                                 :name
                                                 "Network and Route Building"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Ticket to Ride Europe",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1034,
                                                 :name "Trains"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "14996",
              :languages (list "cz"),
              :game/name "Ticket to Ride: Europe",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/0K1AOciqlMVUWFPLTJSiww__thumb/img/RDvu2FvsYVVH8icp1VsilUlqUGI=/fit-in/200x150/filters:strip_icc()/pic66668.jpg"},
             #uuid "ea2abdf4-a5ae-3c18-be7b-bd2db0068ddb"
             {:game/id #uuid "ea2abdf4-a5ae-3c18-be7b-bd2db0068ddb",
              :com.boardgamegeek.boardgame/min-players 2,
              :name "Time’s up",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1094,
                                                 :name "Educational"}),
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/id "38579",
              :languages (list "en"),
              :game/name "Time's Up",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/gDAVfngSgBT84oy3wlm3Rw__thumb/img/vAGevOvjEVquzcQkKWEBDcbK5T4=/fit-in/200x150/filters:strip_icc()/pic376027.jpg"},
             #uuid "c3fa9226-9cf9-3afa-8844-dff274cc446d"
             {:game/id #uuid "c3fa9226-9cf9-3afa-8844-dff274cc446d",
              :com.boardgamegeek.boardgame/min-players 4,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2073,
                                                 :name "Acting"}
                    #:com.boardgamegeek.mechanic{:id 2893,
                                                 :name
                                                 "Communication Limits"}
                    #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}),
              :name "Time’s Up – Rodina",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1045,
                                                 :name "Memory"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 12,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "88126",
              :game/name "Time's Up! Family",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/IaRRFgVPFUkhklzt96Z3sA__thumb/img/t3qrVwTjF04gioPupyc7gfnqDis=/fit-in/200x150/filters:strip_icc()/pic903503.jpg"},
             #uuid "3d1f92a5-65d3-31a6-9880-236e33c49bf3"
             {:game/id #uuid "3d1f92a5-65d3-31a6-9880-236e33c49bf3",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2940,
                                                 :name "Square Grid"}),
              :name "Timeline",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "683",
              :languages (list "cz"),
              :game/name "Timeline",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/xNlnA_NM7ZDKQWqx8WE3Uw__thumb/img/kJOIXrJ87KPJNSqC_niMvA2_JrU=/fit-in/200x150/filters:strip_icc()/pic137941.jpg"},
             #uuid "05e84109-515f-3f98-8ab8-872a8a1a9cb2"
             {:game/id #uuid "05e84109-515f-3f98-8ab8-872a8a1a9cb2",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2080,
                                                 :name
                                                 "Area Majority / Influence"}
                    #:com.boardgamegeek.mechanic{:id 2046,
                                                 :name "Area Movement"}
                    #:com.boardgamegeek.mechanic{:id 2012,
                                                 :name
                                                 "Auction/Bidding"}
                    #:com.boardgamegeek.mechanic{:id 2843,
                                                 :name "Follow"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}
                    #:com.boardgamegeek.mechanic{:id 2079,
                                                 :name
                                                 "Variable Phase Order"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}
                    #:com.boardgamegeek.mechanic{:id 2082,
                                                 :name
                                                 "Worker Placement"}),
              :name "Malá Velká Království",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1015,
                                                 :name "Civilization"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}
                    #:com.boardgamegeek.category{:id 1035,
                                                 :name "Medieval"}
                    #:com.boardgamegeek.category{:id 1120,
                                                 :name
                                                 "Print & Play"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "148951",
              :languages (list "cz"),
              :game/name "Tiny Epic Kingdoms",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/rEBwFqk9b4rT-hrGOQnZrA__thumb/img/nIQB6TR1SMbF1W1Oq4OlhIbnao4=/fit-in/200x150/filters:strip_icc()/pic2947892.jpg"},
             #uuid "104965da-ee0b-3867-95a3-0416228b7b19"
             {:languages (list "cz"),
              :name "Tipni si Česko",
              :game/id #uuid "104965da-ee0b-3867-95a3-0416228b7b19",
              :game/name "Tipni si Česko"},
             #uuid "24689901-b879-3cd9-9b75-5dd7dd2b8f2d"
             {:game/id #uuid "24689901-b879-3cd9-9b75-5dd7dd2b8f2d",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2875,
                                                 :name
                                                 "End Game Bonuses"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2663,
                                                 :name "Time Track"}
                    #:com.boardgamegeek.mechanic{:id 2939,
                                                 :name
                                                 "Track Movement"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Tokaido",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1097,
                                                 :name "Travel"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "123540",
              :languages (list "en"),
              :game/name "Tokaido",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/-sUA2HQNFHBxOdzHE6Ywlg__thumb/img/OW3Jp2snfQM6Aq_nwOrKnHpF2hM=/fit-in/200x150/filters:strip_icc()/pic3747956.png"},
             #uuid "39063899-ef80-383a-97b7-38b8c778cc24"
             {:game/id #uuid "39063899-ef80-383a-97b7-38b8c778cc24",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2046,
                                                 :name "Area Movement"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2891,
                                                 :name "Hidden Roles"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}
                    #:com.boardgamegeek.mechanic{:id 2017,
                                                 :name "Voting"}),
              :name "Tortuga 1667",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1090,
                                                 :name "Pirates"}),
              :com.boardgamegeek.boardgame/max-play-time 40,
              :com.boardgamegeek.boardgame/max-players 9,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "218530",
              :languages (list "en"),
              :game/name "Tortuga 1667",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/rT6zVN1zRbEMHok5V_zoGQ__thumb/img/851DsrYg9ei8WsbL77sj5eQMvP0=/fit-in/200x150/filters:strip_icc()/pic3747083.png"},
             #uuid "8107587f-5b81-3b66-9d13-2fa6e9a887df"
             {:game/id #uuid "8107587f-5b81-3b66-9d13-2fa6e9a887df",
              :com.boardgamegeek.boardgame/min-players 2,
              :name "Totem",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1015,
                                                 :name
                                                 "Civilization"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 90,
              :com.boardgamegeek.boardgame/id "471",
              :languages (list "en"),
              :game/name "Totem",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/4j_lyl1mtRT7YYmTcd2b9g__thumb/img/RhYKvH1TbL2UbbB8TgULIzmquWI=/fit-in/200x150/filters:strip_icc()/pic75195.jpg"},
             #uuid "c31af57c-a315-3610-b455-9d5f386f31e0"
             {:game/id #uuid "c31af57c-a315-3610-b455-9d5f386f31e0",
              :com.boardgamegeek.boardgame/min-players 4,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2011,
                                                 :name "Modular Board"}
                    #:com.boardgamegeek.mechanic{:id 2027,
                                                 :name "Storytelling"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}
                    #:com.boardgamegeek.mechanic{:id 2663,
                                                 :name "Time Track"}),
              :name "Trapwords",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1020,
                                                 :name "Exploration"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1025,
                                                 :name "Word Game"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "257527",
              :languages (list "en"),
              :game/name "Trapwords",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/aU1dLvPuTgGY0NsFajD9HQ__thumb/img/LKC4wxSMYreK8hbG82sNjUFdDiY=/fit-in/200x150/filters:strip_icc()/pic4327157.jpg"},
             #uuid "8ae6e417-a5fe-36fa-9be3-bd2c6ac61840"
             {:game/id #uuid "8ae6e417-a5fe-36fa-9be3-bd2c6ac61840",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}),
              :name "Treasure Island",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1032,
                                                 :name
                                                 "Action / Dexterity"}
                    #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1093,
                                                 :name "Novel-based"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "7659",
              :languages (list "en"),
              :game/name "Treasure Island",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Ow6VaE8Yyn6A_70wvxwZUw__thumb/img/8K7_bIPxeL50ofJO6Gn2xvfG9jY=/fit-in/200x150/filters:strip_icc()/pic31268.jpg"},
             #uuid "08240ccd-42ce-3242-b2f3-7bf5b24420fe"
             {:game/id #uuid "08240ccd-42ce-3242-b2f3-7bf5b24420fe",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Treasure Lair",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "207845",
              :languages (list "en"),
              :game/name "Treasure Lair",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/09gxU5YptdssyaKGcOfRtA__thumb/img/BlVNNRs49cxrpu72Odq9qsXF-qM=/fit-in/200x150/filters:strip_icc()/pic3158785.jpg"},
             #uuid "40bd8e35-d86c-3ba3-8791-e33dad4f0330"
             {:languages (list "en"),
              :name "Treasures of the Carribean",
              :game/id #uuid "40bd8e35-d86c-3ba3-8791-e33dad4f0330",
              :game/name "Treasures of the Carribean"},
             #uuid "f4afb893-6f91-3389-8606-9c088ff6ea75"
             {:game/id #uuid "f4afb893-6f91-3389-8606-9c088ff6ea75",
              :com.boardgamegeek.boardgame/min-players 2,
              :name "Tricks and the Phantom",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "242325",
              :languages (list "de" "en" "fr" "it"),
              :game/name "Tricks and the Phantom",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/q8EjU4y-sCwxe50KG4BV3Q__thumb/img/3xXe3p2eSu2YJ-qmBVgV9FGKTZU=/fit-in/200x150/filters:strip_icc()/pic5797064.png"},
             #uuid "578002db-1bee-32a8-949c-58bece6429a5"
             {:languages (list "en"),
              :name "Triviador",
              :game/id #uuid "578002db-1bee-32a8-949c-58bece6429a5",
              :game/name "Triviador",
              :com.boardgamegeek.boardgame/id "135082",
              :com.boardgamegeek.boardgame/max-players 10,
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1027,
                                                 :name "Trivia"})},
             #uuid "51e8b349-68a5-36bd-84d2-d7b86bb0765b"
             {:game/id #uuid "51e8b349-68a5-36bd-84d2-d7b86bb0765b",
              :com.boardgamegeek.boardgame/min-players 4,
              :name "Trivial Pursuit",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1027,
                                                 :name "Trivia"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 99,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "253633",
              :languages (list "en"),
              :game/name "Trivial Pursuit X",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/wuSzCspUXnJi5WZMBrcnkg__thumb/img/aHCBnB71-uHP38KVVTdJ6Nsf7jY=/fit-in/200x150/filters:strip_icc()/pic4823899.jpg"},
             #uuid "64b81638-f97f-36d4-ad33-08e915a1750e"
             {:game/id #uuid "64b81638-f97f-36d4-ad33-08e915a1750e",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2048,
                                                 :name
                                                 "Pattern Building"}
                    #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}),
              :name "Troika",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}
                    #:com.boardgamegeek.category{:id 1045,
                                                 :name "Memory"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "102248",
              :languages (list "en"),
              :game/name "Troika",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/zqF9ipRqRz-KF1hEhoUhKw__thumb/img/Gi8zTIFzRnJbPYCNps1UAuT2zX0=/fit-in/200x150/filters:strip_icc()/pic1033038.jpg"},
             #uuid "aacb653d-e587-34a7-a360-4c3956b4f677"
             {:game/id #uuid "aacb653d-e587-34a7-a360-4c3956b4f677",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2081,
                                                 :name
                                                 "Network and Route Building"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}),
              :name "Tsuro",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "16992",
              :languages (list "en"),
              :game/name "Tsuro",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/2V3d4ryhxkS3RoPtDrvpUw__thumb/img/NWgNhoxUIF7Lmj1apRkZQhFL6NU=/fit-in/200x150/filters:strip_icc()/pic875761.jpg"},
             #uuid "c377afb2-e46b-30b6-968e-71cb449ac3ea"
             {:game/id #uuid "c377afb2-e46b-30b6-968e-71cb449ac3ea",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}),
              :name "Twist of Fate",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1094,
                                                 :name "Educational"}
                    #:com.boardgamegeek.category{:id 1093,
                                                 :name "Novel-based"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "198059",
              :languages (list "en"),
              :game/name "Twist of Fate",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/-FtKCFdQ89CDoGGg3NZTFA__thumb/img/V8ZkI6tf5sqIRp04swz1U6ewcQo=/fit-in/200x150/filters:strip_icc()/pic3281332.jpg"},
             #uuid "77926e55-5ca9-34b7-8f65-009dd92da63b"
             {:game/id #uuid "77926e55-5ca9-34b7-8f65-009dd92da63b",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}),
              :name "Two Crowns",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1035,
                                                 :name "Medieval"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "132145",
              :languages (list "en"),
              :game/name "Two Crowns",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/F_VS_xKZ31WMaKEUiro9iQ__thumb/img/VPGT_i_iHhQaZM_JjDT7Yvw7BIY=/fit-in/200x150/filters:strip_icc()/pic1750933.png"},
             #uuid "91934e02-f64d-3aab-9536-19f592307a91"
             {:game/id #uuid "91934e02-f64d-3aab-9536-19f592307a91",
              :com.boardgamegeek.boardgame/min-players 6,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2891,
                                                 :name "Hidden Roles"}
                    #:com.boardgamegeek.mechanic{:id 2028,
                                                 :name "Role Playing"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "The Two Khans",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 15,
              :com.boardgamegeek.boardgame/min-play-time 5,
              :com.boardgamegeek.boardgame/id "286892",
              :languages (list "en"),
              :game/name "Two Khans",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/rVFSyzpN-7Bfde8s2yLCWA__thumb/img/IZKAVuDzTdU9eOl7CWxiugP6pSE=/fit-in/200x150/filters:strip_icc()/pic4942004.jpg"},
             #uuid "bbf3c83b-9b9a-3dfd-9cc3-d3295f5d235f"
             {:languages (list "cz"),
              :name "T’zolkin",
              :game/id #uuid "bbf3c83b-9b9a-3dfd-9cc3-d3295f5d235f",
              :game/name "T’zolkin"},
             #uuid "7416a104-a4b4-3c68-895e-98e989dce7de"
             {:game/id #uuid "7416a104-a4b4-3c68-895e-98e989dce7de",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2009,
                                                 :name
                                                 "Trick-taking"}),
              :name "Ugo",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1013,
                                                 :name "Farming"}),
              :com.boardgamegeek.boardgame/max-play-time 40,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 40,
              :com.boardgamegeek.boardgame/id "139326",
              :game/name "UGO!",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/vLlpTJzPbWSTO1p8v65VQQ__thumb/img/NyZCUFG4ITVIHFaWrcdNsOi3fww=/fit-in/200x150/filters:strip_icc()/pic1823140.png"},
             #uuid "59f822bc-aa8e-319b-9e63-eb00919b367a"
             {:game/id #uuid "59f822bc-aa8e-319b-9e63-eb00919b367a",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2836,
                                                 :name "Lose a Turn"}
                    #:com.boardgamegeek.mechanic{:id 3007,
                                                 :name "Matching"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}),
              :name "Uno",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1116,
                                                 :name
                                                 "Comic Book / Strip"}
                    #:com.boardgamegeek.category{:id 1064,
                                                 :name
                                                 "Movies / TV / Radio theme"}
                    #:com.boardgamegeek.category{:id 1098,
                                                 :name "Number"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 10,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "2223",
              :languages (list "en"),
              :game/name "UNO",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/SU-OL7XWn7BOiSYevyTThw__thumb/img/5dxRomuxNxzw01ZYNnIK-f_Ai4o=/fit-in/200x150/filters:strip_icc()/pic981505.jpg"},
             #uuid "63e5002f-f8a6-36bd-81b5-2f817477eecf"
             {:game/id #uuid "63e5002f-f8a6-36bd-81b5-2f817477eecf",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2978,
                                                 :name "Grid Coverage"}
                    #:com.boardgamegeek.mechanic{:id 2048,
                                                 :name
                                                 "Pattern Building"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Ubongo",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1028,
                                                 :name "Puzzle"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}),
              :com.boardgamegeek.boardgame/max-play-time 25,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 25,
              :com.boardgamegeek.boardgame/id "16986",
              :languages (list "cz"),
              :game/name "Ubongo",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/0wSuQbmk4nPwNytp9_zzPw__thumb/img/2_damZx35g1mE8kgWUpIXoHybW8=/fit-in/200x150/filters:strip_icc()/pic4597123.jpg"},
             #uuid "9b45f563-8b03-34d4-9d30-5134ab5e657e"
             {:game/id #uuid "9b45f563-8b03-34d4-9d30-5134ab5e657e",
              :com.boardgamegeek.boardgame/min-players 1,
              :name "Ubongo trigo",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1028,
                                                 :name "Puzzle"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "118553",
              :game/name "Ubongo Trigo",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/9_zB31vH27jNJJ1mSN9u4Q__thumb/img/7tsV5bv_FDMvRBUuAQvn6mR119k=/fit-in/200x150/filters:strip_icc()/pic1210953.jpg"},
             #uuid "7c823c08-2b3e-3613-bf68-fde60227450d"
             {:game/id #uuid "7c823c08-2b3e-3613-bf68-fde60227450d",
              :com.boardgamegeek.boardgame/min-players 5,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2891,
                                                 :name "Hidden Roles"}
                    #:com.boardgamegeek.mechanic{:id 2028,
                                                 :name "Role Playing"}
                    #:com.boardgamegeek.mechanic{:id 2027,
                                                 :name "Storytelling"}
                    #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}
                    #:com.boardgamegeek.mechanic{:id 2814,
                                                 :name "Traitor Game"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}
                    #:com.boardgamegeek.mechanic{:id 2017,
                                                 :name "Voting"}),
              :name "Ultimate werewolf",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1024,
                                                 :name "Horror"}
                    #:com.boardgamegeek.category{:id 1040,
                                                 :name
                                                 "Murder/Mystery"}
                    #:com.boardgamegeek.category{:id 1026,
                                                 :name "Negotiation"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 30,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "152241",
              :languages (list "en"),
              :game/name "Ultimate Werewolf",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/pbX50vKkFCUBsK8DolVq_w__thumb/img/Q-glOUzREfIQkbMyLE70qmf3R9Q=/fit-in/200x150/filters:strip_icc()/pic1878507.png"},
             #uuid "074edbaf-ed58-3f43-ad67-8af6ba4fcefe"
             {:game/id #uuid "074edbaf-ed58-3f43-ad67-8af6ba4fcefe",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2664,
                                                 :name
                                                 "Deck, Bag, and Pool Building"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2011,
                                                 :name "Modular Board"}
                    #:com.boardgamegeek.mechanic{:id 2070,
                                                 :name "Simulation"}),
              :name "Undaunted Normandy",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1019,
                                                 :name "Wargame"}
                    #:com.boardgamegeek.category{:id 1049,
                                                 :name
                                                 "World War II"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "268864",
              :languages (list "en"),
              :game/name "Undaunted: Normandy",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/iCd6hMGDzsQ_UXh00iKsJA__thumb/img/QbOlBm7DZGP2ZBnGZ-YaD-py-UQ=/fit-in/200x150/filters:strip_icc()/pic4602347.jpg"},
             #uuid "7e7123b0-d269-3d5d-9ec8-d12c52a8ed8a"
             {:languages (list "cz"),
              :name "Unlock",
              :game/id #uuid "7e7123b0-d269-3d5d-9ec8-d12c52a8ed8a",
              :game/name "Unlock"},
             #uuid "bc6235a4-d8ed-3225-86d0-ce30fcb2da6a"
             {:game/id #uuid "bc6235a4-d8ed-3225-86d0-ce30fcb2da6a",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}
                    #:com.boardgamegeek.mechanic{:id 2822,
                                                 :name
                                                 "Scenario / Mission / Campaign Game"}
                    #:com.boardgamegeek.mechanic{:id 2027,
                                                 :name
                                                 "Storytelling"}),
              :name "Unlock! Escape Adventures",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1020,
                                                 :name "Exploration"}
                    #:com.boardgamegeek.category{:id 1028,
                                                 :name "Puzzle"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}),
              :com.boardgamegeek.boardgame/max-play-time 75,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "213460",
              :languages (list "cz"),
              :game/name "Unlock!: Escape Adventures",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/h8K_nTemD6bmydT0akChZw__thumb/img/nKF4nF8Ml5q0E0CYo7qo3Ax_gcE=/fit-in/200x150/filters:strip_icc()/pic3348790.jpg"},
             #uuid "7a51eb3c-d160-3393-b631-9ae87020b9db"
             {:game/id #uuid "7a51eb3c-d160-3393-b631-9ae87020b9db",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}),
              :name "Unstable Unicorns",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1079,
                                                 :name "Humor"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "234190",
              :languages (list "en"),
              :game/name "Unstable Unicorns",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/8_5xvpsrrX5JVzO7eBLSgw__thumb/img/fV4UWCHC1ImGFUN7lcJju9K8_zo=/fit-in/200x150/filters:strip_icc()/pic3912914.jpg"},
             #uuid "6b8723ed-8ce2-3285-963d-9682f60b0287"
             {:game/id #uuid "6b8723ed-8ce2-3285-963d-9682f60b0287",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2001,
                                                 :name "Action Points"}
                    #:com.boardgamegeek.mechanic{:id 2676,
                                                 :name "Grid Movement"}
                    #:com.boardgamegeek.mechanic{:id 2011,
                                                 :name "Modular Board"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}),
              :name "Upstream",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1084,
                                                 :name "Environmental"}
                    #:com.boardgamegeek.category{:id 1031,
                                                 :name "Racing"}),
              :com.boardgamegeek.boardgame/max-play-time 40,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 25,
              :com.boardgamegeek.boardgame/id "209567",
              :languages (list "en"),
              :game/name "Upstream",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Iv_eFbNzMuROy275e2X2pw__thumb/img/9hx4WYZfrvM_EFxaYL2oVpJEBuU=/fit-in/200x150/filters:strip_icc()/pic3674313.png"},
             #uuid "d3c432b4-bac7-3974-8e6c-60ce1f8b528f"
             {:game/id #uuid "d3c432b4-bac7-3974-8e6c-60ce1f8b528f",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2664,
                                                 :name
                                                 "Deck, Bag, and Pool Building"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2819,
                                                 :name
                                                 "Solo / Solitaire Game"}),
              :name "Valley of the Kings Afterlife",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1050,
                                                 :name "Ancient"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1082,
                                                 :name "Mythology"}
                    #:com.boardgamegeek.category{:id 1115,
                                                 :name "Religious"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "175223",
              :game/name "Valley of the Kings: Afterlife",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/PqoEulSFarx64L6EYMn-qg__thumb/img/cA12z4bxPWLRHGcZ8FduT8kcLGE=/fit-in/200x150/filters:strip_icc()/pic2456554.jpg"},
             #uuid "14d13fd2-bd65-3d26-a969-71f5cec92764"
             {:game/id #uuid "14d13fd2-bd65-3d26-a969-71f5cec92764",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2920,
                                                 :name
                                                 "Auction: Sealed Bid"}
                    #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}),
              :name "Panovnik",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1029,
                                                 :name "City Building"}
                    #:com.boardgamegeek.category{:id 1015,
                                                 :name "Civilization"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1026,
                                                 :name "Negotiation"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "157526",
              :languages (list "viceroy"),
              :game/name "Viceroy",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/24x3IUxdpizAPxXPOJsypQ__thumb/img/XFKd1GrAgke9M5wwDilZvyGBfDk=/fit-in/200x150/filters:strip_icc()/pic2254354.jpg"},
             #uuid "5c50d320-55f3-337f-b820-3e559968a3f1"
             {:name "Vikings on boards",
              :game/id #uuid "5c50d320-55f3-337f-b820-3e559968a3f1",
              :game/name "Vikings on boards"},
             #uuid "fd6267f8-71dc-3dc3-9ad9-e13b844fed44"
             {:name "Village inn",
              :game/id #uuid "fd6267f8-71dc-3dc3-9ad9-e13b844fed44",
              :game/name "Village inn",
              :com.boardgamegeek.boardgame/id "136223"},
             #uuid "29b3ea31-ed18-3383-b4af-bfe1002404ae"
             {:name "Wakanada",
              :game/id #uuid "29b3ea31-ed18-3383-b4af-bfe1002404ae",
              :game/name "Wakanada"},
             #uuid "6ad0df6a-ac90-3fc1-a6fc-cdd155147a92"
             {:game/id #uuid "6ad0df6a-ac90-3fc1-a6fc-cdd155147a92",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2043,
                                                 :name "Enclosure"}
                    #:com.boardgamegeek.mechanic{:id 2011,
                                                 :name
                                                 "Modular Board"}),
              :name "Walls of York",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1029,
                                                 :name "City Building"}
                    #:com.boardgamegeek.category{:id 1035,
                                                 :name "Medieval"}
                    #:com.boardgamegeek.category{:id 1028,
                                                 :name "Puzzle"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "247980",
              :languages (list "en"),
              :game/name "Walls of York",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/-mGHT2rgFu4dFezodM38kA__thumb/img/x9TBZ5dZiiPi7q2RfgxOFHipG4c=/fit-in/200x150/filters:strip_icc()/pic4223058.png"},
             #uuid "47dbc903-625e-337e-b249-2dbf0b1b9527"
             {:languages (list "en"),
              :name "Wanna Bet Family challenge",
              :game/id #uuid "47dbc903-625e-337e-b249-2dbf0b1b9527",
              :game/name "Wanna Bet Family challenge"},
             #uuid "9cfc3b97-43a7-3c0f-a7c6-2b42b62c90f6"
             {:game/id #uuid "9cfc3b97-43a7-3c0f-a7c6-2b42b62c90f6",
              :com.boardgamegeek.boardgame/min-players 4,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2012,
                                                 :name
                                                 "Auction/Bidding"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}
                    #:com.boardgamegeek.mechanic{:id 2017,
                                                 :name "Voting"}),
              :name "We’re Doomed",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1015,
                                                 :name "Civilization"}
                    #:com.boardgamegeek.category{:id 1026,
                                                 :name "Negotiation"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 10,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "264806",
              :languages (list "en"),
              :game/name "We're Doomed!",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/NCcmCG2X-ssnAA5kyR386g__thumb/img/vaYBsf0wCFaEhjX-cIwpc1vRHUc=/fit-in/200x150/filters:strip_icc()/pic4420866.jpg"},
             #uuid "32288419-57f9-3b53-a2df-4b3393930c5a"
             {:game/id #uuid "32288419-57f9-3b53-a2df-4b3393930c5a",
              :com.boardgamegeek.boardgame/min-players 2,
              :name "Weird things humans search for",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1027,
                                                 :name "Trivia"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 20,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "254419",
              :languages (list "en"),
              :game/name "Weird Things Humans Search For",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/3UUUkiZx5wMr_W9ZmnA1Kg__thumb/img/WQI8ETMLMY6IqZaovZdxE1N04RY=/fit-in/200x150/filters:strip_icc()/pic4206940.jpg"},
             #uuid "44ca4f9f-417c-3200-b21f-4ae33fae9646"
             {:game/id #uuid "44ca4f9f-417c-3200-b21f-4ae33fae9646",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2685,
                                                 :name
                                                 "Player Elimination"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}),
              :name "Vzhuru zpátky do Podzemí",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "195043",
              :languages (list "cz"),
              :game/name "Welcome Back to the Dungeon",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Tu5hFjeX1-5EwnwjdNTaHg__thumb/img/y8At3p87JcNiUuHTiRIKgUvKOks=/fit-in/200x150/filters:strip_icc()/pic3060124.jpg"},
             #uuid "2d7c2d23-5fac-3ff4-8aac-33c2ce47eb1c"
             {:game/id #uuid "2d7c2d23-5fac-3ff4-8aac-33c2ce47eb1c",
              :com.boardgamegeek.boardgame/min-players 4,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2891,
                                                 :name "Hidden Roles"}
                    #:com.boardgamegeek.mechanic{:id 2892,
                                                 :name
                                                 "Roles with Asymmetric Information"}
                    #:com.boardgamegeek.mechanic{:id 2814,
                                                 :name "Traitor Game"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}
                    #:com.boardgamegeek.mechanic{:id 2017,
                                                 :name "Voting"}),
              :name "Werewords",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}
                    #:com.boardgamegeek.category{:id 1025,
                                                 :name "Word Game"}),
              :com.boardgamegeek.boardgame/max-play-time 10,
              :com.boardgamegeek.boardgame/max-players 10,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "219215",
              :languages (list "en"),
              :game/name "Werewords",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/4ngyBZXLLKIOdGuUHE7baw__thumb/img/gSGfC0ZMYbOXukqfdBBuxULmyJU=/fit-in/200x150/filters:strip_icc()/pic4415135.jpg"},
             #uuid "ae7bda5b-fa73-3e1b-b30b-c81fd70b93f5"
             {:game/id #uuid "ae7bda5b-fa73-3e1b-b30b-c81fd70b93f5",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2001,
                                                 :name "Action Points"}
                    #:com.boardgamegeek.mechanic{:id 2046,
                                                 :name "Area Movement"}
                    #:com.boardgamegeek.mechanic{:id 2014,
                                                 :name
                                                 "Betting and Bluffing"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2875,
                                                 :name
                                                 "End Game Bonuses"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2007,
                                                 :name
                                                 "Pick-up and Deliver"}
                    #:com.boardgamegeek.mechanic{:id 2686,
                                                 :name "Take That"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Legendy Západu",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1022,
                                                 :name "Adventure"}
                    #:com.boardgamegeek.category{:id 1055,
                                                 :name
                                                 "American West"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "232405",
              :languages (list "cz"),
              :game/name "Western Legends",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/_FnP28QChh-8uFh6ZvpJhA__thumb/img/iq5peG7h6fe8_-nY_MJkG3QrYCg=/fit-in/200x150/filters:strip_icc()/pic3837503.jpg"},
             #uuid "97fc6923-396a-3ad8-8a4c-70879893f4b7"
             {:game/id #uuid "97fc6923-396a-3ad8-8a4c-70879893f4b7",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name
                                                 "Card Drafting"}),
              :name "Whales Destroying the World",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "256502",
              :languages (list "cz" "en"),
              :game/name "Whales Destroying The World",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/nwk8uhs8nuGghB5WtVfZ0w__thumb/img/cMCkbF_ICrXxKKJBZpcUNb9lzM0=/fit-in/200x150/filters:strip_icc()/pic4276568.jpg"},
             #uuid "3f9e8eb6-bc1b-357a-949e-643f14a3cedf"
             {:game/id #uuid "3f9e8eb6-bc1b-357a-949e-643f14a3cedf",
              :com.boardgamegeek.boardgame/min-players 2,
              :name "What came first",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "283363",
              :languages (list "en"),
              :game/name "What Came First?",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/5bY5HlOzIwyI5SPW1b3JdQ__thumb/img/-oP4DslYzNnxLB48R4snu-WOfeg=/fit-in/200x150/filters:strip_icc()/pic4820669.png"},
             #uuid "ec9a79c1-8253-3d39-9f07-8382ba20e59f"
             {:game/id #uuid "ec9a79c1-8253-3d39-9f07-8382ba20e59f",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2014,
                                                 :name
                                                 "Betting and Bluffing"}),
              :name "What do you meme",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 90,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 90,
              :com.boardgamegeek.boardgame/id "132203",
              :languages (list "en"),
              :game/name "What Do You Meme?",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/11n5l5NwDkUB40QPlw2yIg__thumb/img/-8i8V-TI5HEsYxRvQ7HVNvg7R1g=/fit-in/200x150/filters:strip_icc()/pic4729721.png"},
             #uuid "97fe9a27-6b0c-3281-8d07-433af5bcf4e4"
             {:game/id #uuid "97fe9a27-6b0c-3281-8d07-433af5bcf4e4",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2047,
                                                 :name "Memory"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "What’s Up",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1039,
                                                 :name "Deduction"}
                    #:com.boardgamegeek.category{:id 1045,
                                                 :name "Memory"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 10,
              :com.boardgamegeek.boardgame/id "201054",
              :game/name "What's Up",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/lpKc9CfkSyF5qyNfWG8XrA__thumb/img/SsUJzqPEJQ4Lx0K1d7G7o-D1uEQ=/fit-in/200x150/filters:strip_icc()/pic3042240.jpg"},
             #uuid "c2ea7289-9af9-3d4e-8061-55ca7bf82b6b"
             {:game/id #uuid "c2ea7289-9af9-3d4e-8061-55ca7bf82b6b",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2019,
                                                 :name
                                                 "Team-Based Game"}),
              :name "Say What?",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-players 10,
              :com.boardgamegeek.boardgame/id "232658",
              :languages (list "en"),
              :game/name "Whatcha Say"},
             #uuid "e214a1ce-1929-3835-b502-4510ef89f940"
             {:languages (list "en"),
              :name "Who’s the traitor",
              :game/id #uuid "e214a1ce-1929-3835-b502-4510ef89f940",
              :game/name "Who’s the traitor"},
             #uuid "abe58998-3062-3866-9238-314af7ba0265"
             {:game/id #uuid "abe58998-3062-3866-9238-314af7ba0265",
              :com.boardgamegeek.boardgame/min-players 4,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2012,
                                                 :name
                                                 "Auction/Bidding"}),
              :name "Wild Fun West",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1055,
                                                 :name "American West"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1026,
                                                 :name "Negotiation"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "120781",
              :game/name "Wild Fun West",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/SBTjRWG6lNHkHULIT13AKA__thumb/img/BJy5bJ4IBj3K0tobl3pIMLWijbo=/fit-in/200x150/filters:strip_icc()/pic1391887.png"},
             #uuid "6fe16b2e-cfb7-3be8-8013-6c163b70120b"
             {:game/id #uuid "6fe16b2e-cfb7-3be8-8013-6c163b70120b",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2001,
                                                 :name "Action Points"}
                    #:com.boardgamegeek.mechanic{:id 2046,
                                                 :name "Area Movement"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2011,
                                                 :name
                                                 "Modular Board"}),
              :name "Wilderness",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1022,
                                                 :name "Adventure"}
                    #:com.boardgamegeek.category{:id 1020,
                                                 :name "Exploration"}
                    #:com.boardgamegeek.category{:id 1031,
                                                 :name "Racing"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 8,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "108637",
              :game/name "Wilderness",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/Ucbjn6fKAxqI43Ba_Yl9_w__thumb/img/dtOnPBhmW9j-UkAFCRkoXjAdchk=/fit-in/200x150/filters:strip_icc()/pic1097184.jpg"},
             #uuid "e5f11979-9a30-30ec-8084-92dd584b1214"
             {:game/id #uuid "e5f11979-9a30-30ec-8084-92dd584b1214",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2984,
                                                 :name "Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2875,
                                                 :name
                                                 "End Game Bonuses"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2819,
                                                 :name
                                                 "Solo / Solitaire Game"}),
              :name "Na Křídlech",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1094,
                                                 :name "Educational"}),
              :com.boardgamegeek.boardgame/max-play-time 70,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 40,
              :com.boardgamegeek.boardgame/id "266192",
              :languages (list "cz"),
              :game/name "Wingspan",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/yLZJCVLlIx4c7eJEWUNJ7w__thumb/img/VNToqgS2-pOGU6MuvIkMPKn_y-s=/fit-in/200x150/filters:strip_icc()/pic4458123.jpg"},
             #uuid "19adc592-fdfe-37ba-81a5-d195098fc52d"
             {:game/id #uuid "19adc592-fdfe-37ba-81a5-d195098fc52d",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2014,
                                                 :name
                                                 "Betting and Bluffing"}
                    #:com.boardgamegeek.mechanic{:id 2055,
                                                 :name
                                                 "Paper-and-Pencil"}),
              :name "Wits and Wagers",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1027,
                                                 :name "Trivia"}),
              :com.boardgamegeek.boardgame/max-play-time 25,
              :com.boardgamegeek.boardgame/max-players 7,
              :com.boardgamegeek.boardgame/min-play-time 25,
              :com.boardgamegeek.boardgame/id "20100",
              :languages (list "en"),
              :game/name "Wits & Wagers",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/TxojLHTFHfBOBAk9MQSyLg__thumb/img/J-7XIZYzAorUyzewzFgRqFK7vhk=/fit-in/200x150/filters:strip_icc()/pic2558555.jpg"},
             #uuid "02b25657-6abc-3080-8fb9-16100cb17ad5"
             {:game/id #uuid "02b25657-6abc-3080-8fb9-16100cb17ad5",
              :com.boardgamegeek.boardgame/min-players 3,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2014,
                                                 :name
                                                 "Betting and Bluffing"}
                    #:com.boardgamegeek.mechanic{:id 2055,
                                                 :name
                                                 "Paper-and-Pencil"}),
              :name "Wits and wagers family",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1041,
                                                 :name
                                                 "Children's Game"}
                    #:com.boardgamegeek.category{:id 1094,
                                                 :name "Educational"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1027,
                                                 :name "Trivia"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 10,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "66588",
              :languages (list "en"),
              :game/name "Wits & Wagers Family",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/ScQODaP8QC5mXrRn8qTHOg__thumb/img/_l_W7kLA12ioz0QcaxceZnNHJ1A=/fit-in/200x150/filters:strip_icc()/pic664569.jpg"},
             #uuid "0a4d7b38-fbbc-3f6c-88fe-b09fc35ad1a6"
             {:game/id #uuid "0a4d7b38-fbbc-3f6c-88fe-b09fc35ad1a6",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2060,
                                                 :name
                                                 "Pattern Recognition"}),
              :name "WordQuest",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1009,
                                                 :name
                                                 "Abstract Strategy"}
                    #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}
                    #:com.boardgamegeek.category{:id 1025,
                                                 :name "Word Game"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "39180",
              :game/name "Wordquest",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/UtoR2r81kOMWDZ0xGrSfAA__thumb/img/BRfR57UmJzTqxcN-4-kGN9Qu-qg=/fit-in/200x150/filters:strip_icc()/pic622198.jpg"},
             #uuid "161dfda2-bf83-3041-ae10-e2410340abd1"
             {:game/id #uuid "161dfda2-bf83-3041-ae10-e2410340abd1",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2055,
                                                 :name
                                                 "Paper-and-Pencil"}
                    #:com.boardgamegeek.mechanic{:id 2831,
                                                 :name "Real-Time"}
                    #:com.boardgamegeek.mechanic{:id 2819,
                                                 :name
                                                 "Solo / Solitaire Game"}),
              :name "Wordsy",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1037,
                                                 :name "Real-time"}
                    #:com.boardgamegeek.category{:id 1025,
                                                 :name "Word Game"}),
              :com.boardgamegeek.boardgame/max-play-time 20,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "208480",
              :languages (list "en"),
              :game/name "Wordsy",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/uryuyu59_aycdrCXs8I2Tg__thumb/img/1ow1EXgujmByLH69pW1spzfitIc=/fit-in/200x150/filters:strip_icc()/pic3223277.jpg"},
             #uuid "3463c066-922f-3864-93bd-b87bb1286679"
             {:game/id #uuid "3463c066-922f-3864-93bd-b87bb1286679",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}),
              :name "Wurfel Bohnanza",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}
                    #:com.boardgamegeek.category{:id 1013,
                                                 :name "Farming"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "111148",
              :languages (list "de"),
              :game/name "Würfel Bohnanza",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/iirbnwkZ755tRj69Q-uWHw__thumb/img/_aACxitODyWc7h1cAKG_c8w9Cjo=/fit-in/200x150/filters:strip_icc()/pic1197852.jpg"},
             #uuid "d993f311-557a-391d-ab21-677ab586a01b"
             {:game/id #uuid "d993f311-557a-391d-ab21-677ab586a01b",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2041,
                                                 :name "Card Drafting"}
                    #:com.boardgamegeek.mechanic{:id 2664,
                                                 :name
                                                 "Deck, Bag, and Pool Building"}
                    #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}),
              :name "Xenon Profiteer",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1021,
                                                 :name "Economic"}
                    #:com.boardgamegeek.category{:id 1088,
                                                 :name
                                                 "Industry / Manufacturing"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 4,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "176530",
              :languages (list "en"),
              :game/name "Xenon Profiteer",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/ZYukAQrKxJTosyVYmm98aw__thumb/img/BIsI2thXlVPfY30qfyftZCsNnY0=/fit-in/200x150/filters:strip_icc()/pic2537665.jpg"},
             #uuid "d46d3296-6569-3615-8e1d-5ac2e88a346a"
             {:game/id #uuid "d46d3296-6569-3615-8e1d-5ac2e88a346a",
              :com.boardgamegeek.boardgame/min-players 2,
              :name "Jak jako jak",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}
                    #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}),
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/id "177437",
              :languages (list "cz"),
              :game/name "YAK",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/6W8_WuKJa3vvIFC2Cg-sPQ__thumb/img/Vk4oKKMkyLpynj5YR22lc5Sfx9E=/fit-in/200x150/filters:strip_icc()/pic2385066.jpg"},
             #uuid "191e854e-b00d-3d80-8fa1-fed83b373be7"
             {:game/id #uuid "191e854e-b00d-3d80-8fa1-fed83b373be7",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2035,
                                                 :name
                                                 "Roll / Spin and Move"}),
              :name "Yak",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "21877",
              :game/name "Yak",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/HzHXfWLxdZhAV1OVkWG7pA__thumb/img/tUZvD8FZq4STp8HXkjz509ngCtY=/fit-in/200x150/filters:strip_icc()/pic218963.jpg"},
             #uuid "9cb073d5-2081-32d7-9991-a6077288e01e"
             {:game/id #uuid "9cb073d5-2081-32d7-9991-a6077288e01e",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2661,
                                                 :name
                                                 "Push Your Luck"}),
              :name "Yeti",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1022,
                                                 :name "Adventure"}
                    #:com.boardgamegeek.category{:id 1017,
                                                 :name "Dice"}),
              :com.boardgamegeek.boardgame/max-play-time 40,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 20,
              :com.boardgamegeek.boardgame/id "189294",
              :game/name "Yeti",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/H7gM0ltr7zeYJjwiQiJMEA__thumb/img/EUMiXkxa6LeNKD9UEpdgJGM0kPo=/fit-in/200x150/filters:strip_icc()/pic2817129.jpg"},
             #uuid "36749cc5-01bd-3292-aaaf-44525fc6ed7b"
             {:game/id #uuid "36749cc5-01bd-3292-aaaf-44525fc6ed7b",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2040,
                                                 :name
                                                 "Hand Management"}
                    #:com.boardgamegeek.mechanic{:id 2003,
                                                 :name
                                                 "Rock-Paper-Scissors"}
                    #:com.boardgamegeek.mechanic{:id 2020,
                                                 :name
                                                 "Simultaneous Action Selection"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Yomi",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1023,
                                                 :name "Bluffing"}
                    #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}
                    #:com.boardgamegeek.category{:id 1101,
                                                 :name
                                                 "Video Game Theme"}),
              :com.boardgamegeek.boardgame/max-play-time 30,
              :com.boardgamegeek.boardgame/max-players 2,
              :com.boardgamegeek.boardgame/min-play-time 30,
              :com.boardgamegeek.boardgame/id "43022",
              :game/name "Yomi",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/NGxZknC3YvP4Xjn6ro38tQ__thumb/img/0jN0d9qt3YM2DN9MnG1-v6qI2VM=/fit-in/200x150/filters:strip_icc()/pic885442.jpg"},
             #uuid "05ae57bb-e135-3a41-87f7-2bc52f18bff4"
             {:game/id #uuid "05ae57bb-e135-3a41-87f7-2bc52f18bff4",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2886,
                                                 :name
                                                 "King of the Hill"}),
              :name "Zeus na Uteku",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1104,
                                                 :name "Math"}
                    #:com.boardgamegeek.category{:id 1082,
                                                 :name "Mythology"}
                    #:com.boardgamegeek.category{:id 1098,
                                                 :name "Number"}),
              :com.boardgamegeek.boardgame/max-play-time 15,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 15,
              :com.boardgamegeek.boardgame/id "22864",
              :languages (list "cz"),
              :game/name "Zeus on the Loose",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/t_7YMa7eh46paqvyi9616Q__thumb/img/dQIaPTQ-_Yjf7z_ahIHy2O8H4CU=/fit-in/200x150/filters:strip_icc()/pic191011.jpg"},
             #uuid "0b0ba83c-ba8f-3c56-8b3e-a2fc3bc7f5a4"
             {:game/id #uuid "0b0ba83c-ba8f-3c56-8b3e-a2fc3bc7f5a4",
              :com.boardgamegeek.boardgame/min-players 1,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2023,
                                                 :name
                                                 "Cooperative Game"}
                    #:com.boardgamegeek.mechanic{:id 2072,
                                                 :name "Dice Rolling"}
                    #:com.boardgamegeek.mechanic{:id 2011,
                                                 :name "Modular Board"}
                    #:com.boardgamegeek.mechanic{:id 2822,
                                                 :name
                                                 "Scenario / Mission / Campaign Game"}
                    #:com.boardgamegeek.mechanic{:id 2828,
                                                 :name
                                                 "Turn Order: Progressive"}
                    #:com.boardgamegeek.mechanic{:id 2015,
                                                 :name
                                                 "Variable Player Powers"}),
              :name "Zombicide Cerny mor",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1022,
                                                 :name "Adventure"}
                    #:com.boardgamegeek.category{:id 1010,
                                                 :name "Fantasy"}
                    #:com.boardgamegeek.category{:id 1046,
                                                 :name "Fighting"}
                    #:com.boardgamegeek.category{:id 1024,
                                                 :name "Horror"}
                    #:com.boardgamegeek.category{:id 1035,
                                                 :name "Medieval"}
                    #:com.boardgamegeek.category{:id 1047,
                                                 :name "Miniatures"}
                    #:com.boardgamegeek.category{:id 2481,
                                                 :name "Zombies"}),
              :com.boardgamegeek.boardgame/max-play-time 180,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "176189",
              :languages (list "cz"),
              :game/name "Zombicide: Black Plague",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/kVHuMBxmathfnq42XINBQg__thumb/img/u5Fuj4SwZhXElCO3VmrNKkAeXX4=/fit-in/200x150/filters:strip_icc()/pic2482309.jpg"},
             #uuid "30fe5e0d-e895-3a87-87df-7cdfbdd1f7ab"
             {:game/id #uuid "30fe5e0d-e895-3a87-87df-7cdfbdd1f7ab",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2004,
                                                 :name
                                                 "Set Collection"}
                    #:com.boardgamegeek.mechanic{:id 2002,
                                                 :name
                                                 "Tile Placement"}),
              :name "Zooloretto",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1089,
                                                 :name "Animals"}),
              :com.boardgamegeek.boardgame/max-play-time 45,
              :com.boardgamegeek.boardgame/max-players 5,
              :com.boardgamegeek.boardgame/min-play-time 45,
              :com.boardgamegeek.boardgame/id "27588",
              :languages (list "cz" "de" "en"),
              :game/name "Zooloretto",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/FF_R0HV6APUKh0IW2w6oqw__thumb/img/GH0Q1trIy2CUCkixCe-b6UpjJoY=/fit-in/200x150/filters:strip_icc()/pic2021685.png"},
             #uuid "fab76503-1b94-3d49-8b17-1336fababeec"
             {:languages (list "cz"),
              :name "Zámky",
              :game/id #uuid "fab76503-1b94-3d49-8b17-1336fababeec",
              :game/name "Zámky"},
             #uuid "7369ff3a-fe64-30e3-8363-9067a97ac8b4"
             {:game/id #uuid "7369ff3a-fe64-30e3-8363-9067a97ac8b4",
              :com.boardgamegeek.boardgame/min-players 2,
              :com.boardgamegeek.boardgame/mechanics
              (list #:com.boardgamegeek.mechanic{:id 2014,
                                                 :name
                                                 "Betting and Bluffing"}),
              :name "iKnow",
              :com.boardgamegeek.boardgame/categories
              (list #:com.boardgamegeek.category{:id 1002,
                                                 :name "Card Game"}
                    #:com.boardgamegeek.category{:id 1030,
                                                 :name "Party Game"}
                    #:com.boardgamegeek.category{:id 1027,
                                                 :name "Trivia"}),
              :com.boardgamegeek.boardgame/max-play-time 60,
              :com.boardgamegeek.boardgame/max-players 6,
              :com.boardgamegeek.boardgame/min-play-time 60,
              :com.boardgamegeek.boardgame/id "130680",
              :languages (list "cz"),
              :game/name "iKNOW",
              :com.boardgamegeek.boardgame/thumbnail
              "https://cf.geekdo-images.com/GDCDK9ZaD4AfTYf8FWoVaA__thumb/img/Vd7027iCx6W0QfvuB36TTAmVxcs=/fit-in/200x150/filters:strip_icc()/pic5885668.jpg"}},
            :sorting
            {:game/name
             [#uuid "49b5473d-32f5-382b-943a-dda4a1491daf"
              #uuid "4a3e0096-1a08-379c-b4f9-1ca0070ea2f5"
              #uuid "64581d49-5b7a-3952-b129-c64b56c406ed"
              #uuid "4080e14f-b40a-3b33-98cf-83612aaecf76"
              #uuid "00dbe22a-358d-364c-aa3e-6da841b451dc"
              #uuid "f8283731-6cf2-3086-8140-494037314bf5"
              #uuid "780cd613-d706-3945-8ef3-6d59c16c2312"
              #uuid "993ca650-a85e-3e69-b8f7-eaa4809c4862"
              #uuid "d496a066-c36e-3570-99d1-9eedec118dee"
              #uuid "abe1a4aa-bcd0-3440-8bb5-a57f0dcc37ac"
              #uuid "d82b1470-bb05-3f45-86cb-1e51d8455a3d"
              #uuid "af0c5e41-309d-3a83-afb7-76f7378381b2"
              #uuid "effdb9ce-6c5d-34df-b1b8-9d7069c8e0fb"
              #uuid "110f4e5f-593e-3ca2-819e-29dab8ad6f55"
              #uuid "46abbae9-5fbc-3520-9ed2-16c2901bdbae"
              #uuid "01c751b5-3d59-3358-a6e3-3ab7ddceb42f"
              #uuid "0746ccba-be89-3d2f-a4b6-af590e489ff0"
              #uuid "cbed48f7-5fef-3645-9ebc-db33807e504c"
              #uuid "e3a13cf1-2d4f-3a6a-9791-62315cf53ba2"
              #uuid "ac19727b-672c-352f-b393-c52a81b055cb"
              #uuid "109a021a-56f4-3223-ae04-902a1f40db16"
              #uuid "492b7750-c3e8-3055-a93b-6745391300a6"
              #uuid "28e54304-62fc-38c9-9b76-058878323d57"
              #uuid "7ca15329-76d2-3582-a841-424d17ec0f0b"
              #uuid "a408c9e7-3639-3621-b65f-1f8aeea37b18"
              #uuid "edbf5fa9-4b8b-3458-ace1-fe46640503a1"
              #uuid "7d9e8262-8714-332c-9ca9-ac68c68596b5"
              #uuid "358a9cb1-8677-3a1b-90ac-1c8d6ffa6288"
              #uuid "da7d7bb0-2a43-3cd7-8ea7-21c4eb8ae388"
              #uuid "79a39a92-dda9-376e-b337-e86bdbbc3864"
              #uuid "6d8aa71d-1531-3019-ac35-ea2463485268"
              #uuid "582d2648-b634-3370-a31e-bef979dab3f3"
              #uuid "2e89598e-c81e-39d5-bae2-aee451063265"
              #uuid "bb8434ca-528e-3b5f-bfc5-5eebbe2c00a0"
              #uuid "526e6774-4f0b-3073-9ec1-7c191c62d24c"
              #uuid "24380876-a0ae-3b46-a8c6-a092619bef37"
              #uuid "3be646fb-70d6-3079-b0a7-35b697a011c8"
              #uuid "5af4832c-3c6d-3e4b-883d-4fbba7190317"
              #uuid "d8ebf6a0-f01a-377d-82c8-e903e801973b"
              #uuid "a0969dfc-5294-3b41-82bf-220e859197db"
              #uuid "3e302b86-f47c-3d22-9b4d-c253439d9970"
              #uuid "941e3f4a-24d8-3841-8144-e9db47d6f92b"
              #uuid "660cb8dd-c782-3542-8db8-9e1dc61af856"
              #uuid "c413a292-7a46-3ea3-aa4d-896b4b1e78e0"
              #uuid "0f2e7cd3-2595-3b1b-b656-cb103be3e521"
              #uuid "6f074a1d-f38a-33df-b9d8-d724a8ed3410"
              #uuid "3c213740-1920-3b32-acb4-a2877cd7aa17"
              #uuid "51a7df93-adb9-3cee-bc0c-05f7dc89f774"
              #uuid "c180dcbb-f5dd-3cdf-acb3-dfe83bc594ec"
              #uuid "def6402b-3a6f-30cb-aeb3-63cd5cefb20d"
              #uuid "bf684d42-7071-39ee-809d-514bc5ca241a"
              #uuid "be01908f-633f-35da-be89-80701db8ed25"
              #uuid "7c1ada9b-f78c-379d-a6a7-b3018581aab9"
              #uuid "a4a4e5f6-a7ab-31b8-8ec1-0983b264ed4b"
              #uuid "06c5d6ce-c062-3ac0-bd43-6186b663fc10"
              #uuid "06e9bd9c-0975-32da-acdf-2b1942d57f1e"
              #uuid "7e7fdd38-98cc-3f0f-a059-308e820a2013"
              #uuid "890488d0-a370-30a4-9788-a44754330b27"
              #uuid "8ec8175e-8c92-3f65-a885-97c16ca93454"
              #uuid "59ccf897-4368-3ab7-ae8e-0ac969872f6e"
              #uuid "48309f49-6981-3784-80f4-f8b7cff15c98"
              #uuid "d9878711-9bbd-343b-bb79-ba45904cc23c"
              #uuid "7b6a839b-181c-3d7e-a88a-1115d8a027c2"
              #uuid "dd86edfc-d85e-3039-9399-5c282a2e3524"
              #uuid "595f5c4f-c267-303b-adf4-1333c70a9460"
              #uuid "1a30c214-a750-3e08-97aa-c85a7fa01368"
              #uuid "30c12229-f508-341c-9680-149dbdf88523"
              #uuid "0727c24e-c484-3017-9850-a0e366a7dd42"
              #uuid "f821ee04-f104-3d22-96a6-9bab12eb4c28"
              #uuid "e0dfaae0-12bd-33ef-94b1-4c34842456b4"
              #uuid "09e49bb6-1f03-33a3-bfbe-8937e2e031e8"
              #uuid "99102149-c730-3271-a928-b7549ce07a13"
              #uuid "5b349ead-c3fb-374b-bb6c-47fcc3843355"
              #uuid "fb48a85b-84e9-312b-985b-de09b2c0b29f"
              #uuid "24a04d97-a632-349a-b9b1-bb49af1a096a"
              #uuid "c56337cc-54ed-3e22-8b76-d1092f67310c"
              #uuid "c7b74e13-dff8-3831-98f4-1d81198c1337"
              #uuid "d9f82ac3-bc24-3fa7-8292-3fff745ff105"
              #uuid "7d1c07ba-7b59-3e65-b308-f82e4f02765e"
              #uuid "08cddb57-6c00-3836-9593-a0b04fd84141"
              #uuid "e8bffbf9-2f40-3bce-837e-bd9538b19c58"
              #uuid "935b4085-0cd3-3875-abe0-2996fb99980b"
              #uuid "d0c13971-6116-34f0-ba4f-9f6b16e7b130"
              #uuid "9353a118-c201-398a-83cc-6d58ccb38f02"
              #uuid "fd3be4f0-d310-39a4-86b8-03524d064ee6"
              #uuid "0e7278cd-a02a-3c04-86dc-c75a4df34eb2"
              #uuid "701ae3e6-c75d-3e66-ab6a-b255f6fade83"
              #uuid "c8ccad85-82a3-3865-8ad8-a3487faedffb"
              #uuid "2f266ba4-d63b-34be-8400-6b95a3442ff9"
              #uuid "dfa418bd-eebc-3c3f-96b6-edaf5e3c4d89"
              #uuid "cf06db18-725b-36dc-8e9c-5246b40aae01"
              #uuid "30933bc2-a19f-3124-9a19-d7b8facdbeeb"
              #uuid "accf9b44-d60e-36aa-ab3e-293a0e91aed0"
              #uuid "76a33f97-02f4-3a7e-ada3-46bd2544ae02"
              #uuid "f72af12f-4736-3bde-84b0-ca91070cf43c"
              #uuid "648ffc7a-6dd1-39e8-a7f5-7ecb69cc4066"
              #uuid "054f1270-bf79-32f9-825a-96880e800c9f"
              #uuid "86f0bb77-105e-3136-98ae-4837a11ed606"
              #uuid "ef81a392-af64-3668-81ff-2c3b7736919f"
              #uuid "69895ff2-b990-3611-827e-f4f7fd32eb8a"
              #uuid "664d0a6d-1ba3-3b2b-961f-16ce489ff406"
              #uuid "b2980c72-2a1a-3e7a-b030-3718ce5491d8"
              #uuid "48788b6f-7e50-3fbb-b1a8-772c4139b77a"
              #uuid "3ed6a2fa-a80b-3140-9878-53dd29c238b8"
              #uuid "12218694-0010-31cc-a245-a502b7ed4b19"
              #uuid "4d77e635-44ee-324b-b8e1-1cd07bd913a4"
              #uuid "a93478e2-7d6a-36e5-8e4e-8b4c3f632b0c"
              #uuid "ffbd4d36-9e2e-3949-8c47-2403ba1b4e8a"
              #uuid "ea25ad16-dccd-378f-afde-9dae72c6b4d9"
              #uuid "de3493ea-6e7c-3152-9c99-22e9e501faf8"
              #uuid "bf515360-5eca-32d5-ac9d-fb620b905619"
              #uuid "434949a6-89e3-3ba2-8e67-412edc26c71f"
              #uuid "35af2b0c-b093-3e74-8ed4-e7589938e8ac"
              #uuid "cd19fd52-bf5e-3ad5-8ccf-0d6664374368"
              #uuid "280a5f64-7a78-3590-8dd0-81f7136e31b5"
              #uuid "73fdae1a-b0ca-3e78-b23e-a4a7101cd9e4"
              #uuid "34c99f3a-1325-32c3-865d-f7e597f25a8d"
              #uuid "42f0d762-a858-3dbb-b64d-dde4f6a4fc6d"
              #uuid "f072aeb8-c5dc-3eb7-9f65-6c8ab7d359a9"
              #uuid "9d8b1773-e579-34ae-9aae-3e3c82f764ce"
              #uuid "165261a9-0183-3e53-be82-ccc197c354b8"
              #uuid "a389677b-6118-3815-84fe-c1e75f38984c"
              #uuid "cace91df-d6f2-36fc-a98a-6fa5cde7357d"
              #uuid "ebe3d298-d25e-3110-8e34-1c079e9455d9"
              #uuid "7faaa1de-90c9-3f60-a58e-46fae6daf77c"
              #uuid "ca5622cb-e7ba-31f7-95df-551ad1bbe80f"
              #uuid "06ac533c-6f03-39a8-ae86-a6c373df20f3"
              #uuid "cedb275c-f7e8-3cf1-9073-41cff22af498"
              #uuid "b8f4ece4-3fa5-3fc3-9f1d-a34aec906149"
              #uuid "91a5169d-5877-3642-9a52-54c4f01655da"
              #uuid "d55cb47e-7f6c-3de3-afe9-3acfd3bd09af"
              #uuid "027df389-a20d-3cbe-886e-a91e5b10d58a"
              #uuid "886937cd-0285-3aad-834d-f6e5bd1d1dfb"
              #uuid "2752fdce-7879-3086-8e8e-2a54c21ee999"
              #uuid "34946d54-6d22-3af0-afdb-e795b8de802b"
              #uuid "ebb7a837-d8f1-3d0c-a149-24e17e4005dc"
              #uuid "d76c9788-f173-3fff-9b13-9ced6ab67c4a"
              #uuid "642edb7f-7af6-3c4b-8b07-5ac20dcba0b9"
              #uuid "7873a90e-ea1b-3b3b-8ca8-4820dc662976"
              #uuid "9ecf0011-c0af-37eb-a590-f247005f0399"
              #uuid "af89834e-3251-3aa9-a464-74b8d24a5091"
              #uuid "0aba0975-5e75-3a94-8bfe-fd86797f7ce8"
              #uuid "6b13ea3b-f083-34f2-adf3-f3dba030f1ef"
              #uuid "b150a64b-6e6b-3e4b-8784-e6bc946f1fc1"
              #uuid "35474b73-b019-37a7-b3d6-ee8eb6df3f8c"
              #uuid "4c2d3b0e-9fbd-3faa-9fed-724910231a39"
              #uuid "b1ea21fb-2177-3fed-af81-0a3967e76069"
              #uuid "c8835178-b83e-3ef2-84d6-ed36804309c8"
              #uuid "5f075ae3-e1f9-3038-abb8-c4632991f96f"
              #uuid "ad117101-b1d8-35b7-b02b-d335db512e5e"
              #uuid "bd4049a7-2730-31a1-bbc9-4a077d75facc"
              #uuid "e2257f79-e77e-34b7-87b1-a0924290c7f3"
              #uuid "2ffb14ad-8e1d-3f3c-9df9-133b523d8287"
              #uuid "3cad23d1-2f51-3a7b-8a51-4c256db8638d"
              #uuid "61751dfb-a841-3676-aa92-97d75c9a9f56"
              #uuid "7fe2ec37-f762-3f17-b6c0-cc2b097adead"
              #uuid "5aa42acb-56e5-3325-acc3-e39be2b450a1"
              #uuid "e5c528dd-2ba9-3a89-ac17-c427f0c00414"
              #uuid "c9e680a4-40fb-3a3e-bc38-6556dd90712b"
              #uuid "a9957800-b641-3919-9ff6-ca11f1c233c4"
              #uuid "e8d2a59c-f315-3860-9608-b04f893cbc93"
              #uuid "0a995f25-bdf2-358f-bf5a-93e22c9aa05b"
              #uuid "f98b9f16-c08f-3903-9b7f-80481ccce0d0"
              #uuid "81cc0f79-3609-346a-8dde-65ed1c9f3c3a"
              #uuid "4846597b-0309-3cd6-9f05-12f43edf2faf"
              #uuid "e29fbec4-4c71-3519-8e93-582b67df86f4"
              #uuid "d9ff8a5f-72de-3a40-99bd-301e426485bd"
              #uuid "5aac7681-3d33-3350-b4e8-43d1ae9b29e3"
              #uuid "826863b8-1605-33a8-9169-91ebcb89712b"
              #uuid "434338bc-9501-334b-adbf-2b3752e9e231"
              #uuid "08b3b128-c196-3b26-bc2f-d0e5523bc940"
              #uuid "2fe5b306-b8a0-3e8b-becf-b4a37cf52717"
              #uuid "0d22fe23-de11-3728-9634-4b0114313a9f"
              #uuid "dd1bf333-48e3-3cde-80c2-6fb824ec3563"
              #uuid "af493a90-a6e6-31a5-966e-beed6fcfe1b4"
              #uuid "d803129a-da52-3403-b88a-1331f9bf89b1"
              #uuid "a6092dda-9d9f-3b45-b148-b73eb5da724a"
              #uuid "0d600bac-e4d6-3227-b4bf-b0d9fee001c6"
              #uuid "1b3840b0-b70d-31c1-be70-014c8537dbba"
              #uuid "bb2b867a-583d-3e72-adf5-e81bf22baea4"
              #uuid "bcfc2af4-495d-3023-83ab-12fb1057166f"
              #uuid "6da53f25-b27b-3c31-8b0d-3928dc46f469"
              #uuid "c693b4c3-9720-303a-836a-8f25b4da698a"
              #uuid "aff8862a-8fba-39a6-86f4-ef02a3a228f9"
              #uuid "7369ff3a-fe64-30e3-8363-9067a97ac8b4"
              #uuid "b4991e13-f466-39b4-be16-56909272f1cc"
              #uuid "e74ac58d-7a69-3b4b-9cff-6dc08fd9f434"
              #uuid "0ef8f876-d62a-3535-ae28-410454e3634b"
              #uuid "984c20a2-ad28-3167-b8ae-fcef61acbced"
              #uuid "d701c31b-be98-3228-af7f-aaebd4cb0455"
              #uuid "e4b769db-2a42-392d-b311-b02c3545d07d"
              #uuid "1add2eb4-1fca-39b2-a15b-4a7d68571409"
              #uuid "647e229b-c07b-3419-a641-254ed8b96dbd"
              #uuid "18594966-e721-3762-8ad4-b4cc663db0b9"
              #uuid "a5d7ddea-2e79-3a0f-b248-95af3f6223d4"
              #uuid "f18187e7-f398-32f0-b73e-625e848d8333"
              #uuid "6db176b1-017b-3430-a362-e2d6ee99cc67"
              #uuid "e9e59065-5acd-3d1d-876b-8cb866541534"
              #uuid "d94472e2-8880-369b-b2f2-d1d3b83960c6"
              #uuid "83f7cd22-e2a0-3e46-b9ba-4358004dc75f"
              #uuid "2293c663-d1bc-3701-9a53-009f457c6940"
              #uuid "909332ae-bc74-34a4-8cd5-4ea30edd7930"
              #uuid "e369d9fd-2ab5-3455-9298-16db19e37fd4"
              #uuid "1c585f7b-4a5b-3e81-abe0-97ce17218168"
              #uuid "d8b5d495-0030-372f-8b5b-3131d1bcddc1"
              #uuid "c9135569-60ba-391a-a44b-1d8f95a4eb93"
              #uuid "b1127074-659b-3102-907a-25a0473a3e98"
              #uuid "1b2a1ef5-4042-3ba6-826b-7d8fe796f7ba"
              #uuid "e1d04b1f-1d94-3006-958a-ee81242dab6d"
              #uuid "22b3df14-e100-33a6-a098-e396cb523d6a"
              #uuid "843ecaf0-bb25-3a67-af63-f8a4bc3708a3"
              #uuid "114f738d-8858-3e7b-9fdc-41ddb2758725"
              #uuid "3b11574d-ac04-3356-aa1c-eb3ac5ef4c6f"
              #uuid "a673ace7-74a3-384d-823b-f8131295d6d1"
              #uuid "f0343033-f91c-3c5a-9064-4138ea33af2f"
              #uuid "938351d5-c89e-32e0-af3b-73d217217b14"
              #uuid "4d4c8a37-4103-35eb-b414-672ae3f8ea83"
              #uuid "61f2c08e-b43e-3b4f-80bd-d988013ee49b"
              #uuid "6a99a492-a63d-3ef4-a946-1cdbf945a66a"
              #uuid "ed2baf70-63da-3cbe-9737-466f5a29fe95"
              #uuid "aecc77c6-bfad-3a88-b455-19b8d2c86bc8"
              #uuid "5f955ad8-59ca-3215-9cab-4fa839d2a033"
              #uuid "90f166e5-27c4-3684-8865-0a7d63773ce7"
              #uuid "0eabf8b7-0bee-38f4-bfd2-cd9ef3624d39"
              #uuid "d99574a4-a1a2-3d19-96ca-d4f5094dca65"
              #uuid "9a6c960c-a513-3563-bb1f-1783f1aece80"
              #uuid "4921b8e8-521a-3a27-9aac-936218a067c7"
              #uuid "ae9fa216-d3c0-3682-9657-bc2cb71eaa11"
              #uuid "5a156002-5793-338e-9399-def9bfd7eca6"
              #uuid "53b40008-e2e5-3189-9b82-fd0ba46405e3"
              #uuid "39af5c41-5927-3dde-8a75-10397211dcda"
              #uuid "cd27a171-5aac-359b-82a4-8a86ed2000c0"
              #uuid "b4f52f37-41db-379b-94e2-3b8911f49401"
              #uuid "59bab2ff-b0ef-386f-8db8-ef439320a47e"
              #uuid "423cb589-88be-336d-ada8-9817b5fe519e"
              #uuid "35b5c110-f2b0-3562-ae79-b51bd6300690"
              #uuid "deaefe4b-599d-3d42-982f-b0bef3bbb3d3"
              #uuid "a58b4cee-88af-34f8-9ad6-839f132388f0"
              #uuid "a6480b1c-62dd-3ceb-9f94-fb57c823691e"
              #uuid "d8ac8dc4-6760-3f12-96c2-e3420b291781"
              #uuid "47a720fb-24ff-320b-99ab-77739da99a5a"
              #uuid "227fed4b-25cc-316a-b15e-6c9a064702db"
              #uuid "b7dd6050-6cb3-352e-9363-36450ff12ddc"
              #uuid "1ceaeab6-397f-308a-b02e-6652106f2fbd"
              #uuid "43f3a349-eec8-3b6a-9947-777f90811c90"
              #uuid "3980f7ea-079b-3741-a713-8494f6bcbb9a"
              #uuid "3384a03c-665a-3116-a474-cf5d4406c85a"
              #uuid "eab3ae9a-3d28-3df8-affc-d917c97d7195"
              #uuid "792a15e4-87a1-362b-8199-5789db4c3b0a"
              #uuid "133c22e7-c259-3256-a323-5b88f0b6a645"
              #uuid "12fd071d-60ce-3146-b555-655882920638"
              #uuid "e8f7e1a7-0eb6-3e44-aee0-11dff550f9ee"
              #uuid "87f8a6ab-85c9-3ed3-b02b-4ea641ad4bb5"
              #uuid "fcbd772e-48c4-307d-bd3b-e13b37a82f5e"
              #uuid "d88a6b63-1a1c-36ea-95d1-2d05210eb706"
              #uuid "530b622e-6e90-30f4-b806-d0cbf74102a5"
              #uuid "4ab65803-6f4f-3742-85c3-84b863fed5c2"
              #uuid "58fb7a8c-d0f1-36b0-b1f5-b7091fbb0ba0"
              #uuid "903d8dd1-63cb-3a8b-bcfa-23261d6598b2"
              #uuid "fbccf9d3-dd4b-3e43-954e-9fafac2763ae"
              #uuid "dce6433a-bef0-3dff-a22e-433b721bfc14"
              #uuid "4d6bfce7-c3d0-3def-8625-e405087939ed"
              #uuid "db5ac01b-b987-3006-8f5a-61d4142920ec"
              #uuid "0663d3ee-2750-30d4-ad83-aa74a59c87ce"
              #uuid "f8049db2-d889-3677-984e-4e2ce41de578"
              #uuid "042103e1-8bdd-3157-aceb-cca413d78f3b"
              #uuid "23767cbb-cceb-3686-8a59-f0250c57a1d9"
              #uuid "b17747c8-2344-37e0-af25-4c86481d8b35"
              #uuid "1309682a-fbd4-3c2b-89cb-11c7d8048013"
              #uuid "cb6afc25-1c32-38b1-bfe0-1c3f8797a9ea"
              #uuid "e923a27a-48cd-3c06-a494-d0fa119478a8"
              #uuid "1fdd0d64-7a70-3a2d-93b1-bbf278454b32"
              #uuid "3b726f01-748c-32b9-ac65-408fdb259e18"
              #uuid "39458645-fcb9-368d-81b6-ad23bbed69cf"
              #uuid "51c249b0-90c8-3a66-8732-f796a82e5382"
              #uuid "6e8ce4f2-3cc4-37b8-9002-721e44843aaf"
              #uuid "e3ff49f1-3a4e-3be2-9c80-51385adc499c"
              #uuid "6322ea9d-5e70-3e8c-89a6-0e261275b1d1"
              #uuid "46df0476-0eb0-30b7-92cd-7703972c5f1a"
              #uuid "baf9b7dd-749d-37d7-888f-c84d255e682f"
              #uuid "df4c4520-3102-33f1-9a51-ee304c193f23"
              #uuid "2bc22d15-7e2b-3a2d-aaaa-46fe0f8945e2"
              #uuid "704d0598-6340-3c49-b5b5-9d0fcf54e1f3"
              #uuid "36f8c047-0a0d-34e8-920b-337b779969ab"
              #uuid "07f37b38-2b05-392e-91fd-d4e76cc7fbf0"
              #uuid "17b41f7f-4de8-3fe3-be7f-91fc18e29b8a"
              #uuid "6f243f7a-f0d3-3ed7-8572-4782675ddb75"
              #uuid "b75229d9-66a3-3ee4-86f4-e1e5f353d9a4"
              #uuid "e7c82f28-5b8e-3311-8519-a3cfa713dec3"
              #uuid "a2cce669-b64c-31e7-9afb-63f03c696fee"
              #uuid "f46ff3af-0204-348e-9bd0-c1f668f82128"
              #uuid "5af83e31-96bf-39f4-80f3-1f2e1a6c9afe"
              #uuid "20263815-62ac-3093-af3d-0f4a0f0538bb"
              #uuid "bddc24af-3739-3b8e-bfcb-17b4a25b7153"
              #uuid "189f9b13-158d-379b-9440-05b9bc24a356"
              #uuid "0dd28a2a-30d5-3d29-97ba-3e8bfa086f0f"
              #uuid "da846ac4-d725-3d51-8667-b8ab69c960fb"
              #uuid "a4eb9598-b375-3f22-8363-e0295ac2f5f2"
              #uuid "4a734354-588a-3c87-bd6f-48f09c3e691f"
              #uuid "d5380d3b-56d5-3783-a863-1af12c39f5c7"
              #uuid "41e6fb49-794a-3928-bc31-b058fc3f832d"
              #uuid "c1fa67fc-99a3-39a4-962b-ba099f84d11c"
              #uuid "c6dab445-bf7e-39be-b4cb-6f22ae7e715a"
              #uuid "44de8c27-9942-39ca-997c-57ff932fc882"
              #uuid "275ef384-7d59-3c1c-8625-ec7a6d5208b6"
              #uuid "1cdae507-3b8e-324b-9d32-0d5c541166f3"
              #uuid "33e20383-3807-3414-869c-7a3907d40b75"
              #uuid "e9de6ee3-1f19-36e8-bdf0-3b24bacd02cc"
              #uuid "f750d160-d009-3c96-a630-eff035abfd6c"
              #uuid "a4c50ca7-7a49-3873-a656-5ba52bc56488"
              #uuid "5aeb1f62-f6cd-396d-881c-07d58b82f143"
              #uuid "eb9bd23b-c056-3a5d-a53d-78b2dcbd15ae"
              #uuid "c6dfc763-4e0a-33ee-b4b9-efe1ce4f82b3"
              #uuid "edfa15bc-3235-3696-aaad-09e432fc6662"
              #uuid "b11ddc7e-1671-30bd-a2dc-89dd757508d4"
              #uuid "f81386ae-7767-3f93-a560-c78df55109bb"
              #uuid "f6be0578-56d6-30b6-ad51-8713fc8f260a"
              #uuid "d18a26f4-6f25-37b2-a861-2147cf47cf18"
              #uuid "54b141a9-4bee-378e-b867-fd1d4729f014"
              #uuid "e1405ecf-c37a-3cdf-9bc0-46ca9df2e685"
              #uuid "db6d2f3a-d731-3ddd-9e97-4b857d9ac065"
              #uuid "cba95a42-c53b-3c6f-bf3d-df9bf10a4069"
              #uuid "f7625727-1129-3703-96c0-442c8ac00dae"
              #uuid "4fce228a-9d44-32fe-ac24-659f263ee51e"
              #uuid "e5279fe2-9e7a-313b-9b5d-e2d1f6a1e8db"
              #uuid "b86c48fe-3ed8-3b4e-9369-6d3957a9d311"
              #uuid "b7c512a7-a3f4-35d4-a416-c10bffb57bb4"
              #uuid "67e88af3-f2d3-3953-9be7-c1b26fefe183"
              #uuid "e56eb8fb-70f3-368a-b45d-dec1e25f35aa"
              #uuid "5e611ca2-e99d-358f-adc6-f3f7bcfb3ad5"
              #uuid "11a2b6fb-2a70-314c-b249-9d7b509352e5"
              #uuid "c64e760d-cd41-31b1-9626-a196593146fa"
              #uuid "edc4787a-b55f-39c5-ab40-a99f7c1a0c80"
              #uuid "ad09b2d4-8b28-31c6-8e5a-2bf421f7f2f2"
              #uuid "ba776ee9-9ebc-3521-9d9d-ce1c6a702748"
              #uuid "8acfd5b8-b774-39c4-a04c-29420e5631c0"
              #uuid "e6d5c2ee-6c34-370d-b344-30cc5ee8a749"
              #uuid "3da3ce69-4e95-3c15-beec-5d9ec2078260"
              #uuid "c3fea04b-2042-3a0f-ab59-e7cedee3e1bf"
              #uuid "7d9f1d6a-539f-3506-a533-6d5ff7e5df57"
              #uuid "200327ec-e2f1-3904-9057-9c80de5c3e0f"
              #uuid "f77b4d34-54f4-37eb-8a5b-6d8df9e0f66d"
              #uuid "431d180f-b4d4-35f3-8c95-96ad5a7267d6"
              #uuid "af817d47-9021-3806-800d-7ef8dab08024"
              #uuid "bb7745e6-fe51-351f-843c-5012bd13d334"
              #uuid "1fff84e0-9d09-3677-a846-84f01c21b161"
              #uuid "113e202b-52db-3631-b4c4-7027d1edccf5"
              #uuid "20b16954-6c66-3536-b816-f13d464da44c"
              #uuid "655dd7fb-2048-304d-ac0f-6a354ff76bc2"
              #uuid "a65fe9b8-99d0-317b-9c91-7b969001669d"
              #uuid "e261ac28-9c39-30db-81d4-e7551f8b4fe6"
              #uuid "645ab7f6-09eb-3401-988d-97cd930668c1"
              #uuid "77933845-adf8-3758-a686-a08ea46f015e"
              #uuid "6b1a6c6e-487e-334f-97cf-8b0efad2f3f9"
              #uuid "ba290158-1610-3e16-94fa-7dedd0ef5e08"
              #uuid "5b444b22-2047-3124-af08-48687f72a6b5"
              #uuid "7cd74735-c2f6-352d-8428-474bc1b6b386"
              #uuid "7b9a4759-a742-301f-b458-f4ef2d8368da"
              #uuid "7bd8e302-1270-3448-8815-58d1f6da0834"
              #uuid "01f7b705-9b33-3897-969b-343e8a6e682e"
              #uuid "d20adb03-0a94-319b-9d04-188d5cad9da6"
              #uuid "5610f650-22c6-3571-bffa-cfd6a9d68b2a"
              #uuid "6e6f4eb8-c896-3609-ae50-49ede7fbf6ad"
              #uuid "3992d652-f81d-3e86-bd6e-2e685cb351a3"
              #uuid "a2a3a034-7f0f-301a-8473-dd54dca2462e"
              #uuid "c59a448e-a61e-3dad-871d-f3bc7ebe6774"
              #uuid "b172271f-a27d-3300-9b46-7f9825f0727e"
              #uuid "d5fd1c48-4bc6-3542-8805-4964fab16e05"
              #uuid "568da493-2833-3009-ad26-7108e0683081"
              #uuid "2e994ee0-a8fc-32ef-a229-a0d74edf07cf"
              #uuid "cd9b3130-0865-3759-962d-9c3eab8d03f4"
              #uuid "b7ae6819-447d-36c3-bb6a-0e7dbe5c17ce"
              #uuid "0f797b16-678f-32d3-af6d-84b6d8f6ad20"
              #uuid "6b35d568-0483-3a28-a965-30b88e49b9f5"
              #uuid "6fe19369-f217-3b8c-a477-7fca8a743df4"
              #uuid "1c1ad4ae-57a5-38c9-8c80-666849f4eeec"
              #uuid "106facbb-305a-30f4-afe6-9fe69cfadbdc"
              #uuid "bdc861dc-6b29-3561-92f7-d53f184e07fc"
              #uuid "2c11257f-a438-3f75-8fac-459a4275e4c1"
              #uuid "88857068-79d6-3142-9e20-b8c7fd8b986d"
              #uuid "d8d090ed-62f4-3521-8f53-6cd65960c06e"
              #uuid "dee45e08-5103-32ec-93b7-17d391b64576"
              #uuid "4615cd89-6ac7-3867-a94c-ceb0a15a7b13"
              #uuid "9cf42701-85ad-3877-9a0f-cf57a5acf172"
              #uuid "51817160-093d-3773-957a-662779bebec9"
              #uuid "56be7020-8ac5-312f-9c02-a912103646d9"
              #uuid "7f5c4b62-c9ec-3866-8ad6-598ebab4623a"
              #uuid "5f04dffc-be2c-351d-adf5-f41fb7084b4e"
              #uuid "9db165b4-98ba-3935-9f4e-a7bd23beb693"
              #uuid "761cd5e5-55ee-39c8-b789-0273d2493fe8"
              #uuid "12e2d12e-9e19-33ad-b08e-22ab8cc8eac5"
              #uuid "f5c8ba24-2c49-3844-8721-5cf4e518c90f"
              #uuid "875b8289-de41-3672-8c92-95b6a689ff43"
              #uuid "cb4c3448-07c8-36e6-8cbd-28f45339be1d"
              #uuid "9db68b1a-dbc5-3564-ab25-1023e94227a1"
              #uuid "ff75a7b6-d946-39dc-b9cf-69635113e6f4"
              #uuid "653e0f82-5aec-3cf2-86d0-4422c6b2f8cd"
              #uuid "edcee0da-2a9f-3e86-ab60-5a78ad6f26ee"
              #uuid "2c63539a-a2a5-3415-b3d7-89edc773ac8b"
              #uuid "d80578d7-99b8-36c3-84e7-da04814b80f5"
              #uuid "51c77b26-5d4b-3952-ac93-fa7002f8a379"
              #uuid "309ea4eb-582b-3fb9-93ca-87fd54016d3e"
              #uuid "1e78ea48-893a-3f8e-91e2-01c9ff0e706e"
              #uuid "b8909580-a299-3ec5-848c-548f38510b72"
              #uuid "f00e2b92-434d-31e6-8a25-1b16618b5ab5"
              #uuid "2b110ae1-40c3-3594-bdfa-8a5bfe402f8b"
              #uuid "66437274-239d-371f-a5d1-71102dca56e3"
              #uuid "ccfd0e0f-749f-3a3a-a9cc-7c01a70ea5fd"
              #uuid "9c557202-449d-3095-b805-89c2e6e0fe50"
              #uuid "e154f5ce-d498-3840-a559-661a996d4d09"
              #uuid "0071dfa9-ec41-35e2-befc-ecbe183ff272"
              #uuid "f944b1ee-72e5-3ea8-832f-4eaf0dde6f09"
              #uuid "3ca4bbbb-2ab4-3ee4-85af-cd73036a4cd3"
              #uuid "458d2163-a348-30c3-a4ad-8792fa32645c"
              #uuid "8881688f-f717-3852-a5df-d3c7386562d1"
              #uuid "1bd17795-c173-3c75-9489-8343917b819a"
              #uuid "0d794c9d-d65b-3e94-8ce2-fe8020a2a53c"
              #uuid "595f02eb-d247-3d88-95e4-06800f89e71a"
              #uuid "af9c7e15-a449-3e77-9dcf-1fed9a676d1f"
              #uuid "5e679cbb-17a6-3355-9ddc-017e474ea5a9"
              #uuid "62326243-6ea0-3ce1-aef6-c1d285dbdc80"
              #uuid "72b0f8c3-5245-35e0-9a66-484200882d79"
              #uuid "d8b44a4f-28ae-353d-adeb-b3fd26fc143b"
              #uuid "72e2061f-c210-3f0c-bdd2-68d09fb15b98"
              #uuid "134c5416-16b9-3118-a547-774f6df7bbcd"
              #uuid "af472b73-df4f-3397-a8c7-31a328913353"
              #uuid "5140d848-4910-3017-8f45-c2851658966b"
              #uuid "928c51b9-1ca6-3be5-b2f1-e665e90fab70"
              #uuid "ebb89386-c539-37db-b4a7-972b931256f7"
              #uuid "cf3b2299-3275-32a1-bcc3-40c64f229538"
              #uuid "f945232e-faca-3164-a579-88d416e62368"
              #uuid "a09707a5-88fc-32fa-b544-8afa929496ab"
              #uuid "7b1d9fe4-27bb-3db5-af9b-89f0785afc59"
              #uuid "90a300ed-ea38-3514-b744-0c43440fa4b3"
              #uuid "ea2abdf4-a5ae-3c18-be7b-bd2db0068ddb"
              #uuid "c3fa9226-9cf9-3afa-8844-dff274cc446d"
              #uuid "3d1f92a5-65d3-31a6-9880-236e33c49bf3"
              #uuid "05e84109-515f-3f98-8ab8-872a8a1a9cb2"
              #uuid "104965da-ee0b-3867-95a3-0416228b7b19"
              #uuid "24689901-b879-3cd9-9b75-5dd7dd2b8f2d"
              #uuid "39063899-ef80-383a-97b7-38b8c778cc24"
              #uuid "8107587f-5b81-3b66-9d13-2fa6e9a887df"
              #uuid "c31af57c-a315-3610-b455-9d5f386f31e0"
              #uuid "8ae6e417-a5fe-36fa-9be3-bd2c6ac61840"
              #uuid "08240ccd-42ce-3242-b2f3-7bf5b24420fe"
              #uuid "40bd8e35-d86c-3ba3-8791-e33dad4f0330"
              #uuid "f4afb893-6f91-3389-8606-9c088ff6ea75"
              #uuid "578002db-1bee-32a8-949c-58bece6429a5"
              #uuid "51e8b349-68a5-36bd-84d2-d7b86bb0765b"
              #uuid "64b81638-f97f-36d4-ad33-08e915a1750e"
              #uuid "aacb653d-e587-34a7-a360-4c3956b4f677"
              #uuid "c377afb2-e46b-30b6-968e-71cb449ac3ea"
              #uuid "77926e55-5ca9-34b7-8f65-009dd92da63b"
              #uuid "91934e02-f64d-3aab-9536-19f592307a91"
              #uuid "bbf3c83b-9b9a-3dfd-9cc3-d3295f5d235f"
              #uuid "63e5002f-f8a6-36bd-81b5-2f817477eecf"
              #uuid "9b45f563-8b03-34d4-9d30-5134ab5e657e"
              #uuid "7416a104-a4b4-3c68-895e-98e989dce7de"
              #uuid "7c823c08-2b3e-3613-bf68-fde60227450d"
              #uuid "074edbaf-ed58-3f43-ad67-8af6ba4fcefe"
              #uuid "7e7123b0-d269-3d5d-9ec8-d12c52a8ed8a"
              #uuid "bc6235a4-d8ed-3225-86d0-ce30fcb2da6a"
              #uuid "59f822bc-aa8e-319b-9e63-eb00919b367a"
              #uuid "7a51eb3c-d160-3393-b631-9ae87020b9db"
              #uuid "6b8723ed-8ce2-3285-963d-9682f60b0287"
              #uuid "d3c432b4-bac7-3974-8e6c-60ce1f8b528f"
              #uuid "14d13fd2-bd65-3d26-a969-71f5cec92764"
              #uuid "5c50d320-55f3-337f-b820-3e559968a3f1"
              #uuid "fd6267f8-71dc-3dc3-9ad9-e13b844fed44"
              #uuid "29b3ea31-ed18-3383-b4af-bfe1002404ae"
              #uuid "6ad0df6a-ac90-3fc1-a6fc-cdd155147a92"
              #uuid "47dbc903-625e-337e-b249-2dbf0b1b9527"
              #uuid "9cfc3b97-43a7-3c0f-a7c6-2b42b62c90f6"
              #uuid "32288419-57f9-3b53-a2df-4b3393930c5a"
              #uuid "44ca4f9f-417c-3200-b21f-4ae33fae9646"
              #uuid "2d7c2d23-5fac-3ff4-8aac-33c2ce47eb1c"
              #uuid "ae7bda5b-fa73-3e1b-b30b-c81fd70b93f5"
              #uuid "97fc6923-396a-3ad8-8a4c-70879893f4b7"
              #uuid "3f9e8eb6-bc1b-357a-949e-643f14a3cedf"
              #uuid "ec9a79c1-8253-3d39-9f07-8382ba20e59f"
              #uuid "97fe9a27-6b0c-3281-8d07-433af5bcf4e4"
              #uuid "c2ea7289-9af9-3d4e-8061-55ca7bf82b6b"
              #uuid "e214a1ce-1929-3835-b502-4510ef89f940"
              #uuid "abe58998-3062-3866-9238-314af7ba0265"
              #uuid "6fe16b2e-cfb7-3be8-8013-6c163b70120b"
              #uuid "e5f11979-9a30-30ec-8084-92dd584b1214"
              #uuid "19adc592-fdfe-37ba-81a5-d195098fc52d"
              #uuid "02b25657-6abc-3080-8fb9-16100cb17ad5"
              #uuid "0a4d7b38-fbbc-3f6c-88fe-b09fc35ad1a6"
              #uuid "161dfda2-bf83-3041-ae10-e2410340abd1"
              #uuid "3463c066-922f-3864-93bd-b87bb1286679"
              #uuid "d993f311-557a-391d-ab21-677ab586a01b"
              #uuid "d46d3296-6569-3615-8e1d-5ac2e88a346a"
              #uuid "191e854e-b00d-3d80-8fa1-fed83b373be7"
              #uuid "9cb073d5-2081-32d7-9991-a6077288e01e"
              #uuid "36749cc5-01bd-3292-aaaf-44525fc6ed7b"
              #uuid "05ae57bb-e135-3a41-87f7-2bc52f18bff4"
              #uuid "0b0ba83c-ba8f-3c56-8b3e-a2fc3bc7f5a4"
              #uuid "30fe5e0d-e895-3a87-87df-7cdfbdd1f7ab"
              #uuid "fab76503-1b94-3d49-8b17-1336fababeec"],
             :com.boardgamegeek.boardgame/min-players
             [#uuid "4a3e0096-1a08-379c-b4f9-1ca0070ea2f5"
              #uuid "64581d49-5b7a-3952-b129-c64b56c406ed"
              #uuid "4080e14f-b40a-3b33-98cf-83612aaecf76"
              #uuid "6d8aa71d-1531-3019-ac35-ea2463485268"
              #uuid "780cd613-d706-3945-8ef3-6d59c16c2312"
              #uuid "46abbae9-5fbc-3520-9ed2-16c2901bdbae"
              #uuid "358a9cb1-8677-3a1b-90ac-1c8d6ffa6288"
              #uuid "526e6774-4f0b-3073-9ec1-7c191c62d24c"
              #uuid "24380876-a0ae-3b46-a8c6-a092619bef37"
              #uuid "3be646fb-70d6-3079-b0a7-35b697a011c8"
              #uuid "6f074a1d-f38a-33df-b9d8-d724a8ed3410"
              #uuid "51a7df93-adb9-3cee-bc0c-05f7dc89f774"
              #uuid "a4a4e5f6-a7ab-31b8-8ec1-0983b264ed4b"
              #uuid "8ec8175e-8c92-3f65-a885-97c16ca93454"
              #uuid "7b6a839b-181c-3d7e-a88a-1115d8a027c2"
              #uuid "d9f82ac3-bc24-3fa7-8292-3fff745ff105"
              #uuid "d0c13971-6116-34f0-ba4f-9f6b16e7b130"
              #uuid "fd3be4f0-d310-39a4-86b8-03524d064ee6"
              #uuid "701ae3e6-c75d-3e66-ab6a-b255f6fade83"
              #uuid "2f266ba4-d63b-34be-8400-6b95a3442ff9"
              #uuid "a93478e2-7d6a-36e5-8e4e-8b4c3f632b0c"
              #uuid "280a5f64-7a78-3590-8dd0-81f7136e31b5"
              #uuid "cedb275c-f7e8-3cf1-9073-41cff22af498"
              #uuid "886937cd-0285-3aad-834d-f6e5bd1d1dfb"
              #uuid "642edb7f-7af6-3c4b-8b07-5ac20dcba0b9"
              #uuid "c8835178-b83e-3ef2-84d6-ed36804309c8"
              #uuid "2ffb14ad-8e1d-3f3c-9df9-133b523d8287"
              #uuid "0d22fe23-de11-3728-9634-4b0114313a9f"
              #uuid "d803129a-da52-3403-b88a-1331f9bf89b1"
              #uuid "0d600bac-e4d6-3227-b4bf-b0d9fee001c6"
              #uuid "c693b4c3-9720-303a-836a-8f25b4da698a"
              #uuid "e74ac58d-7a69-3b4b-9cff-6dc08fd9f434"
              #uuid "d8b5d495-0030-372f-8b5b-3131d1bcddc1"
              #uuid "3b11574d-ac04-3356-aa1c-eb3ac5ef4c6f"
              #uuid "a673ace7-74a3-384d-823b-f8131295d6d1"
              #uuid "f0343033-f91c-3c5a-9064-4138ea33af2f"
              #uuid "938351d5-c89e-32e0-af3b-73d217217b14"
              #uuid "4d4c8a37-4103-35eb-b414-672ae3f8ea83"
              #uuid "61f2c08e-b43e-3b4f-80bd-d988013ee49b"
              #uuid "a58b4cee-88af-34f8-9ad6-839f132388f0"
              #uuid "d99574a4-a1a2-3d19-96ca-d4f5094dca65"
              #uuid "53b40008-e2e5-3189-9b82-fd0ba46405e3"
              #uuid "b4f52f37-41db-379b-94e2-3b8911f49401"
              #uuid "12fd071d-60ce-3146-b555-655882920638"
              #uuid "0dd28a2a-30d5-3d29-97ba-3e8bfa086f0f"
              #uuid "da846ac4-d725-3d51-8667-b8ab69c960fb"
              #uuid "4a734354-588a-3c87-bd6f-48f09c3e691f"
              #uuid "41e6fb49-794a-3928-bc31-b058fc3f832d"
              #uuid "c6dab445-bf7e-39be-b4cb-6f22ae7e715a"
              #uuid "275ef384-7d59-3c1c-8625-ec7a6d5208b6"
              #uuid "5aeb1f62-f6cd-396d-881c-07d58b82f143"
              #uuid "cba95a42-c53b-3c6f-bf3d-df9bf10a4069"
              #uuid "b86c48fe-3ed8-3b4e-9369-6d3957a9d311"
              #uuid "67e88af3-f2d3-3953-9be7-c1b26fefe183"
              #uuid "e56eb8fb-70f3-368a-b45d-dec1e25f35aa"
              #uuid "ba776ee9-9ebc-3521-9d9d-ce1c6a702748"
              #uuid "c3fea04b-2042-3a0f-ab59-e7cedee3e1bf"
              #uuid "200327ec-e2f1-3904-9057-9c80de5c3e0f"
              #uuid "6b1a6c6e-487e-334f-97cf-8b0efad2f3f9"
              #uuid "7cd74735-c2f6-352d-8428-474bc1b6b386"
              #uuid "7b9a4759-a742-301f-b458-f4ef2d8368da"
              #uuid "d20adb03-0a94-319b-9d04-188d5cad9da6"
              #uuid "b7ae6819-447d-36c3-bb6a-0e7dbe5c17ce"
              #uuid "0f797b16-678f-32d3-af6d-84b6d8f6ad20"
              #uuid "f5c8ba24-2c49-3844-8721-5cf4e518c90f"
              #uuid "875b8289-de41-3672-8c92-95b6a689ff43"
              #uuid "653e0f82-5aec-3cf2-86d0-4422c6b2f8cd"
              #uuid "66437274-239d-371f-a5d1-71102dca56e3"
              #uuid "ccfd0e0f-749f-3a3a-a9cc-7c01a70ea5fd"
              #uuid "72b0f8c3-5245-35e0-9a66-484200882d79"
              #uuid "cf3b2299-3275-32a1-bcc3-40c64f229538"
              #uuid "a09707a5-88fc-32fa-b544-8afa929496ab"
              #uuid "104965da-ee0b-3867-95a3-0416228b7b19"
              #uuid "40bd8e35-d86c-3ba3-8791-e33dad4f0330"
              #uuid "bbf3c83b-9b9a-3dfd-9cc3-d3295f5d235f"
              #uuid "7e7123b0-d269-3d5d-9ec8-d12c52a8ed8a"
              #uuid "5c50d320-55f3-337f-b820-3e559968a3f1"
              #uuid "fd6267f8-71dc-3dc3-9ad9-e13b844fed44"
              #uuid "29b3ea31-ed18-3383-b4af-bfe1002404ae"
              #uuid "47dbc903-625e-337e-b249-2dbf0b1b9527"
              #uuid "e214a1ce-1929-3835-b502-4510ef89f940"
              #uuid "fab76503-1b94-3d49-8b17-1336fababeec"
              #uuid "d82b1470-bb05-3f45-86cb-1e51d8455a3d"
              #uuid "28e54304-62fc-38c9-9b76-058878323d57"
              #uuid "da7d7bb0-2a43-3cd7-8ea7-21c4eb8ae388"
              #uuid "bb8434ca-528e-3b5f-bfc5-5eebbe2c00a0"
              #uuid "d9878711-9bbd-343b-bb79-ba45904cc23c"
              #uuid "86f0bb77-105e-3136-98ae-4837a11ed606"
              #uuid "ffbd4d36-9e2e-3949-8c47-2403ba1b4e8a"
              #uuid "34c99f3a-1325-32c3-865d-f7e597f25a8d"
              #uuid "9d8b1773-e579-34ae-9aae-3e3c82f764ce"
              #uuid "4c2d3b0e-9fbd-3faa-9fed-724910231a39"
              #uuid "5aa42acb-56e5-3325-acc3-e39be2b450a1"
              #uuid "e5c528dd-2ba9-3a89-ac17-c427f0c00414"
              #uuid "ae9fa216-d3c0-3682-9657-bc2cb71eaa11"
              #uuid "423cb589-88be-336d-ada8-9817b5fe519e"
              #uuid "a6480b1c-62dd-3ceb-9f94-fb57c823691e"
              #uuid "3980f7ea-079b-3741-a713-8494f6bcbb9a"
              #uuid "d88a6b63-1a1c-36ea-95d1-2d05210eb706"
              #uuid "530b622e-6e90-30f4-b806-d0cbf74102a5"
              #uuid "fbccf9d3-dd4b-3e43-954e-9fafac2763ae"
              #uuid "baf9b7dd-749d-37d7-888f-c84d255e682f"
              #uuid "704d0598-6340-3c49-b5b5-9d0fcf54e1f3"
              #uuid "36f8c047-0a0d-34e8-920b-337b779969ab"
              #uuid "f46ff3af-0204-348e-9bd0-c1f668f82128"
              #uuid "e9de6ee3-1f19-36e8-bdf0-3b24bacd02cc"
              #uuid "bb7745e6-fe51-351f-843c-5012bd13d334"
              #uuid "ba290158-1610-3e16-94fa-7dedd0ef5e08"
              #uuid "88857068-79d6-3142-9e20-b8c7fd8b986d"
              #uuid "12e2d12e-9e19-33ad-b08e-22ab8cc8eac5"
              #uuid "f00e2b92-434d-31e6-8a25-1b16618b5ab5"
              #uuid "f944b1ee-72e5-3ea8-832f-4eaf0dde6f09"
              #uuid "af9c7e15-a449-3e77-9dcf-1fed9a676d1f"
              #uuid "72e2061f-c210-3f0c-bdd2-68d09fb15b98"
              #uuid "63e5002f-f8a6-36bd-81b5-2f817477eecf"
              #uuid "9b45f563-8b03-34d4-9d30-5134ab5e657e"
              #uuid "d3c432b4-bac7-3974-8e6c-60ce1f8b528f"
              #uuid "14d13fd2-bd65-3d26-a969-71f5cec92764"
              #uuid "e5f11979-9a30-30ec-8084-92dd584b1214"
              #uuid "161dfda2-bf83-3041-ae10-e2410340abd1"
              #uuid "0b0ba83c-ba8f-3c56-8b3e-a2fc3bc7f5a4"
              #uuid "49b5473d-32f5-382b-943a-dda4a1491daf"
              #uuid "00dbe22a-358d-364c-aa3e-6da841b451dc"
              #uuid "f8283731-6cf2-3086-8140-494037314bf5"
              #uuid "993ca650-a85e-3e69-b8f7-eaa4809c4862"
              #uuid "d496a066-c36e-3570-99d1-9eedec118dee"
              #uuid "af0c5e41-309d-3a83-afb7-76f7378381b2"
              #uuid "110f4e5f-593e-3ca2-819e-29dab8ad6f55"
              #uuid "0746ccba-be89-3d2f-a4b6-af590e489ff0"
              #uuid "e3a13cf1-2d4f-3a6a-9791-62315cf53ba2"
              #uuid "109a021a-56f4-3223-ae04-902a1f40db16"
              #uuid "492b7750-c3e8-3055-a93b-6745391300a6"
              #uuid "7ca15329-76d2-3582-a841-424d17ec0f0b"
              #uuid "7d9e8262-8714-332c-9ca9-ac68c68596b5"
              #uuid "79a39a92-dda9-376e-b337-e86bdbbc3864"
              #uuid "582d2648-b634-3370-a31e-bef979dab3f3"
              #uuid "2e89598e-c81e-39d5-bae2-aee451063265"
              #uuid "d8ebf6a0-f01a-377d-82c8-e903e801973b"
              #uuid "a0969dfc-5294-3b41-82bf-220e859197db"
              #uuid "3e302b86-f47c-3d22-9b4d-c253439d9970"
              #uuid "941e3f4a-24d8-3841-8144-e9db47d6f92b"
              #uuid "660cb8dd-c782-3542-8db8-9e1dc61af856"
              #uuid "c413a292-7a46-3ea3-aa4d-896b4b1e78e0"
              #uuid "0f2e7cd3-2595-3b1b-b656-cb103be3e521"
              #uuid "3c213740-1920-3b32-acb4-a2877cd7aa17"
              #uuid "c180dcbb-f5dd-3cdf-acb3-dfe83bc594ec"
              #uuid "def6402b-3a6f-30cb-aeb3-63cd5cefb20d"
              #uuid "bf684d42-7071-39ee-809d-514bc5ca241a"
              #uuid "be01908f-633f-35da-be89-80701db8ed25"
              #uuid "7c1ada9b-f78c-379d-a6a7-b3018581aab9"
              #uuid "06c5d6ce-c062-3ac0-bd43-6186b663fc10"
              #uuid "06e9bd9c-0975-32da-acdf-2b1942d57f1e"
              #uuid "890488d0-a370-30a4-9788-a44754330b27"
              #uuid "59ccf897-4368-3ab7-ae8e-0ac969872f6e"
              #uuid "dd86edfc-d85e-3039-9399-5c282a2e3524"
              #uuid "595f5c4f-c267-303b-adf4-1333c70a9460"
              #uuid "1a30c214-a750-3e08-97aa-c85a7fa01368"
              #uuid "30c12229-f508-341c-9680-149dbdf88523"
              #uuid "0727c24e-c484-3017-9850-a0e366a7dd42"
              #uuid "f821ee04-f104-3d22-96a6-9bab12eb4c28"
              #uuid "e0dfaae0-12bd-33ef-94b1-4c34842456b4"
              #uuid "99102149-c730-3271-a928-b7549ce07a13"
              #uuid "5b349ead-c3fb-374b-bb6c-47fcc3843355"
              #uuid "fb48a85b-84e9-312b-985b-de09b2c0b29f"
              #uuid "24a04d97-a632-349a-b9b1-bb49af1a096a"
              #uuid "c56337cc-54ed-3e22-8b76-d1092f67310c"
              #uuid "c7b74e13-dff8-3831-98f4-1d81198c1337"
              #uuid "7d1c07ba-7b59-3e65-b308-f82e4f02765e"
              #uuid "08cddb57-6c00-3836-9593-a0b04fd84141"
              #uuid "e8bffbf9-2f40-3bce-837e-bd9538b19c58"
              #uuid "935b4085-0cd3-3875-abe0-2996fb99980b"
              #uuid "9353a118-c201-398a-83cc-6d58ccb38f02"
              #uuid "0e7278cd-a02a-3c04-86dc-c75a4df34eb2"
              #uuid "c8ccad85-82a3-3865-8ad8-a3487faedffb"
              #uuid "cf06db18-725b-36dc-8e9c-5246b40aae01"
              #uuid "30933bc2-a19f-3124-9a19-d7b8facdbeeb"
              #uuid "accf9b44-d60e-36aa-ab3e-293a0e91aed0"
              #uuid "76a33f97-02f4-3a7e-ada3-46bd2544ae02"
              #uuid "648ffc7a-6dd1-39e8-a7f5-7ecb69cc4066"
              #uuid "054f1270-bf79-32f9-825a-96880e800c9f"
              #uuid "b2980c72-2a1a-3e7a-b030-3718ce5491d8"
              #uuid "48788b6f-7e50-3fbb-b1a8-772c4139b77a"
              #uuid "12218694-0010-31cc-a245-a502b7ed4b19"
              #uuid "4d77e635-44ee-324b-b8e1-1cd07bd913a4"
              #uuid "ea25ad16-dccd-378f-afde-9dae72c6b4d9"
              #uuid "de3493ea-6e7c-3152-9c99-22e9e501faf8"
              #uuid "bf515360-5eca-32d5-ac9d-fb620b905619"
              #uuid "434949a6-89e3-3ba2-8e67-412edc26c71f"
              #uuid "35af2b0c-b093-3e74-8ed4-e7589938e8ac"
              #uuid "cd19fd52-bf5e-3ad5-8ccf-0d6664374368"
              #uuid "73fdae1a-b0ca-3e78-b23e-a4a7101cd9e4"
              #uuid "42f0d762-a858-3dbb-b64d-dde4f6a4fc6d"
              #uuid "f072aeb8-c5dc-3eb7-9f65-6c8ab7d359a9"
              #uuid "165261a9-0183-3e53-be82-ccc197c354b8"
              #uuid "a389677b-6118-3815-84fe-c1e75f38984c"
              #uuid "cace91df-d6f2-36fc-a98a-6fa5cde7357d"
              #uuid "ca5622cb-e7ba-31f7-95df-551ad1bbe80f"
              #uuid "06ac533c-6f03-39a8-ae86-a6c373df20f3"
              #uuid "91a5169d-5877-3642-9a52-54c4f01655da"
              #uuid "027df389-a20d-3cbe-886e-a91e5b10d58a"
              #uuid "2752fdce-7879-3086-8e8e-2a54c21ee999"
              #uuid "34946d54-6d22-3af0-afdb-e795b8de802b"
              #uuid "d76c9788-f173-3fff-9b13-9ced6ab67c4a"
              #uuid "af89834e-3251-3aa9-a464-74b8d24a5091"
              #uuid "6b13ea3b-f083-34f2-adf3-f3dba030f1ef"
              #uuid "b150a64b-6e6b-3e4b-8784-e6bc946f1fc1"
              #uuid "35474b73-b019-37a7-b3d6-ee8eb6df3f8c"
              #uuid "b1ea21fb-2177-3fed-af81-0a3967e76069"
              #uuid "5f075ae3-e1f9-3038-abb8-c4632991f96f"
              #uuid "ad117101-b1d8-35b7-b02b-d335db512e5e"
              #uuid "bd4049a7-2730-31a1-bbc9-4a077d75facc"
              #uuid "e2257f79-e77e-34b7-87b1-a0924290c7f3"
              #uuid "61751dfb-a841-3676-aa92-97d75c9a9f56"
              #uuid "7fe2ec37-f762-3f17-b6c0-cc2b097adead"
              #uuid "c9e680a4-40fb-3a3e-bc38-6556dd90712b"
              #uuid "bb2b867a-583d-3e72-adf5-e81bf22baea4"
              #uuid "e8d2a59c-f315-3860-9608-b04f893cbc93"
              #uuid "f98b9f16-c08f-3903-9b7f-80481ccce0d0"
              #uuid "81cc0f79-3609-346a-8dde-65ed1c9f3c3a"
              #uuid "4846597b-0309-3cd6-9f05-12f43edf2faf"
              #uuid "d9ff8a5f-72de-3a40-99bd-301e426485bd"
              #uuid "5aac7681-3d33-3350-b4e8-43d1ae9b29e3"
              #uuid "826863b8-1605-33a8-9169-91ebcb89712b"
              #uuid "434338bc-9501-334b-adbf-2b3752e9e231"
              #uuid "08b3b128-c196-3b26-bc2f-d0e5523bc940"
              #uuid "2fe5b306-b8a0-3e8b-becf-b4a37cf52717"
              #uuid "dd1bf333-48e3-3cde-80c2-6fb824ec3563"
              #uuid "1b3840b0-b70d-31c1-be70-014c8537dbba"
              #uuid "bcfc2af4-495d-3023-83ab-12fb1057166f"
              #uuid "6da53f25-b27b-3c31-8b0d-3928dc46f469"
              #uuid "aff8862a-8fba-39a6-86f4-ef02a3a228f9"
              #uuid "b4991e13-f466-39b4-be16-56909272f1cc"
              #uuid "0ef8f876-d62a-3535-ae28-410454e3634b"
              #uuid "d701c31b-be98-3228-af7f-aaebd4cb0455"
              #uuid "e4b769db-2a42-392d-b311-b02c3545d07d"
              #uuid "1add2eb4-1fca-39b2-a15b-4a7d68571409"
              #uuid "18594966-e721-3762-8ad4-b4cc663db0b9"
              #uuid "a5d7ddea-2e79-3a0f-b248-95af3f6223d4"
              #uuid "f18187e7-f398-32f0-b73e-625e848d8333"
              #uuid "6db176b1-017b-3430-a362-e2d6ee99cc67"
              #uuid "d94472e2-8880-369b-b2f2-d1d3b83960c6"
              #uuid "83f7cd22-e2a0-3e46-b9ba-4358004dc75f"
              #uuid "2293c663-d1bc-3701-9a53-009f457c6940"
              #uuid "909332ae-bc74-34a4-8cd5-4ea30edd7930"
              #uuid "e369d9fd-2ab5-3455-9298-16db19e37fd4"
              #uuid "1c585f7b-4a5b-3e81-abe0-97ce17218168"
              #uuid "c9135569-60ba-391a-a44b-1d8f95a4eb93"
              #uuid "b1127074-659b-3102-907a-25a0473a3e98"
              #uuid "1b2a1ef5-4042-3ba6-826b-7d8fe796f7ba"
              #uuid "e1d04b1f-1d94-3006-958a-ee81242dab6d"
              #uuid "22b3df14-e100-33a6-a098-e396cb523d6a"
              #uuid "843ecaf0-bb25-3a67-af63-f8a4bc3708a3"
              #uuid "6a99a492-a63d-3ef4-a946-1cdbf945a66a"
              #uuid "aecc77c6-bfad-3a88-b455-19b8d2c86bc8"
              #uuid "0eabf8b7-0bee-38f4-bfd2-cd9ef3624d39"
              #uuid "9a6c960c-a513-3563-bb1f-1783f1aece80"
              #uuid "4921b8e8-521a-3a27-9aac-936218a067c7"
              #uuid "5a156002-5793-338e-9399-def9bfd7eca6"
              #uuid "39af5c41-5927-3dde-8a75-10397211dcda"
              #uuid "cd27a171-5aac-359b-82a4-8a86ed2000c0"
              #uuid "59bab2ff-b0ef-386f-8db8-ef439320a47e"
              #uuid "35b5c110-f2b0-3562-ae79-b51bd6300690"
              #uuid "deaefe4b-599d-3d42-982f-b0bef3bbb3d3"
              #uuid "b7dd6050-6cb3-352e-9363-36450ff12ddc"
              #uuid "792a15e4-87a1-362b-8199-5789db4c3b0a"
              #uuid "d8ac8dc4-6760-3f12-96c2-e3420b291781"
              #uuid "47a720fb-24ff-320b-99ab-77739da99a5a"
              #uuid "1ceaeab6-397f-308a-b02e-6652106f2fbd"
              #uuid "43f3a349-eec8-3b6a-9947-777f90811c90"
              #uuid "3384a03c-665a-3116-a474-cf5d4406c85a"
              #uuid "e8f7e1a7-0eb6-3e44-aee0-11dff550f9ee"
              #uuid "87f8a6ab-85c9-3ed3-b02b-4ea641ad4bb5"
              #uuid "fcbd772e-48c4-307d-bd3b-e13b37a82f5e"
              #uuid "4ab65803-6f4f-3742-85c3-84b863fed5c2"
              #uuid "58fb7a8c-d0f1-36b0-b1f5-b7091fbb0ba0"
              #uuid "903d8dd1-63cb-3a8b-bcfa-23261d6598b2"
              #uuid "dce6433a-bef0-3dff-a22e-433b721bfc14"
              #uuid "4d6bfce7-c3d0-3def-8625-e405087939ed"
              #uuid "db5ac01b-b987-3006-8f5a-61d4142920ec"
              #uuid "0663d3ee-2750-30d4-ad83-aa74a59c87ce"
              #uuid "f8049db2-d889-3677-984e-4e2ce41de578"
              #uuid "042103e1-8bdd-3157-aceb-cca413d78f3b"
              #uuid "23767cbb-cceb-3686-8a59-f0250c57a1d9"
              #uuid "b17747c8-2344-37e0-af25-4c86481d8b35"
              #uuid "1309682a-fbd4-3c2b-89cb-11c7d8048013"
              #uuid "cb6afc25-1c32-38b1-bfe0-1c3f8797a9ea"
              #uuid "e923a27a-48cd-3c06-a494-d0fa119478a8"
              #uuid "51c249b0-90c8-3a66-8732-f796a82e5382"
              #uuid "e3ff49f1-3a4e-3be2-9c80-51385adc499c"
              #uuid "6322ea9d-5e70-3e8c-89a6-0e261275b1d1"
              #uuid "46df0476-0eb0-30b7-92cd-7703972c5f1a"
              #uuid "df4c4520-3102-33f1-9a51-ee304c193f23"
              #uuid "2bc22d15-7e2b-3a2d-aaaa-46fe0f8945e2"
              #uuid "5af83e31-96bf-39f4-80f3-1f2e1a6c9afe"
              #uuid "b75229d9-66a3-3ee4-86f4-e1e5f353d9a4"
              #uuid "e7c82f28-5b8e-3311-8519-a3cfa713dec3"
              #uuid "a2cce669-b64c-31e7-9afb-63f03c696fee"
              #uuid "a4eb9598-b375-3f22-8363-e0295ac2f5f2"
              #uuid "d5380d3b-56d5-3783-a863-1af12c39f5c7"
              #uuid "c1fa67fc-99a3-39a4-962b-ba099f84d11c"
              #uuid "1cdae507-3b8e-324b-9d32-0d5c541166f3"
              #uuid "33e20383-3807-3414-869c-7a3907d40b75"
              #uuid "a4c50ca7-7a49-3873-a656-5ba52bc56488"
              #uuid "eb9bd23b-c056-3a5d-a53d-78b2dcbd15ae"
              #uuid "edfa15bc-3235-3696-aaad-09e432fc6662"
              #uuid "f81386ae-7767-3f93-a560-c78df55109bb"
              #uuid "f6be0578-56d6-30b6-ad51-8713fc8f260a"
              #uuid "d18a26f4-6f25-37b2-a861-2147cf47cf18"
              #uuid "54b141a9-4bee-378e-b867-fd1d4729f014"
              #uuid "e5279fe2-9e7a-313b-9b5d-e2d1f6a1e8db"
              #uuid "b7c512a7-a3f4-35d4-a416-c10bffb57bb4"
              #uuid "5e611ca2-e99d-358f-adc6-f3f7bcfb3ad5"
              #uuid "11a2b6fb-2a70-314c-b249-9d7b509352e5"
              #uuid "c64e760d-cd41-31b1-9626-a196593146fa"
              #uuid "ad09b2d4-8b28-31c6-8e5a-2bf421f7f2f2"
              #uuid "8acfd5b8-b774-39c4-a04c-29420e5631c0"
              #uuid "e6d5c2ee-6c34-370d-b344-30cc5ee8a749"
              #uuid "3da3ce69-4e95-3c15-beec-5d9ec2078260"
              #uuid "7d9f1d6a-539f-3506-a533-6d5ff7e5df57"
              #uuid "f77b4d34-54f4-37eb-8a5b-6d8df9e0f66d"
              #uuid "431d180f-b4d4-35f3-8c95-96ad5a7267d6"
              #uuid "113e202b-52db-3631-b4c4-7027d1edccf5"
              #uuid "655dd7fb-2048-304d-ac0f-6a354ff76bc2"
              #uuid "a65fe9b8-99d0-317b-9c91-7b969001669d"
              #uuid "e261ac28-9c39-30db-81d4-e7551f8b4fe6"
              #uuid "77933845-adf8-3758-a686-a08ea46f015e"
              #uuid "7bd8e302-1270-3448-8815-58d1f6da0834"
              #uuid "6e6f4eb8-c896-3609-ae50-49ede7fbf6ad"
              #uuid "3992d652-f81d-3e86-bd6e-2e685cb351a3"
              #uuid "a2a3a034-7f0f-301a-8473-dd54dca2462e"
              #uuid "c59a448e-a61e-3dad-871d-f3bc7ebe6774"
              #uuid "b172271f-a27d-3300-9b46-7f9825f0727e"
              #uuid "d5fd1c48-4bc6-3542-8805-4964fab16e05"
              #uuid "568da493-2833-3009-ad26-7108e0683081"
              #uuid "2e994ee0-a8fc-32ef-a229-a0d74edf07cf"
              #uuid "cd9b3130-0865-3759-962d-9c3eab8d03f4"
              #uuid "6b35d568-0483-3a28-a965-30b88e49b9f5"
              #uuid "1c1ad4ae-57a5-38c9-8c80-666849f4eeec"
              #uuid "106facbb-305a-30f4-afe6-9fe69cfadbdc"
              #uuid "2c11257f-a438-3f75-8fac-459a4275e4c1"
              #uuid "d8d090ed-62f4-3521-8f53-6cd65960c06e"
              #uuid "4615cd89-6ac7-3867-a94c-ceb0a15a7b13"
              #uuid "9cf42701-85ad-3877-9a0f-cf57a5acf172"
              #uuid "51817160-093d-3773-957a-662779bebec9"
              #uuid "56be7020-8ac5-312f-9c02-a912103646d9"
              #uuid "7f5c4b62-c9ec-3866-8ad6-598ebab4623a"
              #uuid "9db165b4-98ba-3935-9f4e-a7bd23beb693"
              #uuid "761cd5e5-55ee-39c8-b789-0273d2493fe8"
              #uuid "cb4c3448-07c8-36e6-8cbd-28f45339be1d"
              #uuid "ff75a7b6-d946-39dc-b9cf-69635113e6f4"
              #uuid "edcee0da-2a9f-3e86-ab60-5a78ad6f26ee"
              #uuid "2c63539a-a2a5-3415-b3d7-89edc773ac8b"
              #uuid "51c77b26-5d4b-3952-ac93-fa7002f8a379"
              #uuid "1e78ea48-893a-3f8e-91e2-01c9ff0e706e"
              #uuid "b8909580-a299-3ec5-848c-548f38510b72"
              #uuid "2b110ae1-40c3-3594-bdfa-8a5bfe402f8b"
              #uuid "9c557202-449d-3095-b805-89c2e6e0fe50"
              #uuid "e154f5ce-d498-3840-a559-661a996d4d09"
              #uuid "0071dfa9-ec41-35e2-befc-ecbe183ff272"
              #uuid "8881688f-f717-3852-a5df-d3c7386562d1"
              #uuid "1bd17795-c173-3c75-9489-8343917b819a"
              #uuid "0d794c9d-d65b-3e94-8ce2-fe8020a2a53c"
              #uuid "595f02eb-d247-3d88-95e4-06800f89e71a"
              #uuid "5e679cbb-17a6-3355-9ddc-017e474ea5a9"
              #uuid "62326243-6ea0-3ce1-aef6-c1d285dbdc80"
              #uuid "d8b44a4f-28ae-353d-adeb-b3fd26fc143b"
              #uuid "134c5416-16b9-3118-a547-774f6df7bbcd"
              #uuid "5140d848-4910-3017-8f45-c2851658966b"
              #uuid "928c51b9-1ca6-3be5-b2f1-e665e90fab70"
              #uuid "ebb89386-c539-37db-b4a7-972b931256f7"
              #uuid "f945232e-faca-3164-a579-88d416e62368"
              #uuid "7b1d9fe4-27bb-3db5-af9b-89f0785afc59"
              #uuid "90a300ed-ea38-3514-b744-0c43440fa4b3"
              #uuid "ea2abdf4-a5ae-3c18-be7b-bd2db0068ddb"
              #uuid "3d1f92a5-65d3-31a6-9880-236e33c49bf3"
              #uuid "05e84109-515f-3f98-8ab8-872a8a1a9cb2"
              #uuid "24689901-b879-3cd9-9b75-5dd7dd2b8f2d"
              #uuid "39063899-ef80-383a-97b7-38b8c778cc24"
              #uuid "8107587f-5b81-3b66-9d13-2fa6e9a887df"
              #uuid "8ae6e417-a5fe-36fa-9be3-bd2c6ac61840"
              #uuid "08240ccd-42ce-3242-b2f3-7bf5b24420fe"
              #uuid "f4afb893-6f91-3389-8606-9c088ff6ea75"
              #uuid "578002db-1bee-32a8-949c-58bece6429a5"
              #uuid "64b81638-f97f-36d4-ad33-08e915a1750e"
              #uuid "aacb653d-e587-34a7-a360-4c3956b4f677"
              #uuid "c377afb2-e46b-30b6-968e-71cb449ac3ea"
              #uuid "77926e55-5ca9-34b7-8f65-009dd92da63b"
              #uuid "7416a104-a4b4-3c68-895e-98e989dce7de"
              #uuid "59f822bc-aa8e-319b-9e63-eb00919b367a"
              #uuid "074edbaf-ed58-3f43-ad67-8af6ba4fcefe"
              #uuid "bc6235a4-d8ed-3225-86d0-ce30fcb2da6a"
              #uuid "7a51eb3c-d160-3393-b631-9ae87020b9db"
              #uuid "6b8723ed-8ce2-3285-963d-9682f60b0287"
              #uuid "6ad0df6a-ac90-3fc1-a6fc-cdd155147a92"
              #uuid "32288419-57f9-3b53-a2df-4b3393930c5a"
              #uuid "44ca4f9f-417c-3200-b21f-4ae33fae9646"
              #uuid "ae7bda5b-fa73-3e1b-b30b-c81fd70b93f5"
              #uuid "3f9e8eb6-bc1b-357a-949e-643f14a3cedf"
              #uuid "97fe9a27-6b0c-3281-8d07-433af5bcf4e4"
              #uuid "c2ea7289-9af9-3d4e-8061-55ca7bf82b6b"
              #uuid "6fe16b2e-cfb7-3be8-8013-6c163b70120b"
              #uuid "0a4d7b38-fbbc-3f6c-88fe-b09fc35ad1a6"
              #uuid "3463c066-922f-3864-93bd-b87bb1286679"
              #uuid "d993f311-557a-391d-ab21-677ab586a01b"
              #uuid "d46d3296-6569-3615-8e1d-5ac2e88a346a"
              #uuid "191e854e-b00d-3d80-8fa1-fed83b373be7"
              #uuid "9cb073d5-2081-32d7-9991-a6077288e01e"
              #uuid "36749cc5-01bd-3292-aaaf-44525fc6ed7b"
              #uuid "05ae57bb-e135-3a41-87f7-2bc52f18bff4"
              #uuid "30fe5e0d-e895-3a87-87df-7cdfbdd1f7ab"
              #uuid "7369ff3a-fe64-30e3-8363-9067a97ac8b4"
              #uuid "abe1a4aa-bcd0-3440-8bb5-a57f0dcc37ac"
              #uuid "01c751b5-3d59-3358-a6e3-3ab7ddceb42f"
              #uuid "cbed48f7-5fef-3645-9ebc-db33807e504c"
              #uuid "a408c9e7-3639-3621-b65f-1f8aeea37b18"
              #uuid "5af4832c-3c6d-3e4b-883d-4fbba7190317"
              #uuid "48309f49-6981-3784-80f4-f8b7cff15c98"
              #uuid "09e49bb6-1f03-33a3-bfbe-8937e2e031e8"
              #uuid "dfa418bd-eebc-3c3f-96b6-edaf5e3c4d89"
              #uuid "f72af12f-4736-3bde-84b0-ca91070cf43c"
              #uuid "ef81a392-af64-3668-81ff-2c3b7736919f"
              #uuid "69895ff2-b990-3611-827e-f4f7fd32eb8a"
              #uuid "664d0a6d-1ba3-3b2b-961f-16ce489ff406"
              #uuid "ebe3d298-d25e-3110-8e34-1c079e9455d9"
              #uuid "7faaa1de-90c9-3f60-a58e-46fae6daf77c"
              #uuid "b8f4ece4-3fa5-3fc3-9f1d-a34aec906149"
              #uuid "d55cb47e-7f6c-3de3-afe9-3acfd3bd09af"
              #uuid "ebb7a837-d8f1-3d0c-a149-24e17e4005dc"
              #uuid "9ecf0011-c0af-37eb-a590-f247005f0399"
              #uuid "3cad23d1-2f51-3a7b-8a51-4c256db8638d"
              #uuid "a9957800-b641-3919-9ff6-ca11f1c233c4"
              #uuid "e29fbec4-4c71-3519-8e93-582b67df86f4"
              #uuid "af493a90-a6e6-31a5-966e-beed6fcfe1b4"
              #uuid "a6092dda-9d9f-3b45-b148-b73eb5da724a"
              #uuid "647e229b-c07b-3419-a641-254ed8b96dbd"
              #uuid "e9e59065-5acd-3d1d-876b-8cb866541534"
              #uuid "114f738d-8858-3e7b-9fdc-41ddb2758725"
              #uuid "ed2baf70-63da-3cbe-9737-466f5a29fe95"
              #uuid "90f166e5-27c4-3684-8865-0a7d63773ce7"
              #uuid "5f955ad8-59ca-3215-9cab-4fa839d2a033"
              #uuid "eab3ae9a-3d28-3df8-affc-d917c97d7195"
              #uuid "3b726f01-748c-32b9-ac65-408fdb259e18"
              #uuid "39458645-fcb9-368d-81b6-ad23bbed69cf"
              #uuid "6e8ce4f2-3cc4-37b8-9002-721e44843aaf"
              #uuid "07f37b38-2b05-392e-91fd-d4e76cc7fbf0"
              #uuid "6f243f7a-f0d3-3ed7-8572-4782675ddb75"
              #uuid "20263815-62ac-3093-af3d-0f4a0f0538bb"
              #uuid "bddc24af-3739-3b8e-bfcb-17b4a25b7153"
              #uuid "189f9b13-158d-379b-9440-05b9bc24a356"
              #uuid "f750d160-d009-3c96-a630-eff035abfd6c"
              #uuid "e1405ecf-c37a-3cdf-9bc0-46ca9df2e685"
              #uuid "db6d2f3a-d731-3ddd-9e97-4b857d9ac065"
              #uuid "f7625727-1129-3703-96c0-442c8ac00dae"
              #uuid "4fce228a-9d44-32fe-ac24-659f263ee51e"
              #uuid "edc4787a-b55f-39c5-ab40-a99f7c1a0c80"
              #uuid "af817d47-9021-3806-800d-7ef8dab08024"
              #uuid "20b16954-6c66-3536-b816-f13d464da44c"
              #uuid "645ab7f6-09eb-3401-988d-97cd930668c1"
              #uuid "01f7b705-9b33-3897-969b-343e8a6e682e"
              #uuid "6fe19369-f217-3b8c-a477-7fca8a743df4"
              #uuid "bdc861dc-6b29-3561-92f7-d53f184e07fc"
              #uuid "dee45e08-5103-32ec-93b7-17d391b64576"
              #uuid "9db68b1a-dbc5-3564-ab25-1023e94227a1"
              #uuid "d80578d7-99b8-36c3-84e7-da04814b80f5"
              #uuid "3ca4bbbb-2ab4-3ee4-85af-cd73036a4cd3"
              #uuid "458d2163-a348-30c3-a4ad-8792fa32645c"
              #uuid "97fc6923-396a-3ad8-8a4c-70879893f4b7"
              #uuid "ec9a79c1-8253-3d39-9f07-8382ba20e59f"
              #uuid "19adc592-fdfe-37ba-81a5-d195098fc52d"
              #uuid "02b25657-6abc-3080-8fb9-16100cb17ad5"
              #uuid "effdb9ce-6c5d-34df-b1b8-9d7069c8e0fb"
              #uuid "ac19727b-672c-352f-b393-c52a81b055cb"
              #uuid "edbf5fa9-4b8b-3458-ace1-fe46640503a1"
              #uuid "7e7fdd38-98cc-3f0f-a059-308e820a2013"
              #uuid "3ed6a2fa-a80b-3140-9878-53dd29c238b8"
              #uuid "984c20a2-ad28-3167-b8ae-fcef61acbced"
              #uuid "17b41f7f-4de8-3fe3-be7f-91fc18e29b8a"
              #uuid "44de8c27-9942-39ca-997c-57ff932fc882"
              #uuid "b11ddc7e-1671-30bd-a2dc-89dd757508d4"
              #uuid "1fff84e0-9d09-3677-a846-84f01c21b161"
              #uuid "5610f650-22c6-3571-bffa-cfd6a9d68b2a"
              #uuid "5f04dffc-be2c-351d-adf5-f41fb7084b4e"
              #uuid "309ea4eb-582b-3fb9-93ca-87fd54016d3e"
              #uuid "c3fa9226-9cf9-3afa-8844-dff274cc446d"
              #uuid "c31af57c-a315-3610-b455-9d5f386f31e0"
              #uuid "51e8b349-68a5-36bd-84d2-d7b86bb0765b"
              #uuid "9cfc3b97-43a7-3c0f-a7c6-2b42b62c90f6"
              #uuid "2d7c2d23-5fac-3ff4-8aac-33c2ce47eb1c"
              #uuid "abe58998-3062-3866-9238-314af7ba0265"
              #uuid "7873a90e-ea1b-3b3b-8ca8-4820dc662976"
              #uuid "0aba0975-5e75-3a94-8bfe-fd86797f7ce8"
              #uuid "0a995f25-bdf2-358f-bf5a-93e22c9aa05b"
              #uuid "133c22e7-c259-3256-a323-5b88f0b6a645"
              #uuid "1fdd0d64-7a70-3a2d-93b1-bbf278454b32"
              #uuid "c6dfc763-4e0a-33ee-b4b9-efe1ce4f82b3"
              #uuid "5b444b22-2047-3124-af08-48687f72a6b5"
              #uuid "af472b73-df4f-3397-a8c7-31a328913353"
              #uuid "7c823c08-2b3e-3613-bf68-fde60227450d"
              #uuid "227fed4b-25cc-316a-b15e-6c9a064702db"
              #uuid "91934e02-f64d-3aab-9536-19f592307a91"],
             :com.boardgamegeek.boardgame/max-players
             [#uuid "4a3e0096-1a08-379c-b4f9-1ca0070ea2f5"
              #uuid "64581d49-5b7a-3952-b129-c64b56c406ed"
              #uuid "4080e14f-b40a-3b33-98cf-83612aaecf76"
              #uuid "6d8aa71d-1531-3019-ac35-ea2463485268"
              #uuid "780cd613-d706-3945-8ef3-6d59c16c2312"
              #uuid "46abbae9-5fbc-3520-9ed2-16c2901bdbae"
              #uuid "358a9cb1-8677-3a1b-90ac-1c8d6ffa6288"
              #uuid "526e6774-4f0b-3073-9ec1-7c191c62d24c"
              #uuid "24380876-a0ae-3b46-a8c6-a092619bef37"
              #uuid "3be646fb-70d6-3079-b0a7-35b697a011c8"
              #uuid "6f074a1d-f38a-33df-b9d8-d724a8ed3410"
              #uuid "51a7df93-adb9-3cee-bc0c-05f7dc89f774"
              #uuid "a4a4e5f6-a7ab-31b8-8ec1-0983b264ed4b"
              #uuid "8ec8175e-8c92-3f65-a885-97c16ca93454"
              #uuid "7b6a839b-181c-3d7e-a88a-1115d8a027c2"
              #uuid "d9f82ac3-bc24-3fa7-8292-3fff745ff105"
              #uuid "d0c13971-6116-34f0-ba4f-9f6b16e7b130"
              #uuid "fd3be4f0-d310-39a4-86b8-03524d064ee6"
              #uuid "701ae3e6-c75d-3e66-ab6a-b255f6fade83"
              #uuid "2f266ba4-d63b-34be-8400-6b95a3442ff9"
              #uuid "a93478e2-7d6a-36e5-8e4e-8b4c3f632b0c"
              #uuid "280a5f64-7a78-3590-8dd0-81f7136e31b5"
              #uuid "cedb275c-f7e8-3cf1-9073-41cff22af498"
              #uuid "886937cd-0285-3aad-834d-f6e5bd1d1dfb"
              #uuid "642edb7f-7af6-3c4b-8b07-5ac20dcba0b9"
              #uuid "c8835178-b83e-3ef2-84d6-ed36804309c8"
              #uuid "2ffb14ad-8e1d-3f3c-9df9-133b523d8287"
              #uuid "0d22fe23-de11-3728-9634-4b0114313a9f"
              #uuid "d803129a-da52-3403-b88a-1331f9bf89b1"
              #uuid "0d600bac-e4d6-3227-b4bf-b0d9fee001c6"
              #uuid "c693b4c3-9720-303a-836a-8f25b4da698a"
              #uuid "e74ac58d-7a69-3b4b-9cff-6dc08fd9f434"
              #uuid "d8b5d495-0030-372f-8b5b-3131d1bcddc1"
              #uuid "3b11574d-ac04-3356-aa1c-eb3ac5ef4c6f"
              #uuid "a673ace7-74a3-384d-823b-f8131295d6d1"
              #uuid "f0343033-f91c-3c5a-9064-4138ea33af2f"
              #uuid "938351d5-c89e-32e0-af3b-73d217217b14"
              #uuid "4d4c8a37-4103-35eb-b414-672ae3f8ea83"
              #uuid "61f2c08e-b43e-3b4f-80bd-d988013ee49b"
              #uuid "a58b4cee-88af-34f8-9ad6-839f132388f0"
              #uuid "d99574a4-a1a2-3d19-96ca-d4f5094dca65"
              #uuid "53b40008-e2e5-3189-9b82-fd0ba46405e3"
              #uuid "b4f52f37-41db-379b-94e2-3b8911f49401"
              #uuid "12fd071d-60ce-3146-b555-655882920638"
              #uuid "0dd28a2a-30d5-3d29-97ba-3e8bfa086f0f"
              #uuid "da846ac4-d725-3d51-8667-b8ab69c960fb"
              #uuid "4a734354-588a-3c87-bd6f-48f09c3e691f"
              #uuid "41e6fb49-794a-3928-bc31-b058fc3f832d"
              #uuid "c6dab445-bf7e-39be-b4cb-6f22ae7e715a"
              #uuid "275ef384-7d59-3c1c-8625-ec7a6d5208b6"
              #uuid "5aeb1f62-f6cd-396d-881c-07d58b82f143"
              #uuid "cba95a42-c53b-3c6f-bf3d-df9bf10a4069"
              #uuid "b86c48fe-3ed8-3b4e-9369-6d3957a9d311"
              #uuid "67e88af3-f2d3-3953-9be7-c1b26fefe183"
              #uuid "e56eb8fb-70f3-368a-b45d-dec1e25f35aa"
              #uuid "ba776ee9-9ebc-3521-9d9d-ce1c6a702748"
              #uuid "c3fea04b-2042-3a0f-ab59-e7cedee3e1bf"
              #uuid "200327ec-e2f1-3904-9057-9c80de5c3e0f"
              #uuid "6b1a6c6e-487e-334f-97cf-8b0efad2f3f9"
              #uuid "7cd74735-c2f6-352d-8428-474bc1b6b386"
              #uuid "7b9a4759-a742-301f-b458-f4ef2d8368da"
              #uuid "d20adb03-0a94-319b-9d04-188d5cad9da6"
              #uuid "b7ae6819-447d-36c3-bb6a-0e7dbe5c17ce"
              #uuid "0f797b16-678f-32d3-af6d-84b6d8f6ad20"
              #uuid "f5c8ba24-2c49-3844-8721-5cf4e518c90f"
              #uuid "875b8289-de41-3672-8c92-95b6a689ff43"
              #uuid "653e0f82-5aec-3cf2-86d0-4422c6b2f8cd"
              #uuid "66437274-239d-371f-a5d1-71102dca56e3"
              #uuid "ccfd0e0f-749f-3a3a-a9cc-7c01a70ea5fd"
              #uuid "72b0f8c3-5245-35e0-9a66-484200882d79"
              #uuid "cf3b2299-3275-32a1-bcc3-40c64f229538"
              #uuid "a09707a5-88fc-32fa-b544-8afa929496ab"
              #uuid "104965da-ee0b-3867-95a3-0416228b7b19"
              #uuid "40bd8e35-d86c-3ba3-8791-e33dad4f0330"
              #uuid "bbf3c83b-9b9a-3dfd-9cc3-d3295f5d235f"
              #uuid "7e7123b0-d269-3d5d-9ec8-d12c52a8ed8a"
              #uuid "5c50d320-55f3-337f-b820-3e559968a3f1"
              #uuid "fd6267f8-71dc-3dc3-9ad9-e13b844fed44"
              #uuid "29b3ea31-ed18-3383-b4af-bfe1002404ae"
              #uuid "47dbc903-625e-337e-b249-2dbf0b1b9527"
              #uuid "e214a1ce-1929-3835-b502-4510ef89f940"
              #uuid "fab76503-1b94-3d49-8b17-1336fababeec"
              #uuid "dd1bf333-48e3-3cde-80c2-6fb824ec3563"
              #uuid "83f7cd22-e2a0-3e46-b9ba-4358004dc75f"
              #uuid "a6480b1c-62dd-3ceb-9f94-fb57c823691e"
              #uuid "110f4e5f-593e-3ca2-819e-29dab8ad6f55"
              #uuid "e3a13cf1-2d4f-3a6a-9791-62315cf53ba2"
              #uuid "2e89598e-c81e-39d5-bae2-aee451063265"
              #uuid "30c12229-f508-341c-9680-149dbdf88523"
              #uuid "0727c24e-c484-3017-9850-a0e366a7dd42"
              #uuid "648ffc7a-6dd1-39e8-a7f5-7ecb69cc4066"
              #uuid "ffbd4d36-9e2e-3949-8c47-2403ba1b4e8a"
              #uuid "2752fdce-7879-3086-8e8e-2a54c21ee999"
              #uuid "34946d54-6d22-3af0-afdb-e795b8de802b"
              #uuid "d76c9788-f173-3fff-9b13-9ced6ab67c4a"
              #uuid "5f075ae3-e1f9-3038-abb8-c4632991f96f"
              #uuid "d9ff8a5f-72de-3a40-99bd-301e426485bd"
              #uuid "434338bc-9501-334b-adbf-2b3752e9e231"
              #uuid "2fe5b306-b8a0-3e8b-becf-b4a37cf52717"
              #uuid "6da53f25-b27b-3c31-8b0d-3928dc46f469"
              #uuid "e4b769db-2a42-392d-b311-b02c3545d07d"
              #uuid "d94472e2-8880-369b-b2f2-d1d3b83960c6"
              #uuid "6a99a492-a63d-3ef4-a946-1cdbf945a66a"
              #uuid "0eabf8b7-0bee-38f4-bfd2-cd9ef3624d39"
              #uuid "b7dd6050-6cb3-352e-9363-36450ff12ddc"
              #uuid "51c249b0-90c8-3a66-8732-f796a82e5382"
              #uuid "a2cce669-b64c-31e7-9afb-63f03c696fee"
              #uuid "edfa15bc-3235-3696-aaad-09e432fc6662"
              #uuid "ad09b2d4-8b28-31c6-8e5a-2bf421f7f2f2"
              #uuid "431d180f-b4d4-35f3-8c95-96ad5a7267d6"
              #uuid "bb7745e6-fe51-351f-843c-5012bd13d334"
              #uuid "a65fe9b8-99d0-317b-9c91-7b969001669d"
              #uuid "7bd8e302-1270-3448-8815-58d1f6da0834"
              #uuid "3992d652-f81d-3e86-bd6e-2e685cb351a3"
              #uuid "c59a448e-a61e-3dad-871d-f3bc7ebe6774"
              #uuid "9cf42701-85ad-3877-9a0f-cf57a5acf172"
              #uuid "9db165b4-98ba-3935-9f4e-a7bd23beb693"
              #uuid "5e679cbb-17a6-3355-9ddc-017e474ea5a9"
              #uuid "f945232e-faca-3164-a579-88d416e62368"
              #uuid "3d1f92a5-65d3-31a6-9880-236e33c49bf3"
              #uuid "77926e55-5ca9-34b7-8f65-009dd92da63b"
              #uuid "074edbaf-ed58-3f43-ad67-8af6ba4fcefe"
              #uuid "191e854e-b00d-3d80-8fa1-fed83b373be7"
              #uuid "36749cc5-01bd-3292-aaaf-44525fc6ed7b"
              #uuid "e369d9fd-2ab5-3455-9298-16db19e37fd4"
              #uuid "49b5473d-32f5-382b-943a-dda4a1491daf"
              #uuid "00dbe22a-358d-364c-aa3e-6da841b451dc"
              #uuid "f8283731-6cf2-3086-8140-494037314bf5"
              #uuid "d496a066-c36e-3570-99d1-9eedec118dee"
              #uuid "0746ccba-be89-3d2f-a4b6-af590e489ff0"
              #uuid "109a021a-56f4-3223-ae04-902a1f40db16"
              #uuid "492b7750-c3e8-3055-a93b-6745391300a6"
              #uuid "7d9e8262-8714-332c-9ca9-ac68c68596b5"
              #uuid "582d2648-b634-3370-a31e-bef979dab3f3"
              #uuid "d8ebf6a0-f01a-377d-82c8-e903e801973b"
              #uuid "3e302b86-f47c-3d22-9b4d-c253439d9970"
              #uuid "941e3f4a-24d8-3841-8144-e9db47d6f92b"
              #uuid "660cb8dd-c782-3542-8db8-9e1dc61af856"
              #uuid "c413a292-7a46-3ea3-aa4d-896b4b1e78e0"
              #uuid "c180dcbb-f5dd-3cdf-acb3-dfe83bc594ec"
              #uuid "def6402b-3a6f-30cb-aeb3-63cd5cefb20d"
              #uuid "7c1ada9b-f78c-379d-a6a7-b3018581aab9"
              #uuid "59ccf897-4368-3ab7-ae8e-0ac969872f6e"
              #uuid "48309f49-6981-3784-80f4-f8b7cff15c98"
              #uuid "dd86edfc-d85e-3039-9399-5c282a2e3524"
              #uuid "f821ee04-f104-3d22-96a6-9bab12eb4c28"
              #uuid "e0dfaae0-12bd-33ef-94b1-4c34842456b4"
              #uuid "99102149-c730-3271-a928-b7549ce07a13"
              #uuid "7d1c07ba-7b59-3e65-b308-f82e4f02765e"
              #uuid "e8bffbf9-2f40-3bce-837e-bd9538b19c58"
              #uuid "0e7278cd-a02a-3c04-86dc-c75a4df34eb2"
              #uuid "30933bc2-a19f-3124-9a19-d7b8facdbeeb"
              #uuid "054f1270-bf79-32f9-825a-96880e800c9f"
              #uuid "ef81a392-af64-3668-81ff-2c3b7736919f"
              #uuid "b2980c72-2a1a-3e7a-b030-3718ce5491d8"
              #uuid "4d77e635-44ee-324b-b8e1-1cd07bd913a4"
              #uuid "ea25ad16-dccd-378f-afde-9dae72c6b4d9"
              #uuid "34c99f3a-1325-32c3-865d-f7e597f25a8d"
              #uuid "06ac533c-6f03-39a8-ae86-a6c373df20f3"
              #uuid "91a5169d-5877-3642-9a52-54c4f01655da"
              #uuid "027df389-a20d-3cbe-886e-a91e5b10d58a"
              #uuid "af89834e-3251-3aa9-a464-74b8d24a5091"
              #uuid "6b13ea3b-f083-34f2-adf3-f3dba030f1ef"
              #uuid "b150a64b-6e6b-3e4b-8784-e6bc946f1fc1"
              #uuid "b1ea21fb-2177-3fed-af81-0a3967e76069"
              #uuid "ad117101-b1d8-35b7-b02b-d335db512e5e"
              #uuid "e2257f79-e77e-34b7-87b1-a0924290c7f3"
              #uuid "e5c528dd-2ba9-3a89-ac17-c427f0c00414"
              #uuid "c9e680a4-40fb-3a3e-bc38-6556dd90712b"
              #uuid "5aac7681-3d33-3350-b4e8-43d1ae9b29e3"
              #uuid "826863b8-1605-33a8-9169-91ebcb89712b"
              #uuid "08b3b128-c196-3b26-bc2f-d0e5523bc940"
              #uuid "1b3840b0-b70d-31c1-be70-014c8537dbba"
              #uuid "aff8862a-8fba-39a6-86f4-ef02a3a228f9"
              #uuid "d701c31b-be98-3228-af7f-aaebd4cb0455"
              #uuid "18594966-e721-3762-8ad4-b4cc663db0b9"
              #uuid "f18187e7-f398-32f0-b73e-625e848d8333"
              #uuid "2293c663-d1bc-3701-9a53-009f457c6940"
              #uuid "909332ae-bc74-34a4-8cd5-4ea30edd7930"
              #uuid "1c585f7b-4a5b-3e81-abe0-97ce17218168"
              #uuid "c9135569-60ba-391a-a44b-1d8f95a4eb93"
              #uuid "b1127074-659b-3102-907a-25a0473a3e98"
              #uuid "22b3df14-e100-33a6-a098-e396cb523d6a"
              #uuid "843ecaf0-bb25-3a67-af63-f8a4bc3708a3"
              #uuid "aecc77c6-bfad-3a88-b455-19b8d2c86bc8"
              #uuid "5a156002-5793-338e-9399-def9bfd7eca6"
              #uuid "cd27a171-5aac-359b-82a4-8a86ed2000c0"
              #uuid "59bab2ff-b0ef-386f-8db8-ef439320a47e"
              #uuid "423cb589-88be-336d-ada8-9817b5fe519e"
              #uuid "35b5c110-f2b0-3562-ae79-b51bd6300690"
              #uuid "792a15e4-87a1-362b-8199-5789db4c3b0a"
              #uuid "d8ac8dc4-6760-3f12-96c2-e3420b291781"
              #uuid "1ceaeab6-397f-308a-b02e-6652106f2fbd"
              #uuid "43f3a349-eec8-3b6a-9947-777f90811c90"
              #uuid "3980f7ea-079b-3741-a713-8494f6bcbb9a"
              #uuid "3384a03c-665a-3116-a474-cf5d4406c85a"
              #uuid "e8f7e1a7-0eb6-3e44-aee0-11dff550f9ee"
              #uuid "fcbd772e-48c4-307d-bd3b-e13b37a82f5e"
              #uuid "d88a6b63-1a1c-36ea-95d1-2d05210eb706"
              #uuid "530b622e-6e90-30f4-b806-d0cbf74102a5"
              #uuid "4ab65803-6f4f-3742-85c3-84b863fed5c2"
              #uuid "903d8dd1-63cb-3a8b-bcfa-23261d6598b2"
              #uuid "dce6433a-bef0-3dff-a22e-433b721bfc14"
              #uuid "0663d3ee-2750-30d4-ad83-aa74a59c87ce"
              #uuid "042103e1-8bdd-3157-aceb-cca413d78f3b"
              #uuid "b17747c8-2344-37e0-af25-4c86481d8b35"
              #uuid "6322ea9d-5e70-3e8c-89a6-0e261275b1d1"
              #uuid "46df0476-0eb0-30b7-92cd-7703972c5f1a"
              #uuid "df4c4520-3102-33f1-9a51-ee304c193f23"
              #uuid "2bc22d15-7e2b-3a2d-aaaa-46fe0f8945e2"
              #uuid "704d0598-6340-3c49-b5b5-9d0fcf54e1f3"
              #uuid "36f8c047-0a0d-34e8-920b-337b779969ab"
              #uuid "b75229d9-66a3-3ee4-86f4-e1e5f353d9a4"
              #uuid "d5380d3b-56d5-3783-a863-1af12c39f5c7"
              #uuid "1cdae507-3b8e-324b-9d32-0d5c541166f3"
              #uuid "33e20383-3807-3414-869c-7a3907d40b75"
              #uuid "e9de6ee3-1f19-36e8-bdf0-3b24bacd02cc"
              #uuid "eb9bd23b-c056-3a5d-a53d-78b2dcbd15ae"
              #uuid "f6be0578-56d6-30b6-ad51-8713fc8f260a"
              #uuid "db6d2f3a-d731-3ddd-9e97-4b857d9ac065"
              #uuid "4fce228a-9d44-32fe-ac24-659f263ee51e"
              #uuid "e5279fe2-9e7a-313b-9b5d-e2d1f6a1e8db"
              #uuid "b7c512a7-a3f4-35d4-a416-c10bffb57bb4"
              #uuid "c64e760d-cd41-31b1-9626-a196593146fa"
              #uuid "8acfd5b8-b774-39c4-a04c-29420e5631c0"
              #uuid "3da3ce69-4e95-3c15-beec-5d9ec2078260"
              #uuid "7d9f1d6a-539f-3506-a533-6d5ff7e5df57"
              #uuid "f77b4d34-54f4-37eb-8a5b-6d8df9e0f66d"
              #uuid "113e202b-52db-3631-b4c4-7027d1edccf5"
              #uuid "77933845-adf8-3758-a686-a08ea46f015e"
              #uuid "a2a3a034-7f0f-301a-8473-dd54dca2462e"
              #uuid "b172271f-a27d-3300-9b46-7f9825f0727e"
              #uuid "2e994ee0-a8fc-32ef-a229-a0d74edf07cf"
              #uuid "1c1ad4ae-57a5-38c9-8c80-666849f4eeec"
              #uuid "2c11257f-a438-3f75-8fac-459a4275e4c1"
              #uuid "88857068-79d6-3142-9e20-b8c7fd8b986d"
              #uuid "d8d090ed-62f4-3521-8f53-6cd65960c06e"
              #uuid "7f5c4b62-c9ec-3866-8ad6-598ebab4623a"
              #uuid "761cd5e5-55ee-39c8-b789-0273d2493fe8"
              #uuid "cb4c3448-07c8-36e6-8cbd-28f45339be1d"
              #uuid "edcee0da-2a9f-3e86-ab60-5a78ad6f26ee"
              #uuid "51c77b26-5d4b-3952-ac93-fa7002f8a379"
              #uuid "f00e2b92-434d-31e6-8a25-1b16618b5ab5"
              #uuid "2b110ae1-40c3-3594-bdfa-8a5bfe402f8b"
              #uuid "8881688f-f717-3852-a5df-d3c7386562d1"
              #uuid "0d794c9d-d65b-3e94-8ce2-fe8020a2a53c"
              #uuid "af9c7e15-a449-3e77-9dcf-1fed9a676d1f"
              #uuid "72e2061f-c210-3f0c-bdd2-68d09fb15b98"
              #uuid "134c5416-16b9-3118-a547-774f6df7bbcd"
              #uuid "5140d848-4910-3017-8f45-c2851658966b"
              #uuid "928c51b9-1ca6-3be5-b2f1-e665e90fab70"
              #uuid "8107587f-5b81-3b66-9d13-2fa6e9a887df"
              #uuid "8ae6e417-a5fe-36fa-9be3-bd2c6ac61840"
              #uuid "08240ccd-42ce-3242-b2f3-7bf5b24420fe"
              #uuid "f4afb893-6f91-3389-8606-9c088ff6ea75"
              #uuid "64b81638-f97f-36d4-ad33-08e915a1750e"
              #uuid "c377afb2-e46b-30b6-968e-71cb449ac3ea"
              #uuid "7416a104-a4b4-3c68-895e-98e989dce7de"
              #uuid "63e5002f-f8a6-36bd-81b5-2f817477eecf"
              #uuid "9b45f563-8b03-34d4-9d30-5134ab5e657e"
              #uuid "d3c432b4-bac7-3974-8e6c-60ce1f8b528f"
              #uuid "14d13fd2-bd65-3d26-a969-71f5cec92764"
              #uuid "6ad0df6a-ac90-3fc1-a6fc-cdd155147a92"
              #uuid "44ca4f9f-417c-3200-b21f-4ae33fae9646"
              #uuid "97fe9a27-6b0c-3281-8d07-433af5bcf4e4"
              #uuid "0a4d7b38-fbbc-3f6c-88fe-b09fc35ad1a6"
              #uuid "d993f311-557a-391d-ab21-677ab586a01b"
              #uuid "abe1a4aa-bcd0-3440-8bb5-a57f0dcc37ac"
              #uuid "d82b1470-bb05-3f45-86cb-1e51d8455a3d"
              #uuid "af0c5e41-309d-3a83-afb7-76f7378381b2"
              #uuid "79a39a92-dda9-376e-b337-e86bdbbc3864"
              #uuid "a0969dfc-5294-3b41-82bf-220e859197db"
              #uuid "0f2e7cd3-2595-3b1b-b656-cb103be3e521"
              #uuid "06e9bd9c-0975-32da-acdf-2b1942d57f1e"
              #uuid "890488d0-a370-30a4-9788-a44754330b27"
              #uuid "09e49bb6-1f03-33a3-bfbe-8937e2e031e8"
              #uuid "08cddb57-6c00-3836-9593-a0b04fd84141"
              #uuid "9353a118-c201-398a-83cc-6d58ccb38f02"
              #uuid "accf9b44-d60e-36aa-ab3e-293a0e91aed0"
              #uuid "76a33f97-02f4-3a7e-ada3-46bd2544ae02"
              #uuid "86f0bb77-105e-3136-98ae-4837a11ed606"
              #uuid "48788b6f-7e50-3fbb-b1a8-772c4139b77a"
              #uuid "bf515360-5eca-32d5-ac9d-fb620b905619"
              #uuid "73fdae1a-b0ca-3e78-b23e-a4a7101cd9e4"
              #uuid "f072aeb8-c5dc-3eb7-9f65-6c8ab7d359a9"
              #uuid "165261a9-0183-3e53-be82-ccc197c354b8"
              #uuid "a389677b-6118-3815-84fe-c1e75f38984c"
              #uuid "cace91df-d6f2-36fc-a98a-6fa5cde7357d"
              #uuid "7faaa1de-90c9-3f60-a58e-46fae6daf77c"
              #uuid "d55cb47e-7f6c-3de3-afe9-3acfd3bd09af"
              #uuid "9ecf0011-c0af-37eb-a590-f247005f0399"
              #uuid "4c2d3b0e-9fbd-3faa-9fed-724910231a39"
              #uuid "e8d2a59c-f315-3860-9608-b04f893cbc93"
              #uuid "f98b9f16-c08f-3903-9b7f-80481ccce0d0"
              #uuid "81cc0f79-3609-346a-8dde-65ed1c9f3c3a"
              #uuid "af493a90-a6e6-31a5-966e-beed6fcfe1b4"
              #uuid "a6092dda-9d9f-3b45-b148-b73eb5da724a"
              #uuid "0ef8f876-d62a-3535-ae28-410454e3634b"
              #uuid "a5d7ddea-2e79-3a0f-b248-95af3f6223d4"
              #uuid "ed2baf70-63da-3cbe-9737-466f5a29fe95"
              #uuid "5f955ad8-59ca-3215-9cab-4fa839d2a033"
              #uuid "39af5c41-5927-3dde-8a75-10397211dcda"
              #uuid "47a720fb-24ff-320b-99ab-77739da99a5a"
              #uuid "3b726f01-748c-32b9-ac65-408fdb259e18"
              #uuid "07f37b38-2b05-392e-91fd-d4e76cc7fbf0"
              #uuid "a4c50ca7-7a49-3873-a656-5ba52bc56488"
              #uuid "f81386ae-7767-3f93-a560-c78df55109bb"
              #uuid "e1405ecf-c37a-3cdf-9bc0-46ca9df2e685"
              #uuid "f7625727-1129-3703-96c0-442c8ac00dae"
              #uuid "edc4787a-b55f-39c5-ab40-a99f7c1a0c80"
              #uuid "ba290158-1610-3e16-94fa-7dedd0ef5e08"
              #uuid "01f7b705-9b33-3897-969b-343e8a6e682e"
              #uuid "d5fd1c48-4bc6-3542-8805-4964fab16e05"
              #uuid "106facbb-305a-30f4-afe6-9fe69cfadbdc"
              #uuid "4615cd89-6ac7-3867-a94c-ceb0a15a7b13"
              #uuid "2c63539a-a2a5-3415-b3d7-89edc773ac8b"
              #uuid "d80578d7-99b8-36c3-84e7-da04814b80f5"
              #uuid "b8909580-a299-3ec5-848c-548f38510b72"
              #uuid "e154f5ce-d498-3840-a559-661a996d4d09"
              #uuid "0071dfa9-ec41-35e2-befc-ecbe183ff272"
              #uuid "f944b1ee-72e5-3ea8-832f-4eaf0dde6f09"
              #uuid "1bd17795-c173-3c75-9489-8343917b819a"
              #uuid "595f02eb-d247-3d88-95e4-06800f89e71a"
              #uuid "d8b44a4f-28ae-353d-adeb-b3fd26fc143b"
              #uuid "ebb89386-c539-37db-b4a7-972b931256f7"
              #uuid "7b1d9fe4-27bb-3db5-af9b-89f0785afc59"
              #uuid "90a300ed-ea38-3514-b744-0c43440fa4b3"
              #uuid "ea2abdf4-a5ae-3c18-be7b-bd2db0068ddb"
              #uuid "05e84109-515f-3f98-8ab8-872a8a1a9cb2"
              #uuid "24689901-b879-3cd9-9b75-5dd7dd2b8f2d"
              #uuid "6b8723ed-8ce2-3285-963d-9682f60b0287"
              #uuid "e5f11979-9a30-30ec-8084-92dd584b1214"
              #uuid "3463c066-922f-3864-93bd-b87bb1286679"
              #uuid "9cb073d5-2081-32d7-9991-a6077288e01e"
              #uuid "05ae57bb-e135-3a41-87f7-2bc52f18bff4"
              #uuid "30fe5e0d-e895-3a87-87df-7cdfbdd1f7ab"
              #uuid "993ca650-a85e-3e69-b8f7-eaa4809c4862"
              #uuid "cbed48f7-5fef-3645-9ebc-db33807e504c"
              #uuid "7ca15329-76d2-3582-a841-424d17ec0f0b"
              #uuid "a408c9e7-3639-3621-b65f-1f8aeea37b18"
              #uuid "d9878711-9bbd-343b-bb79-ba45904cc23c"
              #uuid "595f5c4f-c267-303b-adf4-1333c70a9460"
              #uuid "fb48a85b-84e9-312b-985b-de09b2c0b29f"
              #uuid "c8ccad85-82a3-3865-8ad8-a3487faedffb"
              #uuid "cf06db18-725b-36dc-8e9c-5246b40aae01"
              #uuid "69895ff2-b990-3611-827e-f4f7fd32eb8a"
              #uuid "664d0a6d-1ba3-3b2b-961f-16ce489ff406"
              #uuid "12218694-0010-31cc-a245-a502b7ed4b19"
              #uuid "de3493ea-6e7c-3152-9c99-22e9e501faf8"
              #uuid "434949a6-89e3-3ba2-8e67-412edc26c71f"
              #uuid "35af2b0c-b093-3e74-8ed4-e7589938e8ac"
              #uuid "cd19fd52-bf5e-3ad5-8ccf-0d6664374368"
              #uuid "42f0d762-a858-3dbb-b64d-dde4f6a4fc6d"
              #uuid "9d8b1773-e579-34ae-9aae-3e3c82f764ce"
              #uuid "ebe3d298-d25e-3110-8e34-1c079e9455d9"
              #uuid "b8f4ece4-3fa5-3fc3-9f1d-a34aec906149"
              #uuid "3cad23d1-2f51-3a7b-8a51-4c256db8638d"
              #uuid "61751dfb-a841-3676-aa92-97d75c9a9f56"
              #uuid "7fe2ec37-f762-3f17-b6c0-cc2b097adead"
              #uuid "bb2b867a-583d-3e72-adf5-e81bf22baea4"
              #uuid "4846597b-0309-3cd6-9f05-12f43edf2faf"
              #uuid "e29fbec4-4c71-3519-8e93-582b67df86f4"
              #uuid "bcfc2af4-495d-3023-83ab-12fb1057166f"
              #uuid "1add2eb4-1fca-39b2-a15b-4a7d68571409"
              #uuid "6db176b1-017b-3430-a362-e2d6ee99cc67"
              #uuid "1b2a1ef5-4042-3ba6-826b-7d8fe796f7ba"
              #uuid "e1d04b1f-1d94-3006-958a-ee81242dab6d"
              #uuid "114f738d-8858-3e7b-9fdc-41ddb2758725"
              #uuid "9a6c960c-a513-3563-bb1f-1783f1aece80"
              #uuid "4921b8e8-521a-3a27-9aac-936218a067c7"
              #uuid "58fb7a8c-d0f1-36b0-b1f5-b7091fbb0ba0"
              #uuid "fbccf9d3-dd4b-3e43-954e-9fafac2763ae"
              #uuid "db5ac01b-b987-3006-8f5a-61d4142920ec"
              #uuid "23767cbb-cceb-3686-8a59-f0250c57a1d9"
              #uuid "cb6afc25-1c32-38b1-bfe0-1c3f8797a9ea"
              #uuid "e923a27a-48cd-3c06-a494-d0fa119478a8"
              #uuid "39458645-fcb9-368d-81b6-ad23bbed69cf"
              #uuid "6e8ce4f2-3cc4-37b8-9002-721e44843aaf"
              #uuid "baf9b7dd-749d-37d7-888f-c84d255e682f"
              #uuid "5af83e31-96bf-39f4-80f3-1f2e1a6c9afe"
              #uuid "6f243f7a-f0d3-3ed7-8572-4782675ddb75"
              #uuid "e7c82f28-5b8e-3311-8519-a3cfa713dec3"
              #uuid "f46ff3af-0204-348e-9bd0-c1f668f82128"
              #uuid "a4eb9598-b375-3f22-8363-e0295ac2f5f2"
              #uuid "f750d160-d009-3c96-a630-eff035abfd6c"
              #uuid "54b141a9-4bee-378e-b867-fd1d4729f014"
              #uuid "11a2b6fb-2a70-314c-b249-9d7b509352e5"
              #uuid "20b16954-6c66-3536-b816-f13d464da44c"
              #uuid "655dd7fb-2048-304d-ac0f-6a354ff76bc2"
              #uuid "e261ac28-9c39-30db-81d4-e7551f8b4fe6"
              #uuid "645ab7f6-09eb-3401-988d-97cd930668c1"
              #uuid "6fe19369-f217-3b8c-a477-7fca8a743df4"
              #uuid "bdc861dc-6b29-3561-92f7-d53f184e07fc"
              #uuid "51817160-093d-3773-957a-662779bebec9"
              #uuid "56be7020-8ac5-312f-9c02-a912103646d9"
              #uuid "12e2d12e-9e19-33ad-b08e-22ab8cc8eac5"
              #uuid "9db68b1a-dbc5-3564-ab25-1023e94227a1"
              #uuid "ff75a7b6-d946-39dc-b9cf-69635113e6f4"
              #uuid "9c557202-449d-3095-b805-89c2e6e0fe50"
              #uuid "3ca4bbbb-2ab4-3ee4-85af-cd73036a4cd3"
              #uuid "458d2163-a348-30c3-a4ad-8792fa32645c"
              #uuid "62326243-6ea0-3ce1-aef6-c1d285dbdc80"
              #uuid "bc6235a4-d8ed-3225-86d0-ce30fcb2da6a"
              #uuid "ae7bda5b-fa73-3e1b-b30b-c81fd70b93f5"
              #uuid "97fc6923-396a-3ad8-8a4c-70879893f4b7"
              #uuid "ec9a79c1-8253-3d39-9f07-8382ba20e59f"
              #uuid "161dfda2-bf83-3041-ae10-e2410340abd1"
              #uuid "d46d3296-6569-3615-8e1d-5ac2e88a346a"
              #uuid "0b0ba83c-ba8f-3c56-8b3e-a2fc3bc7f5a4"
              #uuid "7369ff3a-fe64-30e3-8363-9067a97ac8b4"
              #uuid "e9e59065-5acd-3d1d-876b-8cb866541534"
              #uuid "189f9b13-158d-379b-9440-05b9bc24a356"
              #uuid "e6d5c2ee-6c34-370d-b344-30cc5ee8a749"
              #uuid "19adc592-fdfe-37ba-81a5-d195098fc52d"
              #uuid "01c751b5-3d59-3358-a6e3-3ab7ddceb42f"
              #uuid "28e54304-62fc-38c9-9b76-058878323d57"
              #uuid "edbf5fa9-4b8b-3458-ace1-fe46640503a1"
              #uuid "da7d7bb0-2a43-3cd7-8ea7-21c4eb8ae388"
              #uuid "5af4832c-3c6d-3e4b-883d-4fbba7190317"
              #uuid "bb8434ca-528e-3b5f-bfc5-5eebbe2c00a0"
              #uuid "bf684d42-7071-39ee-809d-514bc5ca241a"
              #uuid "be01908f-633f-35da-be89-80701db8ed25"
              #uuid "06c5d6ce-c062-3ac0-bd43-6186b663fc10"
              #uuid "1a30c214-a750-3e08-97aa-c85a7fa01368"
              #uuid "5b349ead-c3fb-374b-bb6c-47fcc3843355"
              #uuid "24a04d97-a632-349a-b9b1-bb49af1a096a"
              #uuid "c7b74e13-dff8-3831-98f4-1d81198c1337"
              #uuid "dfa418bd-eebc-3c3f-96b6-edaf5e3c4d89"
              #uuid "f72af12f-4736-3bde-84b0-ca91070cf43c"
              #uuid "3ed6a2fa-a80b-3140-9878-53dd29c238b8"
              #uuid "ca5622cb-e7ba-31f7-95df-551ad1bbe80f"
              #uuid "ebb7a837-d8f1-3d0c-a149-24e17e4005dc"
              #uuid "7873a90e-ea1b-3b3b-8ca8-4820dc662976"
              #uuid "bd4049a7-2730-31a1-bbc9-4a077d75facc"
              #uuid "5aa42acb-56e5-3325-acc3-e39be2b450a1"
              #uuid "a9957800-b641-3919-9ff6-ca11f1c233c4"
              #uuid "0a995f25-bdf2-358f-bf5a-93e22c9aa05b"
              #uuid "b4991e13-f466-39b4-be16-56909272f1cc"
              #uuid "ae9fa216-d3c0-3682-9657-bc2cb71eaa11"
              #uuid "deaefe4b-599d-3d42-982f-b0bef3bbb3d3"
              #uuid "133c22e7-c259-3256-a323-5b88f0b6a645"
              #uuid "87f8a6ab-85c9-3ed3-b02b-4ea641ad4bb5"
              #uuid "4d6bfce7-c3d0-3def-8625-e405087939ed"
              #uuid "f8049db2-d889-3677-984e-4e2ce41de578"
              #uuid "5610f650-22c6-3571-bffa-cfd6a9d68b2a"
              #uuid "6e6f4eb8-c896-3609-ae50-49ede7fbf6ad"
              #uuid "568da493-2833-3009-ad26-7108e0683081"
              #uuid "cd9b3130-0865-3759-962d-9c3eab8d03f4"
              #uuid "6b35d568-0483-3a28-a965-30b88e49b9f5"
              #uuid "dee45e08-5103-32ec-93b7-17d391b64576"
              #uuid "1e78ea48-893a-3f8e-91e2-01c9ff0e706e"
              #uuid "c31af57c-a315-3610-b455-9d5f386f31e0"
              #uuid "aacb653d-e587-34a7-a360-4c3956b4f677"
              #uuid "7a51eb3c-d160-3393-b631-9ae87020b9db"
              #uuid "3f9e8eb6-bc1b-357a-949e-643f14a3cedf"
              #uuid "abe58998-3062-3866-9238-314af7ba0265"
              #uuid "6fe16b2e-cfb7-3be8-8013-6c163b70120b"
              #uuid "0aba0975-5e75-3a94-8bfe-fd86797f7ce8"
              #uuid "39063899-ef80-383a-97b7-38b8c778cc24"
              #uuid "ac19727b-672c-352f-b393-c52a81b055cb"
              #uuid "984c20a2-ad28-3167-b8ae-fcef61acbced"
              #uuid "647e229b-c07b-3419-a641-254ed8b96dbd"
              #uuid "1309682a-fbd4-3c2b-89cb-11c7d8048013"
              #uuid "20263815-62ac-3093-af3d-0f4a0f0538bb"
              #uuid "bddc24af-3739-3b8e-bfcb-17b4a25b7153"
              #uuid "c1fa67fc-99a3-39a4-962b-ba099f84d11c"
              #uuid "c6dfc763-4e0a-33ee-b4b9-efe1ce4f82b3"
              #uuid "af817d47-9021-3806-800d-7ef8dab08024"
              #uuid "5b444b22-2047-3124-af08-48687f72a6b5"
              #uuid "309ea4eb-582b-3fb9-93ca-87fd54016d3e"
              #uuid "af472b73-df4f-3397-a8c7-31a328913353"
              #uuid "578002db-1bee-32a8-949c-58bece6429a5"
              #uuid "59f822bc-aa8e-319b-9e63-eb00919b367a"
              #uuid "9cfc3b97-43a7-3c0f-a7c6-2b42b62c90f6"
              #uuid "2d7c2d23-5fac-3ff4-8aac-33c2ce47eb1c"
              #uuid "c2ea7289-9af9-3d4e-8061-55ca7bf82b6b"
              #uuid "02b25657-6abc-3080-8fb9-16100cb17ad5"
              #uuid "effdb9ce-6c5d-34df-b1b8-9d7069c8e0fb"
              #uuid "935b4085-0cd3-3875-abe0-2996fb99980b"
              #uuid "90f166e5-27c4-3684-8865-0a7d63773ce7"
              #uuid "227fed4b-25cc-316a-b15e-6c9a064702db"
              #uuid "eab3ae9a-3d28-3df8-affc-d917c97d7195"
              #uuid "e3ff49f1-3a4e-3be2-9c80-51385adc499c"
              #uuid "b11ddc7e-1671-30bd-a2dc-89dd757508d4"
              #uuid "d18a26f4-6f25-37b2-a861-2147cf47cf18"
              #uuid "5e611ca2-e99d-358f-adc6-f3f7bcfb3ad5"
              #uuid "1fff84e0-9d09-3677-a846-84f01c21b161"
              #uuid "5f04dffc-be2c-351d-adf5-f41fb7084b4e"
              #uuid "c3fa9226-9cf9-3afa-8844-dff274cc446d"
              #uuid "3c213740-1920-3b32-acb4-a2877cd7aa17"
              #uuid "91934e02-f64d-3aab-9536-19f592307a91"
              #uuid "17b41f7f-4de8-3fe3-be7f-91fc18e29b8a"
              #uuid "1fdd0d64-7a70-3a2d-93b1-bbf278454b32"
              #uuid "32288419-57f9-3b53-a2df-4b3393930c5a"
              #uuid "44de8c27-9942-39ca-997c-57ff932fc882"
              #uuid "7e7fdd38-98cc-3f0f-a059-308e820a2013"
              #uuid "7c823c08-2b3e-3613-bf68-fde60227450d"
              #uuid "c56337cc-54ed-3e22-8b76-d1092f67310c"
              #uuid "35474b73-b019-37a7-b3d6-ee8eb6df3f8c"
              #uuid "51e8b349-68a5-36bd-84d2-d7b86bb0765b"],
             :com.boardgamegeek.boardgame/min-play-time
             [#uuid "4a3e0096-1a08-379c-b4f9-1ca0070ea2f5"
              #uuid "64581d49-5b7a-3952-b129-c64b56c406ed"
              #uuid "4080e14f-b40a-3b33-98cf-83612aaecf76"
              #uuid "6d8aa71d-1531-3019-ac35-ea2463485268"
              #uuid "780cd613-d706-3945-8ef3-6d59c16c2312"
              #uuid "46abbae9-5fbc-3520-9ed2-16c2901bdbae"
              #uuid "358a9cb1-8677-3a1b-90ac-1c8d6ffa6288"
              #uuid "526e6774-4f0b-3073-9ec1-7c191c62d24c"
              #uuid "24380876-a0ae-3b46-a8c6-a092619bef37"
              #uuid "3be646fb-70d6-3079-b0a7-35b697a011c8"
              #uuid "d8ebf6a0-f01a-377d-82c8-e903e801973b"
              #uuid "6f074a1d-f38a-33df-b9d8-d724a8ed3410"
              #uuid "51a7df93-adb9-3cee-bc0c-05f7dc89f774"
              #uuid "a4a4e5f6-a7ab-31b8-8ec1-0983b264ed4b"
              #uuid "8ec8175e-8c92-3f65-a885-97c16ca93454"
              #uuid "7b6a839b-181c-3d7e-a88a-1115d8a027c2"
              #uuid "d9f82ac3-bc24-3fa7-8292-3fff745ff105"
              #uuid "d0c13971-6116-34f0-ba4f-9f6b16e7b130"
              #uuid "fd3be4f0-d310-39a4-86b8-03524d064ee6"
              #uuid "0e7278cd-a02a-3c04-86dc-c75a4df34eb2"
              #uuid "701ae3e6-c75d-3e66-ab6a-b255f6fade83"
              #uuid "2f266ba4-d63b-34be-8400-6b95a3442ff9"
              #uuid "a93478e2-7d6a-36e5-8e4e-8b4c3f632b0c"
              #uuid "280a5f64-7a78-3590-8dd0-81f7136e31b5"
              #uuid "cedb275c-f7e8-3cf1-9073-41cff22af498"
              #uuid "886937cd-0285-3aad-834d-f6e5bd1d1dfb"
              #uuid "642edb7f-7af6-3c4b-8b07-5ac20dcba0b9"
              #uuid "c8835178-b83e-3ef2-84d6-ed36804309c8"
              #uuid "2ffb14ad-8e1d-3f3c-9df9-133b523d8287"
              #uuid "0d22fe23-de11-3728-9634-4b0114313a9f"
              #uuid "d803129a-da52-3403-b88a-1331f9bf89b1"
              #uuid "0d600bac-e4d6-3227-b4bf-b0d9fee001c6"
              #uuid "c693b4c3-9720-303a-836a-8f25b4da698a"
              #uuid "e74ac58d-7a69-3b4b-9cff-6dc08fd9f434"
              #uuid "83f7cd22-e2a0-3e46-b9ba-4358004dc75f"
              #uuid "d8b5d495-0030-372f-8b5b-3131d1bcddc1"
              #uuid "3b11574d-ac04-3356-aa1c-eb3ac5ef4c6f"
              #uuid "a673ace7-74a3-384d-823b-f8131295d6d1"
              #uuid "f0343033-f91c-3c5a-9064-4138ea33af2f"
              #uuid "938351d5-c89e-32e0-af3b-73d217217b14"
              #uuid "4d4c8a37-4103-35eb-b414-672ae3f8ea83"
              #uuid "61f2c08e-b43e-3b4f-80bd-d988013ee49b"
              #uuid "6a99a492-a63d-3ef4-a946-1cdbf945a66a"
              #uuid "a58b4cee-88af-34f8-9ad6-839f132388f0"
              #uuid "d99574a4-a1a2-3d19-96ca-d4f5094dca65"
              #uuid "53b40008-e2e5-3189-9b82-fd0ba46405e3"
              #uuid "b4f52f37-41db-379b-94e2-3b8911f49401"
              #uuid "1ceaeab6-397f-308a-b02e-6652106f2fbd"
              #uuid "12fd071d-60ce-3146-b555-655882920638"
              #uuid "cb6afc25-1c32-38b1-bfe0-1c3f8797a9ea"
              #uuid "0dd28a2a-30d5-3d29-97ba-3e8bfa086f0f"
              #uuid "da846ac4-d725-3d51-8667-b8ab69c960fb"
              #uuid "4a734354-588a-3c87-bd6f-48f09c3e691f"
              #uuid "41e6fb49-794a-3928-bc31-b058fc3f832d"
              #uuid "c6dab445-bf7e-39be-b4cb-6f22ae7e715a"
              #uuid "275ef384-7d59-3c1c-8625-ec7a6d5208b6"
              #uuid "5aeb1f62-f6cd-396d-881c-07d58b82f143"
              #uuid "cba95a42-c53b-3c6f-bf3d-df9bf10a4069"
              #uuid "b86c48fe-3ed8-3b4e-9369-6d3957a9d311"
              #uuid "67e88af3-f2d3-3953-9be7-c1b26fefe183"
              #uuid "e56eb8fb-70f3-368a-b45d-dec1e25f35aa"
              #uuid "ad09b2d4-8b28-31c6-8e5a-2bf421f7f2f2"
              #uuid "ba776ee9-9ebc-3521-9d9d-ce1c6a702748"
              #uuid "c3fea04b-2042-3a0f-ab59-e7cedee3e1bf"
              #uuid "200327ec-e2f1-3904-9057-9c80de5c3e0f"
              #uuid "6b1a6c6e-487e-334f-97cf-8b0efad2f3f9"
              #uuid "7cd74735-c2f6-352d-8428-474bc1b6b386"
              #uuid "7b9a4759-a742-301f-b458-f4ef2d8368da"
              #uuid "d20adb03-0a94-319b-9d04-188d5cad9da6"
              #uuid "cd9b3130-0865-3759-962d-9c3eab8d03f4"
              #uuid "b7ae6819-447d-36c3-bb6a-0e7dbe5c17ce"
              #uuid "0f797b16-678f-32d3-af6d-84b6d8f6ad20"
              #uuid "f5c8ba24-2c49-3844-8721-5cf4e518c90f"
              #uuid "875b8289-de41-3672-8c92-95b6a689ff43"
              #uuid "653e0f82-5aec-3cf2-86d0-4422c6b2f8cd"
              #uuid "66437274-239d-371f-a5d1-71102dca56e3"
              #uuid "ccfd0e0f-749f-3a3a-a9cc-7c01a70ea5fd"
              #uuid "72b0f8c3-5245-35e0-9a66-484200882d79"
              #uuid "cf3b2299-3275-32a1-bcc3-40c64f229538"
              #uuid "a09707a5-88fc-32fa-b544-8afa929496ab"
              #uuid "ea2abdf4-a5ae-3c18-be7b-bd2db0068ddb"
              #uuid "104965da-ee0b-3867-95a3-0416228b7b19"
              #uuid "40bd8e35-d86c-3ba3-8791-e33dad4f0330"
              #uuid "578002db-1bee-32a8-949c-58bece6429a5"
              #uuid "bbf3c83b-9b9a-3dfd-9cc3-d3295f5d235f"
              #uuid "7e7123b0-d269-3d5d-9ec8-d12c52a8ed8a"
              #uuid "5c50d320-55f3-337f-b820-3e559968a3f1"
              #uuid "fd6267f8-71dc-3dc3-9ad9-e13b844fed44"
              #uuid "29b3ea31-ed18-3383-b4af-bfe1002404ae"
              #uuid "47dbc903-625e-337e-b249-2dbf0b1b9527"
              #uuid "c2ea7289-9af9-3d4e-8061-55ca7bf82b6b"
              #uuid "e214a1ce-1929-3835-b502-4510ef89f940"
              #uuid "d46d3296-6569-3615-8e1d-5ac2e88a346a"
              #uuid "fab76503-1b94-3d49-8b17-1336fababeec"
              #uuid "e29fbec4-4c71-3519-8e93-582b67df86f4"
              #uuid "76a33f97-02f4-3a7e-ada3-46bd2544ae02"
              #uuid "34946d54-6d22-3af0-afdb-e795b8de802b"
              #uuid "b7dd6050-6cb3-352e-9363-36450ff12ddc"
              #uuid "c64e760d-cd41-31b1-9626-a196593146fa"
              #uuid "1c1ad4ae-57a5-38c9-8c80-666849f4eeec"
              #uuid "91934e02-f64d-3aab-9536-19f592307a91"
              #uuid "a6480b1c-62dd-3ceb-9f94-fb57c823691e"
              #uuid "bf515360-5eca-32d5-ac9d-fb620b905619"
              #uuid "49b5473d-32f5-382b-943a-dda4a1491daf"
              #uuid "c413a292-7a46-3ea3-aa4d-896b4b1e78e0"
              #uuid "bf684d42-7071-39ee-809d-514bc5ca241a"
              #uuid "a389677b-6118-3815-84fe-c1e75f38984c"
              #uuid "ebb7a837-d8f1-3d0c-a149-24e17e4005dc"
              #uuid "d76c9788-f173-3fff-9b13-9ced6ab67c4a"
              #uuid "bd4049a7-2730-31a1-bbc9-4a077d75facc"
              #uuid "3cad23d1-2f51-3a7b-8a51-4c256db8638d"
              #uuid "5a156002-5793-338e-9399-def9bfd7eca6"
              #uuid "59bab2ff-b0ef-386f-8db8-ef439320a47e"
              #uuid "227fed4b-25cc-316a-b15e-6c9a064702db"
              #uuid "d88a6b63-1a1c-36ea-95d1-2d05210eb706"
              #uuid "46df0476-0eb0-30b7-92cd-7703972c5f1a"
              #uuid "5af83e31-96bf-39f4-80f3-1f2e1a6c9afe"
              #uuid "a2cce669-b64c-31e7-9afb-63f03c696fee"
              #uuid "bddc24af-3739-3b8e-bfcb-17b4a25b7153"
              #uuid "c1fa67fc-99a3-39a4-962b-ba099f84d11c"
              #uuid "3da3ce69-4e95-3c15-beec-5d9ec2078260"
              #uuid "56be7020-8ac5-312f-9c02-a912103646d9"
              #uuid "9db68b1a-dbc5-3564-ab25-1023e94227a1"
              #uuid "1e78ea48-893a-3f8e-91e2-01c9ff0e706e"
              #uuid "2b110ae1-40c3-3594-bdfa-8a5bfe402f8b"
              #uuid "f4afb893-6f91-3389-8606-9c088ff6ea75"
              #uuid "2d7c2d23-5fac-3ff4-8aac-33c2ce47eb1c"
              #uuid "97fc6923-396a-3ad8-8a4c-70879893f4b7"
              #uuid "97fe9a27-6b0c-3281-8d07-433af5bcf4e4"
              #uuid "f8283731-6cf2-3086-8140-494037314bf5"
              #uuid "0746ccba-be89-3d2f-a4b6-af590e489ff0"
              #uuid "5af4832c-3c6d-3e4b-883d-4fbba7190317"
              #uuid "bb8434ca-528e-3b5f-bfc5-5eebbe2c00a0"
              #uuid "a0969dfc-5294-3b41-82bf-220e859197db"
              #uuid "59ccf897-4368-3ab7-ae8e-0ac969872f6e"
              #uuid "dd86edfc-d85e-3039-9399-5c282a2e3524"
              #uuid "595f5c4f-c267-303b-adf4-1333c70a9460"
              #uuid "f821ee04-f104-3d22-96a6-9bab12eb4c28"
              #uuid "99102149-c730-3271-a928-b7549ce07a13"
              #uuid "24a04d97-a632-349a-b9b1-bb49af1a096a"
              #uuid "c56337cc-54ed-3e22-8b76-d1092f67310c"
              #uuid "c7b74e13-dff8-3831-98f4-1d81198c1337"
              #uuid "c8ccad85-82a3-3865-8ad8-a3487faedffb"
              #uuid "cf06db18-725b-36dc-8e9c-5246b40aae01"
              #uuid "30933bc2-a19f-3124-9a19-d7b8facdbeeb"
              #uuid "054f1270-bf79-32f9-825a-96880e800c9f"
              #uuid "165261a9-0183-3e53-be82-ccc197c354b8"
              #uuid "ca5622cb-e7ba-31f7-95df-551ad1bbe80f"
              #uuid "2752fdce-7879-3086-8e8e-2a54c21ee999"
              #uuid "b150a64b-6e6b-3e4b-8784-e6bc946f1fc1"
              #uuid "4c2d3b0e-9fbd-3faa-9fed-724910231a39"
              #uuid "ad117101-b1d8-35b7-b02b-d335db512e5e"
              #uuid "bb2b867a-583d-3e72-adf5-e81bf22baea4"
              #uuid "a6092dda-9d9f-3b45-b148-b73eb5da724a"
              #uuid "d701c31b-be98-3228-af7f-aaebd4cb0455"
              #uuid "f18187e7-f398-32f0-b73e-625e848d8333"
              #uuid "b1127074-659b-3102-907a-25a0473a3e98"
              #uuid "843ecaf0-bb25-3a67-af63-f8a4bc3708a3"
              #uuid "9a6c960c-a513-3563-bb1f-1783f1aece80"
              #uuid "fbccf9d3-dd4b-3e43-954e-9fafac2763ae"
              #uuid "042103e1-8bdd-3157-aceb-cca413d78f3b"
              #uuid "1309682a-fbd4-3c2b-89cb-11c7d8048013"
              #uuid "1fdd0d64-7a70-3a2d-93b1-bbf278454b32"
              #uuid "51c249b0-90c8-3a66-8732-f796a82e5382"
              #uuid "df4c4520-3102-33f1-9a51-ee304c193f23"
              #uuid "6f243f7a-f0d3-3ed7-8572-4782675ddb75"
              #uuid "20263815-62ac-3093-af3d-0f4a0f0538bb"
              #uuid "eb9bd23b-c056-3a5d-a53d-78b2dcbd15ae"
              #uuid "d18a26f4-6f25-37b2-a861-2147cf47cf18"
              #uuid "54b141a9-4bee-378e-b867-fd1d4729f014"
              #uuid "e5279fe2-9e7a-313b-9b5d-e2d1f6a1e8db"
              #uuid "f77b4d34-54f4-37eb-8a5b-6d8df9e0f66d"
              #uuid "20b16954-6c66-3536-b816-f13d464da44c"
              #uuid "7bd8e302-1270-3448-8815-58d1f6da0834"
              #uuid "2c11257f-a438-3f75-8fac-459a4275e4c1"
              #uuid "88857068-79d6-3142-9e20-b8c7fd8b986d"
              #uuid "dee45e08-5103-32ec-93b7-17d391b64576"
              #uuid "51817160-093d-3773-957a-662779bebec9"
              #uuid "5f04dffc-be2c-351d-adf5-f41fb7084b4e"
              #uuid "ff75a7b6-d946-39dc-b9cf-69635113e6f4"
              #uuid "2c63539a-a2a5-3415-b3d7-89edc773ac8b"
              #uuid "aacb653d-e587-34a7-a360-4c3956b4f677"
              #uuid "77926e55-5ca9-34b7-8f65-009dd92da63b"
              #uuid "9cfc3b97-43a7-3c0f-a7c6-2b42b62c90f6"
              #uuid "191e854e-b00d-3d80-8fa1-fed83b373be7"
              #uuid "05ae57bb-e135-3a41-87f7-2bc52f18bff4"
              #uuid "01c751b5-3d59-3358-a6e3-3ab7ddceb42f"
              #uuid "7d9e8262-8714-332c-9ca9-ac68c68596b5"
              #uuid "3e302b86-f47c-3d22-9b4d-c253439d9970"
              #uuid "941e3f4a-24d8-3841-8144-e9db47d6f92b"
              #uuid "660cb8dd-c782-3542-8db8-9e1dc61af856"
              #uuid "be01908f-633f-35da-be89-80701db8ed25"
              #uuid "accf9b44-d60e-36aa-ab3e-293a0e91aed0"
              #uuid "f72af12f-4736-3bde-84b0-ca91070cf43c"
              #uuid "648ffc7a-6dd1-39e8-a7f5-7ecb69cc4066"
              #uuid "12218694-0010-31cc-a245-a502b7ed4b19"
              #uuid "434949a6-89e3-3ba2-8e67-412edc26c71f"
              #uuid "34c99f3a-1325-32c3-865d-f7e597f25a8d"
              #uuid "ebe3d298-d25e-3110-8e34-1c079e9455d9"
              #uuid "b8f4ece4-3fa5-3fc3-9f1d-a34aec906149"
              #uuid "af89834e-3251-3aa9-a464-74b8d24a5091"
              #uuid "35474b73-b019-37a7-b3d6-ee8eb6df3f8c"
              #uuid "61751dfb-a841-3676-aa92-97d75c9a9f56"
              #uuid "7fe2ec37-f762-3f17-b6c0-cc2b097adead"
              #uuid "5aa42acb-56e5-3325-acc3-e39be2b450a1"
              #uuid "c9e680a4-40fb-3a3e-bc38-6556dd90712b"
              #uuid "d9ff8a5f-72de-3a40-99bd-301e426485bd"
              #uuid "826863b8-1605-33a8-9169-91ebcb89712b"
              #uuid "434338bc-9501-334b-adbf-2b3752e9e231"
              #uuid "2fe5b306-b8a0-3e8b-becf-b4a37cf52717"
              #uuid "dd1bf333-48e3-3cde-80c2-6fb824ec3563"
              #uuid "bcfc2af4-495d-3023-83ab-12fb1057166f"
              #uuid "984c20a2-ad28-3167-b8ae-fcef61acbced"
              #uuid "a5d7ddea-2e79-3a0f-b248-95af3f6223d4"
              #uuid "e9e59065-5acd-3d1d-876b-8cb866541534"
              #uuid "e369d9fd-2ab5-3455-9298-16db19e37fd4"
              #uuid "1c585f7b-4a5b-3e81-abe0-97ce17218168"
              #uuid "90f166e5-27c4-3684-8865-0a7d63773ce7"
              #uuid "aecc77c6-bfad-3a88-b455-19b8d2c86bc8"
              #uuid "39af5c41-5927-3dde-8a75-10397211dcda"
              #uuid "fcbd772e-48c4-307d-bd3b-e13b37a82f5e"
              #uuid "39458645-fcb9-368d-81b6-ad23bbed69cf"
              #uuid "e7c82f28-5b8e-3311-8519-a3cfa713dec3"
              #uuid "f46ff3af-0204-348e-9bd0-c1f668f82128"
              #uuid "f750d160-d009-3c96-a630-eff035abfd6c"
              #uuid "a4c50ca7-7a49-3873-a656-5ba52bc56488"
              #uuid "c6dfc763-4e0a-33ee-b4b9-efe1ce4f82b3"
              #uuid "edfa15bc-3235-3696-aaad-09e432fc6662"
              #uuid "5e611ca2-e99d-358f-adc6-f3f7bcfb3ad5"
              #uuid "edc4787a-b55f-39c5-ab40-a99f7c1a0c80"
              #uuid "a65fe9b8-99d0-317b-9c91-7b969001669d"
              #uuid "5610f650-22c6-3571-bffa-cfd6a9d68b2a"
              #uuid "6e6f4eb8-c896-3609-ae50-49ede7fbf6ad"
              #uuid "3992d652-f81d-3e86-bd6e-2e685cb351a3"
              #uuid "568da493-2833-3009-ad26-7108e0683081"
              #uuid "9cf42701-85ad-3877-9a0f-cf57a5acf172"
              #uuid "309ea4eb-582b-3fb9-93ca-87fd54016d3e"
              #uuid "b8909580-a299-3ec5-848c-548f38510b72"
              #uuid "f00e2b92-434d-31e6-8a25-1b16618b5ab5"
              #uuid "595f02eb-d247-3d88-95e4-06800f89e71a"
              #uuid "134c5416-16b9-3118-a547-774f6df7bbcd"
              #uuid "39063899-ef80-383a-97b7-38b8c778cc24"
              #uuid "64b81638-f97f-36d4-ad33-08e915a1750e"
              #uuid "c377afb2-e46b-30b6-968e-71cb449ac3ea"
              #uuid "9b45f563-8b03-34d4-9d30-5134ab5e657e"
              #uuid "32288419-57f9-3b53-a2df-4b3393930c5a"
              #uuid "3f9e8eb6-bc1b-357a-949e-643f14a3cedf"
              #uuid "02b25657-6abc-3080-8fb9-16100cb17ad5"
              #uuid "161dfda2-bf83-3041-ae10-e2410340abd1"
              #uuid "9cb073d5-2081-32d7-9991-a6077288e01e"
              #uuid "81cc0f79-3609-346a-8dde-65ed1c9f3c3a"
              #uuid "43f3a349-eec8-3b6a-9947-777f90811c90"
              #uuid "133c22e7-c259-3256-a323-5b88f0b6a645"
              #uuid "704d0598-6340-3c49-b5b5-9d0fcf54e1f3"
              #uuid "17b41f7f-4de8-3fe3-be7f-91fc18e29b8a"
              #uuid "1fff84e0-9d09-3677-a846-84f01c21b161"
              #uuid "6b35d568-0483-3a28-a965-30b88e49b9f5"
              #uuid "63e5002f-f8a6-36bd-81b5-2f817477eecf"
              #uuid "6b8723ed-8ce2-3285-963d-9682f60b0287"
              #uuid "19adc592-fdfe-37ba-81a5-d195098fc52d"
              #uuid "d496a066-c36e-3570-99d1-9eedec118dee"
              #uuid "abe1a4aa-bcd0-3440-8bb5-a57f0dcc37ac"
              #uuid "d82b1470-bb05-3f45-86cb-1e51d8455a3d"
              #uuid "110f4e5f-593e-3ca2-819e-29dab8ad6f55"
              #uuid "cbed48f7-5fef-3645-9ebc-db33807e504c"
              #uuid "ac19727b-672c-352f-b393-c52a81b055cb"
              #uuid "492b7750-c3e8-3055-a93b-6745391300a6"
              #uuid "a408c9e7-3639-3621-b65f-1f8aeea37b18"
              #uuid "582d2648-b634-3370-a31e-bef979dab3f3"
              #uuid "2e89598e-c81e-39d5-bae2-aee451063265"
              #uuid "0f2e7cd3-2595-3b1b-b656-cb103be3e521"
              #uuid "def6402b-3a6f-30cb-aeb3-63cd5cefb20d"
              #uuid "7c1ada9b-f78c-379d-a6a7-b3018581aab9"
              #uuid "06e9bd9c-0975-32da-acdf-2b1942d57f1e"
              #uuid "7e7fdd38-98cc-3f0f-a059-308e820a2013"
              #uuid "1a30c214-a750-3e08-97aa-c85a7fa01368"
              #uuid "30c12229-f508-341c-9680-149dbdf88523"
              #uuid "5b349ead-c3fb-374b-bb6c-47fcc3843355"
              #uuid "08cddb57-6c00-3836-9593-a0b04fd84141"
              #uuid "935b4085-0cd3-3875-abe0-2996fb99980b"
              #uuid "86f0bb77-105e-3136-98ae-4837a11ed606"
              #uuid "ef81a392-af64-3668-81ff-2c3b7736919f"
              #uuid "69895ff2-b990-3611-827e-f4f7fd32eb8a"
              #uuid "b2980c72-2a1a-3e7a-b030-3718ce5491d8"
              #uuid "4d77e635-44ee-324b-b8e1-1cd07bd913a4"
              #uuid "ffbd4d36-9e2e-3949-8c47-2403ba1b4e8a"
              #uuid "cd19fd52-bf5e-3ad5-8ccf-0d6664374368"
              #uuid "73fdae1a-b0ca-3e78-b23e-a4a7101cd9e4"
              #uuid "f072aeb8-c5dc-3eb7-9f65-6c8ab7d359a9"
              #uuid "cace91df-d6f2-36fc-a98a-6fa5cde7357d"
              #uuid "06ac533c-6f03-39a8-ae86-a6c373df20f3"
              #uuid "027df389-a20d-3cbe-886e-a91e5b10d58a"
              #uuid "7873a90e-ea1b-3b3b-8ca8-4820dc662976"
              #uuid "9ecf0011-c0af-37eb-a590-f247005f0399"
              #uuid "0aba0975-5e75-3a94-8bfe-fd86797f7ce8"
              #uuid "6b13ea3b-f083-34f2-adf3-f3dba030f1ef"
              #uuid "5f075ae3-e1f9-3038-abb8-c4632991f96f"
              #uuid "a9957800-b641-3919-9ff6-ca11f1c233c4"
              #uuid "4846597b-0309-3cd6-9f05-12f43edf2faf"
              #uuid "5aac7681-3d33-3350-b4e8-43d1ae9b29e3"
              #uuid "af493a90-a6e6-31a5-966e-beed6fcfe1b4"
              #uuid "1b3840b0-b70d-31c1-be70-014c8537dbba"
              #uuid "6da53f25-b27b-3c31-8b0d-3928dc46f469"
              #uuid "aff8862a-8fba-39a6-86f4-ef02a3a228f9"
              #uuid "e4b769db-2a42-392d-b311-b02c3545d07d"
              #uuid "1add2eb4-1fca-39b2-a15b-4a7d68571409"
              #uuid "647e229b-c07b-3419-a641-254ed8b96dbd"
              #uuid "18594966-e721-3762-8ad4-b4cc663db0b9"
              #uuid "6db176b1-017b-3430-a362-e2d6ee99cc67"
              #uuid "d94472e2-8880-369b-b2f2-d1d3b83960c6"
              #uuid "e1d04b1f-1d94-3006-958a-ee81242dab6d"
              #uuid "114f738d-8858-3e7b-9fdc-41ddb2758725"
              #uuid "5f955ad8-59ca-3215-9cab-4fa839d2a033"
              #uuid "0eabf8b7-0bee-38f4-bfd2-cd9ef3624d39"
              #uuid "ae9fa216-d3c0-3682-9657-bc2cb71eaa11"
              #uuid "35b5c110-f2b0-3562-ae79-b51bd6300690"
              #uuid "d8ac8dc4-6760-3f12-96c2-e3420b291781"
              #uuid "47a720fb-24ff-320b-99ab-77739da99a5a"
              #uuid "3980f7ea-079b-3741-a713-8494f6bcbb9a"
              #uuid "87f8a6ab-85c9-3ed3-b02b-4ea641ad4bb5"
              #uuid "903d8dd1-63cb-3a8b-bcfa-23261d6598b2"
              #uuid "0663d3ee-2750-30d4-ad83-aa74a59c87ce"
              #uuid "f8049db2-d889-3677-984e-4e2ce41de578"
              #uuid "b17747c8-2344-37e0-af25-4c86481d8b35"
              #uuid "3b726f01-748c-32b9-ac65-408fdb259e18"
              #uuid "e3ff49f1-3a4e-3be2-9c80-51385adc499c"
              #uuid "6322ea9d-5e70-3e8c-89a6-0e261275b1d1"
              #uuid "36f8c047-0a0d-34e8-920b-337b779969ab"
              #uuid "b75229d9-66a3-3ee4-86f4-e1e5f353d9a4"
              #uuid "a4eb9598-b375-3f22-8363-e0295ac2f5f2"
              #uuid "44de8c27-9942-39ca-997c-57ff932fc882"
              #uuid "f81386ae-7767-3f93-a560-c78df55109bb"
              #uuid "f6be0578-56d6-30b6-ad51-8713fc8f260a"
              #uuid "8acfd5b8-b774-39c4-a04c-29420e5631c0"
              #uuid "7d9f1d6a-539f-3506-a533-6d5ff7e5df57"
              #uuid "431d180f-b4d4-35f3-8c95-96ad5a7267d6"
              #uuid "af817d47-9021-3806-800d-7ef8dab08024"
              #uuid "bb7745e6-fe51-351f-843c-5012bd13d334"
              #uuid "655dd7fb-2048-304d-ac0f-6a354ff76bc2"
              #uuid "e261ac28-9c39-30db-81d4-e7551f8b4fe6"
              #uuid "d8d090ed-62f4-3521-8f53-6cd65960c06e"
              #uuid "761cd5e5-55ee-39c8-b789-0273d2493fe8"
              #uuid "cb4c3448-07c8-36e6-8cbd-28f45339be1d"
              #uuid "edcee0da-2a9f-3e86-ab60-5a78ad6f26ee"
              #uuid "d80578d7-99b8-36c3-84e7-da04814b80f5"
              #uuid "458d2163-a348-30c3-a4ad-8792fa32645c"
              #uuid "1bd17795-c173-3c75-9489-8343917b819a"
              #uuid "d8b44a4f-28ae-353d-adeb-b3fd26fc143b"
              #uuid "af472b73-df4f-3397-a8c7-31a328913353"
              #uuid "5140d848-4910-3017-8f45-c2851658966b"
              #uuid "928c51b9-1ca6-3be5-b2f1-e665e90fab70"
              #uuid "7b1d9fe4-27bb-3db5-af9b-89f0785afc59"
              #uuid "90a300ed-ea38-3514-b744-0c43440fa4b3"
              #uuid "c3fa9226-9cf9-3afa-8844-dff274cc446d"
              #uuid "05e84109-515f-3f98-8ab8-872a8a1a9cb2"
              #uuid "c31af57c-a315-3610-b455-9d5f386f31e0"
              #uuid "8ae6e417-a5fe-36fa-9be3-bd2c6ac61840"
              #uuid "08240ccd-42ce-3242-b2f3-7bf5b24420fe"
              #uuid "51e8b349-68a5-36bd-84d2-d7b86bb0765b"
              #uuid "59f822bc-aa8e-319b-9e63-eb00919b367a"
              #uuid "7c823c08-2b3e-3613-bf68-fde60227450d"
              #uuid "7a51eb3c-d160-3393-b631-9ae87020b9db"
              #uuid "6ad0df6a-ac90-3fc1-a6fc-cdd155147a92"
              #uuid "44ca4f9f-417c-3200-b21f-4ae33fae9646"
              #uuid "0a4d7b38-fbbc-3f6c-88fe-b09fc35ad1a6"
              #uuid "d993f311-557a-391d-ab21-677ab586a01b"
              #uuid "36749cc5-01bd-3292-aaaf-44525fc6ed7b"
              #uuid "e8bffbf9-2f40-3bce-837e-bd9538b19c58"
              #uuid "0a995f25-bdf2-358f-bf5a-93e22c9aa05b"
              #uuid "0ef8f876-d62a-3535-ae28-410454e3634b"
              #uuid "1b2a1ef5-4042-3ba6-826b-7d8fe796f7ba"
              #uuid "deaefe4b-599d-3d42-982f-b0bef3bbb3d3"
              #uuid "113e202b-52db-3631-b4c4-7027d1edccf5"
              #uuid "d5fd1c48-4bc6-3542-8805-4964fab16e05"
              #uuid "f945232e-faca-3164-a579-88d416e62368"
              #uuid "7416a104-a4b4-3c68-895e-98e989dce7de"
              #uuid "e5f11979-9a30-30ec-8084-92dd584b1214"
              #uuid "da7d7bb0-2a43-3cd7-8ea7-21c4eb8ae388"
              #uuid "06c5d6ce-c062-3ac0-bd43-6186b663fc10"
              #uuid "890488d0-a370-30a4-9788-a44754330b27"
              #uuid "fb48a85b-84e9-312b-985b-de09b2c0b29f"
              #uuid "dfa418bd-eebc-3c3f-96b6-edaf5e3c4d89"
              #uuid "48788b6f-7e50-3fbb-b1a8-772c4139b77a"
              #uuid "3ed6a2fa-a80b-3140-9878-53dd29c238b8"
              #uuid "42f0d762-a858-3dbb-b64d-dde4f6a4fc6d"
              #uuid "7faaa1de-90c9-3f60-a58e-46fae6daf77c"
              #uuid "e8d2a59c-f315-3860-9608-b04f893cbc93"
              #uuid "f98b9f16-c08f-3903-9b7f-80481ccce0d0"
              #uuid "08b3b128-c196-3b26-bc2f-d0e5523bc940"
              #uuid "2293c663-d1bc-3701-9a53-009f457c6940"
              #uuid "909332ae-bc74-34a4-8cd5-4ea30edd7930"
              #uuid "c9135569-60ba-391a-a44b-1d8f95a4eb93"
              #uuid "22b3df14-e100-33a6-a098-e396cb523d6a"
              #uuid "4921b8e8-521a-3a27-9aac-936218a067c7"
              #uuid "58fb7a8c-d0f1-36b0-b1f5-b7091fbb0ba0"
              #uuid "e923a27a-48cd-3c06-a494-d0fa119478a8"
              #uuid "baf9b7dd-749d-37d7-888f-c84d255e682f"
              #uuid "07f37b38-2b05-392e-91fd-d4e76cc7fbf0"
              #uuid "189f9b13-158d-379b-9440-05b9bc24a356"
              #uuid "d5380d3b-56d5-3783-a863-1af12c39f5c7"
              #uuid "b11ddc7e-1671-30bd-a2dc-89dd757508d4"
              #uuid "4fce228a-9d44-32fe-ac24-659f263ee51e"
              #uuid "b7c512a7-a3f4-35d4-a416-c10bffb57bb4"
              #uuid "11a2b6fb-2a70-314c-b249-9d7b509352e5"
              #uuid "645ab7f6-09eb-3401-988d-97cd930668c1"
              #uuid "5b444b22-2047-3124-af08-48687f72a6b5"
              #uuid "a2a3a034-7f0f-301a-8473-dd54dca2462e"
              #uuid "c59a448e-a61e-3dad-871d-f3bc7ebe6774"
              #uuid "b172271f-a27d-3300-9b46-7f9825f0727e"
              #uuid "2e994ee0-a8fc-32ef-a229-a0d74edf07cf"
              #uuid "bdc861dc-6b29-3561-92f7-d53f184e07fc"
              #uuid "9db165b4-98ba-3935-9f4e-a7bd23beb693"
              #uuid "9c557202-449d-3095-b805-89c2e6e0fe50"
              #uuid "3ca4bbbb-2ab4-3ee4-85af-cd73036a4cd3"
              #uuid "af9c7e15-a449-3e77-9dcf-1fed9a676d1f"
              #uuid "ebb89386-c539-37db-b4a7-972b931256f7"
              #uuid "3d1f92a5-65d3-31a6-9880-236e33c49bf3"
              #uuid "24689901-b879-3cd9-9b75-5dd7dd2b8f2d"
              #uuid "074edbaf-ed58-3f43-ad67-8af6ba4fcefe"
              #uuid "bc6235a4-d8ed-3225-86d0-ce30fcb2da6a"
              #uuid "d3c432b4-bac7-3974-8e6c-60ce1f8b528f"
              #uuid "14d13fd2-bd65-3d26-a969-71f5cec92764"
              #uuid "abe58998-3062-3866-9238-314af7ba0265"
              #uuid "3463c066-922f-3864-93bd-b87bb1286679"
              #uuid "30fe5e0d-e895-3a87-87df-7cdfbdd1f7ab"
              #uuid "00dbe22a-358d-364c-aa3e-6da841b451dc"
              #uuid "effdb9ce-6c5d-34df-b1b8-9d7069c8e0fb"
              #uuid "7ca15329-76d2-3582-a841-424d17ec0f0b"
              #uuid "edbf5fa9-4b8b-3458-ace1-fe46640503a1"
              #uuid "3c213740-1920-3b32-acb4-a2877cd7aa17"
              #uuid "c180dcbb-f5dd-3cdf-acb3-dfe83bc594ec"
              #uuid "48309f49-6981-3784-80f4-f8b7cff15c98"
              #uuid "d9878711-9bbd-343b-bb79-ba45904cc23c"
              #uuid "0727c24e-c484-3017-9850-a0e366a7dd42"
              #uuid "e0dfaae0-12bd-33ef-94b1-4c34842456b4"
              #uuid "09e49bb6-1f03-33a3-bfbe-8937e2e031e8"
              #uuid "664d0a6d-1ba3-3b2b-961f-16ce489ff406"
              #uuid "de3493ea-6e7c-3152-9c99-22e9e501faf8"
              #uuid "35af2b0c-b093-3e74-8ed4-e7589938e8ac"
              #uuid "9d8b1773-e579-34ae-9aae-3e3c82f764ce"
              #uuid "d55cb47e-7f6c-3de3-afe9-3acfd3bd09af"
              #uuid "b1ea21fb-2177-3fed-af81-0a3967e76069"
              #uuid "e2257f79-e77e-34b7-87b1-a0924290c7f3"
              #uuid "b4991e13-f466-39b4-be16-56909272f1cc"
              #uuid "423cb589-88be-336d-ada8-9817b5fe519e"
              #uuid "792a15e4-87a1-362b-8199-5789db4c3b0a"
              #uuid "3384a03c-665a-3116-a474-cf5d4406c85a"
              #uuid "530b622e-6e90-30f4-b806-d0cbf74102a5"
              #uuid "4ab65803-6f4f-3742-85c3-84b863fed5c2"
              #uuid "4d6bfce7-c3d0-3def-8625-e405087939ed"
              #uuid "db5ac01b-b987-3006-8f5a-61d4142920ec"
              #uuid "6e8ce4f2-3cc4-37b8-9002-721e44843aaf"
              #uuid "2bc22d15-7e2b-3a2d-aaaa-46fe0f8945e2"
              #uuid "1cdae507-3b8e-324b-9d32-0d5c541166f3"
              #uuid "33e20383-3807-3414-869c-7a3907d40b75"
              #uuid "e9de6ee3-1f19-36e8-bdf0-3b24bacd02cc"
              #uuid "e1405ecf-c37a-3cdf-9bc0-46ca9df2e685"
              #uuid "db6d2f3a-d731-3ddd-9e97-4b857d9ac065"
              #uuid "01f7b705-9b33-3897-969b-343e8a6e682e"
              #uuid "6fe19369-f217-3b8c-a477-7fca8a743df4"
              #uuid "106facbb-305a-30f4-afe6-9fe69cfadbdc"
              #uuid "12e2d12e-9e19-33ad-b08e-22ab8cc8eac5"
              #uuid "e154f5ce-d498-3840-a559-661a996d4d09"
              #uuid "0071dfa9-ec41-35e2-befc-ecbe183ff272"
              #uuid "62326243-6ea0-3ce1-aef6-c1d285dbdc80"
              #uuid "72e2061f-c210-3f0c-bdd2-68d09fb15b98"
              #uuid "ae7bda5b-fa73-3e1b-b30b-c81fd70b93f5"
              #uuid "6fe16b2e-cfb7-3be8-8013-6c163b70120b"
              #uuid "0b0ba83c-ba8f-3c56-8b3e-a2fc3bc7f5a4"
              #uuid "7369ff3a-fe64-30e3-8363-9067a97ac8b4"
              #uuid "af0c5e41-309d-3a83-afb7-76f7378381b2"
              #uuid "e3a13cf1-2d4f-3a6a-9791-62315cf53ba2"
              #uuid "e5c528dd-2ba9-3a89-ac17-c427f0c00414"
              #uuid "dce6433a-bef0-3dff-a22e-433b721bfc14"
              #uuid "4615cd89-6ac7-3867-a94c-ceb0a15a7b13"
              #uuid "cd27a171-5aac-359b-82a4-8a86ed2000c0"
              #uuid "993ca650-a85e-3e69-b8f7-eaa4809c4862"
              #uuid "7d1c07ba-7b59-3e65-b308-f82e4f02765e"
              #uuid "ea25ad16-dccd-378f-afde-9dae72c6b4d9"
              #uuid "ed2baf70-63da-3cbe-9737-466f5a29fe95"
              #uuid "eab3ae9a-3d28-3df8-affc-d917c97d7195"
              #uuid "e8f7e1a7-0eb6-3e44-aee0-11dff550f9ee"
              #uuid "f7625727-1129-3703-96c0-442c8ac00dae"
              #uuid "77933845-adf8-3758-a686-a08ea46f015e"
              #uuid "ba290158-1610-3e16-94fa-7dedd0ef5e08"
              #uuid "7f5c4b62-c9ec-3866-8ad6-598ebab4623a"
              #uuid "51c77b26-5d4b-3952-ac93-fa7002f8a379"
              #uuid "8881688f-f717-3852-a5df-d3c7386562d1"
              #uuid "0d794c9d-d65b-3e94-8ce2-fe8020a2a53c"
              #uuid "5e679cbb-17a6-3355-9ddc-017e474ea5a9"
              #uuid "8107587f-5b81-3b66-9d13-2fa6e9a887df"
              #uuid "ec9a79c1-8253-3d39-9f07-8382ba20e59f"
              #uuid "9353a118-c201-398a-83cc-6d58ccb38f02"
              #uuid "91a5169d-5877-3642-9a52-54c4f01655da"
              #uuid "23767cbb-cceb-3686-8a59-f0250c57a1d9"
              #uuid "e6d5c2ee-6c34-370d-b344-30cc5ee8a749"
              #uuid "f944b1ee-72e5-3ea8-832f-4eaf0dde6f09"
              #uuid "28e54304-62fc-38c9-9b76-058878323d57"
              #uuid "79a39a92-dda9-376e-b337-e86bdbbc3864"
              #uuid "109a021a-56f4-3223-ae04-902a1f40db16"],
             :com.boardgamegeek.boardgame/max-play-time
             [#uuid "4a3e0096-1a08-379c-b4f9-1ca0070ea2f5"
              #uuid "64581d49-5b7a-3952-b129-c64b56c406ed"
              #uuid "4080e14f-b40a-3b33-98cf-83612aaecf76"
              #uuid "6d8aa71d-1531-3019-ac35-ea2463485268"
              #uuid "780cd613-d706-3945-8ef3-6d59c16c2312"
              #uuid "46abbae9-5fbc-3520-9ed2-16c2901bdbae"
              #uuid "7d9e8262-8714-332c-9ca9-ac68c68596b5"
              #uuid "358a9cb1-8677-3a1b-90ac-1c8d6ffa6288"
              #uuid "526e6774-4f0b-3073-9ec1-7c191c62d24c"
              #uuid "24380876-a0ae-3b46-a8c6-a092619bef37"
              #uuid "3be646fb-70d6-3079-b0a7-35b697a011c8"
              #uuid "d8ebf6a0-f01a-377d-82c8-e903e801973b"
              #uuid "6f074a1d-f38a-33df-b9d8-d724a8ed3410"
              #uuid "51a7df93-adb9-3cee-bc0c-05f7dc89f774"
              #uuid "a4a4e5f6-a7ab-31b8-8ec1-0983b264ed4b"
              #uuid "8ec8175e-8c92-3f65-a885-97c16ca93454"
              #uuid "7b6a839b-181c-3d7e-a88a-1115d8a027c2"
              #uuid "d9f82ac3-bc24-3fa7-8292-3fff745ff105"
              #uuid "d0c13971-6116-34f0-ba4f-9f6b16e7b130"
              #uuid "fd3be4f0-d310-39a4-86b8-03524d064ee6"
              #uuid "0e7278cd-a02a-3c04-86dc-c75a4df34eb2"
              #uuid "701ae3e6-c75d-3e66-ab6a-b255f6fade83"
              #uuid "2f266ba4-d63b-34be-8400-6b95a3442ff9"
              #uuid "a93478e2-7d6a-36e5-8e4e-8b4c3f632b0c"
              #uuid "280a5f64-7a78-3590-8dd0-81f7136e31b5"
              #uuid "cedb275c-f7e8-3cf1-9073-41cff22af498"
              #uuid "886937cd-0285-3aad-834d-f6e5bd1d1dfb"
              #uuid "642edb7f-7af6-3c4b-8b07-5ac20dcba0b9"
              #uuid "c8835178-b83e-3ef2-84d6-ed36804309c8"
              #uuid "2ffb14ad-8e1d-3f3c-9df9-133b523d8287"
              #uuid "0d22fe23-de11-3728-9634-4b0114313a9f"
              #uuid "d803129a-da52-3403-b88a-1331f9bf89b1"
              #uuid "0d600bac-e4d6-3227-b4bf-b0d9fee001c6"
              #uuid "c693b4c3-9720-303a-836a-8f25b4da698a"
              #uuid "e74ac58d-7a69-3b4b-9cff-6dc08fd9f434"
              #uuid "83f7cd22-e2a0-3e46-b9ba-4358004dc75f"
              #uuid "d8b5d495-0030-372f-8b5b-3131d1bcddc1"
              #uuid "3b11574d-ac04-3356-aa1c-eb3ac5ef4c6f"
              #uuid "a673ace7-74a3-384d-823b-f8131295d6d1"
              #uuid "f0343033-f91c-3c5a-9064-4138ea33af2f"
              #uuid "938351d5-c89e-32e0-af3b-73d217217b14"
              #uuid "4d4c8a37-4103-35eb-b414-672ae3f8ea83"
              #uuid "61f2c08e-b43e-3b4f-80bd-d988013ee49b"
              #uuid "6a99a492-a63d-3ef4-a946-1cdbf945a66a"
              #uuid "a58b4cee-88af-34f8-9ad6-839f132388f0"
              #uuid "d99574a4-a1a2-3d19-96ca-d4f5094dca65"
              #uuid "53b40008-e2e5-3189-9b82-fd0ba46405e3"
              #uuid "b4f52f37-41db-379b-94e2-3b8911f49401"
              #uuid "1ceaeab6-397f-308a-b02e-6652106f2fbd"
              #uuid "12fd071d-60ce-3146-b555-655882920638"
              #uuid "cb6afc25-1c32-38b1-bfe0-1c3f8797a9ea"
              #uuid "0dd28a2a-30d5-3d29-97ba-3e8bfa086f0f"
              #uuid "da846ac4-d725-3d51-8667-b8ab69c960fb"
              #uuid "4a734354-588a-3c87-bd6f-48f09c3e691f"
              #uuid "41e6fb49-794a-3928-bc31-b058fc3f832d"
              #uuid "c6dab445-bf7e-39be-b4cb-6f22ae7e715a"
              #uuid "275ef384-7d59-3c1c-8625-ec7a6d5208b6"
              #uuid "5aeb1f62-f6cd-396d-881c-07d58b82f143"
              #uuid "cba95a42-c53b-3c6f-bf3d-df9bf10a4069"
              #uuid "b86c48fe-3ed8-3b4e-9369-6d3957a9d311"
              #uuid "67e88af3-f2d3-3953-9be7-c1b26fefe183"
              #uuid "e56eb8fb-70f3-368a-b45d-dec1e25f35aa"
              #uuid "ad09b2d4-8b28-31c6-8e5a-2bf421f7f2f2"
              #uuid "ba776ee9-9ebc-3521-9d9d-ce1c6a702748"
              #uuid "c3fea04b-2042-3a0f-ab59-e7cedee3e1bf"
              #uuid "200327ec-e2f1-3904-9057-9c80de5c3e0f"
              #uuid "6b1a6c6e-487e-334f-97cf-8b0efad2f3f9"
              #uuid "7cd74735-c2f6-352d-8428-474bc1b6b386"
              #uuid "7b9a4759-a742-301f-b458-f4ef2d8368da"
              #uuid "d20adb03-0a94-319b-9d04-188d5cad9da6"
              #uuid "cd9b3130-0865-3759-962d-9c3eab8d03f4"
              #uuid "b7ae6819-447d-36c3-bb6a-0e7dbe5c17ce"
              #uuid "0f797b16-678f-32d3-af6d-84b6d8f6ad20"
              #uuid "f5c8ba24-2c49-3844-8721-5cf4e518c90f"
              #uuid "875b8289-de41-3672-8c92-95b6a689ff43"
              #uuid "653e0f82-5aec-3cf2-86d0-4422c6b2f8cd"
              #uuid "66437274-239d-371f-a5d1-71102dca56e3"
              #uuid "ccfd0e0f-749f-3a3a-a9cc-7c01a70ea5fd"
              #uuid "72b0f8c3-5245-35e0-9a66-484200882d79"
              #uuid "cf3b2299-3275-32a1-bcc3-40c64f229538"
              #uuid "a09707a5-88fc-32fa-b544-8afa929496ab"
              #uuid "ea2abdf4-a5ae-3c18-be7b-bd2db0068ddb"
              #uuid "104965da-ee0b-3867-95a3-0416228b7b19"
              #uuid "40bd8e35-d86c-3ba3-8791-e33dad4f0330"
              #uuid "578002db-1bee-32a8-949c-58bece6429a5"
              #uuid "bbf3c83b-9b9a-3dfd-9cc3-d3295f5d235f"
              #uuid "7e7123b0-d269-3d5d-9ec8-d12c52a8ed8a"
              #uuid "5c50d320-55f3-337f-b820-3e559968a3f1"
              #uuid "fd6267f8-71dc-3dc3-9ad9-e13b844fed44"
              #uuid "29b3ea31-ed18-3383-b4af-bfe1002404ae"
              #uuid "47dbc903-625e-337e-b249-2dbf0b1b9527"
              #uuid "c2ea7289-9af9-3d4e-8061-55ca7bf82b6b"
              #uuid "e214a1ce-1929-3835-b502-4510ef89f940"
              #uuid "d46d3296-6569-3615-8e1d-5ac2e88a346a"
              #uuid "fab76503-1b94-3d49-8b17-1336fababeec"
              #uuid "e29fbec4-4c71-3519-8e93-582b67df86f4"
              #uuid "1c1ad4ae-57a5-38c9-8c80-666849f4eeec"
              #uuid "c413a292-7a46-3ea3-aa4d-896b4b1e78e0"
              #uuid "d76c9788-f173-3fff-9b13-9ced6ab67c4a"
              #uuid "5a156002-5793-338e-9399-def9bfd7eca6"
              #uuid "59bab2ff-b0ef-386f-8db8-ef439320a47e"
              #uuid "a2cce669-b64c-31e7-9afb-63f03c696fee"
              #uuid "bddc24af-3739-3b8e-bfcb-17b4a25b7153"
              #uuid "3da3ce69-4e95-3c15-beec-5d9ec2078260"
              #uuid "2b110ae1-40c3-3594-bdfa-8a5bfe402f8b"
              #uuid "2d7c2d23-5fac-3ff4-8aac-33c2ce47eb1c"
              #uuid "a6480b1c-62dd-3ceb-9f94-fb57c823691e"
              #uuid "49b5473d-32f5-382b-943a-dda4a1491daf"
              #uuid "5af4832c-3c6d-3e4b-883d-4fbba7190317"
              #uuid "bb8434ca-528e-3b5f-bfc5-5eebbe2c00a0"
              #uuid "dd86edfc-d85e-3039-9399-5c282a2e3524"
              #uuid "99102149-c730-3271-a928-b7549ce07a13"
              #uuid "24a04d97-a632-349a-b9b1-bb49af1a096a"
              #uuid "c7b74e13-dff8-3831-98f4-1d81198c1337"
              #uuid "cf06db18-725b-36dc-8e9c-5246b40aae01"
              #uuid "30933bc2-a19f-3124-9a19-d7b8facdbeeb"
              #uuid "054f1270-bf79-32f9-825a-96880e800c9f"
              #uuid "165261a9-0183-3e53-be82-ccc197c354b8"
              #uuid "ca5622cb-e7ba-31f7-95df-551ad1bbe80f"
              #uuid "2752fdce-7879-3086-8e8e-2a54c21ee999"
              #uuid "ad117101-b1d8-35b7-b02b-d335db512e5e"
              #uuid "3cad23d1-2f51-3a7b-8a51-4c256db8638d"
              #uuid "f18187e7-f398-32f0-b73e-625e848d8333"
              #uuid "b1127074-659b-3102-907a-25a0473a3e98"
              #uuid "843ecaf0-bb25-3a67-af63-f8a4bc3708a3"
              #uuid "1fdd0d64-7a70-3a2d-93b1-bbf278454b32"
              #uuid "51c249b0-90c8-3a66-8732-f796a82e5382"
              #uuid "20263815-62ac-3093-af3d-0f4a0f0538bb"
              #uuid "d18a26f4-6f25-37b2-a861-2147cf47cf18"
              #uuid "e5279fe2-9e7a-313b-9b5d-e2d1f6a1e8db"
              #uuid "f77b4d34-54f4-37eb-8a5b-6d8df9e0f66d"
              #uuid "20b16954-6c66-3536-b816-f13d464da44c"
              #uuid "2c11257f-a438-3f75-8fac-459a4275e4c1"
              #uuid "dee45e08-5103-32ec-93b7-17d391b64576"
              #uuid "9db68b1a-dbc5-3564-ab25-1023e94227a1"
              #uuid "2c63539a-a2a5-3415-b3d7-89edc773ac8b"
              #uuid "77926e55-5ca9-34b7-8f65-009dd92da63b"
              #uuid "9cfc3b97-43a7-3c0f-a7c6-2b42b62c90f6"
              #uuid "191e854e-b00d-3d80-8fa1-fed83b373be7"
              #uuid "05ae57bb-e135-3a41-87f7-2bc52f18bff4"
              #uuid "01c751b5-3d59-3358-a6e3-3ab7ddceb42f"
              #uuid "a0969dfc-5294-3b41-82bf-220e859197db"
              #uuid "3e302b86-f47c-3d22-9b4d-c253439d9970"
              #uuid "941e3f4a-24d8-3841-8144-e9db47d6f92b"
              #uuid "660cb8dd-c782-3542-8db8-9e1dc61af856"
              #uuid "f821ee04-f104-3d22-96a6-9bab12eb4c28"
              #uuid "accf9b44-d60e-36aa-ab3e-293a0e91aed0"
              #uuid "76a33f97-02f4-3a7e-ada3-46bd2544ae02"
              #uuid "648ffc7a-6dd1-39e8-a7f5-7ecb69cc4066"
              #uuid "bf515360-5eca-32d5-ac9d-fb620b905619"
              #uuid "434949a6-89e3-3ba2-8e67-412edc26c71f"
              #uuid "a389677b-6118-3815-84fe-c1e75f38984c"
              #uuid "ebe3d298-d25e-3110-8e34-1c079e9455d9"
              #uuid "b8f4ece4-3fa5-3fc3-9f1d-a34aec906149"
              #uuid "34946d54-6d22-3af0-afdb-e795b8de802b"
              #uuid "ebb7a837-d8f1-3d0c-a149-24e17e4005dc"
              #uuid "af89834e-3251-3aa9-a464-74b8d24a5091"
              #uuid "bd4049a7-2730-31a1-bbc9-4a077d75facc"
              #uuid "61751dfb-a841-3676-aa92-97d75c9a9f56"
              #uuid "c9e680a4-40fb-3a3e-bc38-6556dd90712b"
              #uuid "bb2b867a-583d-3e72-adf5-e81bf22baea4"
              #uuid "d9ff8a5f-72de-3a40-99bd-301e426485bd"
              #uuid "826863b8-1605-33a8-9169-91ebcb89712b"
              #uuid "434338bc-9501-334b-adbf-2b3752e9e231"
              #uuid "dd1bf333-48e3-3cde-80c2-6fb824ec3563"
              #uuid "a6092dda-9d9f-3b45-b148-b73eb5da724a"
              #uuid "bcfc2af4-495d-3023-83ab-12fb1057166f"
              #uuid "984c20a2-ad28-3167-b8ae-fcef61acbced"
              #uuid "a5d7ddea-2e79-3a0f-b248-95af3f6223d4"
              #uuid "e9e59065-5acd-3d1d-876b-8cb866541534"
              #uuid "e369d9fd-2ab5-3455-9298-16db19e37fd4"
              #uuid "90f166e5-27c4-3684-8865-0a7d63773ce7"
              #uuid "aecc77c6-bfad-3a88-b455-19b8d2c86bc8"
              #uuid "39af5c41-5927-3dde-8a75-10397211dcda"
              #uuid "227fed4b-25cc-316a-b15e-6c9a064702db"
              #uuid "fcbd772e-48c4-307d-bd3b-e13b37a82f5e"
              #uuid "fbccf9d3-dd4b-3e43-954e-9fafac2763ae"
              #uuid "39458645-fcb9-368d-81b6-ad23bbed69cf"
              #uuid "46df0476-0eb0-30b7-92cd-7703972c5f1a"
              #uuid "5af83e31-96bf-39f4-80f3-1f2e1a6c9afe"
              #uuid "e7c82f28-5b8e-3311-8519-a3cfa713dec3"
              #uuid "f46ff3af-0204-348e-9bd0-c1f668f82128"
              #uuid "f750d160-d009-3c96-a630-eff035abfd6c"
              #uuid "a4c50ca7-7a49-3873-a656-5ba52bc56488"
              #uuid "eb9bd23b-c056-3a5d-a53d-78b2dcbd15ae"
              #uuid "edfa15bc-3235-3696-aaad-09e432fc6662"
              #uuid "a65fe9b8-99d0-317b-9c91-7b969001669d"
              #uuid "7bd8e302-1270-3448-8815-58d1f6da0834"
              #uuid "5610f650-22c6-3571-bffa-cfd6a9d68b2a"
              #uuid "9cf42701-85ad-3877-9a0f-cf57a5acf172"
              #uuid "309ea4eb-582b-3fb9-93ca-87fd54016d3e"
              #uuid "b8909580-a299-3ec5-848c-548f38510b72"
              #uuid "595f02eb-d247-3d88-95e4-06800f89e71a"
              #uuid "134c5416-16b9-3118-a547-774f6df7bbcd"
              #uuid "f4afb893-6f91-3389-8606-9c088ff6ea75"
              #uuid "64b81638-f97f-36d4-ad33-08e915a1750e"
              #uuid "aacb653d-e587-34a7-a360-4c3956b4f677"
              #uuid "91934e02-f64d-3aab-9536-19f592307a91"
              #uuid "9b45f563-8b03-34d4-9d30-5134ab5e657e"
              #uuid "97fc6923-396a-3ad8-8a4c-70879893f4b7"
              #uuid "3f9e8eb6-bc1b-357a-949e-643f14a3cedf"
              #uuid "97fe9a27-6b0c-3281-8d07-433af5bcf4e4"
              #uuid "02b25657-6abc-3080-8fb9-16100cb17ad5"
              #uuid "161dfda2-bf83-3041-ae10-e2410340abd1"
              #uuid "595f5c4f-c267-303b-adf4-1333c70a9460"
              #uuid "81cc0f79-3609-346a-8dde-65ed1c9f3c3a"
              #uuid "9a6c960c-a513-3563-bb1f-1783f1aece80"
              #uuid "43f3a349-eec8-3b6a-9947-777f90811c90"
              #uuid "133c22e7-c259-3256-a323-5b88f0b6a645"
              #uuid "df4c4520-3102-33f1-9a51-ee304c193f23"
              #uuid "63e5002f-f8a6-36bd-81b5-2f817477eecf"
              #uuid "19adc592-fdfe-37ba-81a5-d195098fc52d"
              #uuid "f8283731-6cf2-3086-8140-494037314bf5"
              #uuid "d496a066-c36e-3570-99d1-9eedec118dee"
              #uuid "110f4e5f-593e-3ca2-819e-29dab8ad6f55"
              #uuid "0746ccba-be89-3d2f-a4b6-af590e489ff0"
              #uuid "cbed48f7-5fef-3645-9ebc-db33807e504c"
              #uuid "ac19727b-672c-352f-b393-c52a81b055cb"
              #uuid "492b7750-c3e8-3055-a93b-6745391300a6"
              #uuid "a408c9e7-3639-3621-b65f-1f8aeea37b18"
              #uuid "2e89598e-c81e-39d5-bae2-aee451063265"
              #uuid "def6402b-3a6f-30cb-aeb3-63cd5cefb20d"
              #uuid "bf684d42-7071-39ee-809d-514bc5ca241a"
              #uuid "be01908f-633f-35da-be89-80701db8ed25"
              #uuid "7c1ada9b-f78c-379d-a6a7-b3018581aab9"
              #uuid "7e7fdd38-98cc-3f0f-a059-308e820a2013"
              #uuid "59ccf897-4368-3ab7-ae8e-0ac969872f6e"
              #uuid "1a30c214-a750-3e08-97aa-c85a7fa01368"
              #uuid "30c12229-f508-341c-9680-149dbdf88523"
              #uuid "c56337cc-54ed-3e22-8b76-d1092f67310c"
              #uuid "08cddb57-6c00-3836-9593-a0b04fd84141"
              #uuid "935b4085-0cd3-3875-abe0-2996fb99980b"
              #uuid "c8ccad85-82a3-3865-8ad8-a3487faedffb"
              #uuid "f72af12f-4736-3bde-84b0-ca91070cf43c"
              #uuid "ef81a392-af64-3668-81ff-2c3b7736919f"
              #uuid "69895ff2-b990-3611-827e-f4f7fd32eb8a"
              #uuid "b2980c72-2a1a-3e7a-b030-3718ce5491d8"
              #uuid "4d77e635-44ee-324b-b8e1-1cd07bd913a4"
              #uuid "cd19fd52-bf5e-3ad5-8ccf-0d6664374368"
              #uuid "73fdae1a-b0ca-3e78-b23e-a4a7101cd9e4"
              #uuid "f072aeb8-c5dc-3eb7-9f65-6c8ab7d359a9"
              #uuid "cace91df-d6f2-36fc-a98a-6fa5cde7357d"
              #uuid "06ac533c-6f03-39a8-ae86-a6c373df20f3"
              #uuid "027df389-a20d-3cbe-886e-a91e5b10d58a"
              #uuid "b150a64b-6e6b-3e4b-8784-e6bc946f1fc1"
              #uuid "4c2d3b0e-9fbd-3faa-9fed-724910231a39"
              #uuid "a9957800-b641-3919-9ff6-ca11f1c233c4"
              #uuid "5aac7681-3d33-3350-b4e8-43d1ae9b29e3"
              #uuid "2fe5b306-b8a0-3e8b-becf-b4a37cf52717"
              #uuid "1b3840b0-b70d-31c1-be70-014c8537dbba"
              #uuid "aff8862a-8fba-39a6-86f4-ef02a3a228f9"
              #uuid "e4b769db-2a42-392d-b311-b02c3545d07d"
              #uuid "6db176b1-017b-3430-a362-e2d6ee99cc67"
              #uuid "1c585f7b-4a5b-3e81-abe0-97ce17218168"
              #uuid "e1d04b1f-1d94-3006-958a-ee81242dab6d"
              #uuid "5f955ad8-59ca-3215-9cab-4fa839d2a033"
              #uuid "0eabf8b7-0bee-38f4-bfd2-cd9ef3624d39"
              #uuid "ae9fa216-d3c0-3682-9657-bc2cb71eaa11"
              #uuid "b7dd6050-6cb3-352e-9363-36450ff12ddc"
              #uuid "d8ac8dc4-6760-3f12-96c2-e3420b291781"
              #uuid "47a720fb-24ff-320b-99ab-77739da99a5a"
              #uuid "1309682a-fbd4-3c2b-89cb-11c7d8048013"
              #uuid "3b726f01-748c-32b9-ac65-408fdb259e18"
              #uuid "e3ff49f1-3a4e-3be2-9c80-51385adc499c"
              #uuid "6322ea9d-5e70-3e8c-89a6-0e261275b1d1"
              #uuid "36f8c047-0a0d-34e8-920b-337b779969ab"
              #uuid "6f243f7a-f0d3-3ed7-8572-4782675ddb75"
              #uuid "b75229d9-66a3-3ee4-86f4-e1e5f353d9a4"
              #uuid "a4eb9598-b375-3f22-8363-e0295ac2f5f2"
              #uuid "c1fa67fc-99a3-39a4-962b-ba099f84d11c"
              #uuid "44de8c27-9942-39ca-997c-57ff932fc882"
              #uuid "c6dfc763-4e0a-33ee-b4b9-efe1ce4f82b3"
              #uuid "f81386ae-7767-3f93-a560-c78df55109bb"
              #uuid "f6be0578-56d6-30b6-ad51-8713fc8f260a"
              #uuid "54b141a9-4bee-378e-b867-fd1d4729f014"
              #uuid "c64e760d-cd41-31b1-9626-a196593146fa"
              #uuid "edc4787a-b55f-39c5-ab40-a99f7c1a0c80"
              #uuid "7d9f1d6a-539f-3506-a533-6d5ff7e5df57"
              #uuid "431d180f-b4d4-35f3-8c95-96ad5a7267d6"
              #uuid "af817d47-9021-3806-800d-7ef8dab08024"
              #uuid "bb7745e6-fe51-351f-843c-5012bd13d334"
              #uuid "655dd7fb-2048-304d-ac0f-6a354ff76bc2"
              #uuid "e261ac28-9c39-30db-81d4-e7551f8b4fe6"
              #uuid "3992d652-f81d-3e86-bd6e-2e685cb351a3"
              #uuid "d8d090ed-62f4-3521-8f53-6cd65960c06e"
              #uuid "51817160-093d-3773-957a-662779bebec9"
              #uuid "761cd5e5-55ee-39c8-b789-0273d2493fe8"
              #uuid "ff75a7b6-d946-39dc-b9cf-69635113e6f4"
              #uuid "1e78ea48-893a-3f8e-91e2-01c9ff0e706e"
              #uuid "f00e2b92-434d-31e6-8a25-1b16618b5ab5"
              #uuid "458d2163-a348-30c3-a4ad-8792fa32645c"
              #uuid "d8b44a4f-28ae-353d-adeb-b3fd26fc143b"
              #uuid "af472b73-df4f-3397-a8c7-31a328913353"
              #uuid "928c51b9-1ca6-3be5-b2f1-e665e90fab70"
              #uuid "c3fa9226-9cf9-3afa-8844-dff274cc446d"
              #uuid "8ae6e417-a5fe-36fa-9be3-bd2c6ac61840"
              #uuid "08240ccd-42ce-3242-b2f3-7bf5b24420fe"
              #uuid "59f822bc-aa8e-319b-9e63-eb00919b367a"
              #uuid "6ad0df6a-ac90-3fc1-a6fc-cdd155147a92"
              #uuid "32288419-57f9-3b53-a2df-4b3393930c5a"
              #uuid "44ca4f9f-417c-3200-b21f-4ae33fae9646"
              #uuid "0a4d7b38-fbbc-3f6c-88fe-b09fc35ad1a6"
              #uuid "d993f311-557a-391d-ab21-677ab586a01b"
              #uuid "36749cc5-01bd-3292-aaaf-44525fc6ed7b"
              #uuid "7fe2ec37-f762-3f17-b6c0-cc2b097adead"
              #uuid "1fff84e0-9d09-3677-a846-84f01c21b161"
              #uuid "6b35d568-0483-3a28-a965-30b88e49b9f5"
              #uuid "12218694-0010-31cc-a245-a502b7ed4b19"
              #uuid "35474b73-b019-37a7-b3d6-ee8eb6df3f8c"
              #uuid "d94472e2-8880-369b-b2f2-d1d3b83960c6"
              #uuid "1b2a1ef5-4042-3ba6-826b-7d8fe796f7ba"
              #uuid "deaefe4b-599d-3d42-982f-b0bef3bbb3d3"
              #uuid "56be7020-8ac5-312f-9c02-a912103646d9"
              #uuid "f945232e-faca-3164-a579-88d416e62368"
              #uuid "39063899-ef80-383a-97b7-38b8c778cc24"
              #uuid "7416a104-a4b4-3c68-895e-98e989dce7de"
              #uuid "6b8723ed-8ce2-3285-963d-9682f60b0287"
              #uuid "9cb073d5-2081-32d7-9991-a6077288e01e"
              #uuid "582d2648-b634-3370-a31e-bef979dab3f3"
              #uuid "0f2e7cd3-2595-3b1b-b656-cb103be3e521"
              #uuid "06e9bd9c-0975-32da-acdf-2b1942d57f1e"
              #uuid "890488d0-a370-30a4-9788-a44754330b27"
              #uuid "fb48a85b-84e9-312b-985b-de09b2c0b29f"
              #uuid "48788b6f-7e50-3fbb-b1a8-772c4139b77a"
              #uuid "3ed6a2fa-a80b-3140-9878-53dd29c238b8"
              #uuid "ffbd4d36-9e2e-3949-8c47-2403ba1b4e8a"
              #uuid "34c99f3a-1325-32c3-865d-f7e597f25a8d"
              #uuid "42f0d762-a858-3dbb-b64d-dde4f6a4fc6d"
              #uuid "7873a90e-ea1b-3b3b-8ca8-4820dc662976"
              #uuid "5aa42acb-56e5-3325-acc3-e39be2b450a1"
              #uuid "f98b9f16-c08f-3903-9b7f-80481ccce0d0"
              #uuid "4846597b-0309-3cd6-9f05-12f43edf2faf"
              #uuid "d701c31b-be98-3228-af7f-aaebd4cb0455"
              #uuid "2293c663-d1bc-3701-9a53-009f457c6940"
              #uuid "909332ae-bc74-34a4-8cd5-4ea30edd7930"
              #uuid "c9135569-60ba-391a-a44b-1d8f95a4eb93"
              #uuid "22b3df14-e100-33a6-a098-e396cb523d6a"
              #uuid "4921b8e8-521a-3a27-9aac-936218a067c7"
              #uuid "87f8a6ab-85c9-3ed3-b02b-4ea641ad4bb5"
              #uuid "58fb7a8c-d0f1-36b0-b1f5-b7091fbb0ba0"
              #uuid "704d0598-6340-3c49-b5b5-9d0fcf54e1f3"
              #uuid "17b41f7f-4de8-3fe3-be7f-91fc18e29b8a"
              #uuid "d5380d3b-56d5-3783-a863-1af12c39f5c7"
              #uuid "b11ddc7e-1671-30bd-a2dc-89dd757508d4"
              #uuid "b7c512a7-a3f4-35d4-a416-c10bffb57bb4"
              #uuid "5e611ca2-e99d-358f-adc6-f3f7bcfb3ad5"
              #uuid "11a2b6fb-2a70-314c-b249-9d7b509352e5"
              #uuid "8acfd5b8-b774-39c4-a04c-29420e5631c0"
              #uuid "645ab7f6-09eb-3401-988d-97cd930668c1"
              #uuid "5b444b22-2047-3124-af08-48687f72a6b5"
              #uuid "a2a3a034-7f0f-301a-8473-dd54dca2462e"
              #uuid "c59a448e-a61e-3dad-871d-f3bc7ebe6774"
              #uuid "b172271f-a27d-3300-9b46-7f9825f0727e"
              #uuid "2e994ee0-a8fc-32ef-a229-a0d74edf07cf"
              #uuid "bdc861dc-6b29-3561-92f7-d53f184e07fc"
              #uuid "9db165b4-98ba-3935-9f4e-a7bd23beb693"
              #uuid "d80578d7-99b8-36c3-84e7-da04814b80f5"
              #uuid "3ca4bbbb-2ab4-3ee4-85af-cd73036a4cd3"
              #uuid "5140d848-4910-3017-8f45-c2851658966b"
              #uuid "ebb89386-c539-37db-b4a7-972b931256f7"
              #uuid "3d1f92a5-65d3-31a6-9880-236e33c49bf3"
              #uuid "05e84109-515f-3f98-8ab8-872a8a1a9cb2"
              #uuid "24689901-b879-3cd9-9b75-5dd7dd2b8f2d"
              #uuid "c31af57c-a315-3610-b455-9d5f386f31e0"
              #uuid "c377afb2-e46b-30b6-968e-71cb449ac3ea"
              #uuid "7a51eb3c-d160-3393-b631-9ae87020b9db"
              #uuid "d3c432b4-bac7-3974-8e6c-60ce1f8b528f"
              #uuid "abe58998-3062-3866-9238-314af7ba0265"
              #uuid "3463c066-922f-3864-93bd-b87bb1286679"
              #uuid "30fe5e0d-e895-3a87-87df-7cdfbdd1f7ab"
              #uuid "903d8dd1-63cb-3a8b-bcfa-23261d6598b2"
              #uuid "00dbe22a-358d-364c-aa3e-6da841b451dc"
              #uuid "abe1a4aa-bcd0-3440-8bb5-a57f0dcc37ac"
              #uuid "effdb9ce-6c5d-34df-b1b8-9d7069c8e0fb"
              #uuid "7ca15329-76d2-3582-a841-424d17ec0f0b"
              #uuid "edbf5fa9-4b8b-3458-ace1-fe46640503a1"
              #uuid "3c213740-1920-3b32-acb4-a2877cd7aa17"
              #uuid "06c5d6ce-c062-3ac0-bd43-6186b663fc10"
              #uuid "0727c24e-c484-3017-9850-a0e366a7dd42"
              #uuid "09e49bb6-1f03-33a3-bfbe-8937e2e031e8"
              #uuid "5b349ead-c3fb-374b-bb6c-47fcc3843355"
              #uuid "e8bffbf9-2f40-3bce-837e-bd9538b19c58"
              #uuid "dfa418bd-eebc-3c3f-96b6-edaf5e3c4d89"
              #uuid "664d0a6d-1ba3-3b2b-961f-16ce489ff406"
              #uuid "35af2b0c-b093-3e74-8ed4-e7589938e8ac"
              #uuid "9ecf0011-c0af-37eb-a590-f247005f0399"
              #uuid "0aba0975-5e75-3a94-8bfe-fd86797f7ce8"
              #uuid "6b13ea3b-f083-34f2-adf3-f3dba030f1ef"
              #uuid "b1ea21fb-2177-3fed-af81-0a3967e76069"
              #uuid "e2257f79-e77e-34b7-87b1-a0924290c7f3"
              #uuid "e8d2a59c-f315-3860-9608-b04f893cbc93"
              #uuid "08b3b128-c196-3b26-bc2f-d0e5523bc940"
              #uuid "af493a90-a6e6-31a5-966e-beed6fcfe1b4"
              #uuid "6da53f25-b27b-3c31-8b0d-3928dc46f469"
              #uuid "0ef8f876-d62a-3535-ae28-410454e3634b"
              #uuid "1add2eb4-1fca-39b2-a15b-4a7d68571409"
              #uuid "18594966-e721-3762-8ad4-b4cc663db0b9"
              #uuid "114f738d-8858-3e7b-9fdc-41ddb2758725"
              #uuid "35b5c110-f2b0-3562-ae79-b51bd6300690"
              #uuid "792a15e4-87a1-362b-8199-5789db4c3b0a"
              #uuid "3384a03c-665a-3116-a474-cf5d4406c85a"
              #uuid "d88a6b63-1a1c-36ea-95d1-2d05210eb706"
              #uuid "4ab65803-6f4f-3742-85c3-84b863fed5c2"
              #uuid "0663d3ee-2750-30d4-ad83-aa74a59c87ce"
              #uuid "042103e1-8bdd-3157-aceb-cca413d78f3b"
              #uuid "b17747c8-2344-37e0-af25-4c86481d8b35"
              #uuid "e923a27a-48cd-3c06-a494-d0fa119478a8"
              #uuid "baf9b7dd-749d-37d7-888f-c84d255e682f"
              #uuid "189f9b13-158d-379b-9440-05b9bc24a356"
              #uuid "1cdae507-3b8e-324b-9d32-0d5c541166f3"
              #uuid "db6d2f3a-d731-3ddd-9e97-4b857d9ac065"
              #uuid "4fce228a-9d44-32fe-ac24-659f263ee51e"
              #uuid "01f7b705-9b33-3897-969b-343e8a6e682e"
              #uuid "6e6f4eb8-c896-3609-ae50-49ede7fbf6ad"
              #uuid "88857068-79d6-3142-9e20-b8c7fd8b986d"
              #uuid "5f04dffc-be2c-351d-adf5-f41fb7084b4e"
              #uuid "12e2d12e-9e19-33ad-b08e-22ab8cc8eac5"
              #uuid "cb4c3448-07c8-36e6-8cbd-28f45339be1d"
              #uuid "edcee0da-2a9f-3e86-ab60-5a78ad6f26ee"
              #uuid "9c557202-449d-3095-b805-89c2e6e0fe50"
              #uuid "e154f5ce-d498-3840-a559-661a996d4d09"
              #uuid "62326243-6ea0-3ce1-aef6-c1d285dbdc80"
              #uuid "7b1d9fe4-27bb-3db5-af9b-89f0785afc59"
              #uuid "90a300ed-ea38-3514-b744-0c43440fa4b3"
              #uuid "074edbaf-ed58-3f43-ad67-8af6ba4fcefe"
              #uuid "14d13fd2-bd65-3d26-a969-71f5cec92764"
              #uuid "6fe16b2e-cfb7-3be8-8013-6c163b70120b"
              #uuid "7369ff3a-fe64-30e3-8363-9067a97ac8b4"
              #uuid "e5f11979-9a30-30ec-8084-92dd584b1214"
              #uuid "af0c5e41-309d-3a83-afb7-76f7378381b2"
              #uuid "e3a13cf1-2d4f-3a6a-9791-62315cf53ba2"
              #uuid "da7d7bb0-2a43-3cd7-8ea7-21c4eb8ae388"
              #uuid "7faaa1de-90c9-3f60-a58e-46fae6daf77c"
              #uuid "0a995f25-bdf2-358f-bf5a-93e22c9aa05b"
              #uuid "113e202b-52db-3631-b4c4-7027d1edccf5"
              #uuid "4615cd89-6ac7-3867-a94c-ceb0a15a7b13"
              #uuid "bc6235a4-d8ed-3225-86d0-ce30fcb2da6a"
              #uuid "cd27a171-5aac-359b-82a4-8a86ed2000c0"
              #uuid "d5fd1c48-4bc6-3542-8805-4964fab16e05"
              #uuid "993ca650-a85e-3e69-b8f7-eaa4809c4862"
              #uuid "c180dcbb-f5dd-3cdf-acb3-dfe83bc594ec"
              #uuid "e0dfaae0-12bd-33ef-94b1-4c34842456b4"
              #uuid "7d1c07ba-7b59-3e65-b308-f82e4f02765e"
              #uuid "ea25ad16-dccd-378f-afde-9dae72c6b4d9"
              #uuid "d55cb47e-7f6c-3de3-afe9-3acfd3bd09af"
              #uuid "647e229b-c07b-3419-a641-254ed8b96dbd"
              #uuid "ed2baf70-63da-3cbe-9737-466f5a29fe95"
              #uuid "423cb589-88be-336d-ada8-9817b5fe519e"
              #uuid "eab3ae9a-3d28-3df8-affc-d917c97d7195"
              #uuid "e8f7e1a7-0eb6-3e44-aee0-11dff550f9ee"
              #uuid "530b622e-6e90-30f4-b806-d0cbf74102a5"
              #uuid "07f37b38-2b05-392e-91fd-d4e76cc7fbf0"
              #uuid "e1405ecf-c37a-3cdf-9bc0-46ca9df2e685"
              #uuid "77933845-adf8-3758-a686-a08ea46f015e"
              #uuid "51c77b26-5d4b-3952-ac93-fa7002f8a379"
              #uuid "8881688f-f717-3852-a5df-d3c7386562d1"
              #uuid "1bd17795-c173-3c75-9489-8343917b819a"
              #uuid "0d794c9d-d65b-3e94-8ce2-fe8020a2a53c"
              #uuid "af9c7e15-a449-3e77-9dcf-1fed9a676d1f"
              #uuid "72e2061f-c210-3f0c-bdd2-68d09fb15b98"
              #uuid "8107587f-5b81-3b66-9d13-2fa6e9a887df"
              #uuid "51e8b349-68a5-36bd-84d2-d7b86bb0765b"
              #uuid "7c823c08-2b3e-3613-bf68-fde60227450d"
              #uuid "ae7bda5b-fa73-3e1b-b30b-c81fd70b93f5"
              #uuid "ec9a79c1-8253-3d39-9f07-8382ba20e59f"
              #uuid "9353a118-c201-398a-83cc-6d58ccb38f02"
              #uuid "ba290158-1610-3e16-94fa-7dedd0ef5e08"
              #uuid "48309f49-6981-3784-80f4-f8b7cff15c98"
              #uuid "d9878711-9bbd-343b-bb79-ba45904cc23c"
              #uuid "9d8b1773-e579-34ae-9aae-3e3c82f764ce"
              #uuid "91a5169d-5877-3642-9a52-54c4f01655da"
              #uuid "3980f7ea-079b-3741-a713-8494f6bcbb9a"
              #uuid "23767cbb-cceb-3686-8a59-f0250c57a1d9"
              #uuid "6e8ce4f2-3cc4-37b8-9002-721e44843aaf"
              #uuid "2bc22d15-7e2b-3a2d-aaaa-46fe0f8945e2"
              #uuid "33e20383-3807-3414-869c-7a3907d40b75"
              #uuid "568da493-2833-3009-ad26-7108e0683081"
              #uuid "6fe19369-f217-3b8c-a477-7fca8a743df4"
              #uuid "106facbb-305a-30f4-afe6-9fe69cfadbdc"
              #uuid "7f5c4b62-c9ec-3866-8ad6-598ebab4623a"
              #uuid "f944b1ee-72e5-3ea8-832f-4eaf0dde6f09"
              #uuid "5e679cbb-17a6-3355-9ddc-017e474ea5a9"
              #uuid "d82b1470-bb05-3f45-86cb-1e51d8455a3d"
              #uuid "86f0bb77-105e-3136-98ae-4837a11ed606"
              #uuid "e5c528dd-2ba9-3a89-ac17-c427f0c00414"
              #uuid "dce6433a-bef0-3dff-a22e-433b721bfc14"
              #uuid "e9de6ee3-1f19-36e8-bdf0-3b24bacd02cc"
              #uuid "f7625727-1129-3703-96c0-442c8ac00dae"
              #uuid "0071dfa9-ec41-35e2-befc-ecbe183ff272"
              #uuid "28e54304-62fc-38c9-9b76-058878323d57"
              #uuid "79a39a92-dda9-376e-b337-e86bdbbc3864"
              #uuid "de3493ea-6e7c-3152-9c99-22e9e501faf8"
              #uuid "5f075ae3-e1f9-3038-abb8-c4632991f96f"
              #uuid "b4991e13-f466-39b4-be16-56909272f1cc"
              #uuid "4d6bfce7-c3d0-3def-8625-e405087939ed"
              #uuid "db5ac01b-b987-3006-8f5a-61d4142920ec"
              #uuid "f8049db2-d889-3677-984e-4e2ce41de578"
              #uuid "0b0ba83c-ba8f-3c56-8b3e-a2fc3bc7f5a4"
              #uuid "e6d5c2ee-6c34-370d-b344-30cc5ee8a749"
              #uuid "109a021a-56f4-3223-ae04-902a1f40db16"]}}
)
