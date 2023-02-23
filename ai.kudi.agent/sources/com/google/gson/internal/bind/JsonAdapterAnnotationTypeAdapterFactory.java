package com.google.gson.internal.bind;

import com.google.gson.AbstractC6909s;
import com.google.gson.C6784f;
import com.google.gson.InterfaceC6899k;
import com.google.gson.InterfaceC6905q;
import com.google.gson.InterfaceC6915t;
import com.google.gson.internal.C6858c;
import com.google.gson.p184v.C6916a;
/* loaded from: classes2.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements InterfaceC6915t {

    /* renamed from: c */
    private final C6858c f16376c;

    public JsonAdapterAnnotationTypeAdapterFactory(C6858c c6858c) {
        this.f16376c = c6858c;
    }

    @Override // com.google.gson.InterfaceC6915t
    /* renamed from: a */
    public <T> AbstractC6909s<T> mo20463a(C6784f c6784f, C6916a<T> c6916a) {
        com.google.gson.u.b bVar = (com.google.gson.u.b) c6916a.getRawType().getAnnotation(com.google.gson.u.b.class);
        if (bVar == null) {
            return null;
        }
        return (AbstractC6909s<T>) m20689b(this.f16376c, c6784f, c6916a, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public AbstractC6909s<?> m20689b(C6858c c6858c, C6784f c6784f, C6916a<?> c6916a, com.google.gson.u.b bVar) {
        AbstractC6909s<?> treeTypeAdapter;
        Object mo20568a = c6858c.m20593a(C6916a.get(bVar.value())).mo20568a();
        if (mo20568a instanceof AbstractC6909s) {
            treeTypeAdapter = (AbstractC6909s) mo20568a;
        } else if (mo20568a instanceof InterfaceC6915t) {
            treeTypeAdapter = ((InterfaceC6915t) mo20568a).mo20463a(c6784f, c6916a);
        } else {
            boolean z = mo20568a instanceof InterfaceC6905q;
            if (!z && !(mo20568a instanceof InterfaceC6899k)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + mo20568a.getClass().getName() + " as a @JsonAdapter for " + c6916a.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            treeTypeAdapter = new TreeTypeAdapter<>(z ? (InterfaceC6905q) mo20568a : null, mo20568a instanceof InterfaceC6899k ? (InterfaceC6899k) mo20568a : null, c6784f, c6916a, null);
        }
        return (treeTypeAdapter == null || !bVar.nullSafe()) ? treeTypeAdapter : treeTypeAdapter.m20530a();
    }
}
