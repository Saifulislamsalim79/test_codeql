package com.google.firebase.database.p131s.p134i0;

import com.google.firebase.database.p139u.C5921b;
import java.util.HashMap;
import java.util.Map;
/* compiled from: TreeNode.java */
/* renamed from: com.google.firebase.database.s.i0.l */
/* loaded from: classes2.dex */
public class C5794l<T> {

    /* renamed from: a */
    public Map<C5921b, C5794l<T>> f14228a = new HashMap();

    /* renamed from: b */
    public T f14229b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m23751a(String str) {
        String str2 = str + "<value>: " + this.f14229b + "\n";
        if (this.f14228a.isEmpty()) {
            return str2 + str + "<empty>";
        }
        for (Map.Entry<C5921b, C5794l<T>> entry : this.f14228a.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            sb.append(entry.getKey());
            sb.append(":\n");
            sb.append(entry.getValue().m23751a(str + "\t"));
            sb.append("\n");
            str2 = sb.toString();
        }
        return str2;
    }
}
