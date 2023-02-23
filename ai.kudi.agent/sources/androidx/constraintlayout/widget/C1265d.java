package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C1271e;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p201g.p219f.p220a.p221a.C7537a;
import p201g.p219f.p220a.p222b.C7538a;
/* compiled from: ConstraintSet.java */
/* renamed from: androidx.constraintlayout.widget.d */
/* loaded from: classes2.dex */
public class C1265d {

    /* renamed from: d */
    private static final int[] f3875d = {0, 4, 8};

    /* renamed from: e */
    private static SparseIntArray f3876e;

    /* renamed from: a */
    private HashMap<String, C1258a> f3877a = new HashMap<>();

    /* renamed from: b */
    private boolean f3878b = true;

    /* renamed from: c */
    private HashMap<Integer, C1266a> f3879c = new HashMap<>();

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.d$a */
    /* loaded from: classes2.dex */
    public static class C1266a {

        /* renamed from: a */
        int f3880a;

        /* renamed from: b */
        public final C1269d f3881b = new C1269d();

        /* renamed from: c */
        public final C1268c f3882c = new C1268c();

        /* renamed from: d */
        public final C1267b f3883d = new C1267b();

        /* renamed from: e */
        public final C1270e f3884e = new C1270e();

        /* renamed from: f */
        public HashMap<String, C1258a> f3885f = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m36585f(int i, ConstraintLayout.C1255b c1255b) {
            this.f3880a = i;
            C1267b c1267b = this.f3883d;
            c1267b.f3927h = c1255b.f3791d;
            c1267b.f3929i = c1255b.f3793e;
            c1267b.f3931j = c1255b.f3795f;
            c1267b.f3933k = c1255b.f3797g;
            c1267b.f3934l = c1255b.f3799h;
            c1267b.f3935m = c1255b.f3801i;
            c1267b.f3936n = c1255b.f3803j;
            c1267b.f3937o = c1255b.f3805k;
            c1267b.f3938p = c1255b.f3807l;
            c1267b.f3939q = c1255b.f3814p;
            c1267b.f3940r = c1255b.f3815q;
            c1267b.f3941s = c1255b.f3816r;
            c1267b.f3942t = c1255b.f3817s;
            c1267b.f3943u = c1255b.f3824z;
            c1267b.f3944v = c1255b.f3759A;
            c1267b.f3945w = c1255b.f3760B;
            c1267b.f3946x = c1255b.f3809m;
            c1267b.f3947y = c1255b.f3811n;
            c1267b.f3948z = c1255b.f3813o;
            c1267b.f3887A = c1255b.f3774P;
            c1267b.f3888B = c1255b.f3775Q;
            c1267b.f3889C = c1255b.f3776R;
            c1267b.f3925g = c1255b.f3789c;
            c1267b.f3921e = c1255b.f3785a;
            c1267b.f3923f = c1255b.f3787b;
            c1267b.f3917c = ((ViewGroup.MarginLayoutParams) c1255b).width;
            c1267b.f3919d = ((ViewGroup.MarginLayoutParams) c1255b).height;
            c1267b.f3890D = ((ViewGroup.MarginLayoutParams) c1255b).leftMargin;
            c1267b.f3891E = ((ViewGroup.MarginLayoutParams) c1255b).rightMargin;
            c1267b.f3892F = ((ViewGroup.MarginLayoutParams) c1255b).topMargin;
            c1267b.f3893G = ((ViewGroup.MarginLayoutParams) c1255b).bottomMargin;
            c1267b.f3902P = c1255b.f3763E;
            c1267b.f3903Q = c1255b.f3762D;
            c1267b.f3905S = c1255b.f3765G;
            c1267b.f3904R = c1255b.f3764F;
            c1267b.f3928h0 = c1255b.f3777S;
            c1267b.f3930i0 = c1255b.f3778T;
            c1267b.f3906T = c1255b.f3766H;
            c1267b.f3907U = c1255b.f3767I;
            c1267b.f3908V = c1255b.f3770L;
            c1267b.f3909W = c1255b.f3771M;
            c1267b.f3910X = c1255b.f3768J;
            c1267b.f3911Y = c1255b.f3769K;
            c1267b.f3912Z = c1255b.f3772N;
            c1267b.f3914a0 = c1255b.f3773O;
            c1267b.f3926g0 = c1255b.f3779U;
            c1267b.f3897K = c1255b.f3819u;
            c1267b.f3899M = c1255b.f3821w;
            c1267b.f3896J = c1255b.f3818t;
            c1267b.f3898L = c1255b.f3820v;
            c1267b.f3901O = c1255b.f3822x;
            c1267b.f3900N = c1255b.f3823y;
            if (Build.VERSION.SDK_INT >= 17) {
                c1267b.f3894H = c1255b.getMarginEnd();
                this.f3883d.f3895I = c1255b.getMarginStart();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public void m36584g(int i, C1271e.C1272a c1272a) {
            m36585f(i, c1272a);
            this.f3881b.f3960d = c1272a.f3978o0;
            C1270e c1270e = this.f3884e;
            c1270e.f3964b = c1272a.f3981r0;
            c1270e.f3965c = c1272a.f3982s0;
            c1270e.f3966d = c1272a.f3983t0;
            c1270e.f3967e = c1272a.f3984u0;
            c1270e.f3968f = c1272a.f3985v0;
            c1270e.f3969g = c1272a.f3986w0;
            c1270e.f3970h = c1272a.f3987x0;
            c1270e.f3971i = c1272a.f3988y0;
            c1270e.f3972j = c1272a.f3989z0;
            c1270e.f3973k = c1272a.f3977A0;
            c1270e.f3975m = c1272a.f3980q0;
            c1270e.f3974l = c1272a.f3979p0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public void m36583h(AbstractC1261b abstractC1261b, int i, C1271e.C1272a c1272a) {
            m36584g(i, c1272a);
            if (abstractC1261b instanceof Barrier) {
                C1267b c1267b = this.f3883d;
                c1267b.f3920d0 = 1;
                Barrier barrier = (Barrier) abstractC1261b;
                c1267b.f3916b0 = barrier.getType();
                this.f3883d.f3922e0 = barrier.getReferencedIds();
                this.f3883d.f3918c0 = barrier.getMargin();
            }
        }

        /* renamed from: d */
        public void m36587d(ConstraintLayout.C1255b c1255b) {
            C1267b c1267b = this.f3883d;
            c1255b.f3791d = c1267b.f3927h;
            c1255b.f3793e = c1267b.f3929i;
            c1255b.f3795f = c1267b.f3931j;
            c1255b.f3797g = c1267b.f3933k;
            c1255b.f3799h = c1267b.f3934l;
            c1255b.f3801i = c1267b.f3935m;
            c1255b.f3803j = c1267b.f3936n;
            c1255b.f3805k = c1267b.f3937o;
            c1255b.f3807l = c1267b.f3938p;
            c1255b.f3814p = c1267b.f3939q;
            c1255b.f3815q = c1267b.f3940r;
            c1255b.f3816r = c1267b.f3941s;
            c1255b.f3817s = c1267b.f3942t;
            ((ViewGroup.MarginLayoutParams) c1255b).leftMargin = c1267b.f3890D;
            ((ViewGroup.MarginLayoutParams) c1255b).rightMargin = c1267b.f3891E;
            ((ViewGroup.MarginLayoutParams) c1255b).topMargin = c1267b.f3892F;
            ((ViewGroup.MarginLayoutParams) c1255b).bottomMargin = c1267b.f3893G;
            c1255b.f3822x = c1267b.f3901O;
            c1255b.f3823y = c1267b.f3900N;
            c1255b.f3819u = c1267b.f3897K;
            c1255b.f3821w = c1267b.f3899M;
            c1255b.f3824z = c1267b.f3943u;
            c1255b.f3759A = c1267b.f3944v;
            c1255b.f3809m = c1267b.f3946x;
            c1255b.f3811n = c1267b.f3947y;
            c1255b.f3813o = c1267b.f3948z;
            c1255b.f3760B = c1267b.f3945w;
            c1255b.f3774P = c1267b.f3887A;
            c1255b.f3775Q = c1267b.f3888B;
            c1255b.f3763E = c1267b.f3902P;
            c1255b.f3762D = c1267b.f3903Q;
            c1255b.f3765G = c1267b.f3905S;
            c1255b.f3764F = c1267b.f3904R;
            c1255b.f3777S = c1267b.f3928h0;
            c1255b.f3778T = c1267b.f3930i0;
            c1255b.f3766H = c1267b.f3906T;
            c1255b.f3767I = c1267b.f3907U;
            c1255b.f3770L = c1267b.f3908V;
            c1255b.f3771M = c1267b.f3909W;
            c1255b.f3768J = c1267b.f3910X;
            c1255b.f3769K = c1267b.f3911Y;
            c1255b.f3772N = c1267b.f3912Z;
            c1255b.f3773O = c1267b.f3914a0;
            c1255b.f3776R = c1267b.f3889C;
            c1255b.f3789c = c1267b.f3925g;
            c1255b.f3785a = c1267b.f3921e;
            c1255b.f3787b = c1267b.f3923f;
            ((ViewGroup.MarginLayoutParams) c1255b).width = c1267b.f3917c;
            ((ViewGroup.MarginLayoutParams) c1255b).height = c1267b.f3919d;
            String str = c1267b.f3926g0;
            if (str != null) {
                c1255b.f3779U = str;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                c1255b.setMarginStart(this.f3883d.f3895I);
                c1255b.setMarginEnd(this.f3883d.f3894H);
            }
            c1255b.m36636a();
        }

        /* renamed from: e */
        public C1266a clone() {
            C1266a c1266a = new C1266a();
            c1266a.f3883d.m36582a(this.f3883d);
            c1266a.f3882c.m36580a(this.f3882c);
            c1266a.f3881b.m36578a(this.f3881b);
            c1266a.f3884e.m36576a(this.f3884e);
            c1266a.f3880a = this.f3880a;
            return c1266a;
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.d$b */
    /* loaded from: classes2.dex */
    public static class C1267b {

        /* renamed from: k0 */
        private static SparseIntArray f3886k0;

        /* renamed from: c */
        public int f3917c;

        /* renamed from: d */
        public int f3919d;

        /* renamed from: e0 */
        public int[] f3922e0;

        /* renamed from: f0 */
        public String f3924f0;

        /* renamed from: g0 */
        public String f3926g0;

        /* renamed from: a */
        public boolean f3913a = false;

        /* renamed from: b */
        public boolean f3915b = false;

        /* renamed from: e */
        public int f3921e = -1;

        /* renamed from: f */
        public int f3923f = -1;

        /* renamed from: g */
        public float f3925g = -1.0f;

        /* renamed from: h */
        public int f3927h = -1;

        /* renamed from: i */
        public int f3929i = -1;

        /* renamed from: j */
        public int f3931j = -1;

        /* renamed from: k */
        public int f3933k = -1;

        /* renamed from: l */
        public int f3934l = -1;

        /* renamed from: m */
        public int f3935m = -1;

        /* renamed from: n */
        public int f3936n = -1;

        /* renamed from: o */
        public int f3937o = -1;

        /* renamed from: p */
        public int f3938p = -1;

        /* renamed from: q */
        public int f3939q = -1;

        /* renamed from: r */
        public int f3940r = -1;

        /* renamed from: s */
        public int f3941s = -1;

        /* renamed from: t */
        public int f3942t = -1;

        /* renamed from: u */
        public float f3943u = 0.5f;

        /* renamed from: v */
        public float f3944v = 0.5f;

        /* renamed from: w */
        public String f3945w = null;

        /* renamed from: x */
        public int f3946x = -1;

        /* renamed from: y */
        public int f3947y = 0;

        /* renamed from: z */
        public float f3948z = 0.0f;

        /* renamed from: A */
        public int f3887A = -1;

        /* renamed from: B */
        public int f3888B = -1;

        /* renamed from: C */
        public int f3889C = -1;

        /* renamed from: D */
        public int f3890D = -1;

        /* renamed from: E */
        public int f3891E = -1;

        /* renamed from: F */
        public int f3892F = -1;

        /* renamed from: G */
        public int f3893G = -1;

        /* renamed from: H */
        public int f3894H = -1;

        /* renamed from: I */
        public int f3895I = -1;

        /* renamed from: J */
        public int f3896J = -1;

        /* renamed from: K */
        public int f3897K = -1;

        /* renamed from: L */
        public int f3898L = -1;

        /* renamed from: M */
        public int f3899M = -1;

        /* renamed from: N */
        public int f3900N = -1;

        /* renamed from: O */
        public int f3901O = -1;

        /* renamed from: P */
        public float f3902P = -1.0f;

        /* renamed from: Q */
        public float f3903Q = -1.0f;

        /* renamed from: R */
        public int f3904R = 0;

        /* renamed from: S */
        public int f3905S = 0;

        /* renamed from: T */
        public int f3906T = 0;

        /* renamed from: U */
        public int f3907U = 0;

        /* renamed from: V */
        public int f3908V = -1;

        /* renamed from: W */
        public int f3909W = -1;

        /* renamed from: X */
        public int f3910X = -1;

        /* renamed from: Y */
        public int f3911Y = -1;

        /* renamed from: Z */
        public float f3912Z = 1.0f;

        /* renamed from: a0 */
        public float f3914a0 = 1.0f;

        /* renamed from: b0 */
        public int f3916b0 = -1;

        /* renamed from: c0 */
        public int f3918c0 = 0;

        /* renamed from: d0 */
        public int f3920d0 = -1;

        /* renamed from: h0 */
        public boolean f3928h0 = false;

        /* renamed from: i0 */
        public boolean f3930i0 = false;

        /* renamed from: j0 */
        public boolean f3932j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3886k0 = sparseIntArray;
            sparseIntArray.append(C1276i.Layout_layout_constraintLeft_toLeftOf, 24);
            f3886k0.append(C1276i.Layout_layout_constraintLeft_toRightOf, 25);
            f3886k0.append(C1276i.Layout_layout_constraintRight_toLeftOf, 28);
            f3886k0.append(C1276i.Layout_layout_constraintRight_toRightOf, 29);
            f3886k0.append(C1276i.Layout_layout_constraintTop_toTopOf, 35);
            f3886k0.append(C1276i.Layout_layout_constraintTop_toBottomOf, 34);
            f3886k0.append(C1276i.Layout_layout_constraintBottom_toTopOf, 4);
            f3886k0.append(C1276i.Layout_layout_constraintBottom_toBottomOf, 3);
            f3886k0.append(C1276i.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f3886k0.append(C1276i.Layout_layout_editor_absoluteX, 6);
            f3886k0.append(C1276i.Layout_layout_editor_absoluteY, 7);
            f3886k0.append(C1276i.Layout_layout_constraintGuide_begin, 17);
            f3886k0.append(C1276i.Layout_layout_constraintGuide_end, 18);
            f3886k0.append(C1276i.Layout_layout_constraintGuide_percent, 19);
            f3886k0.append(C1276i.Layout_android_orientation, 26);
            f3886k0.append(C1276i.Layout_layout_constraintStart_toEndOf, 31);
            f3886k0.append(C1276i.Layout_layout_constraintStart_toStartOf, 32);
            f3886k0.append(C1276i.Layout_layout_constraintEnd_toStartOf, 10);
            f3886k0.append(C1276i.Layout_layout_constraintEnd_toEndOf, 9);
            f3886k0.append(C1276i.Layout_layout_goneMarginLeft, 13);
            f3886k0.append(C1276i.Layout_layout_goneMarginTop, 16);
            f3886k0.append(C1276i.Layout_layout_goneMarginRight, 14);
            f3886k0.append(C1276i.Layout_layout_goneMarginBottom, 11);
            f3886k0.append(C1276i.Layout_layout_goneMarginStart, 15);
            f3886k0.append(C1276i.Layout_layout_goneMarginEnd, 12);
            f3886k0.append(C1276i.Layout_layout_constraintVertical_weight, 38);
            f3886k0.append(C1276i.Layout_layout_constraintHorizontal_weight, 37);
            f3886k0.append(C1276i.Layout_layout_constraintHorizontal_chainStyle, 39);
            f3886k0.append(C1276i.Layout_layout_constraintVertical_chainStyle, 40);
            f3886k0.append(C1276i.Layout_layout_constraintHorizontal_bias, 20);
            f3886k0.append(C1276i.Layout_layout_constraintVertical_bias, 36);
            f3886k0.append(C1276i.Layout_layout_constraintDimensionRatio, 5);
            f3886k0.append(C1276i.Layout_layout_constraintLeft_creator, 76);
            f3886k0.append(C1276i.Layout_layout_constraintTop_creator, 76);
            f3886k0.append(C1276i.Layout_layout_constraintRight_creator, 76);
            f3886k0.append(C1276i.Layout_layout_constraintBottom_creator, 76);
            f3886k0.append(C1276i.Layout_layout_constraintBaseline_creator, 76);
            f3886k0.append(C1276i.Layout_android_layout_marginLeft, 23);
            f3886k0.append(C1276i.Layout_android_layout_marginRight, 27);
            f3886k0.append(C1276i.Layout_android_layout_marginStart, 30);
            f3886k0.append(C1276i.Layout_android_layout_marginEnd, 8);
            f3886k0.append(C1276i.Layout_android_layout_marginTop, 33);
            f3886k0.append(C1276i.Layout_android_layout_marginBottom, 2);
            f3886k0.append(C1276i.Layout_android_layout_width, 22);
            f3886k0.append(C1276i.Layout_android_layout_height, 21);
            f3886k0.append(C1276i.Layout_layout_constraintCircle, 61);
            f3886k0.append(C1276i.Layout_layout_constraintCircleRadius, 62);
            f3886k0.append(C1276i.Layout_layout_constraintCircleAngle, 63);
            f3886k0.append(C1276i.Layout_layout_constraintWidth_percent, 69);
            f3886k0.append(C1276i.Layout_layout_constraintHeight_percent, 70);
            f3886k0.append(C1276i.Layout_chainUseRtl, 71);
            f3886k0.append(C1276i.Layout_barrierDirection, 72);
            f3886k0.append(C1276i.Layout_barrierMargin, 73);
            f3886k0.append(C1276i.Layout_constraint_referenced_ids, 74);
            f3886k0.append(C1276i.Layout_barrierAllowsGoneWidgets, 75);
        }

        /* renamed from: a */
        public void m36582a(C1267b c1267b) {
            this.f3913a = c1267b.f3913a;
            this.f3917c = c1267b.f3917c;
            this.f3915b = c1267b.f3915b;
            this.f3919d = c1267b.f3919d;
            this.f3921e = c1267b.f3921e;
            this.f3923f = c1267b.f3923f;
            this.f3925g = c1267b.f3925g;
            this.f3927h = c1267b.f3927h;
            this.f3929i = c1267b.f3929i;
            this.f3931j = c1267b.f3931j;
            this.f3933k = c1267b.f3933k;
            this.f3934l = c1267b.f3934l;
            this.f3935m = c1267b.f3935m;
            this.f3936n = c1267b.f3936n;
            this.f3937o = c1267b.f3937o;
            this.f3938p = c1267b.f3938p;
            this.f3939q = c1267b.f3939q;
            this.f3940r = c1267b.f3940r;
            this.f3941s = c1267b.f3941s;
            this.f3942t = c1267b.f3942t;
            this.f3943u = c1267b.f3943u;
            this.f3944v = c1267b.f3944v;
            this.f3945w = c1267b.f3945w;
            this.f3946x = c1267b.f3946x;
            this.f3947y = c1267b.f3947y;
            this.f3948z = c1267b.f3948z;
            this.f3887A = c1267b.f3887A;
            this.f3888B = c1267b.f3888B;
            this.f3889C = c1267b.f3889C;
            this.f3890D = c1267b.f3890D;
            this.f3891E = c1267b.f3891E;
            this.f3892F = c1267b.f3892F;
            this.f3893G = c1267b.f3893G;
            this.f3894H = c1267b.f3894H;
            this.f3895I = c1267b.f3895I;
            this.f3896J = c1267b.f3896J;
            this.f3897K = c1267b.f3897K;
            this.f3898L = c1267b.f3898L;
            this.f3899M = c1267b.f3899M;
            this.f3900N = c1267b.f3900N;
            this.f3901O = c1267b.f3901O;
            this.f3902P = c1267b.f3902P;
            this.f3903Q = c1267b.f3903Q;
            this.f3904R = c1267b.f3904R;
            this.f3905S = c1267b.f3905S;
            this.f3906T = c1267b.f3906T;
            this.f3907U = c1267b.f3907U;
            this.f3908V = c1267b.f3908V;
            this.f3909W = c1267b.f3909W;
            this.f3910X = c1267b.f3910X;
            this.f3911Y = c1267b.f3911Y;
            this.f3912Z = c1267b.f3912Z;
            this.f3914a0 = c1267b.f3914a0;
            this.f3916b0 = c1267b.f3916b0;
            this.f3918c0 = c1267b.f3918c0;
            this.f3920d0 = c1267b.f3920d0;
            this.f3926g0 = c1267b.f3926g0;
            int[] iArr = c1267b.f3922e0;
            if (iArr != null) {
                this.f3922e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f3922e0 = null;
            }
            this.f3924f0 = c1267b.f3924f0;
            this.f3928h0 = c1267b.f3928h0;
            this.f3930i0 = c1267b.f3930i0;
            this.f3932j0 = c1267b.f3932j0;
        }

        /* renamed from: b */
        void m36581b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1276i.Layout);
            this.f3915b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f3886k0.get(index);
                if (i2 == 80) {
                    this.f3928h0 = obtainStyledAttributes.getBoolean(index, this.f3928h0);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            this.f3938p = C1265d.m36593q(obtainStyledAttributes, index, this.f3938p);
                            continue;
                        case 2:
                            this.f3893G = obtainStyledAttributes.getDimensionPixelSize(index, this.f3893G);
                            continue;
                        case 3:
                            this.f3937o = C1265d.m36593q(obtainStyledAttributes, index, this.f3937o);
                            continue;
                        case 4:
                            this.f3936n = C1265d.m36593q(obtainStyledAttributes, index, this.f3936n);
                            continue;
                        case 5:
                            this.f3945w = obtainStyledAttributes.getString(index);
                            continue;
                        case 6:
                            this.f3887A = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3887A);
                            continue;
                        case 7:
                            this.f3888B = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3888B);
                            continue;
                        case 8:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.f3894H = obtainStyledAttributes.getDimensionPixelSize(index, this.f3894H);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            this.f3942t = C1265d.m36593q(obtainStyledAttributes, index, this.f3942t);
                            continue;
                        case 10:
                            this.f3941s = C1265d.m36593q(obtainStyledAttributes, index, this.f3941s);
                            continue;
                        case 11:
                            this.f3899M = obtainStyledAttributes.getDimensionPixelSize(index, this.f3899M);
                            continue;
                        case 12:
                            this.f3900N = obtainStyledAttributes.getDimensionPixelSize(index, this.f3900N);
                            continue;
                        case 13:
                            this.f3896J = obtainStyledAttributes.getDimensionPixelSize(index, this.f3896J);
                            continue;
                        case 14:
                            this.f3898L = obtainStyledAttributes.getDimensionPixelSize(index, this.f3898L);
                            continue;
                        case 15:
                            this.f3901O = obtainStyledAttributes.getDimensionPixelSize(index, this.f3901O);
                            continue;
                        case 16:
                            this.f3897K = obtainStyledAttributes.getDimensionPixelSize(index, this.f3897K);
                            continue;
                        case 17:
                            this.f3921e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3921e);
                            continue;
                        case 18:
                            this.f3923f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3923f);
                            continue;
                        case 19:
                            this.f3925g = obtainStyledAttributes.getFloat(index, this.f3925g);
                            continue;
                        case 20:
                            this.f3943u = obtainStyledAttributes.getFloat(index, this.f3943u);
                            continue;
                        case 21:
                            this.f3919d = obtainStyledAttributes.getLayoutDimension(index, this.f3919d);
                            continue;
                        case 22:
                            this.f3917c = obtainStyledAttributes.getLayoutDimension(index, this.f3917c);
                            continue;
                        case 23:
                            this.f3890D = obtainStyledAttributes.getDimensionPixelSize(index, this.f3890D);
                            continue;
                        case 24:
                            this.f3927h = C1265d.m36593q(obtainStyledAttributes, index, this.f3927h);
                            continue;
                        case 25:
                            this.f3929i = C1265d.m36593q(obtainStyledAttributes, index, this.f3929i);
                            continue;
                        case 26:
                            this.f3889C = obtainStyledAttributes.getInt(index, this.f3889C);
                            continue;
                        case 27:
                            this.f3891E = obtainStyledAttributes.getDimensionPixelSize(index, this.f3891E);
                            continue;
                        case 28:
                            this.f3931j = C1265d.m36593q(obtainStyledAttributes, index, this.f3931j);
                            continue;
                        case 29:
                            this.f3933k = C1265d.m36593q(obtainStyledAttributes, index, this.f3933k);
                            continue;
                        case 30:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.f3895I = obtainStyledAttributes.getDimensionPixelSize(index, this.f3895I);
                                break;
                            } else {
                                continue;
                            }
                        case 31:
                            this.f3939q = C1265d.m36593q(obtainStyledAttributes, index, this.f3939q);
                            continue;
                        case 32:
                            this.f3940r = C1265d.m36593q(obtainStyledAttributes, index, this.f3940r);
                            continue;
                        case 33:
                            this.f3892F = obtainStyledAttributes.getDimensionPixelSize(index, this.f3892F);
                            continue;
                        case 34:
                            this.f3935m = C1265d.m36593q(obtainStyledAttributes, index, this.f3935m);
                            continue;
                        case 35:
                            this.f3934l = C1265d.m36593q(obtainStyledAttributes, index, this.f3934l);
                            continue;
                        case 36:
                            this.f3944v = obtainStyledAttributes.getFloat(index, this.f3944v);
                            continue;
                        case 37:
                            this.f3903Q = obtainStyledAttributes.getFloat(index, this.f3903Q);
                            continue;
                        case 38:
                            this.f3902P = obtainStyledAttributes.getFloat(index, this.f3902P);
                            continue;
                        case 39:
                            this.f3904R = obtainStyledAttributes.getInt(index, this.f3904R);
                            continue;
                        case 40:
                            this.f3905S = obtainStyledAttributes.getInt(index, this.f3905S);
                            continue;
                        default:
                            switch (i2) {
                                case 54:
                                    this.f3906T = obtainStyledAttributes.getInt(index, this.f3906T);
                                    continue;
                                case 55:
                                    this.f3907U = obtainStyledAttributes.getInt(index, this.f3907U);
                                    continue;
                                case 56:
                                    this.f3908V = obtainStyledAttributes.getDimensionPixelSize(index, this.f3908V);
                                    continue;
                                case 57:
                                    this.f3909W = obtainStyledAttributes.getDimensionPixelSize(index, this.f3909W);
                                    continue;
                                case 58:
                                    this.f3910X = obtainStyledAttributes.getDimensionPixelSize(index, this.f3910X);
                                    continue;
                                case 59:
                                    this.f3911Y = obtainStyledAttributes.getDimensionPixelSize(index, this.f3911Y);
                                    continue;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.f3946x = C1265d.m36593q(obtainStyledAttributes, index, this.f3946x);
                                            continue;
                                        case 62:
                                            this.f3947y = obtainStyledAttributes.getDimensionPixelSize(index, this.f3947y);
                                            continue;
                                        case 63:
                                            this.f3948z = obtainStyledAttributes.getFloat(index, this.f3948z);
                                            continue;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.f3912Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.f3914a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case 72:
                                                    this.f3916b0 = obtainStyledAttributes.getInt(index, this.f3916b0);
                                                    continue;
                                                case 73:
                                                    this.f3918c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3918c0);
                                                    continue;
                                                case 74:
                                                    this.f3924f0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.f3932j0 = obtainStyledAttributes.getBoolean(index, this.f3932j0);
                                                    continue;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f3886k0.get(index));
                                                    continue;
                                                case 77:
                                                    this.f3926g0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f3886k0.get(index));
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f3930i0 = obtainStyledAttributes.getBoolean(index, this.f3930i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.d$c */
    /* loaded from: classes2.dex */
    public static class C1268c {

        /* renamed from: h */
        private static SparseIntArray f3949h;

        /* renamed from: a */
        public boolean f3950a = false;

        /* renamed from: b */
        public int f3951b = -1;

        /* renamed from: c */
        public String f3952c = null;

        /* renamed from: d */
        public int f3953d = -1;

        /* renamed from: e */
        public int f3954e = 0;

        /* renamed from: f */
        public float f3955f = Float.NaN;

        /* renamed from: g */
        public float f3956g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3949h = sparseIntArray;
            sparseIntArray.append(C1276i.Motion_motionPathRotate, 1);
            f3949h.append(C1276i.Motion_pathMotionArc, 2);
            f3949h.append(C1276i.Motion_transitionEasing, 3);
            f3949h.append(C1276i.Motion_drawPath, 4);
            f3949h.append(C1276i.Motion_animate_relativeTo, 5);
            f3949h.append(C1276i.Motion_motionStagger, 6);
        }

        /* renamed from: a */
        public void m36580a(C1268c c1268c) {
            this.f3950a = c1268c.f3950a;
            this.f3951b = c1268c.f3951b;
            this.f3952c = c1268c.f3952c;
            this.f3953d = c1268c.f3953d;
            this.f3954e = c1268c.f3954e;
            this.f3956g = c1268c.f3956g;
            this.f3955f = c1268c.f3955f;
        }

        /* renamed from: b */
        void m36579b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1276i.Motion);
            this.f3950a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f3949h.get(index)) {
                    case 1:
                        this.f3956g = obtainStyledAttributes.getFloat(index, this.f3956g);
                        break;
                    case 2:
                        this.f3953d = obtainStyledAttributes.getInt(index, this.f3953d);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f3952c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f3952c = C7537a.f17920a[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f3954e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f3951b = C1265d.m36593q(obtainStyledAttributes, index, this.f3951b);
                        break;
                    case 6:
                        this.f3955f = obtainStyledAttributes.getFloat(index, this.f3955f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.d$d */
    /* loaded from: classes2.dex */
    public static class C1269d {

        /* renamed from: a */
        public boolean f3957a = false;

        /* renamed from: b */
        public int f3958b = 0;

        /* renamed from: c */
        public int f3959c = 0;

        /* renamed from: d */
        public float f3960d = 1.0f;

        /* renamed from: e */
        public float f3961e = Float.NaN;

        /* renamed from: a */
        public void m36578a(C1269d c1269d) {
            this.f3957a = c1269d.f3957a;
            this.f3958b = c1269d.f3958b;
            this.f3960d = c1269d.f3960d;
            this.f3961e = c1269d.f3961e;
            this.f3959c = c1269d.f3959c;
        }

        /* renamed from: b */
        void m36577b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1276i.PropertySet);
            this.f3957a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1276i.PropertySet_android_alpha) {
                    this.f3960d = obtainStyledAttributes.getFloat(index, this.f3960d);
                } else if (index == C1276i.PropertySet_android_visibility) {
                    this.f3958b = obtainStyledAttributes.getInt(index, this.f3958b);
                    this.f3958b = C1265d.f3875d[this.f3958b];
                } else if (index == C1276i.PropertySet_visibilityMode) {
                    this.f3959c = obtainStyledAttributes.getInt(index, this.f3959c);
                } else if (index == C1276i.PropertySet_motionProgress) {
                    this.f3961e = obtainStyledAttributes.getFloat(index, this.f3961e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.d$e */
    /* loaded from: classes2.dex */
    public static class C1270e {

        /* renamed from: n */
        private static SparseIntArray f3962n;

        /* renamed from: a */
        public boolean f3963a = false;

        /* renamed from: b */
        public float f3964b = 0.0f;

        /* renamed from: c */
        public float f3965c = 0.0f;

        /* renamed from: d */
        public float f3966d = 0.0f;

        /* renamed from: e */
        public float f3967e = 1.0f;

        /* renamed from: f */
        public float f3968f = 1.0f;

        /* renamed from: g */
        public float f3969g = Float.NaN;

        /* renamed from: h */
        public float f3970h = Float.NaN;

        /* renamed from: i */
        public float f3971i = 0.0f;

        /* renamed from: j */
        public float f3972j = 0.0f;

        /* renamed from: k */
        public float f3973k = 0.0f;

        /* renamed from: l */
        public boolean f3974l = false;

        /* renamed from: m */
        public float f3975m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3962n = sparseIntArray;
            sparseIntArray.append(C1276i.Transform_android_rotation, 1);
            f3962n.append(C1276i.Transform_android_rotationX, 2);
            f3962n.append(C1276i.Transform_android_rotationY, 3);
            f3962n.append(C1276i.Transform_android_scaleX, 4);
            f3962n.append(C1276i.Transform_android_scaleY, 5);
            f3962n.append(C1276i.Transform_android_transformPivotX, 6);
            f3962n.append(C1276i.Transform_android_transformPivotY, 7);
            f3962n.append(C1276i.Transform_android_translationX, 8);
            f3962n.append(C1276i.Transform_android_translationY, 9);
            f3962n.append(C1276i.Transform_android_translationZ, 10);
            f3962n.append(C1276i.Transform_android_elevation, 11);
        }

        /* renamed from: a */
        public void m36576a(C1270e c1270e) {
            this.f3963a = c1270e.f3963a;
            this.f3964b = c1270e.f3964b;
            this.f3965c = c1270e.f3965c;
            this.f3966d = c1270e.f3966d;
            this.f3967e = c1270e.f3967e;
            this.f3968f = c1270e.f3968f;
            this.f3969g = c1270e.f3969g;
            this.f3970h = c1270e.f3970h;
            this.f3971i = c1270e.f3971i;
            this.f3972j = c1270e.f3972j;
            this.f3973k = c1270e.f3973k;
            this.f3974l = c1270e.f3974l;
            this.f3975m = c1270e.f3975m;
        }

        /* renamed from: b */
        void m36575b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1276i.Transform);
            this.f3963a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f3962n.get(index)) {
                    case 1:
                        this.f3964b = obtainStyledAttributes.getFloat(index, this.f3964b);
                        break;
                    case 2:
                        this.f3965c = obtainStyledAttributes.getFloat(index, this.f3965c);
                        break;
                    case 3:
                        this.f3966d = obtainStyledAttributes.getFloat(index, this.f3966d);
                        break;
                    case 4:
                        this.f3967e = obtainStyledAttributes.getFloat(index, this.f3967e);
                        break;
                    case 5:
                        this.f3968f = obtainStyledAttributes.getFloat(index, this.f3968f);
                        break;
                    case 6:
                        this.f3969g = obtainStyledAttributes.getDimension(index, this.f3969g);
                        break;
                    case 7:
                        this.f3970h = obtainStyledAttributes.getDimension(index, this.f3970h);
                        break;
                    case 8:
                        this.f3971i = obtainStyledAttributes.getDimension(index, this.f3971i);
                        break;
                    case 9:
                        this.f3972j = obtainStyledAttributes.getDimension(index, this.f3972j);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f3973k = obtainStyledAttributes.getDimension(index, this.f3973k);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f3974l = true;
                            this.f3975m = obtainStyledAttributes.getDimension(index, this.f3975m);
                            break;
                        } else {
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3876e = sparseIntArray;
        sparseIntArray.append(C1276i.Constraint_layout_constraintLeft_toLeftOf, 25);
        f3876e.append(C1276i.Constraint_layout_constraintLeft_toRightOf, 26);
        f3876e.append(C1276i.Constraint_layout_constraintRight_toLeftOf, 29);
        f3876e.append(C1276i.Constraint_layout_constraintRight_toRightOf, 30);
        f3876e.append(C1276i.Constraint_layout_constraintTop_toTopOf, 36);
        f3876e.append(C1276i.Constraint_layout_constraintTop_toBottomOf, 35);
        f3876e.append(C1276i.Constraint_layout_constraintBottom_toTopOf, 4);
        f3876e.append(C1276i.Constraint_layout_constraintBottom_toBottomOf, 3);
        f3876e.append(C1276i.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f3876e.append(C1276i.Constraint_layout_editor_absoluteX, 6);
        f3876e.append(C1276i.Constraint_layout_editor_absoluteY, 7);
        f3876e.append(C1276i.Constraint_layout_constraintGuide_begin, 17);
        f3876e.append(C1276i.Constraint_layout_constraintGuide_end, 18);
        f3876e.append(C1276i.Constraint_layout_constraintGuide_percent, 19);
        f3876e.append(C1276i.Constraint_android_orientation, 27);
        f3876e.append(C1276i.Constraint_layout_constraintStart_toEndOf, 32);
        f3876e.append(C1276i.Constraint_layout_constraintStart_toStartOf, 33);
        f3876e.append(C1276i.Constraint_layout_constraintEnd_toStartOf, 10);
        f3876e.append(C1276i.Constraint_layout_constraintEnd_toEndOf, 9);
        f3876e.append(C1276i.Constraint_layout_goneMarginLeft, 13);
        f3876e.append(C1276i.Constraint_layout_goneMarginTop, 16);
        f3876e.append(C1276i.Constraint_layout_goneMarginRight, 14);
        f3876e.append(C1276i.Constraint_layout_goneMarginBottom, 11);
        f3876e.append(C1276i.Constraint_layout_goneMarginStart, 15);
        f3876e.append(C1276i.Constraint_layout_goneMarginEnd, 12);
        f3876e.append(C1276i.Constraint_layout_constraintVertical_weight, 40);
        f3876e.append(C1276i.Constraint_layout_constraintHorizontal_weight, 39);
        f3876e.append(C1276i.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f3876e.append(C1276i.Constraint_layout_constraintVertical_chainStyle, 42);
        f3876e.append(C1276i.Constraint_layout_constraintHorizontal_bias, 20);
        f3876e.append(C1276i.Constraint_layout_constraintVertical_bias, 37);
        f3876e.append(C1276i.Constraint_layout_constraintDimensionRatio, 5);
        f3876e.append(C1276i.Constraint_layout_constraintLeft_creator, 82);
        f3876e.append(C1276i.Constraint_layout_constraintTop_creator, 82);
        f3876e.append(C1276i.Constraint_layout_constraintRight_creator, 82);
        f3876e.append(C1276i.Constraint_layout_constraintBottom_creator, 82);
        f3876e.append(C1276i.Constraint_layout_constraintBaseline_creator, 82);
        f3876e.append(C1276i.Constraint_android_layout_marginLeft, 24);
        f3876e.append(C1276i.Constraint_android_layout_marginRight, 28);
        f3876e.append(C1276i.Constraint_android_layout_marginStart, 31);
        f3876e.append(C1276i.Constraint_android_layout_marginEnd, 8);
        f3876e.append(C1276i.Constraint_android_layout_marginTop, 34);
        f3876e.append(C1276i.Constraint_android_layout_marginBottom, 2);
        f3876e.append(C1276i.Constraint_android_layout_width, 23);
        f3876e.append(C1276i.Constraint_android_layout_height, 21);
        f3876e.append(C1276i.Constraint_android_visibility, 22);
        f3876e.append(C1276i.Constraint_android_alpha, 43);
        f3876e.append(C1276i.Constraint_android_elevation, 44);
        f3876e.append(C1276i.Constraint_android_rotationX, 45);
        f3876e.append(C1276i.Constraint_android_rotationY, 46);
        f3876e.append(C1276i.Constraint_android_rotation, 60);
        f3876e.append(C1276i.Constraint_android_scaleX, 47);
        f3876e.append(C1276i.Constraint_android_scaleY, 48);
        f3876e.append(C1276i.Constraint_android_transformPivotX, 49);
        f3876e.append(C1276i.Constraint_android_transformPivotY, 50);
        f3876e.append(C1276i.Constraint_android_translationX, 51);
        f3876e.append(C1276i.Constraint_android_translationY, 52);
        f3876e.append(C1276i.Constraint_android_translationZ, 53);
        f3876e.append(C1276i.Constraint_layout_constraintWidth_default, 54);
        f3876e.append(C1276i.Constraint_layout_constraintHeight_default, 55);
        f3876e.append(C1276i.Constraint_layout_constraintWidth_max, 56);
        f3876e.append(C1276i.Constraint_layout_constraintHeight_max, 57);
        f3876e.append(C1276i.Constraint_layout_constraintWidth_min, 58);
        f3876e.append(C1276i.Constraint_layout_constraintHeight_min, 59);
        f3876e.append(C1276i.Constraint_layout_constraintCircle, 61);
        f3876e.append(C1276i.Constraint_layout_constraintCircleRadius, 62);
        f3876e.append(C1276i.Constraint_layout_constraintCircleAngle, 63);
        f3876e.append(C1276i.Constraint_animate_relativeTo, 64);
        f3876e.append(C1276i.Constraint_transitionEasing, 65);
        f3876e.append(C1276i.Constraint_drawPath, 66);
        f3876e.append(C1276i.Constraint_transitionPathRotate, 67);
        f3876e.append(C1276i.Constraint_motionStagger, 79);
        f3876e.append(C1276i.Constraint_android_id, 38);
        f3876e.append(C1276i.Constraint_motionProgress, 68);
        f3876e.append(C1276i.Constraint_layout_constraintWidth_percent, 69);
        f3876e.append(C1276i.Constraint_layout_constraintHeight_percent, 70);
        f3876e.append(C1276i.Constraint_chainUseRtl, 71);
        f3876e.append(C1276i.Constraint_barrierDirection, 72);
        f3876e.append(C1276i.Constraint_barrierMargin, 73);
        f3876e.append(C1276i.Constraint_constraint_referenced_ids, 74);
        f3876e.append(C1276i.Constraint_barrierAllowsGoneWidgets, 75);
        f3876e.append(C1276i.Constraint_pathMotionArc, 76);
        f3876e.append(C1276i.Constraint_layout_constraintTag, 77);
        f3876e.append(C1276i.Constraint_visibilityMode, 78);
        f3876e.append(C1276i.Constraint_layout_constrainedWidth, 80);
        f3876e.append(C1276i.Constraint_layout_constrainedHeight, 81);
    }

    /* renamed from: l */
    private int[] m36598l(View view, String str) {
        int i;
        Object designInformation;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C1275h.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i = ((Integer) designInformation).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* renamed from: m */
    private C1266a m36597m(Context context, AttributeSet attributeSet) {
        C1266a c1266a = new C1266a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1276i.Constraint);
        m36592r(context, c1266a, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return c1266a;
    }

    /* renamed from: n */
    private C1266a m36596n(int i) {
        if (!this.f3879c.containsKey(Integer.valueOf(i))) {
            this.f3879c.put(Integer.valueOf(i), new C1266a());
        }
        return this.f3879c.get(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static int m36593q(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: r */
    private void m36592r(Context context, C1266a c1266a, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != C1276i.Constraint_android_id && C1276i.Constraint_android_layout_marginStart != index && C1276i.Constraint_android_layout_marginEnd != index) {
                c1266a.f3882c.f3950a = true;
                c1266a.f3883d.f3915b = true;
                c1266a.f3881b.f3957a = true;
                c1266a.f3884e.f3963a = true;
            }
            switch (f3876e.get(index)) {
                case 1:
                    C1267b c1267b = c1266a.f3883d;
                    c1267b.f3938p = m36593q(typedArray, index, c1267b.f3938p);
                    break;
                case 2:
                    C1267b c1267b2 = c1266a.f3883d;
                    c1267b2.f3893G = typedArray.getDimensionPixelSize(index, c1267b2.f3893G);
                    break;
                case 3:
                    C1267b c1267b3 = c1266a.f3883d;
                    c1267b3.f3937o = m36593q(typedArray, index, c1267b3.f3937o);
                    break;
                case 4:
                    C1267b c1267b4 = c1266a.f3883d;
                    c1267b4.f3936n = m36593q(typedArray, index, c1267b4.f3936n);
                    break;
                case 5:
                    c1266a.f3883d.f3945w = typedArray.getString(index);
                    break;
                case 6:
                    C1267b c1267b5 = c1266a.f3883d;
                    c1267b5.f3887A = typedArray.getDimensionPixelOffset(index, c1267b5.f3887A);
                    break;
                case 7:
                    C1267b c1267b6 = c1266a.f3883d;
                    c1267b6.f3888B = typedArray.getDimensionPixelOffset(index, c1267b6.f3888B);
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        C1267b c1267b7 = c1266a.f3883d;
                        c1267b7.f3894H = typedArray.getDimensionPixelSize(index, c1267b7.f3894H);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    C1267b c1267b8 = c1266a.f3883d;
                    c1267b8.f3942t = m36593q(typedArray, index, c1267b8.f3942t);
                    break;
                case 10:
                    C1267b c1267b9 = c1266a.f3883d;
                    c1267b9.f3941s = m36593q(typedArray, index, c1267b9.f3941s);
                    break;
                case 11:
                    C1267b c1267b10 = c1266a.f3883d;
                    c1267b10.f3899M = typedArray.getDimensionPixelSize(index, c1267b10.f3899M);
                    break;
                case 12:
                    C1267b c1267b11 = c1266a.f3883d;
                    c1267b11.f3900N = typedArray.getDimensionPixelSize(index, c1267b11.f3900N);
                    break;
                case 13:
                    C1267b c1267b12 = c1266a.f3883d;
                    c1267b12.f3896J = typedArray.getDimensionPixelSize(index, c1267b12.f3896J);
                    break;
                case 14:
                    C1267b c1267b13 = c1266a.f3883d;
                    c1267b13.f3898L = typedArray.getDimensionPixelSize(index, c1267b13.f3898L);
                    break;
                case 15:
                    C1267b c1267b14 = c1266a.f3883d;
                    c1267b14.f3901O = typedArray.getDimensionPixelSize(index, c1267b14.f3901O);
                    break;
                case 16:
                    C1267b c1267b15 = c1266a.f3883d;
                    c1267b15.f3897K = typedArray.getDimensionPixelSize(index, c1267b15.f3897K);
                    break;
                case 17:
                    C1267b c1267b16 = c1266a.f3883d;
                    c1267b16.f3921e = typedArray.getDimensionPixelOffset(index, c1267b16.f3921e);
                    break;
                case 18:
                    C1267b c1267b17 = c1266a.f3883d;
                    c1267b17.f3923f = typedArray.getDimensionPixelOffset(index, c1267b17.f3923f);
                    break;
                case 19:
                    C1267b c1267b18 = c1266a.f3883d;
                    c1267b18.f3925g = typedArray.getFloat(index, c1267b18.f3925g);
                    break;
                case 20:
                    C1267b c1267b19 = c1266a.f3883d;
                    c1267b19.f3943u = typedArray.getFloat(index, c1267b19.f3943u);
                    break;
                case 21:
                    C1267b c1267b20 = c1266a.f3883d;
                    c1267b20.f3919d = typedArray.getLayoutDimension(index, c1267b20.f3919d);
                    break;
                case 22:
                    C1269d c1269d = c1266a.f3881b;
                    c1269d.f3958b = typedArray.getInt(index, c1269d.f3958b);
                    C1269d c1269d2 = c1266a.f3881b;
                    c1269d2.f3958b = f3875d[c1269d2.f3958b];
                    break;
                case 23:
                    C1267b c1267b21 = c1266a.f3883d;
                    c1267b21.f3917c = typedArray.getLayoutDimension(index, c1267b21.f3917c);
                    break;
                case 24:
                    C1267b c1267b22 = c1266a.f3883d;
                    c1267b22.f3890D = typedArray.getDimensionPixelSize(index, c1267b22.f3890D);
                    break;
                case 25:
                    C1267b c1267b23 = c1266a.f3883d;
                    c1267b23.f3927h = m36593q(typedArray, index, c1267b23.f3927h);
                    break;
                case 26:
                    C1267b c1267b24 = c1266a.f3883d;
                    c1267b24.f3929i = m36593q(typedArray, index, c1267b24.f3929i);
                    break;
                case 27:
                    C1267b c1267b25 = c1266a.f3883d;
                    c1267b25.f3889C = typedArray.getInt(index, c1267b25.f3889C);
                    break;
                case 28:
                    C1267b c1267b26 = c1266a.f3883d;
                    c1267b26.f3891E = typedArray.getDimensionPixelSize(index, c1267b26.f3891E);
                    break;
                case 29:
                    C1267b c1267b27 = c1266a.f3883d;
                    c1267b27.f3931j = m36593q(typedArray, index, c1267b27.f3931j);
                    break;
                case 30:
                    C1267b c1267b28 = c1266a.f3883d;
                    c1267b28.f3933k = m36593q(typedArray, index, c1267b28.f3933k);
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT >= 17) {
                        C1267b c1267b29 = c1266a.f3883d;
                        c1267b29.f3895I = typedArray.getDimensionPixelSize(index, c1267b29.f3895I);
                        break;
                    } else {
                        break;
                    }
                case 32:
                    C1267b c1267b30 = c1266a.f3883d;
                    c1267b30.f3939q = m36593q(typedArray, index, c1267b30.f3939q);
                    break;
                case 33:
                    C1267b c1267b31 = c1266a.f3883d;
                    c1267b31.f3940r = m36593q(typedArray, index, c1267b31.f3940r);
                    break;
                case 34:
                    C1267b c1267b32 = c1266a.f3883d;
                    c1267b32.f3892F = typedArray.getDimensionPixelSize(index, c1267b32.f3892F);
                    break;
                case 35:
                    C1267b c1267b33 = c1266a.f3883d;
                    c1267b33.f3935m = m36593q(typedArray, index, c1267b33.f3935m);
                    break;
                case 36:
                    C1267b c1267b34 = c1266a.f3883d;
                    c1267b34.f3934l = m36593q(typedArray, index, c1267b34.f3934l);
                    break;
                case 37:
                    C1267b c1267b35 = c1266a.f3883d;
                    c1267b35.f3944v = typedArray.getFloat(index, c1267b35.f3944v);
                    break;
                case 38:
                    c1266a.f3880a = typedArray.getResourceId(index, c1266a.f3880a);
                    break;
                case 39:
                    C1267b c1267b36 = c1266a.f3883d;
                    c1267b36.f3903Q = typedArray.getFloat(index, c1267b36.f3903Q);
                    break;
                case 40:
                    C1267b c1267b37 = c1266a.f3883d;
                    c1267b37.f3902P = typedArray.getFloat(index, c1267b37.f3902P);
                    break;
                case 41:
                    C1267b c1267b38 = c1266a.f3883d;
                    c1267b38.f3904R = typedArray.getInt(index, c1267b38.f3904R);
                    break;
                case 42:
                    C1267b c1267b39 = c1266a.f3883d;
                    c1267b39.f3905S = typedArray.getInt(index, c1267b39.f3905S);
                    break;
                case 43:
                    C1269d c1269d3 = c1266a.f3881b;
                    c1269d3.f3960d = typedArray.getFloat(index, c1269d3.f3960d);
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C1270e c1270e = c1266a.f3884e;
                        c1270e.f3974l = true;
                        c1270e.f3975m = typedArray.getDimension(index, c1270e.f3975m);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    C1270e c1270e2 = c1266a.f3884e;
                    c1270e2.f3965c = typedArray.getFloat(index, c1270e2.f3965c);
                    break;
                case 46:
                    C1270e c1270e3 = c1266a.f3884e;
                    c1270e3.f3966d = typedArray.getFloat(index, c1270e3.f3966d);
                    break;
                case 47:
                    C1270e c1270e4 = c1266a.f3884e;
                    c1270e4.f3967e = typedArray.getFloat(index, c1270e4.f3967e);
                    break;
                case 48:
                    C1270e c1270e5 = c1266a.f3884e;
                    c1270e5.f3968f = typedArray.getFloat(index, c1270e5.f3968f);
                    break;
                case 49:
                    C1270e c1270e6 = c1266a.f3884e;
                    c1270e6.f3969g = typedArray.getDimension(index, c1270e6.f3969g);
                    break;
                case 50:
                    C1270e c1270e7 = c1266a.f3884e;
                    c1270e7.f3970h = typedArray.getDimension(index, c1270e7.f3970h);
                    break;
                case 51:
                    C1270e c1270e8 = c1266a.f3884e;
                    c1270e8.f3971i = typedArray.getDimension(index, c1270e8.f3971i);
                    break;
                case 52:
                    C1270e c1270e9 = c1266a.f3884e;
                    c1270e9.f3972j = typedArray.getDimension(index, c1270e9.f3972j);
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C1270e c1270e10 = c1266a.f3884e;
                        c1270e10.f3973k = typedArray.getDimension(index, c1270e10.f3973k);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    C1267b c1267b40 = c1266a.f3883d;
                    c1267b40.f3906T = typedArray.getInt(index, c1267b40.f3906T);
                    break;
                case 55:
                    C1267b c1267b41 = c1266a.f3883d;
                    c1267b41.f3907U = typedArray.getInt(index, c1267b41.f3907U);
                    break;
                case 56:
                    C1267b c1267b42 = c1266a.f3883d;
                    c1267b42.f3908V = typedArray.getDimensionPixelSize(index, c1267b42.f3908V);
                    break;
                case 57:
                    C1267b c1267b43 = c1266a.f3883d;
                    c1267b43.f3909W = typedArray.getDimensionPixelSize(index, c1267b43.f3909W);
                    break;
                case 58:
                    C1267b c1267b44 = c1266a.f3883d;
                    c1267b44.f3910X = typedArray.getDimensionPixelSize(index, c1267b44.f3910X);
                    break;
                case 59:
                    C1267b c1267b45 = c1266a.f3883d;
                    c1267b45.f3911Y = typedArray.getDimensionPixelSize(index, c1267b45.f3911Y);
                    break;
                case 60:
                    C1270e c1270e11 = c1266a.f3884e;
                    c1270e11.f3964b = typedArray.getFloat(index, c1270e11.f3964b);
                    break;
                case 61:
                    C1267b c1267b46 = c1266a.f3883d;
                    c1267b46.f3946x = m36593q(typedArray, index, c1267b46.f3946x);
                    break;
                case 62:
                    C1267b c1267b47 = c1266a.f3883d;
                    c1267b47.f3947y = typedArray.getDimensionPixelSize(index, c1267b47.f3947y);
                    break;
                case 63:
                    C1267b c1267b48 = c1266a.f3883d;
                    c1267b48.f3948z = typedArray.getFloat(index, c1267b48.f3948z);
                    break;
                case 64:
                    C1268c c1268c = c1266a.f3882c;
                    c1268c.f3951b = m36593q(typedArray, index, c1268c.f3951b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c1266a.f3882c.f3952c = typedArray.getString(index);
                        break;
                    } else {
                        c1266a.f3882c.f3952c = C7537a.f17920a[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    c1266a.f3882c.f3954e = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C1268c c1268c2 = c1266a.f3882c;
                    c1268c2.f3956g = typedArray.getFloat(index, c1268c2.f3956g);
                    break;
                case 68:
                    C1269d c1269d4 = c1266a.f3881b;
                    c1269d4.f3961e = typedArray.getFloat(index, c1269d4.f3961e);
                    break;
                case 69:
                    c1266a.f3883d.f3912Z = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    c1266a.f3883d.f3914a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    C1267b c1267b49 = c1266a.f3883d;
                    c1267b49.f3916b0 = typedArray.getInt(index, c1267b49.f3916b0);
                    break;
                case 73:
                    C1267b c1267b50 = c1266a.f3883d;
                    c1267b50.f3918c0 = typedArray.getDimensionPixelSize(index, c1267b50.f3918c0);
                    break;
                case 74:
                    c1266a.f3883d.f3924f0 = typedArray.getString(index);
                    break;
                case 75:
                    C1267b c1267b51 = c1266a.f3883d;
                    c1267b51.f3932j0 = typedArray.getBoolean(index, c1267b51.f3932j0);
                    break;
                case 76:
                    C1268c c1268c3 = c1266a.f3882c;
                    c1268c3.f3953d = typedArray.getInt(index, c1268c3.f3953d);
                    break;
                case 77:
                    c1266a.f3883d.f3926g0 = typedArray.getString(index);
                    break;
                case 78:
                    C1269d c1269d5 = c1266a.f3881b;
                    c1269d5.f3959c = typedArray.getInt(index, c1269d5.f3959c);
                    break;
                case 79:
                    C1268c c1268c4 = c1266a.f3882c;
                    c1268c4.f3955f = typedArray.getFloat(index, c1268c4.f3955f);
                    break;
                case 80:
                    C1267b c1267b52 = c1266a.f3883d;
                    c1267b52.f3928h0 = typedArray.getBoolean(index, c1267b52.f3928h0);
                    break;
                case 81:
                    C1267b c1267b53 = c1266a.f3883d;
                    c1267b53.f3930i0 = typedArray.getBoolean(index, c1267b53.f3930i0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f3876e.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f3876e.get(index));
                    break;
            }
        }
    }

    /* renamed from: s */
    private String m36591s(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return OpsMetricTracker.START;
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    /* renamed from: c */
    public void m36607c(ConstraintLayout constraintLayout) {
        m36606d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m36606d(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f3879c.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f3879c.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + C7538a.m18436a(childAt));
            } else if (this.f3878b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id != -1) {
                    if (this.f3879c.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C1266a c1266a = this.f3879c.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            c1266a.f3883d.f3920d0 = 1;
                        }
                        int i2 = c1266a.f3883d.f3920d0;
                        if (i2 != -1 && i2 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(c1266a.f3883d.f3916b0);
                            barrier.setMargin(c1266a.f3883d.f3918c0);
                            barrier.setAllowsGoneWidget(c1266a.f3883d.f3932j0);
                            C1267b c1267b = c1266a.f3883d;
                            int[] iArr = c1267b.f3922e0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = c1267b.f3924f0;
                                if (str != null) {
                                    c1267b.f3922e0 = m36598l(barrier, str);
                                    barrier.setReferencedIds(c1266a.f3883d.f3922e0);
                                }
                            }
                        }
                        ConstraintLayout.C1255b c1255b = (ConstraintLayout.C1255b) childAt.getLayoutParams();
                        c1255b.m36636a();
                        c1266a.m36587d(c1255b);
                        if (z) {
                            C1258a.m36631c(childAt, c1266a.f3885f);
                        }
                        childAt.setLayoutParams(c1255b);
                        C1269d c1269d = c1266a.f3881b;
                        if (c1269d.f3959c == 0) {
                            childAt.setVisibility(c1269d.f3958b);
                        }
                        if (Build.VERSION.SDK_INT >= 17) {
                            childAt.setAlpha(c1266a.f3881b.f3960d);
                            childAt.setRotation(c1266a.f3884e.f3964b);
                            childAt.setRotationX(c1266a.f3884e.f3965c);
                            childAt.setRotationY(c1266a.f3884e.f3966d);
                            childAt.setScaleX(c1266a.f3884e.f3967e);
                            childAt.setScaleY(c1266a.f3884e.f3968f);
                            if (!Float.isNaN(c1266a.f3884e.f3969g)) {
                                childAt.setPivotX(c1266a.f3884e.f3969g);
                            }
                            if (!Float.isNaN(c1266a.f3884e.f3970h)) {
                                childAt.setPivotY(c1266a.f3884e.f3970h);
                            }
                            childAt.setTranslationX(c1266a.f3884e.f3971i);
                            childAt.setTranslationY(c1266a.f3884e.f3972j);
                            if (Build.VERSION.SDK_INT >= 21) {
                                childAt.setTranslationZ(c1266a.f3884e.f3973k);
                                C1270e c1270e = c1266a.f3884e;
                                if (c1270e.f3974l) {
                                    childAt.setElevation(c1270e.f3975m);
                                }
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C1266a c1266a2 = this.f3879c.get(num);
            int i3 = c1266a2.f3883d.f3920d0;
            if (i3 != -1 && i3 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                C1267b c1267b2 = c1266a2.f3883d;
                int[] iArr2 = c1267b2.f3922e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = c1267b2.f3924f0;
                    if (str2 != null) {
                        c1267b2.f3922e0 = m36598l(barrier2, str2);
                        barrier2.setReferencedIds(c1266a2.f3883d.f3922e0);
                    }
                }
                barrier2.setType(c1266a2.f3883d.f3916b0);
                barrier2.setMargin(c1266a2.f3883d.f3918c0);
                ConstraintLayout.C1255b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.m36617n();
                c1266a2.m36587d(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (c1266a2.f3883d.f3913a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.C1255b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                c1266a2.m36587d(generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, generateDefaultLayoutParams2);
            }
        }
    }

    /* renamed from: e */
    public void m36605e(int i, int i2) {
        if (this.f3879c.containsKey(Integer.valueOf(i))) {
            C1266a c1266a = this.f3879c.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    C1267b c1267b = c1266a.f3883d;
                    c1267b.f3929i = -1;
                    c1267b.f3927h = -1;
                    c1267b.f3890D = -1;
                    c1267b.f3896J = -1;
                    return;
                case 2:
                    C1267b c1267b2 = c1266a.f3883d;
                    c1267b2.f3933k = -1;
                    c1267b2.f3931j = -1;
                    c1267b2.f3891E = -1;
                    c1267b2.f3898L = -1;
                    return;
                case 3:
                    C1267b c1267b3 = c1266a.f3883d;
                    c1267b3.f3935m = -1;
                    c1267b3.f3934l = -1;
                    c1267b3.f3892F = -1;
                    c1267b3.f3897K = -1;
                    return;
                case 4:
                    C1267b c1267b4 = c1266a.f3883d;
                    c1267b4.f3936n = -1;
                    c1267b4.f3937o = -1;
                    c1267b4.f3893G = -1;
                    c1267b4.f3899M = -1;
                    return;
                case 5:
                    c1266a.f3883d.f3938p = -1;
                    return;
                case 6:
                    C1267b c1267b5 = c1266a.f3883d;
                    c1267b5.f3939q = -1;
                    c1267b5.f3940r = -1;
                    c1267b5.f3895I = -1;
                    c1267b5.f3901O = -1;
                    return;
                case 7:
                    C1267b c1267b6 = c1266a.f3883d;
                    c1267b6.f3941s = -1;
                    c1267b6.f3942t = -1;
                    c1267b6.f3894H = -1;
                    c1267b6.f3900N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    /* renamed from: f */
    public void m36604f(Context context, int i) {
        m36603g((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    /* renamed from: g */
    public void m36603g(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f3879c.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.C1255b c1255b = (ConstraintLayout.C1255b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f3878b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f3879c.containsKey(Integer.valueOf(id))) {
                this.f3879c.put(Integer.valueOf(id), new C1266a());
            }
            C1266a c1266a = this.f3879c.get(Integer.valueOf(id));
            c1266a.f3885f = C1258a.m36633a(this.f3877a, childAt);
            c1266a.m36585f(id, c1255b);
            c1266a.f3881b.f3958b = childAt.getVisibility();
            if (Build.VERSION.SDK_INT >= 17) {
                c1266a.f3881b.f3960d = childAt.getAlpha();
                c1266a.f3884e.f3964b = childAt.getRotation();
                c1266a.f3884e.f3965c = childAt.getRotationX();
                c1266a.f3884e.f3966d = childAt.getRotationY();
                c1266a.f3884e.f3967e = childAt.getScaleX();
                c1266a.f3884e.f3968f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    C1270e c1270e = c1266a.f3884e;
                    c1270e.f3969g = pivotX;
                    c1270e.f3970h = pivotY;
                }
                c1266a.f3884e.f3971i = childAt.getTranslationX();
                c1266a.f3884e.f3972j = childAt.getTranslationY();
                if (Build.VERSION.SDK_INT >= 21) {
                    c1266a.f3884e.f3973k = childAt.getTranslationZ();
                    C1270e c1270e2 = c1266a.f3884e;
                    if (c1270e2.f3974l) {
                        c1270e2.f3975m = childAt.getElevation();
                    }
                }
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                c1266a.f3883d.f3932j0 = barrier.m36638o();
                c1266a.f3883d.f3922e0 = barrier.getReferencedIds();
                c1266a.f3883d.f3916b0 = barrier.getType();
                c1266a.f3883d.f3918c0 = barrier.getMargin();
            }
        }
    }

    /* renamed from: h */
    public void m36602h(C1271e c1271e) {
        int childCount = c1271e.getChildCount();
        this.f3879c.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = c1271e.getChildAt(i);
            C1271e.C1272a c1272a = (C1271e.C1272a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f3878b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f3879c.containsKey(Integer.valueOf(id))) {
                this.f3879c.put(Integer.valueOf(id), new C1266a());
            }
            C1266a c1266a = this.f3879c.get(Integer.valueOf(id));
            if (childAt instanceof AbstractC1261b) {
                c1266a.m36583h((AbstractC1261b) childAt, id, c1272a);
            }
            c1266a.m36584g(id, c1272a);
        }
    }

    /* renamed from: i */
    public void m36601i(int i, int i2, int i3, int i4) {
        if (!this.f3879c.containsKey(Integer.valueOf(i))) {
            this.f3879c.put(Integer.valueOf(i), new C1266a());
        }
        C1266a c1266a = this.f3879c.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    C1267b c1267b = c1266a.f3883d;
                    c1267b.f3927h = i3;
                    c1267b.f3929i = -1;
                    return;
                } else if (i4 == 2) {
                    C1267b c1267b2 = c1266a.f3883d;
                    c1267b2.f3929i = i3;
                    c1267b2.f3927h = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + m36591s(i4) + " undefined");
                }
            case 2:
                if (i4 == 1) {
                    C1267b c1267b3 = c1266a.f3883d;
                    c1267b3.f3931j = i3;
                    c1267b3.f3933k = -1;
                    return;
                } else if (i4 == 2) {
                    C1267b c1267b4 = c1266a.f3883d;
                    c1267b4.f3933k = i3;
                    c1267b4.f3931j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m36591s(i4) + " undefined");
                }
            case 3:
                if (i4 == 3) {
                    C1267b c1267b5 = c1266a.f3883d;
                    c1267b5.f3934l = i3;
                    c1267b5.f3935m = -1;
                    c1267b5.f3938p = -1;
                    return;
                } else if (i4 == 4) {
                    C1267b c1267b6 = c1266a.f3883d;
                    c1267b6.f3935m = i3;
                    c1267b6.f3934l = -1;
                    c1267b6.f3938p = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m36591s(i4) + " undefined");
                }
            case 4:
                if (i4 == 4) {
                    C1267b c1267b7 = c1266a.f3883d;
                    c1267b7.f3937o = i3;
                    c1267b7.f3936n = -1;
                    c1267b7.f3938p = -1;
                    return;
                } else if (i4 == 3) {
                    C1267b c1267b8 = c1266a.f3883d;
                    c1267b8.f3936n = i3;
                    c1267b8.f3937o = -1;
                    c1267b8.f3938p = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m36591s(i4) + " undefined");
                }
            case 5:
                if (i4 == 5) {
                    C1267b c1267b9 = c1266a.f3883d;
                    c1267b9.f3938p = i3;
                    c1267b9.f3937o = -1;
                    c1267b9.f3936n = -1;
                    c1267b9.f3934l = -1;
                    c1267b9.f3935m = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + m36591s(i4) + " undefined");
            case 6:
                if (i4 == 6) {
                    C1267b c1267b10 = c1266a.f3883d;
                    c1267b10.f3940r = i3;
                    c1267b10.f3939q = -1;
                    return;
                } else if (i4 == 7) {
                    C1267b c1267b11 = c1266a.f3883d;
                    c1267b11.f3939q = i3;
                    c1267b11.f3940r = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m36591s(i4) + " undefined");
                }
            case 7:
                if (i4 == 7) {
                    C1267b c1267b12 = c1266a.f3883d;
                    c1267b12.f3942t = i3;
                    c1267b12.f3941s = -1;
                    return;
                } else if (i4 == 6) {
                    C1267b c1267b13 = c1266a.f3883d;
                    c1267b13.f3941s = i3;
                    c1267b13.f3942t = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m36591s(i4) + " undefined");
                }
            default:
                throw new IllegalArgumentException(m36591s(i2) + " to " + m36591s(i4) + " unknown");
        }
    }

    /* renamed from: j */
    public void m36600j(int i, int i2, int i3, int i4, int i5) {
        if (!this.f3879c.containsKey(Integer.valueOf(i))) {
            this.f3879c.put(Integer.valueOf(i), new C1266a());
        }
        C1266a c1266a = this.f3879c.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    C1267b c1267b = c1266a.f3883d;
                    c1267b.f3927h = i3;
                    c1267b.f3929i = -1;
                } else if (i4 == 2) {
                    C1267b c1267b2 = c1266a.f3883d;
                    c1267b2.f3929i = i3;
                    c1267b2.f3927h = -1;
                } else {
                    throw new IllegalArgumentException("Left to " + m36591s(i4) + " undefined");
                }
                c1266a.f3883d.f3890D = i5;
                return;
            case 2:
                if (i4 == 1) {
                    C1267b c1267b3 = c1266a.f3883d;
                    c1267b3.f3931j = i3;
                    c1267b3.f3933k = -1;
                } else if (i4 == 2) {
                    C1267b c1267b4 = c1266a.f3883d;
                    c1267b4.f3933k = i3;
                    c1267b4.f3931j = -1;
                } else {
                    throw new IllegalArgumentException("right to " + m36591s(i4) + " undefined");
                }
                c1266a.f3883d.f3891E = i5;
                return;
            case 3:
                if (i4 == 3) {
                    C1267b c1267b5 = c1266a.f3883d;
                    c1267b5.f3934l = i3;
                    c1267b5.f3935m = -1;
                    c1267b5.f3938p = -1;
                } else if (i4 == 4) {
                    C1267b c1267b6 = c1266a.f3883d;
                    c1267b6.f3935m = i3;
                    c1267b6.f3934l = -1;
                    c1267b6.f3938p = -1;
                } else {
                    throw new IllegalArgumentException("right to " + m36591s(i4) + " undefined");
                }
                c1266a.f3883d.f3892F = i5;
                return;
            case 4:
                if (i4 == 4) {
                    C1267b c1267b7 = c1266a.f3883d;
                    c1267b7.f3937o = i3;
                    c1267b7.f3936n = -1;
                    c1267b7.f3938p = -1;
                } else if (i4 == 3) {
                    C1267b c1267b8 = c1266a.f3883d;
                    c1267b8.f3936n = i3;
                    c1267b8.f3937o = -1;
                    c1267b8.f3938p = -1;
                } else {
                    throw new IllegalArgumentException("right to " + m36591s(i4) + " undefined");
                }
                c1266a.f3883d.f3893G = i5;
                return;
            case 5:
                if (i4 == 5) {
                    C1267b c1267b9 = c1266a.f3883d;
                    c1267b9.f3938p = i3;
                    c1267b9.f3937o = -1;
                    c1267b9.f3936n = -1;
                    c1267b9.f3934l = -1;
                    c1267b9.f3935m = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + m36591s(i4) + " undefined");
            case 6:
                if (i4 == 6) {
                    C1267b c1267b10 = c1266a.f3883d;
                    c1267b10.f3940r = i3;
                    c1267b10.f3939q = -1;
                } else if (i4 == 7) {
                    C1267b c1267b11 = c1266a.f3883d;
                    c1267b11.f3939q = i3;
                    c1267b11.f3940r = -1;
                } else {
                    throw new IllegalArgumentException("right to " + m36591s(i4) + " undefined");
                }
                c1266a.f3883d.f3895I = i5;
                return;
            case 7:
                if (i4 == 7) {
                    C1267b c1267b12 = c1266a.f3883d;
                    c1267b12.f3942t = i3;
                    c1267b12.f3941s = -1;
                } else if (i4 == 6) {
                    C1267b c1267b13 = c1266a.f3883d;
                    c1267b13.f3941s = i3;
                    c1267b13.f3942t = -1;
                } else {
                    throw new IllegalArgumentException("right to " + m36591s(i4) + " undefined");
                }
                c1266a.f3883d.f3894H = i5;
                return;
            default:
                throw new IllegalArgumentException(m36591s(i2) + " to " + m36591s(i4) + " unknown");
        }
    }

    /* renamed from: k */
    public void m36599k(int i, int i2, int i3, float f) {
        C1267b c1267b = m36596n(i).f3883d;
        c1267b.f3946x = i2;
        c1267b.f3947y = i3;
        c1267b.f3948z = f;
    }

    /* renamed from: o */
    public void m36595o(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    C1266a m36597m = m36597m(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        m36597m.f3883d.f3913a = true;
                    }
                    this.f3879c.put(Integer.valueOf(m36597m.f3880a), m36597m);
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x017b, code lost:
        continue;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m36594p(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C1265d.m36594p(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
