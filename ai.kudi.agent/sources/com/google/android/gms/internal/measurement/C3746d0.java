package com.google.android.gms.internal.measurement;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.d0 */
/* loaded from: classes2.dex */
public final class C3746d0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static q m29699a(String str, f fVar, C3968r4 c3968r4, List<q> list) {
        String str2;
        char c;
        String str3;
        double min;
        AbstractC3838j abstractC3838j;
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                if (str.equals(str2)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    c = 0;
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    str2 = "toString";
                    c = 2;
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    c = '\n';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c = 17;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c = 3;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c = 6;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c = 19;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c = 7;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c = '\b';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c = 5;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 3452698:
                if (str.equals(MetricTracker.Place.PUSH)) {
                    c = '\t';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c = 15;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c = 16;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    str2 = "toString";
                    c = 1;
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c = '\r';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c = 14;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c = 11;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c = '\f';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c = 4;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            default:
                str2 = "toString";
                c = 65535;
                break;
        }
        double d = 0.0d;
        switch (c) {
            case 0:
                f d2 = fVar.d();
                if (!list.isEmpty()) {
                    for (q qVar : list) {
                        f m29051b = c3968r4.m29051b(qVar);
                        if (!(m29051b instanceof C3806h)) {
                            f fVar2 = d2;
                            int E = fVar2.E();
                            if (m29051b instanceof f) {
                                f fVar3 = m29051b;
                                Iterator J = fVar3.J();
                                while (J.hasNext()) {
                                    Integer num = (Integer) J.next();
                                    fVar2.Z(num.intValue() + E, fVar3.F(num.intValue()));
                                }
                            } else {
                                fVar2.Z(E, m29051b);
                            }
                        } else {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                    }
                }
                return d2;
            case 1:
                C3969r5.m29037h("every", 1, list);
                q m29051b2 = c3968r4.m29051b(list.get(0));
                if (m29051b2 instanceof C3933p) {
                    if (fVar.E() != 0 && m29698b(fVar, c3968r4, (C3933p) m29051b2, Boolean.FALSE, Boolean.TRUE).E() != fVar.E()) {
                        return q.o;
                    }
                    return q.n;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 2:
                C3969r5.m29037h("filter", 1, list);
                q m29051b3 = c3968r4.m29051b(list.get(0));
                if (m29051b3 instanceof C3933p) {
                    if (fVar.u() == 0) {
                        return new f();
                    }
                    f d3 = fVar.d();
                    f m29698b = m29698b(fVar, c3968r4, (C3933p) m29051b3, null, Boolean.TRUE);
                    f fVar4 = new f();
                    Iterator J2 = m29698b.J();
                    while (J2.hasNext()) {
                        fVar4.Z(fVar4.E(), d3.F(((Integer) J2.next()).intValue()));
                    }
                    return fVar4;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 3:
                C3969r5.m29037h("forEach", 1, list);
                q m29051b4 = c3968r4.m29051b(list.get(0));
                if (m29051b4 instanceof C3933p) {
                    if (fVar.u() == 0) {
                        return q.i;
                    }
                    m29698b(fVar, c3968r4, (C3933p) m29051b4, null, null);
                    return q.i;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 4:
                C3969r5.m29035j("indexOf", 2, list);
                q qVar2 = q.i;
                if (!list.isEmpty()) {
                    qVar2 = c3968r4.m29051b(list.get(0));
                }
                if (list.size() > 1) {
                    double m29044a = C3969r5.m29044a(c3968r4.m29051b(list.get(1)).b().doubleValue());
                    if (m29044a >= fVar.E()) {
                        return new C3822i(Double.valueOf(-1.0d));
                    }
                    if (m29044a < 0.0d) {
                        double E2 = fVar.E();
                        Double.isNaN(E2);
                        d = E2 + m29044a;
                    } else {
                        d = m29044a;
                    }
                }
                Iterator J3 = fVar.J();
                while (J3.hasNext()) {
                    int intValue = ((Integer) J3.next()).intValue();
                    double d4 = intValue;
                    if (d4 >= d && C3969r5.m29033l(fVar.F(intValue), qVar2)) {
                        return new C3822i(Double.valueOf(d4));
                    }
                }
                return new C3822i(Double.valueOf(-1.0d));
            case 5:
                C3969r5.m29035j("join", 1, list);
                if (fVar.E() == 0) {
                    return q.p;
                }
                if (list.size() > 0) {
                    q m29051b5 = c3968r4.m29051b(list.get(0));
                    str3 = ((m29051b5 instanceof C3917o) || (m29051b5 instanceof C4027v)) ? "" : m29051b5.h();
                } else {
                    str3 = ",";
                }
                return new C4011u(fVar.I(str3));
            case 6:
                C3969r5.m29035j("lastIndexOf", 2, list);
                q qVar3 = q.i;
                if (!list.isEmpty()) {
                    qVar3 = c3968r4.m29051b(list.get(0));
                }
                double E3 = fVar.E() - 1;
                if (list.size() > 1) {
                    q m29051b6 = c3968r4.m29051b(list.get(1));
                    E3 = Double.isNaN(m29051b6.b().doubleValue()) ? fVar.E() - 1 : C3969r5.m29044a(m29051b6.b().doubleValue());
                    if (E3 < 0.0d) {
                        double E4 = fVar.E();
                        Double.isNaN(E4);
                        E3 += E4;
                    }
                }
                if (E3 < 0.0d) {
                    return new C3822i(Double.valueOf(-1.0d));
                }
                for (int min2 = (int) Math.min(fVar.E(), E3); min2 >= 0; min2--) {
                    if (fVar.b0(min2) && C3969r5.m29033l(fVar.F(min2), qVar3)) {
                        return new C3822i(Double.valueOf(min2));
                    }
                }
                return new C3822i(Double.valueOf(-1.0d));
            case 7:
                C3969r5.m29037h("map", 1, list);
                q m29051b7 = c3968r4.m29051b(list.get(0));
                if (m29051b7 instanceof C3933p) {
                    if (fVar.E() == 0) {
                        return new f();
                    }
                    return m29698b(fVar, c3968r4, (C3933p) m29051b7, null, null);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\b':
                C3969r5.m29037h("pop", 0, list);
                int E5 = fVar.E();
                if (E5 == 0) {
                    return q.i;
                }
                int i = E5 - 1;
                q F = fVar.F(i);
                fVar.X(i);
                return F;
            case '\t':
                if (!list.isEmpty()) {
                    for (q qVar4 : list) {
                        fVar.Z(fVar.E(), c3968r4.m29051b(qVar4));
                    }
                }
                return new C3822i(Double.valueOf(fVar.E()));
            case '\n':
                return m29697c(fVar, c3968r4, list, true);
            case 11:
                return m29697c(fVar, c3968r4, list, false);
            case '\f':
                C3969r5.m29037h("reverse", 0, list);
                int E6 = fVar.E();
                if (E6 != 0) {
                    for (int i2 = 0; i2 < E6 / 2; i2++) {
                        if (fVar.b0(i2)) {
                            q F2 = fVar.F(i2);
                            fVar.Z(i2, (q) null);
                            int i3 = (E6 - 1) - i2;
                            if (fVar.b0(i3)) {
                                fVar.Z(i2, fVar.F(i3));
                            }
                            fVar.Z(i3, F2);
                        }
                    }
                }
                return fVar;
            case '\r':
                C3969r5.m29037h("shift", 0, list);
                if (fVar.E() == 0) {
                    return q.i;
                }
                q F3 = fVar.F(0);
                fVar.X(0);
                return F3;
            case 14:
                C3969r5.m29035j("slice", 2, list);
                if (list.isEmpty()) {
                    return fVar.d();
                }
                double E7 = fVar.E();
                double m29044a2 = C3969r5.m29044a(c3968r4.m29051b(list.get(0)).b().doubleValue());
                if (m29044a2 < 0.0d) {
                    Double.isNaN(E7);
                    min = Math.max(m29044a2 + E7, 0.0d);
                } else {
                    min = Math.min(m29044a2, E7);
                }
                if (list.size() == 2) {
                    double m29044a3 = C3969r5.m29044a(c3968r4.m29051b(list.get(1)).b().doubleValue());
                    if (m29044a3 < 0.0d) {
                        Double.isNaN(E7);
                        E7 = Math.max(E7 + m29044a3, 0.0d);
                    } else {
                        E7 = Math.min(E7, m29044a3);
                    }
                }
                f fVar5 = new f();
                for (int i4 = (int) min; i4 < E7; i4++) {
                    fVar5.Z(fVar5.E(), fVar.F(i4));
                }
                return fVar5;
            case 15:
                C3969r5.m29037h("some", 1, list);
                q m29051b8 = c3968r4.m29051b(list.get(0));
                if (m29051b8 instanceof AbstractC3838j) {
                    if (fVar.E() == 0) {
                        return q.o;
                    }
                    AbstractC3838j abstractC3838j2 = (AbstractC3838j) m29051b8;
                    Iterator J4 = fVar.J();
                    while (J4.hasNext()) {
                        int intValue2 = ((Integer) J4.next()).intValue();
                        if (fVar.b0(intValue2) && abstractC3838j2.mo28520a(c3968r4, Arrays.asList(fVar.F(intValue2), new C3822i(Double.valueOf(intValue2)), fVar)).f().booleanValue()) {
                            return q.n;
                        }
                    }
                    return q.o;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 16:
                C3969r5.m29035j("sort", 1, list);
                if (fVar.E() >= 2) {
                    List<q> O = fVar.O();
                    if (list.isEmpty()) {
                        abstractC3838j = null;
                    } else {
                        q m29051b9 = c3968r4.m29051b(list.get(0));
                        if (m29051b9 instanceof AbstractC3838j) {
                            abstractC3838j = (AbstractC3838j) m29051b9;
                        } else {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                    }
                    Collections.sort(O, new C3730c0(abstractC3838j, c3968r4));
                    fVar.P();
                    int i5 = 0;
                    for (q qVar5 : O) {
                        fVar.Z(i5, qVar5);
                        i5++;
                    }
                }
                return fVar;
            case 17:
                if (list.isEmpty()) {
                    return new f();
                }
                int m29044a4 = (int) C3969r5.m29044a(c3968r4.m29051b(list.get(0)).b().doubleValue());
                if (m29044a4 < 0) {
                    m29044a4 = Math.max(0, m29044a4 + fVar.E());
                } else if (m29044a4 > fVar.E()) {
                    m29044a4 = fVar.E();
                }
                int E8 = fVar.E();
                f fVar6 = new f();
                if (list.size() > 1) {
                    int max = Math.max(0, (int) C3969r5.m29044a(c3968r4.m29051b(list.get(1)).b().doubleValue()));
                    if (max > 0) {
                        for (int i6 = m29044a4; i6 < Math.min(E8, m29044a4 + max); i6++) {
                            fVar6.Z(fVar6.E(), fVar.F(m29044a4));
                            fVar.X(m29044a4);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i7 = 2; i7 < list.size(); i7++) {
                            q m29051b10 = c3968r4.m29051b(list.get(i7));
                            if (!(m29051b10 instanceof C3806h)) {
                                fVar.V((m29044a4 + i7) - 2, m29051b10);
                            } else {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                        }
                    }
                } else {
                    while (m29044a4 < E8) {
                        fVar6.Z(fVar6.E(), fVar.F(m29044a4));
                        fVar.Z(m29044a4, (q) null);
                        m29044a4++;
                    }
                }
                return fVar6;
            case 18:
                C3969r5.m29037h(str2, 0, list);
                return new C4011u(fVar.I(","));
            case 19:
                if (!list.isEmpty()) {
                    f fVar7 = new f();
                    for (q qVar6 : list) {
                        q m29051b11 = c3968r4.m29051b(qVar6);
                        if (!(m29051b11 instanceof C3806h)) {
                            fVar7.Z(fVar7.E(), m29051b11);
                        } else {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                    }
                    int E9 = fVar7.E();
                    Iterator J5 = fVar.J();
                    while (J5.hasNext()) {
                        Integer num2 = (Integer) J5.next();
                        fVar7.Z(num2.intValue() + E9, fVar.F(num2.intValue()));
                    }
                    fVar.P();
                    Iterator J6 = fVar7.J();
                    while (J6.hasNext()) {
                        Integer num3 = (Integer) J6.next();
                        fVar.Z(num3.intValue(), fVar7.F(num3.intValue()));
                    }
                }
                return new C3822i(Double.valueOf(fVar.E()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static f m29698b(f fVar, C3968r4 c3968r4, AbstractC3838j abstractC3838j, Boolean bool, Boolean bool2) {
        f fVar2 = new f();
        Iterator J = fVar.J();
        while (J.hasNext()) {
            int intValue = ((Integer) J.next()).intValue();
            if (fVar.b0(intValue)) {
                q mo28520a = abstractC3838j.mo28520a(c3968r4, Arrays.asList(fVar.F(intValue), new C3822i(Double.valueOf(intValue)), fVar));
                if (mo28520a.f().equals(bool)) {
                    return fVar2;
                }
                if (bool2 == null || mo28520a.f().equals(bool2)) {
                    fVar2.Z(intValue, mo28520a);
                }
            }
        }
        return fVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    private static q m29697c(f fVar, C3968r4 c3968r4, List<q> list, boolean z) {
        q qVar;
        C3969r5.m29036i("reduce", 1, list);
        C3969r5.m29035j("reduce", 2, list);
        q m29051b = c3968r4.m29051b(list.get(0));
        if (m29051b instanceof AbstractC3838j) {
            if (list.size() == 2) {
                qVar = c3968r4.m29051b(list.get(1));
                if (qVar instanceof C3806h) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else if (fVar.E() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            } else {
                qVar = null;
            }
            AbstractC3838j abstractC3838j = (AbstractC3838j) m29051b;
            int E = fVar.E();
            int i = z ? 0 : E - 1;
            int i2 = z ? E - 1 : 0;
            int i3 = true == z ? 1 : -1;
            if (qVar == null) {
                qVar = fVar.F(i);
                i += i3;
            }
            while ((i2 - i) * i3 >= 0) {
                if (fVar.b0(i)) {
                    qVar = abstractC3838j.mo28520a(c3968r4, Arrays.asList(qVar, fVar.F(i), new C3822i(Double.valueOf(i)), fVar));
                    if (qVar instanceof C3806h) {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                    i += i3;
                } else {
                    i += i3;
                }
            }
            return qVar;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }
}
