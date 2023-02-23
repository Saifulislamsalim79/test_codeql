package p577n.p578a.p579a.p581v;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: Escaping.java */
/* renamed from: n.a.a.v.a */
/* loaded from: classes3.dex */
public class C14406a {

    /* renamed from: a */
    private static final Pattern f31783a = Pattern.compile("[\\\\&]");

    /* renamed from: b */
    private static final Pattern f31784b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* renamed from: c */
    private static final char[] f31785c;

    /* renamed from: d */
    private static final Pattern f31786d;

    /* renamed from: e */
    private static final InterfaceC14408b f31787e;

    /* compiled from: Escaping.java */
    /* renamed from: n.a.a.v.a$a */
    /* loaded from: classes3.dex */
    static class C14407a implements InterfaceC14408b {
        C14407a() {
        }

        @Override // p577n.p578a.p579a.p581v.C14406a.InterfaceC14408b
        /* renamed from: a */
        public void mo1830a(String str, StringBuilder sb) {
            if (str.charAt(0) == '\\') {
                sb.append((CharSequence) str, 1, str.length());
            } else {
                sb.append(C14409b.m1829a(str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Escaping.java */
    /* renamed from: n.a.a.v.a$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC14408b {
        /* renamed from: a */
        void mo1830a(String str, StringBuilder sb);
    }

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        f31785c = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        f31786d = Pattern.compile("[ \t\r\n]+");
        f31787e = new C14407a();
    }

    /* renamed from: a */
    public static String m1834a(String str) {
        return f31786d.matcher(str.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
    }

    /* renamed from: b */
    public static String m1833b(String str) {
        return m1834a(str.substring(1, str.length() - 1));
    }

    /* renamed from: c */
    private static String m1832c(Pattern pattern, String str, InterfaceC14408b interfaceC14408b) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            StringBuilder sb = new StringBuilder(str.length() + 16);
            int i = 0;
            do {
                sb.append((CharSequence) str, i, matcher.start());
                interfaceC14408b.mo1830a(matcher.group(), sb);
                i = matcher.end();
            } while (matcher.find());
            if (i != str.length()) {
                sb.append((CharSequence) str, i, str.length());
            }
            return sb.toString();
        }
        return str;
    }

    /* renamed from: d */
    public static String m1831d(String str) {
        return f31783a.matcher(str).find() ? m1832c(f31784b, str, f31787e) : str;
    }
}
