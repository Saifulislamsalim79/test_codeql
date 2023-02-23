package p577n.p578a.p579a.p581v;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: Html5Entities.java */
/* renamed from: n.a.a.v.b */
/* loaded from: classes3.dex */
public class C14409b {

    /* renamed from: a */
    private static final Map<String, String> f31788a = m1828b();

    /* renamed from: b */
    private static final Pattern f31789b = Pattern.compile("^&#[Xx]?");

    /* renamed from: a */
    public static String m1829a(String str) {
        Matcher matcher = f31789b.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(str.substring(matcher.end(), str.length() - 1), matcher.end() == 2 ? 10 : 16);
                return parseInt == 0 ? "�" : new String(Character.toChars(parseInt));
            } catch (IllegalArgumentException unused) {
                return "�";
            }
        }
        String str2 = f31788a.get(str.substring(1, str.length() - 1));
        return str2 != null ? str2 : str;
    }

    /* renamed from: b */
    private static Map<String, String> m1828b() {
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(C14409b.class.getResourceAsStream("/org/commonmark/internal/util/entities.properties"), Charset.forName("UTF-8")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    if (readLine.length() != 0) {
                        int indexOf = readLine.indexOf("=");
                        hashMap.put(readLine.substring(0, indexOf), readLine.substring(indexOf + 1));
                    }
                } else {
                    bufferedReader.close();
                    hashMap.put("NewLine", "\n");
                    return hashMap;
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Failed reading data for HTML named character references", e);
        }
    }
}
