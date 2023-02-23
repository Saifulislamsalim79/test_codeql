package p577n.p587c.p589e;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p577n.p587c.InterfaceC14458a;
import p577n.p587c.InterfaceC14459b;
/* compiled from: AndroidLoggerFactory.java */
/* renamed from: n.c.e.b */
/* loaded from: classes3.dex */
class C14471b implements InterfaceC14458a {

    /* renamed from: a */
    private final ConcurrentMap<String, InterfaceC14459b> f31838a = new ConcurrentHashMap();

    /* renamed from: b */
    private static String m1632b(String str) {
        int length = str.length();
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            int i = lastIndexOf + 1;
            if (length - i <= 23) {
                return str.substring(i);
            }
        }
        return '*' + str.substring((length - 23) + 1);
    }

    /* renamed from: c */
    static String m1631c(String str) {
        if (str == null) {
            return "null";
        }
        int length = str.length();
        if (length <= 23) {
            return str;
        }
        StringBuilder sb = new StringBuilder(26);
        int i = 0;
        int i2 = 0;
        do {
            int indexOf = str.indexOf(46, i);
            if (indexOf == -1) {
                int i3 = length - i;
                if (i2 != 0 && i2 + i3 <= 23) {
                    sb.append((CharSequence) str, i, length);
                    return sb.toString();
                }
                return m1632b(str);
            }
            sb.append(str.charAt(i));
            if (indexOf - i > 1) {
                sb.append('*');
            }
            sb.append('.');
            i = indexOf + 1;
            i2 = sb.length();
        } while (i2 <= 23);
        return m1632b(str);
    }

    @Override // p577n.p587c.InterfaceC14458a
    /* renamed from: a */
    public InterfaceC14459b mo1633a(String str) {
        String m1631c = m1631c(str);
        InterfaceC14459b interfaceC14459b = this.f31838a.get(m1631c);
        if (interfaceC14459b == null) {
            C14470a c14470a = new C14470a(m1631c);
            InterfaceC14459b putIfAbsent = this.f31838a.putIfAbsent(m1631c, c14470a);
            return putIfAbsent == null ? c14470a : putIfAbsent;
        }
        return interfaceC14459b;
    }
}
