package com.google.mlkit.vision.face.internal;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamic.BinderC2989b;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.p186b.C6943m;
import com.google.mlkit.vision.common.internal.C6968b;
import com.google.mlkit.vision.common.internal.C6969c;
import com.google.mlkit.vision.common.internal.C6970d;
import java.util.ArrayList;
import java.util.List;
import p272h.p286c.p287a.p300b.p307d.p317j.AbstractBinderC8955id;
import p272h.p286c.p287a.p300b.p307d.p317j.C8865cd;
import p272h.p286c.p287a.p300b.p307d.p317j.C8895ed;
import p272h.p286c.p287a.p300b.p307d.p317j.C8925gd;
import p272h.p286c.p287a.p300b.p307d.p317j.C8984kc;
import p272h.p286c.p287a.p300b.p307d.p317j.C9175xc;
import p272h.p286c.p287a.p300b.p307d.p317j.C9189yc;
import p272h.p286c.p287a.p300b.p307d.p317j.EnumC8981k9;
import p272h.p286c.p360e.p361a.p362a.C9395a;
import p272h.p286c.p360e.p361a.p363b.C9397a;
import p272h.p286c.p360e.p361a.p363b.C9401e;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: com.google.mlkit.vision.face.internal.a */
/* loaded from: classes2.dex */
final class C6977a implements InterfaceC6978b {

    /* renamed from: a */
    private final Context f16703a;

    /* renamed from: b */
    private final C9401e f16704b;

    /* renamed from: c */
    private boolean f16705c;

    /* renamed from: d */
    private boolean f16706d;

    /* renamed from: e */
    private boolean f16707e;

    /* renamed from: f */
    private final C8984kc f16708f;

    /* renamed from: g */
    private C8925gd f16709g;

    /* renamed from: h */
    private C8925gd f16710h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6977a(Context context, C9401e c9401e, C8984kc c8984kc) {
        this.f16703a = context;
        this.f16704b = c9401e;
        this.f16708f = c8984kc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m20404b(Context context) {
        return DynamiteModule.m31493a(context, "com.google.mlkit.dynamite.face") > 0;
    }

    /* renamed from: e */
    private final void m20402e() throws DynamiteModule.LoadingException, RemoteException {
        if (this.f16704b.m14830c() != 2) {
            if (this.f16710h == null) {
                this.f16710h = m20401f(new C8865cd(this.f16704b.m14828e(), this.f16704b.m14829d(), this.f16704b.m14831b(), 1, this.f16704b.m14826g(), this.f16704b.m14832a()));
                return;
            }
            return;
        }
        if (this.f16709g == null) {
            this.f16709g = m20401f(new C8865cd(this.f16704b.m14828e(), 1, 1, 2, false, this.f16704b.m14832a()));
        }
        if ((this.f16704b.m14829d() == 2 || this.f16704b.m14831b() == 2 || this.f16704b.m14828e() == 2) && this.f16710h == null) {
            this.f16710h = m20401f(new C8865cd(this.f16704b.m14828e(), this.f16704b.m14829d(), this.f16704b.m14831b(), 1, this.f16704b.m14826g(), this.f16704b.m14832a()));
        }
    }

    /* renamed from: f */
    private final C8925gd m20401f(C8865cd c8865cd) throws DynamiteModule.LoadingException, RemoteException {
        if (this.f16706d) {
            DynamiteModule.InterfaceC2991a interfaceC2991a = DynamiteModule.f8161c;
            C9175xc.m15514a();
            return m20403c(interfaceC2991a, "com.google.mlkit.dynamite.face", "com.google.android.gms.vision.face.mlkit.FaceDetectorCreator", c8865cd);
        }
        return m20403c(DynamiteModule.f8160b, "com.google.android.gms.vision.face", "com.google.android.gms.vision.face.mlkit.FaceDetectorCreator", c8865cd);
    }

    /* renamed from: g */
    private static List m20400g(C8925gd c8925gd, C9395a c9395a) throws MlKitException {
        if (c9395a.m14855e() == -1) {
            c9395a = C9395a.m14859a(C6969c.m20415c().m20416b(c9395a, false), c9395a.m14850j(), c9395a.m14854f(), c9395a.m14851i(), 17);
        }
        try {
            List<C8895ed> m15705p1 = c8925gd.m15705p1(C6970d.m20410b().m20411a(c9395a), new C9189yc(c9395a.m14855e(), c9395a.m14850j(), c9395a.m14854f(), C6968b.m20421a(c9395a.m14851i()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            for (C8895ed c8895ed : m15705p1) {
                arrayList.add(new C9397a(c8895ed, c9395a.m14856d()));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new MlKitException("Failed to run face detector.", 13, e);
        }
    }

    @Override // com.google.mlkit.vision.face.internal.InterfaceC6978b
    /* renamed from: a */
    public final Pair mo20384a(C9395a c9395a) throws MlKitException {
        List list;
        if (this.f16710h == null && this.f16709g == null) {
            mo20381d();
        }
        if (!this.f16705c) {
            try {
                C8925gd c8925gd = this.f16710h;
                if (c8925gd != null) {
                    c8925gd.m15704q1();
                }
                C8925gd c8925gd2 = this.f16709g;
                if (c8925gd2 != null) {
                    c8925gd2.m15704q1();
                }
                this.f16705c = true;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to init face detector.", 13, e);
            }
        }
        C8925gd c8925gd3 = this.f16710h;
        List list2 = null;
        if (c8925gd3 != null) {
            list = m20400g(c8925gd3, c9395a);
            if (!this.f16704b.m14826g()) {
                C6984h.m20393j(list);
            }
        } else {
            list = null;
        }
        C8925gd c8925gd4 = this.f16709g;
        if (c8925gd4 != null) {
            list2 = m20400g(c8925gd4, c9395a);
            C6984h.m20393j(list2);
        }
        return new Pair(list, list2);
    }

    /* renamed from: c */
    final C8925gd m20403c(DynamiteModule.InterfaceC2991a interfaceC2991a, String str, String str2, C8865cd c8865cd) throws DynamiteModule.LoadingException, RemoteException {
        return AbstractBinderC8955id.m15696m(DynamiteModule.m31489e(this.f16703a, interfaceC2991a, str).m31490d("com.google.android.gms.vision.face.mlkit.FaceDetectorCreator")).mo15694O(BinderC2989b.m31494p1(this.f16703a), c8865cd);
    }

    @Override // com.google.mlkit.vision.face.internal.InterfaceC6978b
    /* renamed from: d */
    public final boolean mo20381d() throws MlKitException {
        if (this.f16710h == null && this.f16709g == null) {
            if (DynamiteModule.m31493a(this.f16703a, "com.google.mlkit.dynamite.face") > 0) {
                this.f16706d = true;
                try {
                    m20402e();
                } catch (RemoteException e) {
                    throw new MlKitException("Failed to create thick face detector.", 13, e);
                } catch (DynamiteModule.LoadingException e2) {
                    throw new MlKitException("Failed to load the bundled face module.", 13, e2);
                }
            } else {
                this.f16706d = false;
                try {
                    m20402e();
                } catch (RemoteException e3) {
                    C6986j.m20387c(this.f16708f, this.f16706d, EnumC8981k9.OPTIONAL_MODULE_INIT_ERROR);
                    throw new MlKitException("Failed to create thin face detector.", 13, e3);
                } catch (DynamiteModule.LoadingException unused) {
                    if (!this.f16707e) {
                        C6943m.m20435a(this.f16703a, "face");
                        this.f16707e = true;
                    }
                    C6986j.m20387c(this.f16708f, this.f16706d, EnumC8981k9.OPTIONAL_MODULE_NOT_AVAILABLE);
                    throw new MlKitException("Waiting for the face module to be downloaded. Please wait.", 14);
                }
            }
            C6986j.m20387c(this.f16708f, this.f16706d, EnumC8981k9.NO_ERROR);
            return this.f16706d;
        }
        return this.f16706d;
    }

    @Override // com.google.mlkit.vision.face.internal.InterfaceC6978b
    public final void zzb() {
        try {
            C8925gd c8925gd = this.f16710h;
            if (c8925gd != null) {
                c8925gd.m15703r1();
                this.f16710h = null;
            }
            C8925gd c8925gd2 = this.f16709g;
            if (c8925gd2 != null) {
                c8925gd2.m15703r1();
                this.f16709g = null;
            }
        } catch (RemoteException e) {
            Log.e("DecoupledFaceDelegate", "Failed to release face detector.", e);
        }
        this.f16705c = false;
    }
}
