package com.google.mlkit.vision.face.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.C2834f;
import com.google.android.gms.dynamic.BinderC2989b;
import com.google.android.gms.dynamic.InterfaceC2987a;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.p186b.C6943m;
import java.util.List;
import p272h.p286c.p287a.p300b.p307d.p317j.AbstractBinderC8982ka;
import p272h.p286c.p287a.p300b.p307d.p317j.C8918g6;
import p272h.p286c.p287a.p300b.p307d.p317j.C8950i8;
import p272h.p286c.p287a.p300b.p307d.p317j.C8984kc;
import p272h.p286c.p287a.p300b.p307d.p317j.EnumC8981k9;
import p272h.p286c.p287a.p300b.p307d.p317j.InterfaceC8998lb;
import p272h.p286c.p360e.p361a.p362a.C9395a;
import p272h.p286c.p360e.p361a.p363b.C9401e;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: com.google.mlkit.vision.face.internal.m */
/* loaded from: classes2.dex */
final class C6989m implements InterfaceC6978b {

    /* renamed from: a */
    private boolean f16734a;

    /* renamed from: b */
    private final Context f16735b;

    /* renamed from: c */
    private final C9401e f16736c;

    /* renamed from: d */
    private final int f16737d;

    /* renamed from: e */
    private final C8984kc f16738e;

    /* renamed from: f */
    private C8950i8 f16739f;

    /* renamed from: g */
    private C8950i8 f16740g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6989m(Context context, C9401e c9401e, C8984kc c8984kc) {
        this.f16735b = context;
        this.f16736c = c9401e;
        this.f16737d = C2834f.m31847f().m31852a(context);
        this.f16738e = c8984kc;
    }

    /* renamed from: b */
    static int m20383b(int i) {
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            StringBuilder sb = new StringBuilder(40);
            sb.append("Invalid classification type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return 0;
    }

    /* renamed from: c */
    static int m20382c(int i) {
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            StringBuilder sb = new StringBuilder(34);
            sb.append("Invalid landmark type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return 0;
    }

    /* renamed from: e */
    private static int m20380e(int i) {
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            StringBuilder sb = new StringBuilder(30);
            sb.append("Invalid mode type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a4 A[LOOP:0: B:12:0x00a2->B:13:0x00a4, LOOP_END] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List m20379f(p272h.p286c.p287a.p300b.p307d.p317j.C8950i8 r15, p272h.p286c.p360e.p361a.p362a.C9395a r16) throws com.google.mlkit.common.MlKitException {
        /*
            r14 = this;
            h.c.a.b.d.j.nd r11 = new h.c.a.b.d.j.nd     // Catch: android.os.RemoteException -> Lb8
            int r2 = r16.m14850j()     // Catch: android.os.RemoteException -> Lb8
            int r3 = r16.m14854f()     // Catch: android.os.RemoteException -> Lb8
            r4 = 0
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: android.os.RemoteException -> Lb8
            int r0 = r16.m14851i()     // Catch: android.os.RemoteException -> Lb8
            int r7 = com.google.mlkit.vision.common.internal.C6968b.m20421a(r0)     // Catch: android.os.RemoteException -> Lb8
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r7)     // Catch: android.os.RemoteException -> Lb8
            int r0 = r16.m14855e()     // Catch: android.os.RemoteException -> Lb8
            r1 = 35
            r12 = 0
            if (r0 != r1) goto L88
            r13 = r14
            int r0 = r13.f16737d     // Catch: android.os.RemoteException -> Lb6
            r1 = 201500000(0xc02a560, float:1.0064601E-31)
            if (r0 < r1) goto L89
            android.media.Image$Plane[] r0 = r16.m14852h()     // Catch: android.os.RemoteException -> Lb6
            com.google.android.gms.common.internal.s.j(r0)     // Catch: android.os.RemoteException -> Lb6
            android.media.Image$Plane[] r0 = (android.media.Image.Plane[]) r0     // Catch: android.os.RemoteException -> Lb6
            r1 = r0[r12]     // Catch: android.os.RemoteException -> Lb6
            java.nio.ByteBuffer r1 = r1.getBuffer()     // Catch: android.os.RemoteException -> Lb6
            com.google.android.gms.dynamic.a r2 = com.google.android.gms.dynamic.BinderC2989b.m31494p1(r1)     // Catch: android.os.RemoteException -> Lb6
            r1 = 1
            r3 = r0[r1]     // Catch: android.os.RemoteException -> Lb6
            java.nio.ByteBuffer r3 = r3.getBuffer()     // Catch: android.os.RemoteException -> Lb6
            com.google.android.gms.dynamic.a r3 = com.google.android.gms.dynamic.BinderC2989b.m31494p1(r3)     // Catch: android.os.RemoteException -> Lb6
            r4 = 2
            r5 = r0[r4]     // Catch: android.os.RemoteException -> Lb6
            java.nio.ByteBuffer r5 = r5.getBuffer()     // Catch: android.os.RemoteException -> Lb6
            com.google.android.gms.dynamic.a r5 = com.google.android.gms.dynamic.BinderC2989b.m31494p1(r5)     // Catch: android.os.RemoteException -> Lb6
            r6 = r0[r12]     // Catch: android.os.RemoteException -> Lb6
            int r6 = r6.getPixelStride()     // Catch: android.os.RemoteException -> Lb6
            r7 = r0[r1]     // Catch: android.os.RemoteException -> Lb6
            int r7 = r7.getPixelStride()     // Catch: android.os.RemoteException -> Lb6
            r8 = r0[r4]     // Catch: android.os.RemoteException -> Lb6
            int r8 = r8.getPixelStride()     // Catch: android.os.RemoteException -> Lb6
            r9 = r0[r12]     // Catch: android.os.RemoteException -> Lb6
            int r9 = r9.getRowStride()     // Catch: android.os.RemoteException -> Lb6
            r1 = r0[r1]     // Catch: android.os.RemoteException -> Lb6
            int r10 = r1.getRowStride()     // Catch: android.os.RemoteException -> Lb6
            r0 = r0[r4]     // Catch: android.os.RemoteException -> Lb6
            int r0 = r0.getRowStride()     // Catch: android.os.RemoteException -> Lb6
            r1 = r15
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r0
            h.c.a.b.d.j.e4[] r0 = r1.m15697r1(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: android.os.RemoteException -> Lb6
            r1 = r16
            goto L9c
        L88:
            r13 = r14
        L89:
            com.google.mlkit.vision.common.internal.c r0 = com.google.mlkit.vision.common.internal.C6969c.m20415c()     // Catch: android.os.RemoteException -> Lb6
            r1 = r16
            java.nio.ByteBuffer r0 = r0.m20416b(r1, r12)     // Catch: android.os.RemoteException -> Lb6
            com.google.android.gms.dynamic.a r0 = com.google.android.gms.dynamic.BinderC2989b.m31494p1(r0)     // Catch: android.os.RemoteException -> Lb6
            r2 = r15
            h.c.a.b.d.j.e4[] r0 = r15.m15698q1(r0, r11)     // Catch: android.os.RemoteException -> Lb6
        L9c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r0.length
        La2:
            if (r12 >= r3) goto Lb5
            r4 = r0[r12]
            h.c.e.a.b.a r5 = new h.c.e.a.b.a
            android.graphics.Matrix r6 = r16.m14856d()
            r5.<init>(r4, r6)
            r2.add(r5)
            int r12 = r12 + 1
            goto La2
        Lb5:
            return r2
        Lb6:
            r0 = move-exception
            goto Lba
        Lb8:
            r0 = move-exception
            r13 = r14
        Lba:
            com.google.mlkit.common.MlKitException r1 = new com.google.mlkit.common.MlKitException
            r2 = 13
            java.lang.String r3 = "Failed to detect with legacy face detector"
            r1.<init>(r3, r2, r0)
            goto Lc5
        Lc4:
            throw r1
        Lc5:
            goto Lc4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.face.internal.C6989m.m20379f(h.c.a.b.d.j.i8, h.c.e.a.a.a):java.util.List");
    }

    @Override // com.google.mlkit.vision.face.internal.InterfaceC6978b
    /* renamed from: a */
    public final Pair mo20384a(C9395a c9395a) throws MlKitException {
        List list;
        if (this.f16739f == null && this.f16740g == null) {
            mo20381d();
        }
        C8950i8 c8950i8 = this.f16739f;
        if (c8950i8 == null && this.f16740g == null) {
            throw new MlKitException("Waiting for the face detection module to be downloaded. Please wait.", 14);
        }
        List list2 = null;
        if (c8950i8 != null) {
            list = m20379f(c8950i8, c9395a);
            if (!this.f16736c.m14826g()) {
                C6984h.m20393j(list);
            }
        } else {
            list = null;
        }
        C8950i8 c8950i82 = this.f16740g;
        if (c8950i82 != null) {
            list2 = m20379f(c8950i82, c9395a);
            C6984h.m20393j(list2);
        }
        return new Pair(list, list2);
    }

    @Override // com.google.mlkit.vision.face.internal.InterfaceC6978b
    /* renamed from: d */
    public final boolean mo20381d() throws MlKitException {
        if (this.f16739f == null && this.f16740g == null) {
            try {
                InterfaceC8998lb m15680m = AbstractBinderC8982ka.m15680m(DynamiteModule.m31489e(this.f16735b, DynamiteModule.f8160b, "com.google.android.gms.vision.dynamite").m31490d("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"));
                InterfaceC2987a m31494p1 = BinderC2989b.m31494p1(this.f16735b);
                if (this.f16736c.m14830c() == 2) {
                    if (this.f16740g == null) {
                        this.f16740g = m15680m.mo15658x0(m31494p1, new C8918g6(2, 2, 0, true, false, this.f16736c.m14832a()));
                    }
                    if ((this.f16736c.m14829d() == 2 || this.f16736c.m14831b() == 2 || this.f16736c.m14828e() == 2) && this.f16739f == null) {
                        this.f16739f = m15680m.mo15658x0(m31494p1, new C8918g6(m20380e(this.f16736c.m14828e()), m20382c(this.f16736c.m14829d()), m20383b(this.f16736c.m14831b()), false, this.f16736c.m14826g(), this.f16736c.m14832a()));
                    }
                } else if (this.f16739f == null) {
                    this.f16739f = m15680m.mo15658x0(m31494p1, new C8918g6(m20380e(this.f16736c.m14828e()), m20382c(this.f16736c.m14829d()), m20383b(this.f16736c.m14831b()), false, this.f16736c.m14826g(), this.f16736c.m14832a()));
                }
                if (this.f16739f == null && this.f16740g == null && !this.f16734a) {
                    Log.d("LegacyFaceDelegate", "Request face optional module download.");
                    C6943m.m20435a(this.f16735b, "barcode");
                    this.f16734a = true;
                }
                C6986j.m20387c(this.f16738e, false, EnumC8981k9.NO_ERROR);
                return false;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to create legacy face detector.", 13, e);
            } catch (DynamiteModule.LoadingException e2) {
                throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e2);
            }
        }
        return false;
    }

    @Override // com.google.mlkit.vision.face.internal.InterfaceC6978b
    public final void zzb() {
        C8950i8 c8950i8 = this.f16739f;
        if (c8950i8 != null) {
            try {
                c8950i8.m15699p1();
            } catch (RemoteException e) {
                Log.e("LegacyFaceDelegate", "Failed to release legacy face detector.", e);
            }
            this.f16739f = null;
        }
        C8950i8 c8950i82 = this.f16740g;
        if (c8950i82 != null) {
            try {
                c8950i82.m15699p1();
            } catch (RemoteException e2) {
                Log.e("LegacyFaceDelegate", "Failed to release legacy face detector.", e2);
            }
            this.f16740g = null;
        }
    }
}
