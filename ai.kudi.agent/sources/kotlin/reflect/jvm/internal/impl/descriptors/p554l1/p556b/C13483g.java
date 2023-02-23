package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p483e0.C11754a;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
/* compiled from: ReflectJavaAnnotationOwner.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.g */
/* loaded from: classes3.dex */
public final class C13483g {
    /* renamed from: a */
    public static final C13477c m4871a(Annotation[] annotationArr, C12609c c12609c) {
        Annotation annotation;
        l.f(annotationArr, "<this>");
        l.f(c12609c, "fqName");
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (l.b(C13474b.m4893a(C11754a.m10364b(C11754a.m10365a(annotation))).m7395b(), c12609c)) {
                break;
            }
            i++;
        }
        if (annotation == null) {
            return null;
        }
        return new C13477c(annotation);
    }

    /* renamed from: b */
    public static final List<C13477c> m4870b(Annotation[] annotationArr) {
        l.f(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C13477c(annotation));
        }
        return arrayList;
    }
}
