package com.google.protobuf;

import com.google.protobuf.AbstractC7141y;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MessageLiteToString.java */
/* renamed from: com.google.protobuf.t0 */
/* loaded from: classes2.dex */
public final class C7117t0 {
    /* renamed from: a */
    private static final String m19569a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m19568b(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        } else if (obj instanceof Float) {
            return ((Float) obj).floatValue() == 0.0f;
        } else if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d;
        } else if (obj instanceof String) {
            return obj.equals("");
        } else {
            if (obj instanceof AbstractC7039i) {
                return obj.equals(AbstractC7039i.f16815d);
            }
            return obj instanceof InterfaceC7100r0 ? obj == ((InterfaceC7100r0) obj).mo19354a() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static final void m19567c(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                m19567c(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m19567c(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(C7080m1.m19807c((String) obj));
                sb.append('\"');
            } else if (obj instanceof AbstractC7039i) {
                sb.append(": \"");
                sb.append(C7080m1.m19809a((AbstractC7039i) obj));
                sb.append('\"');
            } else if (obj instanceof AbstractC7141y) {
                sb.append(" {");
                m19566d((AbstractC7141y) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                m19567c(sb, i4, "key", entry2.getKey());
                m19567c(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    /* renamed from: d */
    private static void m19566d(InterfaceC7100r0 interfaceC7100r0, StringBuilder sb, int i) {
        Method[] declaredMethods;
        Map.Entry<AbstractC7141y.C7145d, Object> next;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : interfaceC7100r0.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            boolean z = true;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String str2 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m19567c(sb, i, m19569a(str2), AbstractC7141y.m19389G(method2, interfaceC7100r0, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String str3 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m19567c(sb, i, m19569a(str3), AbstractC7141y.m19389G(method3, interfaceC7100r0, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + substring)) != null) {
                if (substring.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                String str4 = substring.substring(0, 1).toLowerCase() + substring.substring(1);
                Method method4 = (Method) hashMap.get("get" + substring);
                Method method5 = (Method) hashMap.get("has" + substring);
                if (method4 != null) {
                    Object m19389G = AbstractC7141y.m19389G(method4, interfaceC7100r0, new Object[0]);
                    if (method5 == null) {
                        if (m19568b(m19389G)) {
                            z = false;
                        }
                    } else {
                        z = ((Boolean) AbstractC7141y.m19389G(method5, interfaceC7100r0, new Object[0])).booleanValue();
                    }
                    if (z) {
                        m19567c(sb, i, m19569a(str4), m19389G);
                    }
                }
            }
        }
        if (interfaceC7100r0 instanceof AbstractC7141y.AbstractC7144c) {
            Iterator<Map.Entry<AbstractC7141y.C7145d, Object>> m19542r = ((AbstractC7141y.AbstractC7144c) interfaceC7100r0).extensions.m19542r();
            while (m19542r.hasNext()) {
                m19567c(sb, i, "[" + next.getKey().mo19348d() + "]", m19542r.next().getValue());
            }
        }
        C7088o1 c7088o1 = ((AbstractC7141y) interfaceC7100r0).unknownFields;
        if (c7088o1 != null) {
            c7088o1.m19776l(sb, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static String m19565e(InterfaceC7100r0 interfaceC7100r0, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m19566d(interfaceC7100r0, sb, 0);
        return sb.toString();
    }
}
