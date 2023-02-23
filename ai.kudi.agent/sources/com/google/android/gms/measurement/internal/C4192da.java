package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.C3713b;
import com.google.android.gms.internal.measurement.C3717b3;
import com.google.android.gms.internal.measurement.C3718b4;
import com.google.android.gms.internal.measurement.C3749d3;
import com.google.android.gms.internal.measurement.C3750d4;
import com.google.android.gms.internal.measurement.C3765e4;
import com.google.android.gms.internal.measurement.C3779f4;
import com.google.android.gms.internal.measurement.C3810h3;
import com.google.android.gms.internal.measurement.C3827i4;
import com.google.android.gms.internal.measurement.C3842j3;
import com.google.android.gms.internal.measurement.C3843j4;
import com.google.android.gms.internal.measurement.C3905n3;
import com.google.android.gms.internal.measurement.C3906n4;
import com.google.android.gms.internal.measurement.C3922o4;
import com.google.android.gms.internal.measurement.C3937p4;
import com.google.android.gms.internal.measurement.C4009td;
import com.google.android.gms.internal.measurement.C4032v4;
import com.google.android.gms.internal.measurement.C4064x4;
import com.google.android.gms.internal.measurement.C4080y4;
import com.google.android.gms.internal.measurement.C4096z4;
import com.google.android.gms.internal.measurement.C4099z7;
import com.google.android.gms.internal.measurement.InterfaceC3911n9;
import com.google.android.gms.internal.measurement.zzkh;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.da */
/* loaded from: classes2.dex */
public final class C4192da extends AbstractC4353r9 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4192da(C4168ba c4168ba) {
        super(c4168ba);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static <Builder extends InterfaceC3911n9> Builder m28300D(Builder builder, byte[] bArr) throws zzkh {
        C4099z7 m28537b = C4099z7.m28537b();
        if (m28537b != null) {
            builder.mo28543Q0(bArr, m28537b);
            return builder;
        }
        builder.mo28544L0(bArr);
        return builder;
    }

    /* renamed from: H */
    static List<C3843j4> m28296H(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                C3827i4 m29488A = C3843j4.m29488A();
                for (String str : bundle.keySet()) {
                    C3827i4 m29488A2 = C3843j4.m29488A();
                    m29488A2.m29530A(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        m29488A2.m29520z(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        m29488A2.m29529B((String) obj);
                    } else if (obj instanceof Double) {
                        m29488A2.m29521y(((Double) obj).doubleValue());
                    }
                    m29488A.m29526t(m29488A2);
                }
                if (m29488A.m29528r() > 0) {
                    arrayList.add(m29488A.m29456k());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static List<Long> m28294J(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static boolean m28290N(List<Long> list, int i) {
        if (i < list.size() * 64) {
            return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public static boolean m28288P(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static final void m28286m(C3765e4 c3765e4, String str, Object obj) {
        List<C3843j4> m29666G = c3765e4.m29666G();
        int i = 0;
        while (true) {
            if (i >= m29666G.size()) {
                i = -1;
                break;
            } else if (str.equals(m29666G.get(i).m29486C())) {
                break;
            } else {
                i++;
            }
        }
        C3827i4 m29488A = C3843j4.m29488A();
        m29488A.m29530A(str);
        if (obj instanceof Long) {
            m29488A.m29520z(((Long) obj).longValue());
        } else if (obj instanceof String) {
            m29488A.m29529B((String) obj);
        } else if (obj instanceof Double) {
            m29488A.m29521y(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            m29488A.m29527s(m28296H((Bundle[]) obj));
        }
        if (i >= 0) {
            c3765e4.m29672A(i, m29488A);
        } else {
            c3765e4.m29661v(m29488A);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static final boolean m28285n(C4379u c4379u, C4307na c4307na) {
        com.google.android.gms.common.internal.s.j(c4379u);
        com.google.android.gms.common.internal.s.j(c4307na);
        return (TextUtils.isEmpty(c4307na.f10530d) && TextUtils.isEmpty(c4307na.f10523I)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static final C3843j4 m28284o(C3779f4 c3779f4, String str) {
        for (C3843j4 c3843j4 : c3779f4.m29629E()) {
            if (c3843j4.m29486C().equals(str)) {
                return c3843j4;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static final Object m28283p(C3779f4 c3779f4, String str) {
        C3843j4 m28284o = m28284o(c3779f4, str);
        if (m28284o != null) {
            if (m28284o.m29469T()) {
                return m28284o.m29485D();
            }
            if (m28284o.m29471R()) {
                return Long.valueOf(m28284o.m29464z());
            }
            if (m28284o.m29473P()) {
                return Double.valueOf(m28284o.m29467w());
            }
            if (m28284o.m29465y() > 0) {
                List<C3843j4> m29484E = m28284o.m29484E();
                ArrayList arrayList = new ArrayList();
                for (C3843j4 c3843j4 : m29484E) {
                    if (c3843j4 != null) {
                        Bundle bundle = new Bundle();
                        for (C3843j4 c3843j42 : c3843j4.m29484E()) {
                            if (c3843j42.m29469T()) {
                                bundle.putString(c3843j42.m29486C(), c3843j42.m29485D());
                            } else if (c3843j42.m29471R()) {
                                bundle.putLong(c3843j42.m29486C(), c3843j42.m29464z());
                            } else if (c3843j42.m29473P()) {
                                bundle.putDouble(c3843j42.m29486C(), c3843j42.m29467w());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    /* renamed from: q */
    private final void m28282q(StringBuilder sb, int i, List<C3843j4> list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        for (C3843j4 c3843j4 : list) {
            if (c3843j4 != null) {
                m28280s(sb, i2);
                sb.append("param {\n");
                m28277v(sb, i2, "name", c3843j4.m29470S() ? ((v5) this).a.D().m28045e(c3843j4.m29486C()) : null);
                m28277v(sb, i2, "string_value", c3843j4.m29469T() ? c3843j4.m29485D() : null);
                m28277v(sb, i2, "int_value", c3843j4.m29471R() ? Long.valueOf(c3843j4.m29464z()) : null);
                m28277v(sb, i2, "double_value", c3843j4.m29473P() ? Double.valueOf(c3843j4.m29467w()) : null);
                if (c3843j4.m29465y() > 0) {
                    m28282q(sb, i2, c3843j4.m29484E());
                }
                m28280s(sb, i2);
                sb.append("}\n");
            }
        }
    }

    /* renamed from: r */
    private final void m28281r(StringBuilder sb, int i, C3749d3 c3749d3) {
        String str;
        if (c3749d3 == null) {
            return;
        }
        m28280s(sb, i);
        sb.append("filter {\n");
        if (c3749d3.m29693D()) {
            m28277v(sb, i, "complement", Boolean.valueOf(c3749d3.m29694C()));
        }
        if (c3749d3.m29691F()) {
            m28277v(sb, i, "param_name", ((v5) this).a.D().m28045e(c3749d3.m29696A()));
        }
        if (c3749d3.m29690G()) {
            int i2 = i + 1;
            C3905n3 m29686z = c3749d3.m29686z();
            if (m29686z != null) {
                m28280s(sb, i2);
                sb.append("string_filter {\n");
                if (m29686z.m29360E()) {
                    switch (m29686z.m29359F()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    m28277v(sb, i2, "match_type", str);
                }
                if (m29686z.m29361D()) {
                    m28277v(sb, i2, "expression", m29686z.m29355z());
                }
                if (m29686z.m29362C()) {
                    m28277v(sb, i2, "case_sensitive", Boolean.valueOf(m29686z.m29363B()));
                }
                if (m29686z.m29358w() > 0) {
                    m28280s(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str2 : m29686z.m29364A()) {
                        m28280s(sb, i2 + 2);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m28280s(sb, i2);
                sb.append("}\n");
            }
        }
        if (c3749d3.m29692E()) {
            m28276w(sb, i + 1, "number_filter", c3749d3.m29687y());
        }
        m28280s(sb, i);
        sb.append("}\n");
    }

    /* renamed from: s */
    private static final void m28280s(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: t */
    private static final String m28279t(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: u */
    private static final void m28278u(StringBuilder sb, int i, String str, C4032v4 c4032v4) {
        if (c4032v4 == null) {
            return;
        }
        m28280s(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (c4032v4.m28779x() != 0) {
            m28280s(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l : c4032v4.m28793G()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (c4032v4.m28777z() != 0) {
            m28280s(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l2 : c4032v4.m28791I()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (c4032v4.m28780w() != 0) {
            m28280s(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (C3750d4 c3750d4 : c4032v4.m28794F()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(c3750d4.m29682D() ? Integer.valueOf(c3750d4.m29681w()) : null);
                sb.append(":");
                sb.append(c3750d4.m29683C() ? Long.valueOf(c3750d4.m29680x()) : null);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (c4032v4.m28778y() != 0) {
            m28280s(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (C4064x4 c4064x4 : c4032v4.m28792H()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(c4064x4.m28665E() ? Integer.valueOf(c4064x4.m28663x()) : null);
                sb.append(": [");
                int i10 = 0;
                for (Long l3 : c4064x4.m28668B()) {
                    long longValue = l3.longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i10 = i11;
                }
                sb.append("]");
                i8 = i9;
            }
            sb.append("}\n");
        }
        m28280s(sb, 3);
        sb.append("}\n");
    }

    /* renamed from: v */
    private static final void m28277v(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m28280s(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    /* renamed from: w */
    private static final void m28276w(StringBuilder sb, int i, String str, C3810h3 c3810h3) {
        if (c3810h3 == null) {
            return;
        }
        m28280s(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (c3810h3.m29567C()) {
            int m29562H = c3810h3.m29562H();
            m28277v(sb, i, "comparison_type", m29562H != 1 ? m29562H != 2 ? m29562H != 3 ? m29562H != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (c3810h3.m29565E()) {
            m28277v(sb, i, "match_as_float", Boolean.valueOf(c3810h3.m29568B()));
        }
        if (c3810h3.m29566D()) {
            m28277v(sb, i, "comparison_value", c3810h3.m29559y());
        }
        if (c3810h3.m29563G()) {
            m28277v(sb, i, "min_comparison_value", c3810h3.m29569A());
        }
        if (c3810h3.m29564F()) {
            m28277v(sb, i, "max_comparison_value", c3810h3.m29558z());
        }
        m28280s(sb, i);
        sb.append("}\n");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static int m28275x(C3922o4 c3922o4, String str) {
        for (int i = 0; i < c3922o4.m29274m0(); i++) {
            if (str.equals(c3922o4.m29280e0(i).m28568B())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public final <T extends Parcelable> T m28303A(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            ((v5) this).a.b().r().m28014a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public final C4379u m28302B(C3713b c3713b) {
        Object obj;
        Bundle m28273z = m28273z(c3713b.m29834e(), true);
        String obj2 = (!m28273z.containsKey("_o") || (obj = m28273z.get("_o")) == null) ? "app" : obj.toString();
        String m27803b = C4441z5.m27803b(c3713b.m29835d());
        if (m27803b == null) {
            m27803b = c3713b.m29835d();
        }
        return new C4379u(m27803b, new C4355s(m28273z), obj2, c3713b.m29838a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public final C3779f4 m28301C(C4320p c4320p) {
        C3765e4 m29633A = C3779f4.m29633A();
        m29633A.m29670C(c4320p.f10569e);
        C4343r c4343r = new C4343r(c4320p.f10570f);
        while (c4343r.hasNext()) {
            String next = c4343r.next();
            C3827i4 m29488A = C3843j4.m29488A();
            m29488A.m29530A(next);
            Object m27974u = c4320p.f10570f.m27974u(next);
            com.google.android.gms.common.internal.s.j(m27974u);
            m28292L(m29488A, m27974u);
            m29633A.m29661v(m29488A);
        }
        return m29633A.m29456k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public final String m28299E(C3906n4 c3906n4) {
        if (c3906n4 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (C3937p4 c3937p4 : c3906n4.m29350z()) {
            if (c3937p4 != null) {
                m28280s(sb, 1);
                sb.append("bundle {\n");
                if (c3937p4.m29139j1()) {
                    m28277v(sb, 1, "protocol_version", Integer.valueOf(c3937p4.m29124r1()));
                }
                m28277v(sb, 1, "platform", c3937p4.m29202G());
                if (c3937p4.m29147f1()) {
                    m28277v(sb, 1, "gmp_version", Long.valueOf(c3937p4.m29218A1()));
                }
                if (c3937p4.m29128p1()) {
                    m28277v(sb, 1, "uploading_gmp_version", Long.valueOf(c3937p4.m29203F1()));
                }
                if (c3937p4.m29151d1()) {
                    m28277v(sb, 1, "dynamite_version", Long.valueOf(c3937p4.m29107y1()));
                }
                if (c3937p4.m29114w0()) {
                    m28277v(sb, 1, "config_version", Long.valueOf(c3937p4.m29113w1()));
                }
                m28277v(sb, 1, "gmp_app_id", c3937p4.m29211D());
                m28277v(sb, 1, "admob_app_id", c3937p4.m29188K1());
                m28277v(sb, 1, "app_id", c3937p4.m29186L1());
                m28277v(sb, 1, "app_version", c3937p4.m29112x());
                if (c3937p4.m29119u0()) {
                    m28277v(sb, 1, "app_version_major", Integer.valueOf(c3937p4.m29167V()));
                }
                m28277v(sb, 1, "firebase_instance_id", c3937p4.m29217B());
                if (c3937p4.m29153c1()) {
                    m28277v(sb, 1, "dev_cert_hash", Long.valueOf(c3937p4.m29110x1()));
                }
                m28277v(sb, 1, "app_store", c3937p4.m29115w());
                if (c3937p4.m29130o1()) {
                    m28277v(sb, 1, "upload_timestamp_millis", Long.valueOf(c3937p4.m29206E1()));
                }
                if (c3937p4.m29134m1()) {
                    m28277v(sb, 1, "start_timestamp_millis", Long.valueOf(c3937p4.m29209D1()));
                }
                if (c3937p4.m29149e1()) {
                    m28277v(sb, 1, "end_timestamp_millis", Long.valueOf(c3937p4.m29104z1()));
                }
                if (c3937p4.m29141i1()) {
                    m28277v(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c3937p4.m29212C1()));
                }
                if (c3937p4.m29143h1()) {
                    m28277v(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c3937p4.m29215B1()));
                }
                m28277v(sb, 1, "app_instance_id", c3937p4.m29183M1());
                m28277v(sb, 1, "resettable_device_id", c3937p4.m29199H());
                m28277v(sb, 1, "ds_id", c3937p4.m29220A());
                if (c3937p4.m29145g1()) {
                    m28277v(sb, 1, "limited_ad_tracking", Boolean.valueOf(c3937p4.m29125r0()));
                }
                m28277v(sb, 1, "os_version", c3937p4.m29205F());
                m28277v(sb, 1, "device_model", c3937p4.m29106z());
                m28277v(sb, 1, "user_default_language", c3937p4.m29196I());
                if (c3937p4.m29132n1()) {
                    m28277v(sb, 1, "time_zone_offset_minutes", Integer.valueOf(c3937p4.m29120t1()));
                }
                if (c3937p4.m29117v0()) {
                    m28277v(sb, 1, "bundle_sequential_index", Integer.valueOf(c3937p4.m29159Z0()));
                }
                if (c3937p4.m29136l1()) {
                    m28277v(sb, 1, "service_upload", Boolean.valueOf(c3937p4.m29123s0()));
                }
                m28277v(sb, 1, "health_monitor", c3937p4.m29208E());
                if (!((v5) this).a.z().B(null, C4173c3.f10140m0) && c3937p4.m29121t0() && c3937p4.m29116v1() != 0) {
                    m28277v(sb, 1, "android_id", Long.valueOf(c3937p4.m29116v1()));
                }
                if (c3937p4.m29138k1()) {
                    m28277v(sb, 1, IjkMediaPlayer.OnNativeInvokeListener.ARG_RETRY_COUNTER, Integer.valueOf(c3937p4.m29122s1()));
                }
                if (c3937p4.m29111x0()) {
                    m28277v(sb, 1, "consent_signals", c3937p4.m29109y());
                }
                List<C4096z4> m29187L = c3937p4.m29187L();
                if (m29187L != null) {
                    for (C4096z4 c4096z4 : m29187L) {
                        if (c4096z4 != null) {
                            m28280s(sb, 2);
                            sb.append("user_property {\n");
                            m28277v(sb, 2, "set_timestamp_millis", c4096z4.m28556N() ? Long.valueOf(c4096z4.m28551y()) : null);
                            m28277v(sb, 2, "name", ((v5) this).a.D().m28044f(c4096z4.m28568B()));
                            m28277v(sb, 2, "string_value", c4096z4.m28567C());
                            m28277v(sb, 2, "int_value", c4096z4.m28557M() ? Long.valueOf(c4096z4.m28552x()) : null);
                            m28277v(sb, 2, "double_value", c4096z4.m28558L() ? Double.valueOf(c4096z4.m28553w()) : null);
                            m28280s(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C3718b4> m29193J = c3937p4.m29193J();
                if (m29193J != null) {
                    for (C3718b4 c3718b4 : m29193J) {
                        if (c3718b4 != null) {
                            m28280s(sb, 2);
                            sb.append("audience_membership {\n");
                            if (c3718b4.m29806G()) {
                                m28277v(sb, 2, "audience_id", Integer.valueOf(c3718b4.m29803w()));
                            }
                            if (c3718b4.m29805H()) {
                                m28277v(sb, 2, "new_audience", Boolean.valueOf(c3718b4.m29807F()));
                            }
                            m28278u(sb, 2, "current_data", c3718b4.m29800z());
                            if (c3718b4.m29804I()) {
                                m28278u(sb, 2, "previous_data", c3718b4.m29812A());
                            }
                            m28280s(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C3779f4> m29190K = c3937p4.m29190K();
                if (m29190K != null) {
                    for (C3779f4 c3779f4 : m29190K) {
                        if (c3779f4 != null) {
                            m28280s(sb, 2);
                            sb.append("event {\n");
                            m28277v(sb, 2, "name", ((v5) this).a.D().m28046d(c3779f4.m29630D()));
                            if (c3779f4.m29618P()) {
                                m28277v(sb, 2, "timestamp_millis", Long.valueOf(c3779f4.m29613z()));
                            }
                            if (c3779f4.m29619O()) {
                                m28277v(sb, 2, "previous_timestamp_millis", Long.valueOf(c3779f4.m29614y()));
                            }
                            if (c3779f4.m29620N()) {
                                m28277v(sb, 2, "count", Integer.valueOf(c3779f4.m29616w()));
                            }
                            if (c3779f4.m29615x() != 0) {
                                m28282q(sb, 2, c3779f4.m29629E());
                            }
                            m28280s(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m28280s(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public final String m28298F(C3717b3 c3717b3) {
        if (c3717b3 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (c3717b3.m29818K()) {
            m28277v(sb, 0, "filter_id", Integer.valueOf(c3717b3.m29815x()));
        }
        m28277v(sb, 0, "event_name", ((v5) this).a.D().m28046d(c3717b3.m29826C()));
        String m28279t = m28279t(c3717b3.m29822G(), c3717b3.m29821H(), c3717b3.m29820I());
        if (!m28279t.isEmpty()) {
            m28277v(sb, 0, "filter_type", m28279t);
        }
        if (c3717b3.m29819J()) {
            m28276w(sb, 1, "event_count_filter", c3717b3.m29827B());
        }
        if (c3717b3.m29816w() > 0) {
            sb.append("  filters {\n");
            for (C3749d3 c3749d3 : c3717b3.m29825D()) {
                m28281r(sb, 2, c3749d3);
            }
        }
        m28280s(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public final String m28297G(C3842j3 c3842j3) {
        if (c3842j3 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (c3842j3.m29494F()) {
            m28277v(sb, 0, "filter_id", Integer.valueOf(c3842j3.m29492w()));
        }
        m28277v(sb, 0, "property_name", ((v5) this).a.D().m28044f(c3842j3.m29499A()));
        String m28279t = m28279t(c3842j3.m29497C(), c3842j3.m29496D(), c3842j3.m29495E());
        if (!m28279t.isEmpty()) {
            m28277v(sb, 0, "filter_type", m28279t);
        }
        m28281r(sb, 1, c3842j3.m29491x());
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public final List<Long> m28295I(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                ((v5) this).a.b().w().m28013b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    ((v5) this).a.b().w().m28012c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (num.intValue() % 64)) ^ (-1))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
        if ((r3 instanceof android.os.Parcelable[]) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
        r3 = (android.os.Parcelable[]) r3;
        r5 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        if (r7 >= r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
        r4.add(m28293K((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
        if ((r3 instanceof java.util.ArrayList) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
        r3 = (java.util.ArrayList) r3;
        r5 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
        if (r7 >= r5) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
        r4.add(m28293K((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
        if ((r3 instanceof android.os.Bundle) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:
        r4.add(m28293K((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
        r0.put(r2, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x000d A[SYNTHETIC] */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> m28293K(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La6
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            com.google.android.gms.internal.measurement.C4009td.m28898b()
            com.google.android.gms.measurement.internal.b5 r4 = r10.a
            com.google.android.gms.measurement.internal.g r4 = r4.z()
            r5 = 0
            com.google.android.gms.measurement.internal.b3<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C4173c3.f10152s0
            boolean r4 = r4.B(r5, r6)
            if (r4 == 0) goto L3c
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L49
            goto L4f
        L3c:
            boolean r4 = r3 instanceof android.os.Bundle[]
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L49
            goto L4f
        L49:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L4f:
            if (r12 == 0) goto Ld
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r5 = r3 instanceof android.os.Parcelable[]
            r6 = 0
            if (r5 == 0) goto L73
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r5 = r3.length
            r7 = 0
        L5f:
            if (r7 >= r5) goto La1
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.m28293K(r8, r6)
            r4.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5f
        L73:
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 == 0) goto L94
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r5 = r3.size()
            r7 = 0
        L7e:
            if (r7 >= r5) goto La1
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L91
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.m28293K(r8, r6)
            r4.add(r8)
        L91:
            int r7 = r7 + 1
            goto L7e
        L94:
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto La1
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.m28293K(r3, r6)
            r4.add(r3)
        La1:
            r0.put(r2, r4)
            goto Ld
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4192da.m28293K(android.os.Bundle, boolean):java.util.Map");
    }

    /* renamed from: L */
    final void m28292L(C3827i4 c3827i4, Object obj) {
        com.google.android.gms.common.internal.s.j(obj);
        c3827i4.m29522x();
        c3827i4.m29524v();
        c3827i4.m29525u();
        c3827i4.m29523w();
        if (obj instanceof String) {
            c3827i4.m29529B((String) obj);
        } else if (obj instanceof Long) {
            c3827i4.m29520z(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            c3827i4.m29521y(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            c3827i4.m29527s(m28296H((Bundle[]) obj));
        } else {
            ((v5) this).a.b().r().m28013b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public final void m28291M(C4080y4 c4080y4, Object obj) {
        com.google.android.gms.common.internal.s.j(obj);
        c4080y4.m28607t();
        c4080y4.m28608s();
        c4080y4.m28609r();
        if (obj instanceof String) {
            c4080y4.m28602y((String) obj);
        } else if (obj instanceof Long) {
            c4080y4.m28605v(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            c4080y4.m28606u(((Double) obj).doubleValue());
        } else {
            ((v5) this).a.b().r().m28013b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public final boolean m28289O(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(((v5) this).a.c().currentTimeMillis() - j) > j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public final byte[] m28287Q(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            ((v5) this).a.b().r().m28013b("Failed to gzip content", e);
            throw e;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4353r9
    /* renamed from: l */
    protected final boolean mo27835l() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public final long m28274y(byte[] bArr) {
        com.google.android.gms.common.internal.s.j(bArr);
        ((v5) this).a.N().h();
        MessageDigest s = ia.s();
        if (s == null) {
            ((v5) this).a.b().r().m28014a("Failed to get MD5");
            return 0L;
        }
        return ia.q0(s.digest(bArr));
    }

    /* renamed from: z */
    final Bundle m28273z(Map<String, Object> map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                C4009td.m28898b();
                if (((v5) this).a.z().B(null, C4173c3.f10152s0)) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        arrayList2.add(m28273z((Map) arrayList.get(i), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                } else {
                    ArrayList arrayList3 = (ArrayList) obj;
                    ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                    int size2 = arrayList3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        arrayList4.add(m28273z((Map) arrayList3.get(i2), false));
                    }
                    bundle.putParcelableArrayList(str, arrayList4);
                }
            }
        }
        return bundle;
    }
}
