package year_2019.semester_b.period_a.solution.question_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Loader {
	static String[] names = new String[]{"Perry Silberman",
		"Felton Lesher",
		"Major Lincoln",
		"Greg Schlueter",
		"Clement Strawn",
		"Broderick Mcgaughey",
		"Renato Johnsen",
		"Fletcher Mento",
		"Aldo Harth",
		"Landon Schroeder",
		"Dane Ammann",
		"Oliver Baldonado",
		"Alfonzo Jantzen",
		"Britt Mcmaster",
		"Nicholas Milone",
		"Joe Bagdon",
		"Kermit Hooton",
		"Alex Weckerly",
		"Rudolf Pariseau",
		"Markus Presgraves",
		"Felix Halsted",
		"Willie Ransdell",
		"Wm Speciale",
		"Marquis Krantz",
		"Emmett Demark",
		"Theron Sommer",
		"Davis Corea",
		"Joseph Goslin",
		"Gale Gunderman",
		"Stanley Morvant",
		"Trevor Corriveau",
		"Keneth Mulvaney",
		"Johnson Kibler",
		"Ken Jeanlouis",
		"Deshawn Randle",
		"Ellsworth Bechard",
		"Cedrick Mailhot",
		"Jewel Milano",
		"Thurman Croswell",
		"Trenton Suggs",
		"Harlan Schlabach",
		"Houston Coots",
		"Rick Kierstead",
		"Kelvin Diehl",
		"Brendan Guyette",
		"Sanford Raskin",
		"Alonso Forshee",
		"Douglass Pascual",
		"Giuseppe Mortimer",
		"Jerrell Perri",
		"Roy Zeman",
		"Shayne Shreve",
		"Roman Lafontaine",
		"Dave Mani",
		"Shirley Rother",
		"Numbers Kamer",
		"Gregory Chaloux",
		"Winfred Gaskin",
		"Franklyn Koffler",
		"Hubert Tegeler",
		"Hunter Vandusen",
		"Donovan Schommer",
		"Mario Hagel",
		"Dino Brooke",
		"Gabriel Krauth",
		"Mohammad Torian",
		"Preston Barefoot",
		"Dorian Peay",
		"Nathanael Rosenberg",
		"Weston Santee",
		"Roderick Giese",
		"Marlon Sackrider",
		"Moses Wicklund",
		"Tobias Appel",
		"Billie Freda",
		"Donny Kessler",
		"Leopoldo Vales",
		"Nestor Wolery",
		"Rosario Fred",
		"Mason Winburn",
		"Margarito Mertz",
		"Barrett Silvestri",
		"Elmer Conry",
		"Rob Urbain",
		"Coy Furguson",
		"Lee Scheurer",
		"Nicky Lemus",
		"Christoper Waldron",
		"Elton Whang",
		"Trinidad Lash",
		"Bryan Salzer",
		"Leslie Grayer",
		"Ivan Schaefer",
		"Vicente Gothard",
		"Monroe Ballew",
		"Dana Maser",
		"Shane Blades",
		"Stanley Fenn",
		"Pedro Flatt",
		"Patricia Ga",
		"Mason Swensen",
		"Huey Look",
		"Teddy Poeppelman",
		"Seymour Clothier",
		"Jimmy Brunelle",
		"Alexander Woolley",
		"Isidro Luciano",
		"Bobbie Mans",
		"Larry Perrett",
		"Arturo Widman",
		"Heath Kyker",
		"Reggie Despres",
		"Matthew Sumpter",
		"Wallace Bester",
		"Harris Ellenwood",
		"Elijah Behar",
		"Marty Testerman",
		"Ralph Graydon",
		"Porfirio Baltz",
		"Judson Pariseau",
		"Victor Hesse",
		"Sang Noguera",
		"Bryon Yeoman",
		"Simon Vanderploeg",
		"Jerrell Faulkenberry",
		"Daniel Daigneault",
		"Rey Blinn",
		"Tomas Suydam",
		"Sung Hamlett",
		"Miles Sprow",
		"Arnold Basil",
		"Ray Lengyel",
		"Romeo Marrs",
		"Bertram Tritt",
		"Carlos Veney",
		"Gilberto Redington",
		"Kristopher Elizondo",
		"Sammie Ismail",
		"Peter Smtih",
		"Antonio Frase",
		"Augustine Tart",
		"Gaston Jefferies",
		"Ronald Sisemore",
		"Luis Mele",
		"Vaughn Sanderfur",
		"Gordon Behrens",
		"Darius Przybyla",
		"Jackie Futch",
		"Wade Lappin",
		"Zachariah Givens",
		"Dorsey Pellegrini",
		"Geoffrey Mccartney",
		"Colby Tay",
		"Shannon Vieyra",
		"Anibal Lambright",
		"Angelo Rucker",
		"Antione Capp",
		"Arthur Padua",
		"Malcolm Fee",
		"Royce Lybrand",
		"Eduardo Ashburn",
		"Karl Bliss",
		"Gregory Abreu",
		"Ricky Horvat",
		"Daren Ocasio",
		"Troy Michie",
		"Korey Wahl",
		"Alvin Minix",
		"Isaias Simek",
		"Eldridge Sanchez",
		"Calvin Wachter",
		"Keneth Rausch",
		"Rene Quintero",
		"Von Veal",
		"Brant Kinnaird",
		"Delmar Castaneda",
		"Maximo Pennel",
		"Dexter Scalf",
		"Robbie Mcquay",
		"Lonnie Ranger",
		"Mason Linebaugh",
		"Rosendo Pontbriand",
		"Larry Agarwal",
		"Lawrence Gossard",
		"Norbert Case",
		"Glen Broady",
		"Asa Petroski",
		"Bill Lillard",
		"Gerry Judd",
		"Quentin Hargrove",
		"Titus Gosier",
		"Guillermo Consolini",
		"Demetrius Traub",
		"Jamal Chavarin",
		"Rusty Budge",
		"Tyree Cardiel",
		"Frederic Toby",
		"Zackary Stabile",
		"Shad Weiskopf",
		"Hayden Jasinski",
		"Michel Spoon",
		"Theo Bryd",
		"Keven Oullette",
		"Heath Beres",
		"Delmer Bussiere",
		"John Dayton",
		"Hunter Eriksen",
		"Jeremiah Spenser",
		"Nick Mcavoy",
		"Elbert Riddell",
		"Aaron Hillwig",
		"Toney Dansereau",
		"Antonia Gloss",
		"Justin Banner",
		"Tyrell Flippen",
		"Wilburn Scheidt",
		"Rory Haggins",
		"Lacy Hayhurst",
		"Byron Arant",
		"Clyde Koh",
		"Terrance Kaplan",
		"Anderson Alvarenga",
		"Hai Decola",
		"Florencio Deeb",
		"Leland Milliron",
		"Dwayne Curnutte",
		"Ian Macauley",
		"Mariano Chairez",
		"Hipolito Cacho",
		"William Massman",
		"Jed Mowery",
		"Preston Crabb",
		"Cesar Zeh",
		"Garry Meredith",
		"Devin Macmaster",
		"Reuben Mcgranahan",
		"Randall Fannin",
		"Nolan Locke",
		"Dewayne Knapik",
		"Sang Elmore",
		"Vicente Batchelder",
		"Dannie Ludwick",
		"Earle Creason",
		"Heriberto Tietjen",
		"Gilberto Jines",
		"Marlin Kilian",
		"Carrol Shoup",
		"Raymond Bickel",
		"Lesley Straley",
		"Broderick Fitc"};
	
	private static String[] colleges = new String[]{"Community College of the Air Force",
			"Community College of the Air Force",
			"Alabama A & M University",
			"University of Alabama at Birmingham",
			"UAB School of Optometry",
			"UAB School of Dentistry",
			"Amridge University",
			"University of Alabama at Huntsville",
			"Alabama State University",
			"The University of Alabama",
			"Central Alabama Community College",
			"Childersburg Campus",
			"Alexander City Campus",
			"Athens State University",
			"Northeast Alabama CC",
			"Northwest - Shoals Alabama CC",
			"Redstone Arsenal",
			"Snead State CC",
			"Wallace State Comm Coll - Hanceville",
			"Auburn University-Montgomery",
			"Auburn University Main Campus",
			"Mobile Campus (Pharmacy)",
			"Birmingham Southern College",
			"Chattahoochee Valley Community College",
			"Concordia College Alabama",
			"DCH Regional Medical Center",
			"Enterprise State Community College",
			"AAC at Mobile",
			"AAC at Ozark",
			"James H. Faulkner State Community College",
			"Faulkner State Fairhope Campus",
			"Faulkner State Gulf Shores Campus",
			"Faulkner State at Daphne High School",
			"Faulkner University",
			"FAULKNER UNIVERSITY-HUNTSVILLE",
			"Birmingham",
			"Mobile",
			"Gadsden Business College",
			"Gadsden Business College - Anniston Campus",
			"Gadsden State Community College",
			"Gadsden State Community College - Ayers Campus",
			"George C Wallace Community College",
			"Ft. Rucker Center",
			"Sparks Campus",
			"Clanton Ext",
			"Wallace State Community College  - Hanceville",
			"George Corley Wallace State Community College - Selma",
			"Huntingdon College",
			"Huntsville Hospital",
			"Heritage Christian University",
			"J.F. Drake State Community and Technical College",
			"J F Ingram State Technical College",
			"J. F. Ingram State Technical College, Donaldson Correctional Facility",
			"J. F. Ingram State Technical College, Draper Instructional Service Center",
			"J. F. Ingram State Technical College, Tutwiler Instructional Service Center",
			"Jacksonville State University",
			"Jefferson Davis Community College",
			"Atmore",
			"Jefferson State Community College",
			"Richard M. Scrushy Campus",
			"Calhoun Community College",
			"Decatur Fire and Rescue Center",
			"Judson College",
			"University of West Alabama",
			"Lurleen B Wallace Community College",
			"Lurleen B Wallace Community College - Greenville Campus",
			"Lurleen B Wallace Community College - Springdale",
			"MacArthur Campus",
			"Marion Military Institute",
			"Miles College",
			"University of Mobile",
			"University of Montevallo",
			"Northwest-Shoals Community College - Muscle Shoals",
			"Phil Campbell Campus",
			"Shoals Campus",
			"University of North Alabama",
			"Northeast Alabama Community College",
			"Northwest-Shoals Community College - Phil Campbell",
			"Oakwood University",
			"Alabama Southern Community College",
			"Jackson Campus",
			"Thomasville Campus",
			"Gilbertown Campus",
			"Demopolis Campus",
			"Prince Institute - Southeast",
			"Prince Institute - Great Lakes",
			"Prince Institute - Rocky Mountains",
			"Reid State Technical College",
			"Reid State Technical College Extension Campus",
			"Reid State Technical College at Jeff Davis Community College",
			"Reid State Technical College, South Baldwin Transportation Site",
			"Bishop State Community College",
			"Samford University",
			"Shelton State Community College",
			"Shelton State Community College - C.A. Fredd Campus",
			"Snead State Community College",
			"University of South Alabama",
			"University of South Alabama - Springhill",
			"Southern Community College",
			"Spring Hill College",
			"Southeastern Bible College",
			"Stillman College",
			"Talladega College",
			"H. Councill Trenholm State Community College",
			"H Councill Trenholm State Technical College - Patterson Campus",
			"Troy University",
			"Troy University - Dothan",
			"Troy University - Montgomery",
			"Troy University - Phenix City",
			"Troy University - Atlantic Region",
			"Troy University - Western Region",
			"Troy University - Southeast Region",
			"Troy University - Atlantic Region",
			"Tuskegee University",
			"United States Sports Academy",
			"Bevill State Community College",
			"BSCC Business Incubator",
			"Fayette Campus",
			"Hamilton Campus",
			"Jasper Campus",
			"University of Alaska Anchorage",
			"University of Alaska Fairbanks",
			"Tanana Valley campus",
			"University of Alaska Southeast",
			"Alaska Pacific University",
			"Alaska Vocational Technical Center",
			"Alaska Vocational Technical Center - Allied Health Department",
			"Charter College",
			"Charter College - Mat-Su",
			"Charter College - Pasco",
			"Charter College - Oxnard",
			"Charter College - Vancouver",
			"Charter College - Bellingham",
			"Charter College - Fife",
			"Charter College- Lynwood",
			"Charter College - Billings",
			"Charter College - Canyon Country",
			"Charter College - East Wenatchee",
			"Charter College - Lacey",
			"Charter College - Lancaster",
			"Charter College - Missoula",
			"Charter College - Yakima",
			"Prince William Sound Community College",
			"Sheldon Jackson College",
			"Alaska Career College",
			"Everest College - Phoenix",
			"Everest College - Mesa",
			"Thunderbird School of Global Management",
			"Thunderbird School of Global Management - Miami Campus",
			"American Indian College",
			"American Institute of Trucking",
			"Carrington College - Phoenix",
			"Carrington College - Tucson",
			"Carrington College - Las Vegas",
			"Carrington College - Tri City Inc.",
			"Carrington College - Westside",
			"Carrington College - Online",
			"Carrington College - Albuquerque",
			"College America - Flagstaff",
			"Arizona Academy of Beauty Inc",
			"Arizona Automotive Institute",
			"International Institute of the Americas",
			"Arizona State University",
			"Arizona State University at the Downtown Phoenix Campus",
			"Arizona State University at the West Campus",
			"Arizona State University at the Polytechnic Campus",
			"Arizona State University at Avondale Lattie Coor",
			"Arizona State University at Chinle Elementary School",
			"Arizona State University at Joe Carlson Elementary",
			"Arizona State University at Ganado Middle School (Ganado Unified School District",
			"Arizona State University at Mirage School (Deer Valley School District)",
			"Arizona State University at Sonoran Sky Elementary (Pendergast PDS Site)",
			"Arizona State University at Lake Havasu",
			"Arizona State University at Cloves Campbell School (Roosevelt District PDS)",
			"Arizona State University at Longview School",
			"Arizona State University at Madison Park Middle School (Madison Elem District)",
			"Arizona State University at Mayo Clinic Hospital",
			"Arizona State University at Palomino Elementary School (Paradise Valley PDS Site)",
			"Arizona State University at Phoenix College (Phoenix Metro Area)",
			"Arizona State University at Gadsden Jr. High School (San Luis PDS Site)",
			"Arizona State University at Hohokam School",
			"Arizona State University at TB&B Parkside",
			"Arizona State University at ASU Research Park",
			"Arizona State University at Eastern Arizona College",
			"Arizona State University at Sunnyside Unified School District",
			"Arizona State University at Tucson",
			"Arizona State University at Michael Anderson Elementary School",
			"Arizona State University at San Carlos Unified School District",
			"Arizona State University at Sunnyside Unified School District (Esperanza Elem Sc",
			"Arizona State University at Flagstaff",
			"Arizona State University at Chandler Instructional Resource Center",
			"Arizona State University at Dysart District Office",
			"Arizona State University at Barry Goldwater High School",
			"Arizona State University at Isaac Junior High School",
			"Arizona State University at Kyrene de la Mariposa School",
			"Arizona State University at Madison School No. 2",
			"Arizona State University at Mesa School Student Service Center",
			"Arizona State University at Mohave School",
			"Arizona State University at Phoenix Prep Academy",
			"Arizona State University at Supai Middle School"};
	
	static String[] ids = new String[]{"nIe3O7fBr8",
			"NT0UJLn8Hz",
			"LQUXZMncvR",
			"xpZAMMwWZB",
			"5Mi8ZT4TgN",
			"H8ZvO1IYLN",
			"TBaAcuUxsW",
			"u4csxR73xo",
			"OKlJvJP368",
			"IgapRj78HW",
			"wTYPDfR6zM",
			"7SRuddbURL",
			"VVEkHYQoKU",
			"YrMHtyOMsS",
			"upDwclUINn",
			"m1XFTLAYqL",
			"j68Z0MwHkt",
			"j5UXJeJvFY",
			"NfH6KaC9f3",
			"SuURmgRhQD",
			"5wDhGdggUV",
			"OZWjvwjUec",
			"WzRdcx0CDb",
			"OfpKze9GDv",
			"wd6pYlngNv",
			"MIUGGiqnFF",
			"W9PvGfAqcG",
			"LN7FGYZNst",
			"ySWXR3yNuU",
			"n1qauG0dvh",
			"Qac29fZm3u",
			"hyhz5t229B",
			"qI7C97gffm",
			"t6aTh91vpA",
			"APIXkXB8E7",
			"fc83myBJxA",
			"h0OUzqsrWu",
			"EUEFJNOiDC",
			"F8NXcbtGsn",
			"uToXUdl3YQ",
			"UPrzOhzo3L",
			"ObQV3ZU1zz",
			"0xF5LMS83I",
			"Mv9kDXgktN",
			"7SsuzB7ASw",
			"06Plann0EU",
			"3bpgoKcy7t",
			"UD1mTCi9lv",
			"jJzN1MEuPm",
			"00RHVQqXNu",
			"y7PDBt2rBk",
			"76xitbkHCP",
			"CNQ8hfmEHu",
			"eEj0qbmtkt",
			"HzCET3yszR",
			"wPRg1nn8YD",
			"CwSH8Sj7ba",
			"phDRSPe8Fb",
			"Udmnmr0BwJ",
			"O6RXGHGtfz",
			"liricxEWOq",
			"vfVdZrs6mL",
			"jZrlHeH9Mk",
			"3CcWTAzWJ5",
			"HOAnqh1PeO",
			"e0voG3pJFO",
			"y3XRow62ti",
			"eAbMaP7cqr",
			"XwSxdWak15",
			"WgwmQ5YXLJ",
			"X2cCPnzw3S",
			"bilt0pUmnD",
			"su8sdimeik",
			"EnvNYeWvKN",
			"KHGPd3m7hX",
			"692WHsd2hd",
			"ypoIJUQSBc",
			"7yIy6feJEY",
			"FslEsf8H10",
			"vgtCoIUKbl",
			"6OU8xrV4xR",
			"QIj4FqDI5z",
			"uJqRix2eJB",
			"vpssBtOB6C",
			"5dpe0CdQnv",
			"Sj6pUot4DW",
			"P37si5szBB",
			"fGzJM6KD7Q",
			"19E3ZAIR3J",
			"XsrpG8XU68",
			"RPaMBityO5",
			"wzZIK3LdfF",
			"WXC6by35fk",
			"1lRU2kTPxr",
			"89xa64R0ze",
			"wmVagKK7BV",
			"cOB1nU1Cg2",
			"xDrqCuJze7",
			"BsQa2d1hwF",
			"Ivt7dUyuU2",
			"wLXW7vm1wq",
			"xaMtBO7Dge",
			"Dw2SZeWYFr",
			"Wkk6Q2pXDN",
			"29pk3fVmvl",
			"JGOPHkUWjR",
			"lX0X3tu67W",
			"PkYAqHqTuU",
			"PX6HC7Shna",
			"69Shq0I4c2",
			"74ctXR5UdJ",
			"IcwyHiWVky",
			"A4D1T0lwTt",
			"WPUIO9DGng",
			"YT2UJ8BeV9",
			"U8I1szOP7o",
			"6lAHLtz0Ee",
			"qLvyNCxzX2",
			"d0FcxBvZR5",
			"Xnva59cuQP",
			"BhA7naX3SD",
			"HatRth9kr8",
			"y2SuLnudCY",
			"TzWTAjDZbx",
			"QccEa33NqX",
			"sKgNYNOW9f",
			"rn5q179lec",
			"YaEDv1phx5",
			"XSYLzmbh2q",
			"qsbXok4H3h",
			"VumjvZsI2P",
			"XOP4mTjnSM",
			"ygD0OzENXU",
			"LLDtyTtSMV",
			"KKUpXfQBBr",
			"1emKI12nva",
			"PVVBcQPr4M",
			"55T3jIgz21",
			"P3dbkBKEP2",
			"4RuqPnrRu0",
			"tvJSM61h1k",
			"h5Z5aTTMXH",
			"nCvKX30jWa",
			"9xNc9loCnx",
			"kpuLOjin1j",
			"yKSFTMqSqS",
			"e0Gyu5vVPP",
			"oRoQjwRz3P",
			"cczalPHFTa",
			"bzf2TYSZ8T",
			"gr2OycR2VC",
			"GKGlHRO4mU",
			"6Qsc0Uf0ZD",
			"pAPLO0NxFK",
			"q9OSkNKGfz",
			"1T6xxn2cXq",
			"VFGtj7fKyu",
			"Ju22ZpCXgS",
			"pNWjAW87CC",
			"iHcjF3PTwY",
			"72O41cq7Ue",
			"2VVn1yxwhj",
			"An3GbuYOVo",
			"12dJvlTwXB",
			"pWnY2ZNVw1",
			"nsk98zezUI",
			"0SVZxt0WPZ",
			"JdVMWQGK2j",
			"6IbtmkfA2U",
			"mb8wjJ34r5",
			"7CN4cKQcJB",
			"eBup8ySlni",
			"92pzSLE0Cw",
			"9pu89ILkXx",
			"MNDt4m4JTz",
			"vGVnUfdi5U",
			"rjYZl70PNg",
			"B1O1VFWo7H",
			"ALqaqW6kJY",
			"zdO9eMjeIq",
			"RFc4rrOWc8",
			"4k8IwjxoUW",
			"USug0JE2oN",
			"NNbPpFWETP",
			"MlKl5oygIY",
			"LSMBcxWekS",
			"qD465IWDOU",
			"BszAndMl0G",
			"PYK1WhLZTt",
			"NSA4V3tcJJ",
			"svFOgXGd7I",
			"9IJS2BK1gr",
			"EM0wKM8PHg",
			"8WPkuchBUq",
			"Ph4bxsUKDc",
			"mzbTaf2f6A",
			"2asNGKM9SR",
			"WbJI9ZNMzG",
			"T96s2QXkLj",
			"oByAJ1QGGe"};
	
	public static void main(String[] args) throws FileNotFoundException {
		FootballPlayer.Position[] positions = new FootballPlayer.Position[] {FootballPlayer.Position.Quarterback, FootballPlayer.Position.RunningBack, FootballPlayer.Position.WideReceiver, FootballPlayer.Position.TightEnd, FootballPlayer.Position.OffensiveLine, FootballPlayer.Position.Center, FootballPlayer.Position.Guard, FootballPlayer.Position.OffensiveTackle, 
				FootballPlayer.Position.DefensiveEnd, FootballPlayer.Position.DefensiveTackle, FootballPlayer.Position.Linebacker, FootballPlayer.Position.Cornerback, FootballPlayer.Position.Safety};
		
		FootballPlayer.Behavior[] behaviors = new FootballPlayer.Behavior[] {FootballPlayer.Behavior.TeamPlayer, FootballPlayer.Behavior.LoneWolf, FootballPlayer.Behavior.CoOperative, FootballPlayer.Behavior.TotalMess};

		FootballPlayer.GameTalentLevel[] talentLevels = new FootballPlayer.GameTalentLevel[] {FootballPlayer.GameTalentLevel.Low, FootballPlayer.GameTalentLevel.Average, FootballPlayer.GameTalentLevel.Good, FootballPlayer.GameTalentLevel.Talent, FootballPlayer.GameTalentLevel.Star};

		ArrayList<FootballPlayer> players = new ArrayList<FootballPlayer>();
		for(int index = 0; index < 200; index++) {
			float random = (float) (Math.random());
			AthleticAbilities athleticAbilities = new AthleticAbilities(random * 30 + 1, random * 6 + 1, random * 11 + 1, (int)(random * 35 + 1));
			FootballPlayer footballPlayer = new FootballPlayer(names[index], ids[index], colleges[index], behaviors[(int) (random * 3 + 0)], positions[(int) (random * 12 + 0)], talentLevels[(int) (random * 4 + 0)], athleticAbilities);
			players.add(footballPlayer);
		}
		
		File file = new File("src/question_1/players_new.txt");
		PrintWriter printWritter = new PrintWriter(file);
		
		for (FootballPlayer footballPlayer : players) {
			footballPlayer.save(printWritter);
			printWritter.println("-");
		}
		
		printWritter.close();
	}
}