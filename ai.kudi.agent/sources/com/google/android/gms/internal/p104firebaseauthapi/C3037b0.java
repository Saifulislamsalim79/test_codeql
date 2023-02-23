package com.google.android.gms.internal.p104firebaseauthapi;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.b0 */
/* loaded from: classes2.dex */
public final class C3037b0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m31413a(InterfaceC3644y interfaceC3644y, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m31410d(interfaceC3644y, sb, 0);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static final void m31412b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                m31412b(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m31412b(sb, i, str, entry);
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
                sb.append(C3619x0.m30068a(AbstractC3223ho.m31020P((String) obj)));
                sb.append('\"');
            } else if (obj instanceof AbstractC3223ho) {
                sb.append(": \"");
                sb.append(C3619x0.m30068a((AbstractC3223ho) obj));
                sb.append('\"');
            } else if (obj instanceof AbstractC3251ip) {
                sb.append(" {");
                m31410d((AbstractC3251ip) obj, sb, i + 2);
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
                m31412b(sb, i4, "key", entry2.getKey());
                m31412b(sb, i4, "value", entry2.getValue());
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

    /* renamed from: c */
    private static final String m31411c(String str) {
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

    /* renamed from: d */
    private static void m31410d(InterfaceC3644y interfaceC3644y, StringBuilder sb, int i) {
        Method[] declaredMethods;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : interfaceC3644y.getClass().getDeclaredMethods()) {
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
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m31412b(sb, i, m31411c(concat), AbstractC3251ip.m30953e(method2, interfaceC3644y, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m31412b(sb, i, m31411c(concat2), AbstractC3251ip.m30953e(method3, interfaceC3644y, new Object[0]));
                }
            }
            String valueOf5 = String.valueOf(substring);
            if (((Method) hashMap2.get(valueOf5.length() != 0 ? "set".concat(valueOf5) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf6 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf6.length() != 0 ? "get".concat(valueOf6) : new String("get"))) {
                    }
                }
                String valueOf7 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf8 = String.valueOf(substring.substring(1));
                String concat3 = valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new String(valueOf7);
                String valueOf9 = String.valueOf(substring);
                Method method4 = (Method) hashMap.get(valueOf9.length() != 0 ? "get".concat(valueOf9) : new String("get"));
                String valueOf10 = String.valueOf(substring);
                Method method5 = (Method) hashMap.get(valueOf10.length() != 0 ? "has".concat(valueOf10) : new String("has"));
                if (method4 != null) {
                    Object m30953e = AbstractC3251ip.m30953e(method4, interfaceC3644y, new Object[0]);
                    if (method5 == null) {
                        if (m30953e instanceof Boolean) {
                            if (((Boolean) m30953e).booleanValue()) {
                                m31412b(sb, i, m31411c(concat3), m30953e);
                            }
                        } else if (m30953e instanceof Integer) {
                            if (((Integer) m30953e).intValue() != 0) {
                                m31412b(sb, i, m31411c(concat3), m30953e);
                            }
                        } else if (m30953e instanceof Float) {
                            if (((Float) m30953e).floatValue() != 0.0f) {
                                m31412b(sb, i, m31411c(concat3), m30953e);
                            }
                        } else if (m30953e instanceof Double) {
                            if (((Double) m30953e).doubleValue() != 0.0d) {
                                m31412b(sb, i, m31411c(concat3), m30953e);
                            }
                        } else {
                            if (m30953e instanceof String) {
                                equals = m30953e.equals("");
                            } else if (m30953e instanceof AbstractC3223ho) {
                                equals = m30953e.equals(AbstractC3223ho.f8571d);
                            } else if (m30953e instanceof InterfaceC3644y) {
                                if (m30953e != ((InterfaceC3644y) m30953e).mo30944u()) {
                                    m31412b(sb, i, m31411c(concat3), m30953e);
                                }
                            } else {
                                if ((m30953e instanceof Enum) && ((Enum) m30953e).ordinal() == 0) {
                                }
                                m31412b(sb, i, m31411c(concat3), m30953e);
                            }
                            if (!equals) {
                                m31412b(sb, i, m31411c(concat3), m30953e);
                            }
                        }
                    } else if (((Boolean) AbstractC3251ip.m30953e(method5, interfaceC3644y, new Object[0])).booleanValue()) {
                        m31412b(sb, i, m31411c(concat3), m30953e);
                    }
                }
            }
        }
        if (!(interfaceC3644y instanceof AbstractC3197gp)) {
            C3011a1 c3011a1 = ((AbstractC3251ip) interfaceC3644y).zzc;
            if (c3011a1 != null) {
                c3011a1.m31458g(sb, i);
                return;
            }
            return;
        }
        C3062bp c3062bp = ((AbstractC3197gp) interfaceC3644y).zzb;
        throw null;
    }
}
