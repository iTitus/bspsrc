package info.ata4.bsplib.app.definitions;

import info.ata4.bsplib.app.SourceApp;
import info.ata4.bsplib.app.SourceAppBuilder;
import info.ata4.bsplib.app.SourceAppId;

import java.util.regex.Pattern;

public class HalfLife2Def {

	public static final SourceApp APP = new SourceAppBuilder()
			.setName("Half-Life 2")
			.setAppId(SourceAppId.HALF_LIFE_2)
			.setVersionMin(17)
			.setVersionMax(20)
			.setFilePattern(Pattern.compile("^d[1-3]_"))
			.setPointsEntities(5)
			.setEntities(
					"combine_mine",
					"env_alyxemp",
					"env_citadel_energy_core",
					"env_headcrabcanister",
					"func_combine_ball_spawner",
					"func_tankairboatgun",
					"func_tankmortar",
					"func_tankrocket",
					"info_apc_missile_hint",
					"info_snipertarget",
					"info_target_gunshipcrash",
					"info_teleporter_countdown",
					"item_ammo_357",
					"item_ammo_357_large",
					"item_ammo_ar2",
					"item_ammo_ar2_altfire",
					"item_ammo_ar2_large",
					"item_ammo_crate",
					"item_ammo_crossbow",
					"item_ammo_pistol",
					"item_ammo_pistol_large",
					"item_ammo_smg1",
					"item_ammo_smg1_grenade",
					"item_ar2_grenade",
					"item_battery",
					"item_box_buckshot",
					"item_box_lrounds",
					"item_box_mrounds",
					"item_box_srounds",
					"item_dynamic_resupply",
					"item_healthcharger",
					"item_healthkit",
					"item_healthvial",
					"item_item_crate",
					"item_rpg_round",
					"item_suit",
					"item_suitcharger",
					"npc_alyx",
					"npc_antlion",
					"npc_antlion_template_maker",
					"npc_antlionguard",
					"npc_apcdriver",
					"npc_barnacle",
					"npc_barney",
					"npc_breen",
					"npc_bullseye",
					"npc_citizen",
					"npc_combine_camera",
					"npc_combine_s",
					"npc_combinedropship",
					"npc_combinegunship",
					"npc_cranedriver",
					"npc_crow",
					"npc_cscanner",
					"npc_dog",
					"npc_eli",
					"npc_fastzombie",
					"npc_gman",
					"npc_headcrab",
					"npc_headcrab_black",
					"npc_headcrab_fast",
					"npc_heli_avoidbox",
					"npc_heli_avoidsphere",
					"npc_heli_nobomb",
					"npc_helicopter",
					"npc_ichthyosaur",
					"npc_kleiner",
					"npc_manhack",
					"npc_metropolice",
					"npc_monk",
					"npc_mossman",
					"npc_pigeon",
					"npc_poisonzombie",
					"npc_rollermine",
					"npc_seagull",
					"npc_sniper",
					"npc_stalker",
					"npc_strider",
					"npc_turret_ceiling",
					"npc_turret_floor",
					"npc_turret_ground",
					"npc_vehicledriver",
					"npc_vortigaunt",
					"npc_zombie",
					"npc_zombie_torso",
					"physics_cannister",
					"point_antlion_repellant",
					"point_bugbait",
					"prop_thumper",
					"prop_vehicle_airboat",
					"prop_vehicle_apc",
					"prop_vehicle_crane",
					"prop_vehicle_jeep",
					"prop_vehicle_prisoner_pod",
					"weapon_357",
					"weapon_annabelle",
					"weapon_ar2",
					"weapon_bugbait",
					"weapon_crossbow",
					"weapon_crowbar",
					"weapon_frag",
					"weapon_physcannon",
					"weapon_pistol",
					"weapon_rpg",
					"weapon_shotgun",
					"weapon_smg1"
			)
			.build();
}