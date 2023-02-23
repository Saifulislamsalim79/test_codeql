package p272h.p286c.p360e.p361a.p363b;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.mlkit.vision.common.internal.C6968b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p272h.p286c.p287a.p300b.p307d.p317j.C8835ad;
import p272h.p286c.p287a.p300b.p307d.p317j.C8854c2;
import p272h.p286c.p287a.p300b.p307d.p317j.C8886e4;
import p272h.p286c.p287a.p300b.p307d.p317j.C8895ed;
import p272h.p286c.p287a.p300b.p307d.p317j.C8985kd;
import p272h.p286c.p287a.p300b.p307d.p317j.C9014mc;
import p272h.p286c.p287a.p300b.p307d.p317j.C9119td;
import p272h.p286c.p287a.p300b.p307d.p317j.C9134ud;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.e.a.b.a */
/* loaded from: classes2.dex */
public class C9397a {

    /* renamed from: a */
    private final Rect f22010a;

    /* renamed from: b */
    private int f22011b;

    /* renamed from: c */
    private final float f22012c;

    /* renamed from: d */
    private final float f22013d;

    /* renamed from: e */
    private final float f22014e;

    /* renamed from: f */
    private final float f22015f;

    /* renamed from: g */
    private final float f22016g;

    /* renamed from: h */
    private final float f22017h;

    /* renamed from: i */
    private final SparseArray f22018i = new SparseArray();

    /* renamed from: j */
    private final SparseArray f22019j = new SparseArray();

    public C9397a(C8886e4 c8886e4, Matrix matrix) {
        C9014mc[] c9014mcArr;
        C8854c2[] c8854c2Arr;
        int length;
        float f = c8886e4.f20883e;
        float f2 = c8886e4.f20885w / 2.0f;
        float f3 = c8886e4.f20884f;
        float f4 = c8886e4.f20886x / 2.0f;
        Rect rect = new Rect((int) (f - f2), (int) (f3 - f4), (int) (f + f2), (int) (f3 + f4));
        this.f22010a = rect;
        if (matrix != null) {
            C6968b.m20418d(rect, matrix);
        }
        this.f22011b = c8886e4.f20882d;
        for (C9014mc c9014mc : c8886e4.f20875B) {
            if (m14835l(c9014mc.f21309f)) {
                PointF pointF = new PointF(c9014mc.f21307d, c9014mc.f21308e);
                if (matrix != null) {
                    C6968b.m20420b(pointF, matrix);
                }
                SparseArray sparseArray = this.f22018i;
                int i = c9014mc.f21309f;
                sparseArray.put(i, new C9403f(i, pointF));
            }
        }
        for (C8854c2 c8854c2 : c8886e4.f20879F) {
            int i2 = c8854c2.f20828d;
            if (m14836k(i2)) {
                PointF[] pointFArr = c8854c2.f20827c;
                if (pointFArr != null) {
                    long length2 = pointFArr.length + 5 + (length / 10);
                    ArrayList arrayList = new ArrayList(length2 > 2147483647L ? Integer.MAX_VALUE : (int) length2);
                    Collections.addAll(arrayList, pointFArr);
                    if (matrix != null) {
                        C6968b.m20419c(arrayList, matrix);
                    }
                    this.f22019j.put(i2, new C9398b(i2, arrayList));
                } else {
                    throw null;
                }
            }
        }
        this.f22015f = c8886e4.f20874A;
        this.f22016g = c8886e4.f20887y;
        this.f22017h = c8886e4.f20888z;
        this.f22014e = c8886e4.f20878E;
        this.f22013d = c8886e4.f20876C;
        this.f22012c = c8886e4.f20877D;
    }

    /* renamed from: k */
    private static boolean m14836k(int i) {
        return i <= 15 && i > 0;
    }

    /* renamed from: l */
    private static boolean m14835l(int i) {
        return i == 0 || i == 1 || i == 7 || i == 3 || i == 9 || i == 4 || i == 10 || i == 5 || i == 11 || i == 6;
    }

    /* renamed from: a */
    public Rect m14846a() {
        return this.f22010a;
    }

    /* renamed from: b */
    public C9398b m14845b(int i) {
        return (C9398b) this.f22019j.get(i);
    }

    /* renamed from: c */
    public C9403f m14844c(int i) {
        return (C9403f) this.f22018i.get(i);
    }

    /* renamed from: d */
    public Float m14843d() {
        float f = this.f22014e;
        if (f < 0.0f || f > 1.0f) {
            return null;
        }
        return Float.valueOf(this.f22013d);
    }

    /* renamed from: e */
    public Float m14842e() {
        float f = this.f22012c;
        if (f < 0.0f || f > 1.0f) {
            return null;
        }
        return Float.valueOf(f);
    }

    /* renamed from: f */
    public Float m14841f() {
        float f = this.f22014e;
        if (f < 0.0f || f > 1.0f) {
            return null;
        }
        return Float.valueOf(f);
    }

    /* renamed from: g */
    public Integer m14840g() {
        int i = this.f22011b;
        if (i == -1) {
            return null;
        }
        return Integer.valueOf(i);
    }

    /* renamed from: h */
    public final SparseArray m14839h() {
        return this.f22019j;
    }

    /* renamed from: i */
    public final void m14838i(SparseArray sparseArray) {
        this.f22019j.clear();
        for (int i = 0; i < sparseArray.size(); i++) {
            this.f22019j.put(sparseArray.keyAt(i), (C9398b) sparseArray.valueAt(i));
        }
    }

    /* renamed from: j */
    public final void m14837j(int i) {
        this.f22011b = -1;
    }

    public String toString() {
        C9119td m15528a = C9134ud.m15528a("Face");
        m15528a.m15538c("boundingBox", this.f22010a);
        m15528a.m15539b("trackingId", this.f22011b);
        m15528a.m15540a("rightEyeOpenProbability", this.f22012c);
        m15528a.m15540a("leftEyeOpenProbability", this.f22013d);
        m15528a.m15540a("smileProbability", this.f22014e);
        m15528a.m15540a("eulerX", this.f22015f);
        m15528a.m15540a("eulerY", this.f22016g);
        m15528a.m15540a("eulerZ", this.f22017h);
        C9119td m15528a2 = C9134ud.m15528a("Landmarks");
        for (int i = 0; i <= 11; i++) {
            if (m14835l(i)) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("landmark_");
                sb.append(i);
                m15528a2.m15538c(sb.toString(), m14844c(i));
            }
        }
        m15528a.m15538c("landmarks", m15528a2.toString());
        C9119td m15528a3 = C9134ud.m15528a("Contours");
        for (int i2 = 1; i2 <= 15; i2++) {
            StringBuilder sb2 = new StringBuilder(19);
            sb2.append("Contour_");
            sb2.append(i2);
            m15528a3.m15538c(sb2.toString(), m14845b(i2));
        }
        m15528a.m15538c("contours", m15528a3.toString());
        return m15528a.toString();
    }

    public C9397a(C8895ed c8895ed, Matrix matrix) {
        Rect m15749d0 = c8895ed.m15749d0();
        this.f22010a = m15749d0;
        if (matrix != null) {
            C6968b.m20418d(m15749d0, matrix);
        }
        this.f22011b = c8895ed.m15750E();
        for (C8985kd c8985kd : c8895ed.m15745h0()) {
            if (m14835l(c8985kd.m15670f())) {
                PointF m15669h = c8985kd.m15669h();
                if (matrix != null) {
                    C6968b.m20420b(m15669h, matrix);
                }
                this.f22018i.put(c8985kd.m15670f(), new C9403f(c8985kd.m15670f(), m15669h));
            }
        }
        for (C8835ad c8835ad : c8895ed.m15748e0()) {
            int m15815f = c8835ad.m15815f();
            if (m14836k(m15815f)) {
                List m15814h = c8835ad.m15814h();
                if (m15814h != null) {
                    ArrayList arrayList = new ArrayList(m15814h);
                    if (matrix != null) {
                        C6968b.m20419c(arrayList, matrix);
                    }
                    this.f22019j.put(m15815f, new C9398b(m15815f, arrayList));
                } else {
                    throw null;
                }
            }
        }
        this.f22015f = c8895ed.m15741u();
        this.f22016g = c8895ed.m15746h();
        this.f22017h = -c8895ed.m15743l();
        this.f22014e = c8895ed.m15742s();
        this.f22013d = c8895ed.m15747f();
        this.f22012c = c8895ed.m15744k();
    }
}
