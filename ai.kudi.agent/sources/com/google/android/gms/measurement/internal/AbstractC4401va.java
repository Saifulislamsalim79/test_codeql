package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C3810h3;
import com.google.android.gms.internal.measurement.C3905n3;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.va */
/* loaded from: classes2.dex */
public abstract class AbstractC4401va {

    /* renamed from: a */
    final String f10744a;

    /* renamed from: b */
    final int f10745b;

    /* renamed from: c */
    Boolean f10746c;

    /* renamed from: d */
    Boolean f10747d;

    /* renamed from: e */
    Long f10748e;

    /* renamed from: f */
    Long f10749f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4401va(String str, int i) {
        this.f10744a = str;
        this.f10745b = i;
    }

    /* renamed from: d */
    private static Boolean m27912d(String str, int i, boolean z, String str2, List<String> list, String str3, q3 q3Var) {
        if (i == 7) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (q3Var != null) {
                        q3Var.w().m28013b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    /* renamed from: e */
    static Boolean m27911e(BigDecimal bigDecimal, C3810h3 c3810h3, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        com.google.android.gms.common.internal.s.j(c3810h3);
        if (c3810h3.m29567C()) {
            if (c3810h3.m29562H() != 1) {
                if (c3810h3.m29562H() == 5) {
                    if (!c3810h3.m29563G() || !c3810h3.m29564F()) {
                        return null;
                    }
                } else if (!c3810h3.m29566D()) {
                    return null;
                }
                int m29562H = c3810h3.m29562H();
                if (c3810h3.m29562H() == 5) {
                    if (C4192da.m28288P(c3810h3.m29569A()) && C4192da.m28288P(c3810h3.m29558z())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(c3810h3.m29569A());
                            bigDecimal4 = new BigDecimal(c3810h3.m29558z());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                } else if (!C4192da.m28288P(c3810h3.m29559y())) {
                    return null;
                } else {
                    try {
                        bigDecimal2 = new BigDecimal(c3810h3.m29559y());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (m29562H == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i = m29562H - 1;
                if (i == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                } else if (i == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                } else if (i != 3) {
                    if (i == 4 && bigDecimal3 != null) {
                        return Boolean.valueOf((bigDecimal.compareTo(bigDecimal3) < 0 || bigDecimal.compareTo(bigDecimal4) > 0) ? false : false);
                    }
                    return null;
                } else if (bigDecimal2 == null) {
                    return null;
                } else {
                    if (d != 0.0d) {
                        return Boolean.valueOf((bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) >= 0) ? false : false);
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static Boolean m27910f(String str, C3905n3 c3905n3, q3 q3Var) {
        String m29355z;
        List<String> list;
        com.google.android.gms.common.internal.s.j(c3905n3);
        if (str == null || !c3905n3.m29360E() || c3905n3.m29359F() == 1) {
            return null;
        }
        if (c3905n3.m29359F() == 7) {
            if (c3905n3.m29358w() == 0) {
                return null;
            }
        } else if (!c3905n3.m29361D()) {
            return null;
        }
        int m29359F = c3905n3.m29359F();
        boolean m29363B = c3905n3.m29363B();
        if (!m29363B && m29359F != 2 && m29359F != 7) {
            m29355z = c3905n3.m29355z().toUpperCase(Locale.ENGLISH);
        } else {
            m29355z = c3905n3.m29355z();
        }
        String str2 = m29355z;
        if (c3905n3.m29358w() == 0) {
            list = null;
        } else {
            List<String> m29364A = c3905n3.m29364A();
            if (!m29363B) {
                ArrayList arrayList = new ArrayList(m29364A.size());
                for (String str3 : m29364A) {
                    arrayList.add(str3.toUpperCase(Locale.ENGLISH));
                }
                m29364A = Collections.unmodifiableList(arrayList);
            }
            list = m29364A;
        }
        return m27912d(str, m29359F, m29363B, str2, list, m29359F == 2 ? str2 : null, q3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static Boolean m27909g(double d, C3810h3 c3810h3) {
        try {
            return m27911e(new BigDecimal(d), c3810h3, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static Boolean m27908h(long j, C3810h3 c3810h3) {
        try {
            return m27911e(new BigDecimal(j), c3810h3, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static Boolean m27907i(String str, C3810h3 c3810h3) {
        if (C4192da.m28288P(str)) {
            try {
                return m27911e(new BigDecimal(str), c3810h3, 0.0d);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static Boolean m27906j(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo27847a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo27846b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract boolean mo27845c();
}
