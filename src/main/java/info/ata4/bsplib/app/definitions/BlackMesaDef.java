package info.ata4.bsplib.app.definitions;

import info.ata4.bsplib.app.SourceApp;
import info.ata4.bsplib.app.SourceAppBuilder;
import info.ata4.bsplib.app.SourceAppId;

import java.util.regex.Pattern;

public class BlackMesaDef {

	public static final SourceApp APP = new SourceAppBuilder()
			.setName("Black Mesa")
			.setAppId(SourceAppId.BLACK_MESA)
			.setVersionMin(20)
			.setFilePattern(Pattern.compile("^(bm_c[0-5]a[0-5][a-i][1]?)|(dm_.*)$"))
			.setEntities(
					"ai_goal_throw_prop",
					"camera_satellite",
					"env_cascade_volume",
					"env_dispenser",
					"env_introcredits",
					"env_leech_controller",
					"env_mortar_controller",
					"env_mortar_launcher",
					"env_particle_beam",
					"env_particle_tesla",
					"env_pinch",
					"env_tram_screen",
					"env_xen_portal",
					"env_xen_portal_template",
					"env_xen_pushpad",
					"filter_activator_flag",
					"filter_damage_class",
					"func_50cal",
					"func_conveyor_bms",
					"func_friction",
					"func_minefield",
					"func_tow",
					"godrays_settings",
					"grenade_satchel",
					"grenade_tripmine",
					"info_bigmomma",
					"info_dlightmap_update",
					"info_stopallsounds",
					"info_target_helicoptercrash",
					"item_ammo_canister",
					"item_ammo_energy",
					"item_ammo_glock",
					"item_ammo_mp5",
					"item_ammo_shotgun",
					"item_grenade_mp5",
					"item_grenade_rpg",
					"item_longjump",
					"item_tow_missile",
					"item_weapon_357",
					"item_weapon_crossbow",
					"item_weapon_crowbar",
					"item_weapon_frag",
					"item_weapon_glock",
					"item_weapon_gluon",
					"item_weapon_hivehand",
					"item_weapon_mp5",
					"item_weapon_rpg",
					"item_weapon_satchel",
					"item_weapon_shotgun",
					"item_weapon_snark",
					"item_weapon_tau",
					"item_weapon_tripmine",
					"newLight_Dir",
					"newLight_Point",
					"newLight_Spot",
					"newLights_Spawner",
					"newLights_settings",
					"npc_abrams",
					"npc_alien_controller",
					"npc_alien_grunt",
					"npc_alien_grunt_melee",
					"npc_alien_grunt_unarmored",
					"npc_alien_slave",
					"npc_apache",
					"npc_babycrab",
					"npc_barrel_cactus",
					"npc_bullsquid",
					"npc_cockroach",
					"npc_enemyfinder",
					"npc_flyer_flock",
					"npc_gargantua",
					"npc_gonarch",
					"npc_houndeye",
					"npc_human_assassin",
					"npc_human_commander",
					"npc_human_grenadier",
					"npc_human_grunt",
					"npc_human_medic",
					"npc_human_scientist",
					"npc_human_scientist_eli",
					"npc_human_scientist_female",
					"npc_human_scientist_kleiner",
					"npc_human_security",
					"npc_lav",
					"npc_maintenance",
					"npc_manta",
					"npc_nihilanth",
					"npc_osprey",
					"npc_plantlight",
					"npc_protozoan",
					"npc_rat",
					"npc_sentry_ceiling",
					"npc_sentry_ground",
					"npc_snark",
					"npc_tentacle",
					"npc_xentree",
					"npc_xenturret",
					"npc_zombie_grunt",
					"npc_zombie_scientist",
					"npc_zombie_scientist_torso",
					"npc_zombie_security",
					"prop_flare",
					"prop_physics_respawnable",
					"prop_puffballfungus",
					"prop_retinalscanner",
					"prop_surgerybot",
					"prop_train_apprehension",
					"prop_train_awesome",
					"trigger_gargantua_shake",
					"trigger_lift",
					"trigger_weaponfire",
					"xen_portal"
			)
			.build();
}