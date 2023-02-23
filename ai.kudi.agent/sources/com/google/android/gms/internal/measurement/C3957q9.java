package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.q9 */
/* loaded from: classes2.dex */
public final class C3957q9 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m29081a(InterfaceC3927o9 interfaceC3927o9, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m29078d(interfaceC3927o9, sb, 0);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static final void m29080b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                m29080b(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m29080b(sb, i, str, entry);
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
                sb.append(C3881la.m29414a(AbstractC3909n7.m29344I((String) obj)));
                sb.append('\"');
            } else if (obj instanceof AbstractC3909n7) {
                sb.append(": \"");
                sb.append(C3881la.m29414a((AbstractC3909n7) obj));
                sb.append('\"');
            } else if (obj instanceof AbstractC3894m8) {
                sb.append(" {");
                m29078d((AbstractC3894m8) obj, sb, i + 2);
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
                m29080b(sb, i4, "key", entry2.getKey());
                m29080b(sb, i4, "value", entry2.getValue());
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
    private static final String m29079c(String str) {
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
    private static void m29078d(InterfaceC3927o9 interfaceC3927o9, StringBuilder sb, int i) {
        Method[] declaredMethods;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : interfaceC3927o9.getClass().getDeclaredMethods()) {
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
                    m29080b(sb, i, m29079c(concat), AbstractC3894m8.m29391m(method2, interfaceC3927o9, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m29080b(sb, i, m29079c(concat2), AbstractC3894m8.m29391m(method3, interfaceC3927o9, new Object[0]));
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
                    Object m29391m = AbstractC3894m8.m29391m(method4, interfaceC3927o9, new Object[0]);
                    if (method5 == null) {
                        if (m29391m instanceof Boolean) {
                            if (((Boolean) m29391m).booleanValue()) {
                                m29080b(sb, i, m29079c(concat3), m29391m);
                            }
                        } else if (m29391m instanceof Integer) {
                            if (((Integer) m29391m).intValue() != 0) {
                                m29080b(sb, i, m29079c(concat3), m29391m);
                            }
                        } else if (m29391m instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) m29391m).floatValue()) != 0) {
                                m29080b(sb, i, m29079c(concat3), m29391m);
                            }
                        } else if (m29391m instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) m29391m).doubleValue()) != 0) {
                                m29080b(sb, i, m29079c(concat3), m29391m);
                            }
                        } else {
                            if (m29391m instanceof String) {
                                equals = m29391m.equals("");
                            } else if (m29391m instanceof AbstractC3909n7) {
                                equals = m29391m.equals(AbstractC3909n7.f9575d);
                            } else if (m29391m instanceof InterfaceC3927o9) {
                                if (m29391m != ((InterfaceC3927o9) m29391m).mo29102e()) {
                                    m29080b(sb, i, m29079c(concat3), m29391m);
                                }
                            } else {
                                if ((m29391m instanceof Enum) && ((Enum) m29391m).ordinal() == 0) {
                                }
                                m29080b(sb, i, m29079c(concat3), m29391m);
                            }
                            if (!equals) {
                                m29080b(sb, i, m29079c(concat3), m29391m);
                            }
                        }
                    } else if (((Boolean) AbstractC3894m8.m29391m(method5, interfaceC3927o9, new Object[0])).booleanValue()) {
                        m29080b(sb, i, m29079c(concat3), m29391m);
                    }
                }
            }
        }
        if (!(interfaceC3927o9 instanceof AbstractC3863k8)) {
            C3928oa c3928oa = ((AbstractC3894m8) interfaceC3927o9).zzc;
            if (c3928oa != null) {
                c3928oa.m29239g(sb, i);
                return;
            }
            return;
        }
        C3769e8 c3769e8 = ((AbstractC3863k8) interfaceC3927o9).zza;
        throw null;
    }
}
