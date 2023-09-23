package com.shatteredpixel.shatteredpixeldungeon;

import com.shatteredpixel.shatteredpixeldungeon.actors.buffs.LockedFloor;
import com.watabou.noosa.audio.Music;

public class BGMPlayer {
    public static void playBGMWithDepth() {
        if (Dungeon.hero == null) {
            if (Dungeon.hero.buff(LockedFloor.class) == null) {
                //playBoss();
                return;
            }
        }
        int d = Dungeon.depth;
        if ( d < 5) {
            Music.INSTANCE.play(Assets.Music.TEMPLE, true);
        } else if (d > 5 && d < 10) {
            Music.INSTANCE.play(Assets.Music.UNDER, true);
        } else if (d > 10 && d < 15) {
            Music.INSTANCE.play(Assets.Music.MINE, true);
        } else if (d > 15 && d < 20 ) {
            Music.INSTANCE.play(Assets.Music.NETHER,true);
        } else if (d > 20 && d < 25) {
            Music.INSTANCE.play(Assets.Music.ABYSS, true);
        } else if (d == 26 ) {
            Music.INSTANCE.play(Assets.Music.NIGHTMARE, true);
        } else if (d == 5) {
            Music.INSTANCE.play(Assets.Music.BOSS1, true);
        } else if (d == 10) {
            Music.INSTANCE.play(Assets.Music.BOSS2, true);
        } else if (d == 15) {
            Music.INSTANCE.play(Assets.Music.BOSS3, true);
        } else if (d == 20) {
            Music.INSTANCE.play(Assets.Music.BOSS4, true);
        } else if (d == 25) {
            Music.INSTANCE.play(Assets.Music.BOSS5, true);
        } else if (d == 27) {
            Music.INSTANCE.play(Assets.Music.BOSS6, true);
        }
    }

    public static void playBoss() {
        int t = Dungeon.depth;
        if (t == 5) {
            Music.INSTANCE.play(Assets.Music.BOSS1, true);
        } else if (t == 10) {
            Music.INSTANCE.play(Assets.Music.BOSS2, true);
        } else if (t == 15) {
            Music.INSTANCE.play(Assets.Music.BOSS3, true);
        } else if (t == 20) {
            Music.INSTANCE.play(Assets.Music.BOSS4, true);
        } else if (t == 25) {
            Music.INSTANCE.play(Assets.Music.BOSS5, true);
        }
    }
}