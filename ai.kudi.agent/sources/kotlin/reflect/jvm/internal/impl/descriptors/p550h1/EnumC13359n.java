package kotlin.reflect.jvm.internal.impl.descriptors.p550h1;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.C13664u;
import kotlin.e0.d.g;
import kotlin.p557z.C13715n;
import kotlin.p557z.C13727r0;
import kotlin.p557z.C13742z;
/* compiled from: KotlinTarget.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.h1.n */
/* loaded from: classes3.dex */
public enum EnumC13359n {
    CLASS("class", false, 2, null),
    ANNOTATION_CLASS("annotation class", false, 2, null),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2, null),
    FIELD("field", false, 2, null),
    LOCAL_VARIABLE("local variable", false, 2, null),
    VALUE_PARAMETER("value parameter", false, 2, null),
    CONSTRUCTOR("constructor", false, 2, null),
    FUNCTION("function", false, 2, null),
    PROPERTY_GETTER("getter", false, 2, null),
    PROPERTY_SETTER("setter", false, 2, null),
    TYPE("type usage", false),
    EXPRESSION("expression", false),
    FILE("file", false),
    TYPEALIAS("typealias", false),
    TYPE_PROJECTION("type projection", false),
    STAR_PROJECTION("star projection", false),
    PROPERTY_PARAMETER("property constructor parameter", false),
    CLASS_ONLY("class", false),
    OBJECT("object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false),
    LOCAL_FUNCTION("local function", false),
    MEMBER_FUNCTION("member function", false),
    TOP_LEVEL_FUNCTION("top level function", false),
    MEMBER_PROPERTY("member property", false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    TOP_LEVEL_PROPERTY("top level property", false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    INITIALIZER("initializer", false),
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    LAMBDA_EXPRESSION("lambda expression", false),
    ANONYMOUS_FUNCTION("anonymous function", false),
    OBJECT_LITERAL("object literal", false);
    

    /* renamed from: d */
    private static final HashMap<String, EnumC13359n> f29564d;

    /* renamed from: c */
    private final boolean f29578c;

    static {
        EnumC13359n enumC13359n = FIELD;
        EnumC13359n enumC13359n2 = VALUE_PARAMETER;
        f29564d = new HashMap<>();
        EnumC13359n[] values = values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            EnumC13359n enumC13359n3 = values[i];
            i++;
            f29564d.put(enumC13359n3.name(), enumC13359n3);
        }
        EnumC13359n[] values2 = values();
        ArrayList arrayList = new ArrayList();
        for (EnumC13359n enumC13359n4 : values2) {
            if (enumC13359n4.m5299b()) {
                arrayList.add(enumC13359n4);
            }
        }
        C13742z.m3821F0(arrayList);
        C13715n.m4012m0(values());
        C13727r0.m3878n(C13664u.m4227a(EnumC13343e.CONSTRUCTOR_PARAMETER, enumC13359n2), C13664u.m4227a(EnumC13343e.FIELD, enumC13359n), C13664u.m4227a(EnumC13343e.PROPERTY, PROPERTY), C13664u.m4227a(EnumC13343e.FILE, FILE), C13664u.m4227a(EnumC13343e.PROPERTY_GETTER, PROPERTY_GETTER), C13664u.m4227a(EnumC13343e.PROPERTY_SETTER, PROPERTY_SETTER), C13664u.m4227a(EnumC13343e.RECEIVER, enumC13359n2), C13664u.m4227a(EnumC13343e.SETTER_PARAMETER, enumC13359n2), C13664u.m4227a(EnumC13343e.PROPERTY_DELEGATE_FIELD, enumC13359n));
    }

    EnumC13359n(String str, boolean z) {
        this.f29578c = z;
    }

    /* renamed from: b */
    public final boolean m5299b() {
        return this.f29578c;
    }

    /* synthetic */ EnumC13359n(String str, boolean z, int i, g gVar) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
