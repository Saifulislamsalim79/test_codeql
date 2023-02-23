package com.github.ybq.android.spinkit;

import com.github.ybq.android.spinkit.p093g.AbstractC2540f;
import com.github.ybq.android.spinkit.p094h.C2553a;
import com.github.ybq.android.spinkit.p094h.C2555b;
import com.github.ybq.android.spinkit.p094h.C2557c;
import com.github.ybq.android.spinkit.p094h.C2560d;
import com.github.ybq.android.spinkit.p094h.C2562e;
import com.github.ybq.android.spinkit.p094h.C2564f;
import com.github.ybq.android.spinkit.p094h.C2566g;
import com.github.ybq.android.spinkit.p094h.C2567h;
import com.github.ybq.android.spinkit.p094h.C2568i;
import com.github.ybq.android.spinkit.p094h.C2569j;
import com.github.ybq.android.spinkit.p094h.C2570k;
import com.github.ybq.android.spinkit.p094h.C2571l;
import com.github.ybq.android.spinkit.p094h.C2572m;
import com.github.ybq.android.spinkit.p094h.C2574n;
import com.github.ybq.android.spinkit.p094h.C2576o;
/* compiled from: SpriteFactory.java */
/* renamed from: com.github.ybq.android.spinkit.d */
/* loaded from: classes2.dex */
public class C2519d {

    /* compiled from: SpriteFactory.java */
    /* renamed from: com.github.ybq.android.spinkit.d$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C2520a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7144a;

        static {
            int[] iArr = new int[EnumC2521e.values().length];
            f7144a = iArr;
            try {
                iArr[EnumC2521e.ROTATING_PLANE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7144a[EnumC2521e.DOUBLE_BOUNCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7144a[EnumC2521e.WAVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7144a[EnumC2521e.WANDERING_CUBES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7144a[EnumC2521e.PULSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7144a[EnumC2521e.CHASING_DOTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7144a[EnumC2521e.THREE_BOUNCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7144a[EnumC2521e.CIRCLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7144a[EnumC2521e.CUBE_GRID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7144a[EnumC2521e.FADING_CIRCLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7144a[EnumC2521e.FOLDING_CUBE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7144a[EnumC2521e.ROTATING_CIRCLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7144a[EnumC2521e.MULTIPLE_PULSE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7144a[EnumC2521e.PULSE_RING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7144a[EnumC2521e.MULTIPLE_PULSE_RING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* renamed from: a */
    public static AbstractC2540f m32691a(EnumC2521e enumC2521e) {
        switch (C2520a.f7144a[enumC2521e.ordinal()]) {
            case 1:
                return new C2571l();
            case 2:
                return new C2560d();
            case 3:
                return new C2576o();
            case 4:
                return new C2574n();
            case 5:
                return new C2568i();
            case 6:
                return new C2553a();
            case 7:
                return new C2572m();
            case 8:
                return new C2555b();
            case 9:
                return new C2557c();
            case 10:
                return new C2562e();
            case 11:
                return new C2564f();
            case 12:
                return new C2570k();
            case 13:
                return new C2566g();
            case 14:
                return new C2569j();
            case 15:
                return new C2567h();
            default:
                return null;
        }
    }
}
