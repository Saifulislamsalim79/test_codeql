package com.google.firebase.inappmessaging.model;

import android.text.TextUtils;
import com.google.common.base.C5051n;
import com.google.firebase.inappmessaging.C5999a0;
import com.google.firebase.inappmessaging.C6002b0;
import com.google.firebase.inappmessaging.C6005c0;
import com.google.firebase.inappmessaging.C6010d0;
import com.google.firebase.inappmessaging.C6128e0;
import com.google.firebase.inappmessaging.C6131f0;
import com.google.firebase.inappmessaging.C6135g0;
import com.google.firebase.inappmessaging.C6418z;
import com.google.firebase.inappmessaging.model.C6365a;
import com.google.firebase.inappmessaging.model.C6371c;
import com.google.firebase.inappmessaging.model.C6374d;
import com.google.firebase.inappmessaging.model.C6378f;
import com.google.firebase.inappmessaging.model.C6381g;
import com.google.firebase.inappmessaging.model.C6383h;
import com.google.firebase.inappmessaging.model.C6387j;
import com.google.firebase.inappmessaging.model.C6397n;
import com.google.firebase.inappmessaging.p154j0.C6163c3;
import java.util.Map;
/* compiled from: ProtoMarshallerClient.java */
/* renamed from: com.google.firebase.inappmessaging.model.k */
/* loaded from: classes2.dex */
public class C6390k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProtoMarshallerClient.java */
    /* renamed from: com.google.firebase.inappmessaging.model.k$a */
    /* loaded from: classes2.dex */
    public class C6391a extends AbstractC6386i {
        C6391a(C6377e c6377e, MessageType messageType, Map map) {
            super(c6377e, messageType, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProtoMarshallerClient.java */
    /* renamed from: com.google.firebase.inappmessaging.model.k$b */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C6392b {

        /* renamed from: a */
        static final /* synthetic */ int[] f15468a;

        static {
            int[] iArr = new int[C6010d0.EnumC6012b.values().length];
            f15468a = iArr;
            try {
                iArr[C6010d0.EnumC6012b.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15468a[C6010d0.EnumC6012b.IMAGE_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15468a[C6010d0.EnumC6012b.MODAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15468a[C6010d0.EnumC6012b.CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    private static C6365a.C6367b m22138a(C6418z c6418z) {
        C6365a.C6367b m22203a = C6365a.m22203a();
        if (!TextUtils.isEmpty(c6418z.m22080S())) {
            m22203a.m22199b(c6418z.m22080S());
        }
        return m22203a;
    }

    /* renamed from: b */
    private static C6365a m22137b(C6418z c6418z, C6002b0 c6002b0) {
        C6365a.C6367b m22138a = m22138a(c6418z);
        if (!c6002b0.equals(C6002b0.m23046T())) {
            C6374d.C6376b m22186a = C6374d.m22186a();
            if (!TextUtils.isEmpty(c6002b0.m23047S())) {
                m22186a.m22182b(c6002b0.m23047S());
            }
            if (c6002b0.m23044V()) {
                C6397n.C6399b m22118a = C6397n.m22118a();
                C6135g0 m23045U = c6002b0.m23045U();
                if (!TextUtils.isEmpty(m23045U.m22640U())) {
                    m22118a.m22113c(m23045U.m22640U());
                }
                if (!TextUtils.isEmpty(m23045U.m22641T())) {
                    m22118a.m22114b(m23045U.m22641T());
                }
                m22186a.m22181c(m22118a.m22115a());
            }
            m22138a.m22198c(m22186a.m22183a());
        }
        return m22138a.m22200a();
    }

    /* renamed from: c */
    public static AbstractC6386i m22136c(C6010d0 c6010d0, String str, String str2, boolean z, Map<String, String> map) {
        C5051n.m25779o(c6010d0, "FirebaseInAppMessaging content cannot be null.");
        C5051n.m25779o(str, "FirebaseInAppMessaging campaign id cannot be null.");
        C5051n.m25779o(str2, "FirebaseInAppMessaging campaign name cannot be null.");
        C6163c3.m22621a("Decoding message: " + c6010d0.toString());
        C6377e c6377e = new C6377e(str, str2, z);
        int i = C6392b.f15468a[c6010d0.m22995W().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return new C6391a(new C6377e(str, str2, z), MessageType.UNSUPPORTED, map);
                    }
                    return m22133f(c6010d0.m22998T()).m22169a(c6377e, map);
                }
                return m22131h(c6010d0.m22994X()).m22144a(c6377e, map);
            }
            return m22132g(c6010d0.m22996V()).m22155a(c6377e, map);
        }
        return m22134e(c6010d0.m22999S()).m22192a(c6377e, map);
    }

    /* renamed from: d */
    private static C6397n m22135d(C6135g0 c6135g0) {
        C6397n.C6399b m22118a = C6397n.m22118a();
        if (!TextUtils.isEmpty(c6135g0.m22641T())) {
            m22118a.m22114b(c6135g0.m22641T());
        }
        if (!TextUtils.isEmpty(c6135g0.m22640U())) {
            m22118a.m22113c(c6135g0.m22640U());
        }
        return m22118a.m22115a();
    }

    /* renamed from: e */
    private static C6371c.C6373b m22134e(C5999a0 c5999a0) {
        C6371c.C6373b m22197d = C6371c.m22197d();
        if (!TextUtils.isEmpty(c5999a0.m23056T())) {
            m22197d.m22190c(c5999a0.m23056T());
        }
        if (!TextUtils.isEmpty(c5999a0.m23053W())) {
            C6381g.C6382a m22161a = C6381g.m22161a();
            m22161a.m22158b(c5999a0.m23053W());
            m22197d.m22188e(m22161a.m22159a());
        }
        if (c5999a0.m23051Y()) {
            m22197d.m22191b(m22138a(c5999a0.m23057S()).m22200a());
        }
        if (c5999a0.m23050Z()) {
            m22197d.m22189d(m22135d(c5999a0.m23055U()));
        }
        if (c5999a0.m23049a0()) {
            m22197d.m22187f(m22135d(c5999a0.m23052X()));
        }
        return m22197d;
    }

    /* renamed from: f */
    private static C6378f.C6380b m22133f(C6005c0 c6005c0) {
        C6378f.C6380b m22177d = C6378f.m22177d();
        if (c6005c0.m23027h0()) {
            m22177d.m22162h(m22135d(c6005c0.m23033b0()));
        }
        if (c6005c0.m23032c0()) {
            m22177d.m22167c(m22135d(c6005c0.m23041T()));
        }
        if (!TextUtils.isEmpty(c6005c0.m23042S())) {
            m22177d.m22168b(c6005c0.m23042S());
        }
        if (c6005c0.m23031d0() || c6005c0.m23030e0()) {
            m22177d.m22164f(m22137b(c6005c0.m23037X(), c6005c0.m23036Y()));
        }
        if (c6005c0.m23029f0() || c6005c0.m23028g0()) {
            m22177d.m22163g(m22137b(c6005c0.m23035Z(), c6005c0.m23034a0()));
        }
        if (!TextUtils.isEmpty(c6005c0.m23038W())) {
            C6381g.C6382a m22161a = C6381g.m22161a();
            m22161a.m22158b(c6005c0.m23038W());
            m22177d.m22165e(m22161a.m22159a());
        }
        if (!TextUtils.isEmpty(c6005c0.m23039V())) {
            C6381g.C6382a m22161a2 = C6381g.m22161a();
            m22161a2.m22158b(c6005c0.m23039V());
            m22177d.m22166d(m22161a2.m22159a());
        }
        return m22177d;
    }

    /* renamed from: g */
    private static C6383h.C6385b m22132g(C6128e0 c6128e0) {
        C6383h.C6385b m22157d = C6383h.m22157d();
        if (!TextUtils.isEmpty(c6128e0.m22659U())) {
            C6381g.C6382a m22161a = C6381g.m22161a();
            m22161a.m22158b(c6128e0.m22659U());
            m22157d.m22153c(m22161a.m22159a());
        }
        if (c6128e0.m22658V()) {
            m22157d.m22154b(m22138a(c6128e0.m22661S()).m22200a());
        }
        return m22157d;
    }

    /* renamed from: h */
    private static C6387j.C6389b m22131h(C6131f0 c6131f0) {
        C6387j.C6389b m22149d = C6387j.m22149d();
        if (!TextUtils.isEmpty(c6131f0.m22654U())) {
            m22149d.m22142c(c6131f0.m22654U());
        }
        if (!TextUtils.isEmpty(c6131f0.m22651X())) {
            C6381g.C6382a m22161a = C6381g.m22161a();
            m22161a.m22158b(c6131f0.m22651X());
            m22149d.m22140e(m22161a.m22159a());
        }
        if (c6131f0.m22649Z()) {
            m22149d.m22143b(m22137b(c6131f0.m22656S(), c6131f0.m22655T()));
        }
        if (c6131f0.m22648a0()) {
            m22149d.m22141d(m22135d(c6131f0.m22653V()));
        }
        if (c6131f0.m22647b0()) {
            m22149d.m22139f(m22135d(c6131f0.m22650Y()));
        }
        return m22149d;
    }
}
