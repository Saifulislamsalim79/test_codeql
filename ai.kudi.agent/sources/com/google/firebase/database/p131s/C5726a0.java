package com.google.firebase.database.p131s;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.p139u.C5921b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ValidationPath.java */
/* renamed from: com.google.firebase.database.s.a0 */
/* loaded from: classes2.dex */
public class C5726a0 {

    /* renamed from: a */
    private final List<String> f14100a = new ArrayList();

    /* renamed from: b */
    private int f14101b;

    private C5726a0(C5830l c5830l) throws DatabaseException {
        this.f14101b = 0;
        Iterator<C5921b> it = c5830l.iterator();
        while (it.hasNext()) {
            this.f14100a.add(it.next().m23298b());
        }
        this.f14101b = Math.max(1, this.f14100a.size());
        for (int i = 0; i < this.f14100a.size(); i++) {
            this.f14101b += m23999f(this.f14100a.get(i));
        }
        m24004a();
    }

    /* renamed from: a */
    private void m24004a() throws DatabaseException {
        if (this.f14101b <= 768) {
            if (this.f14100a.size() <= 32) {
                return;
            }
            throw new DatabaseException("Path specified exceeds the maximum depth that can be written (32) or object contains a cycle " + m24000e());
        }
        throw new DatabaseException("Data has a key path longer than 768 bytes (" + this.f14101b + ").");
    }

    /* renamed from: b */
    private static String m24003b(String str, List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append(str);
            }
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    /* renamed from: c */
    private String m24002c() {
        List<String> list;
        String remove = this.f14100a.remove(list.size() - 1);
        this.f14101b -= m23999f(remove);
        if (this.f14100a.size() > 0) {
            this.f14101b--;
        }
        return remove;
    }

    /* renamed from: d */
    private void m24001d(String str) throws DatabaseException {
        if (this.f14100a.size() > 0) {
            this.f14101b++;
        }
        this.f14100a.add(str);
        this.f14101b += m23999f(str);
        m24004a();
    }

    /* renamed from: e */
    private String m24000e() {
        if (this.f14100a.size() == 0) {
            return "";
        }
        return "in path '" + m24003b("/", this.f14100a) + "'";
    }

    /* renamed from: f */
    private static int m23999f(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt <= 127) {
                i2++;
            } else if (charAt <= 2047) {
                i2 += 2;
            } else if (Character.isHighSurrogate(charAt)) {
                i2 += 4;
                i++;
            } else {
                i2 += 3;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: g */
    public static void m23998g(C5830l c5830l, Object obj) throws DatabaseException {
        new C5726a0(c5830l).m23997h(obj);
    }

    /* renamed from: h */
    private void m23997h(Object obj) throws DatabaseException {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            for (String str : map.keySet()) {
                if (!str.startsWith(".")) {
                    m24001d(str);
                    m23997h(map.get(str));
                    m24002c();
                }
            }
        } else if (obj instanceof List) {
            List list = (List) obj;
            for (int i = 0; i < list.size(); i++) {
                m24001d(Integer.toString(i));
                m23997h(list.get(i));
                m24002c();
            }
        }
    }
}
