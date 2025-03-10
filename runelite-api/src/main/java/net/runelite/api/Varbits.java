/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Server controlled "content-developer" integers.
 *
 * @see VarPlayer
 *
 * These differ from a {@link VarPlayer} in that VarBits can be
 * less than 32 bits. One or more VarBits can be assigned to a
 * backing VarPlayer, each with a static range of bits that it is
 * allowed to access. This allows a more compact representation
 * of small values, like booleans
 */
@AllArgsConstructor
@Getter
public enum Varbits
{
	/*
	 * If chatbox is transparent or not
	 */
	TRANSPARENT_CHATBOX(4608),

	/*
	 * If the player has an active stamina potion effect or not
	 */
	RUN_SLOWED_DEPLETION_ACTIVE(25),

	/**
	 * If scrollbar in resizable mode chat is on the left
	 */
	CHAT_SCROLLBAR_ON_LEFT(6374),

	/**
	 * Runepouch
	 */
	RUNE_POUCH_RUNE1(29),
	RUNE_POUCH_RUNE2(1622),
	RUNE_POUCH_RUNE3(1623),
	RUNE_POUCH_AMOUNT1(1624),
	RUNE_POUCH_AMOUNT2(1625),
	RUNE_POUCH_AMOUNT3(1626),

	/**
	 * Prayers
	 */
	QUICK_PRAYER(4103),
	PRAYER_THICK_SKIN(4104),
	PRAYER_BURST_OF_STRENGTH(4105),
	PRAYER_CLARITY_OF_THOUGHT(4106),
	PRAYER_SHARP_EYE(4122),
	PRAYER_MYSTIC_WILL(4123),
	PRAYER_ROCK_SKIN(4107),
	PRAYER_SUPERHUMAN_STRENGTH(4108),
	PRAYER_IMPROVED_REFLEXES(4109),
	PRAYER_RAPID_RESTORE(4110),
	PRAYER_RAPID_HEAL(4111),
	PRAYER_PROTECT_ITEM(4112),
	PRAYER_HAWK_EYE(4124),
	PRAYER_MYSTIC_LORE(4125),
	PRAYER_STEEL_SKIN(4113),
	PRAYER_ULTIMATE_STRENGTH(4114),
	PRAYER_INCREDIBLE_REFLEXES(4115),
	PRAYER_PROTECT_FROM_MAGIC(4116),
	PRAYER_PROTECT_FROM_MISSILES(4117),
	PRAYER_PROTECT_FROM_MELEE(4118),
	PRAYER_EAGLE_EYE(4126),
	PRAYER_MYSTIC_MIGHT(4127),
	PRAYER_RETRIBUTION(4119),
	PRAYER_REDEMPTION(4120),
	PRAYER_SMITE(4121),
	PRAYER_CHIVALRY(4128),
	PRAYER_PIETY(4129),
	PRAYER_PRESERVE(5466),
	PRAYER_RIGOUR(5464),
	PRAYER_AUGURY(5465),

	RIGOUR_UNLOCKED(5451),
	AUGURY_UNLOCKED(5452),
	PRESERVE_UNLOCKED(5453),

	/**
	 * Diary Entries
	 */
	DIARY_ARDOUGNE_EASY(4458),
	DIARY_ARDOUGNE_MEDIUM(4459),
	DIARY_ARDOUGNE_HARD(4460),
	DIARY_ARDOUGNE_ELITE(4461),

	DIARY_DESERT_EASY(4483),
	DIARY_DESERT_MEDIUM(4484),
	DIARY_DESERT_HARD(4485),
	DIARY_DESERT_ELITE(4486),

	DIARY_FALADOR_EASY(4462),
	DIARY_FALADOR_MEDIUM(4463),
	DIARY_FALADOR_HARD(4464),
	DIARY_FALADOR_ELITE(4465),

	DIARY_FREMENNIK_EASY(4491),
	DIARY_FREMENNIK_MEDIUM(4492),
	DIARY_FREMENNIK_HARD(4493),
	DIARY_FREMENNIK_ELITE(4494),

	DIARY_KANDARIN_EASY(4475),
	DIARY_KANDARIN_MEDIUM(4476),
	DIARY_KANDARIN_HARD(4477),
	DIARY_KANDARIN_ELITE(4478),

	DIARY_KARAMJA_EASY(3578),
	DIARY_KARAMJA_MEDIUM(3599),
	DIARY_KARAMJA_HARD(3611),
	DIARY_KARAMJA_ELITE(4566),

	DIARY_KOUREND_EASY(7925),
	DIARY_KOUREND_MEDIUM(7926),
	DIARY_KOUREND_HARD(7927),
	DIARY_KOUREND_ELITE(7928),

	DIARY_LUMBRIDGE_EASY(4495),
	DIARY_LUMBRIDGE_MEDIUM(4496),
	DIARY_LUMBRIDGE_HARD(4497),
	DIARY_LUMBRIDGE_ELITE(4498),

	DIARY_MORYTANIA_EASY(4487),
	DIARY_MORYTANIA_MEDIUM(4488),
	DIARY_MORYTANIA_HARD(4489),
	DIARY_MORYTANIA_ELITE(4490),

	DIARY_VARROCK_EASY(4479),
	DIARY_VARROCK_MEDIUM(4480),
	DIARY_VARROCK_HARD(4481),
	DIARY_VARROCK_ELITE(4482),

	DIARY_WESTERN_EASY(4471),
	DIARY_WESTERN_MEDIUM(4472),
	DIARY_WESTERN_HARD(4473),
	DIARY_WESTERN_ELITE(4474),

	DIARY_WILDERNESS_EASY(4466),
	DIARY_WILDERNESS_MEDIUM(4467),
	DIARY_WILDERNESS_HARD(4468),
	DIARY_WILDERNESS_ELITE(4469),

	/**
	 * Kourend house favours
	 */
	KOUREND_FAVOR_ARCEUUS(4896),
	KOUREND_FAVOR_HOSIDIUS(4895),
	KOUREND_FAVOR_LOVAKENGJ(4898),
	KOUREND_FAVOR_PISCARILIUS(4899),
	KOUREND_FAVOR_SHAYZIEN(4894),

	/**
	 * Equipped weapon type
	 */
	EQUIPPED_WEAPON_TYPE(357),

	/**
	 * Defensive casting mode
	 */
	DEFENSIVE_CASTING_MODE(2668),
	/**
	 * Spells being auto-casted
	 */
	AUTO_CAST_SPELL(276),

	/**
	 * Options
	 */
	SIDE_PANELS(4607),

	/**
	 * Herbiboar Trails
	 */
	HB_TRAIL_31303(5737),
	HB_TRAIL_31306(5738),
	HB_TRAIL_31309(5739),
	HB_TRAIL_31312(5740),
	HB_TRAIL_31315(5741),
	HB_TRAIL_31318(5742),
	HB_TRAIL_31321(5743),
	HB_TRAIL_31324(5744),
	HB_TRAIL_31327(5745),
	HB_TRAIL_31330(5746),

	HB_TRAIL_31333(5768),
	HB_TRAIL_31336(5769),
	HB_TRAIL_31339(5770),
	HB_TRAIL_31342(5771),
	HB_TRAIL_31345(5772),
	HB_TRAIL_31348(5773),
	HB_TRAIL_31351(5774),
	HB_TRAIL_31354(5775),
	HB_TRAIL_31357(5776),
	HB_TRAIL_31360(5777),

	HB_TRAIL_31363(5747),
	HB_TRAIL_31366(5748),
	HB_TRAIL_31369(5749),
	HB_TRAIL_31372(5750),

	HB_FINISH(5766),

	/**
	 * Started hunting Herbiboar.
	 * <br>
	 * NOTE: This value remains at 0 even after starting a Herbiboar trail up until searching the first object along the
	 * hunting path.
	 */
	HB_STARTED(5767),

	/**
	 * Barbarian Assault
	 */
	IN_GAME_BA(3923),
	BA_GC(4768),

	/**
	 * 0 = Outside wilderness
	 * 1 = In wilderness
	 */
	IN_WILDERNESS(5963),

	/**
	 * Fishing Trawler
	 * FISHING_TRAWLER_ACTIVITY Expected values: 0-255
	 */
	FISHING_TRAWLER_ACTIVITY(3377),

	/**
	 * Blast Furnace Bar Dispenser
	 *
	 * These are the expected values:
	 *	0 = No bars being processed
	 *	1 = Ores are being processed on the conveyor belt, bar dispenser cannot be checked
	 *	2 = Bars are cooling down
	 *	3 = Bars can be collected
	 */
	BAR_DISPENSER(936),

	/**
	 * Motherlode mine sack
	 */
	SACK_NUMBER(5558),
	SACK_UPGRADED(5556),

	/**
	 * Experience tracker
	 *
	 * EXPERIENCE_TRACKER_POSITION expected values:
	 *   0 = Right
	 *   1 = Middle
	 *   2 = Left
	 */
	EXPERIENCE_TRACKER_POSITION(4692),
	EXPERIENCE_TRACKER_COUNTER(4697),
	EXPERIENCE_TRACKER_PROGRESS_BAR(4698),

	/**
	 * Experience drop color
	 */
	EXPERIENCE_DROP_COLOR(4695),

	/**
	 * Tithe Farm
	 */
	TITHE_FARM_SACK_AMOUNT(4900),
	TITHE_FARM_SACK_ICON(5370),
	TITHE_FARM_POINTS(4893),

	/**
	 * Blast Mine
	 */
	BLAST_MINE_COAL(4924),
	BLAST_MINE_GOLD(4925),
	BLAST_MINE_MITHRIL(4926),
	BLAST_MINE_ADAMANTITE(4921),
	BLAST_MINE_RUNITE(4922),

	/**
	 * Raids
	 */
	IN_RAID(5432),
	TOTAL_POINTS(5431),
	PERSONAL_POINTS(5422),
	RAID_PARTY_SIZE(5424),

	// 0 = raid not started, >0 = raid started
	RAID_STATE(5425),

	/**
	 * Making Friends with My Arm fire pits
	 *
	 * Expected values:
	 *  0 = Not built
	 *  1 = Built
	 */
	FIRE_PIT_GIANT_MOLE(6532),
	FIRE_PIT_LUMBRIDGE_SWAMP(6533),
	FIRE_PIT_MOS_LE_HARMLESS(6534),

	/**
	 * Theatre of Blood 1=In Party, 2=Inside/Spectator, 3=Dead Spectating
	 */
	THEATRE_OF_BLOOD(6440),

	/**
	 * Nightmare Zone
	 */
	NMZ_ABSORPTION(3956),
	NMZ_POINTS(3949),

	/**
	 * Blast Furnace
	 */
	BLAST_FURNACE_COPPER_ORE(959),
	BLAST_FURNACE_TIN_ORE(950),
	BLAST_FURNACE_IRON_ORE(951),
	BLAST_FURNACE_COAL(949),
	BLAST_FURNACE_MITHRIL_ORE(952),
	BLAST_FURNACE_ADAMANTITE_ORE(953),
	BLAST_FURNACE_RUNITE_ORE(954),
	BLAST_FURNACE_SILVER_ORE(956),
	BLAST_FURNACE_GOLD_ORE(955),

	BLAST_FURNACE_BRONZE_BAR(941),
	BLAST_FURNACE_IRON_BAR(942),
	BLAST_FURNACE_STEEL_BAR(943),
	BLAST_FURNACE_MITHRIL_BAR(944),
	BLAST_FURNACE_ADAMANTITE_BAR(945),
	BLAST_FURNACE_RUNITE_BAR(946),
	BLAST_FURNACE_SILVER_BAR(948),
	BLAST_FURNACE_GOLD_BAR(947),

	BLAST_FURNACE_COFFER(5357),

	/**
	 * Pyramid plunder
	 */
	PYRAMID_PLUNDER_ROOM_LOCATION(2365),
	PYRAMID_PLUNDER_TIMER(2375),
	PYRAMID_PLUNDER_THIEVING_LEVEL(2376),
	PYRAMID_PLUNDER_ROOM(2377),

	/**
	 * Barrows
	 */
	BARROWS_KILLED_AHRIM(457),
	BARROWS_KILLED_DHAROK(458),
	BARROWS_KILLED_GUTHAN(459),
	BARROWS_KILLED_KARIL(460),
	BARROWS_KILLED_TORAG(461),
	BARROWS_KILLED_VERAC(462),
	BARROWS_REWARD_POTENTIAL(463),
	BARROWS_NPCS_SLAIN(464),

	/**
	 * Spicy stew ingredients
	 */
	SPICY_STEW_RED_SPICES(1879),
	SPICY_STEW_YELLOW_SPICES(1880),
	SPICY_STEW_BROWN_SPICES(1881),
	SPICY_STEW_ORANGE_SPICES(1882),

	/**
	 * Multicombat area
	 */
	MULTICOMBAT_AREA(4605),

	/**
	 * Kingdom of Miscellania Management
	 * Kingdom Approval is represented as a 7-bit unsigned integer; 127 corresponds to 100% approval
	 */
	KINGDOM_APPROVAL(72),
	KINGDOM_COFFER(74),

	// TODO: Remove next major
	@Deprecated
	KINGDOM_FAVOR(72),

	/**
	 * The Hand in the Sand quest status
	 */
	QUEST_THE_HAND_IN_THE_SAND(1527),

	/**
	 * 0 = Sir Bedivere
	 * 1 = Sir Pelleas
	 * 2 = Sir Tristram
	 * 3 = Sir Palomedes
	 * 4 = Sir Lucan
	 * 5 = Sir Gawain
	 * 6 = Sir Kay
	 * 7 = Sir Lancelot
	 * 8 = Completed (Chivalry and Piety are unlocked)
	 */
	CAMELOT_TRAINING_ROOM_STATUS(3909),

	/**
	 * Daily Tasks (Collection availability)
	 */
	DAILY_HERB_BOXES_COLLECTED(3961),
	DAILY_STAVES_COLLECTED(4539),
	DAILY_ESSENCE_COLLECTED(4547),
	DAILY_RUNES_COLLECTED(4540),
	DAILY_SAND_COLLECTED(4549),
	DAILY_FLAX_STATE(4559),
	DAILY_ARROWS_STATE(4563),
	/**
	 * This varbit tracks how much bonemeal has been redeemed from Robin
	 * The player gets 13 for each diary completed above and including Medium, for a maxiumum of 39
	 */
	DAILY_BONEMEAL_STATE(4543),

	DAILY_DYNAMITE_COLLECTED(7939),

	/**
	 * Fairy Ring
	 */
	FAIR_RING_LAST_DESTINATION(5374),
	FAIRY_RING_DIAL_ADCB(3985), //Left dial
	FAIRY_RIGH_DIAL_ILJK(3986), //Middle dial
	FAIRY_RING_DIAL_PSRQ(3987), //Right dial

	/**
	 * Transmog controllers for farming
	 */
	FARMING_4771(4771),
	FARMING_4772(4772),
	FARMING_4773(4773),
	FARMING_4774(4774),
	FARMING_4775(4775),
	FARMING_7904(7904),
	FARMING_7905(7905),
	FARMING_7906(7906),
	FARMING_7907(7907),
	FARMING_7908(7908),
	FARMING_7909(7909),
	FARMING_7910(7910),
	FARMING_7911(7911),
	FARMING_7912(7912),

	/**
	 * Transmog controllers for grapes
	 */
	GRAPES_4953(4953),
	GRAPES_4954(4954),
	GRAPES_4955(4955),
	GRAPES_4956(4956),
	GRAPES_4957(4957),
	GRAPES_4958(4958),
	GRAPES_4959(4959),
	GRAPES_4960(4960),
	GRAPES_4961(4961),
	GRAPES_4962(4962),
	GRAPES_4963(4963),
	GRAPES_4964(4964),

	/**
	 * Automatically weed farming patches
	 */
	AUTOWEED(5557),

	/**
	 * The varbit that stores the players {@code AccountType}.
	 */
	ACCOUNT_TYPE(1777),

	/**
	 * The varbit that stores the oxygen percentage for player
	 */
	OXYGEN_LEVEL(5811),

	/**
	 * Drift net status
	 *
	 * Expected values
	 *  0 = Unset
	 *  1 = Set up
	 *  2 = Caught some fish
	 *  3 = Full
	 */
	NORTH_NET_STATUS(5812),
	SOUTH_NET_STATUS(5814),

	/**
	 * Drift net catch count
	 */
	NORTH_NET_CATCH_COUNT(5813),
	SOUTH_NET_CATCH_COUNT(5815),

	/**
	 * Drift net collect interface
	 *
	 * Expected values:
	 *  0 = Not open
	 *  1 = North interface open
	 *  2 = South interface open
	 */
	DRIFT_NET_COLLECT(5933),

	/**
	 * Corp beast damage
	 */
	CORP_DAMAGE(999),

	/**
	 * Toggleable slayer unlocks
	 */
	SUPERIOR_ENABLED(5362),
	FOSSIL_ISLAND_WYVERN_DISABLE(6251),

	BANK_REARRANGE_MODE(3959),
	CURRENT_BANK_TAB(4150),

	WORLDHOPPER_FAVROITE_1(4597),
	WORLDHOPPER_FAVROITE_2(4598),

	/**
	 * Vengeance is active
	 */
	VENGEANCE_ACTIVE(2450),

	/**
	 * Spell cooldowns
	 */
	VENGEANCE_COOLDOWN(2451),
	CORRUPTION_COOLDOWN(12288),

	/**
	 * Amount of items in each bank tab
	 */
	BANK_TAB_ONE_COUNT(4171),
	BANK_TAB_TWO_COUNT(4172),
	BANK_TAB_THREE_COUNT(4173),
	BANK_TAB_FOUR_COUNT(4174),
	BANK_TAB_FIVE_COUNT(4175),
	BANK_TAB_SIX_COUNT(4176),
	BANK_TAB_SEVEN_COUNT(4177),
	BANK_TAB_EIGHT_COUNT(4178),
	BANK_TAB_NINE_COUNT(4179),

	/**
	 * Type of GE offer currently being created
	 * 0 = buy
	 * 1 = sell
	 */
	GE_OFFER_CREATION_TYPE(4397),
	GE_OFFER_PRICE_PER_ITEM(4398),

	/**
	 * The active tab within the quest interface
	 */
	QUEST_TAB(8168),

	/**
	 * Explorer ring
	 */
	EXPLORER_RING_ALCHTYPE(5398),
	EXPLORER_RING_TELEPORTS(4552),
	EXPLORER_RING_ALCHS(4554),
	EXPLORER_RING_RUNENERGY(4553),

	WINTERTODT_TIMER(7980),

	/**
	 * League relics
	 */
	LEAGUE_RELIC_1(10049),
	LEAGUE_RELIC_2(10050),
	LEAGUE_RELIC_3(10051),
	LEAGUE_RELIC_4(10052),
	LEAGUE_RELIC_5(10053),
	LEAGUE_RELIC_6(11696),

	/**
	 * Muted volume restore values
	 */
	MUTED_MUSIC_VOLUME(9666),
	MUTED_SOUND_EFFECT_VOLUME(9674),
	MUTED_AREA_EFFECT_VOLUME(9675),

	/**
	 * Parasite infection status during nightmare of ashihama bossfight
	 *
	 * 0 = not infected
	 * 1 = infected
	 *
	 */
	PARASITE(10151),

	/**
	 * Whether the vanilla wiki entity lookup is displayed under the minimap
	 *
	 * 0 = Enabled
	 * 1 = Disabled
	 *
	 */
	WIKI_ENTITY_LOOKUP(10113),

	/**
	 * Whether the Special Attack orb is disabled due to being in a PvP area
	 *
	 * 0 = Enabled (player is not in PvP)
	 * 1 = Disabled (player in in PvP)
	 *
	 * @see <a href="https://oldschool.runescape.wiki/w/Minimap#Special_attack_orb">The OSRS Wiki's Minimap page</a>
	 */
	PVP_SPEC_ORB(8121),

	/**
	 * Collection Log notification settings whenever a new item is added
	 *
	 * 0 = no notification
	 * 1 = chat notification only
	 * 2 = popup notification only
	 * 3 = chat and popup
	 */
	COLLECTION_LOG_NOTIFICATION(11959);

	/**
	 * The raw varbit ID.
	 */
	private final int id;
}
