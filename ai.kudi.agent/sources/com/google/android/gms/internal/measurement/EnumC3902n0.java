package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.n0 */
/* loaded from: classes2.dex */
public enum EnumC3902n0 {
    ADD(0),
    AND(1),
    APPLY(2),
    ASSIGN(3),
    BITWISE_AND(56),
    BITWISE_LEFT_SHIFT(57),
    BITWISE_NOT(58),
    BITWISE_OR(59),
    BITWISE_RIGHT_SHIFT(60),
    BITWISE_UNSIGNED_RIGHT_SHIFT(61),
    BITWISE_XOR(62),
    BLOCK(53),
    BREAK(4),
    CASE(5),
    CONST(52),
    CONTINUE(6),
    CONTROL(49),
    CREATE_ARRAY(7),
    CREATE_OBJECT(8),
    DEFAULT(9),
    DEFINE_FUNCTION(50),
    DIVIDE(10),
    DO(11),
    EQUALS(12),
    EXPRESSION_LIST(13),
    FN(51),
    FOR_IN(47),
    FOR_IN_CONST(54),
    FOR_IN_LET(55),
    FOR_LET(63),
    FOR_OF(64),
    FOR_OF_CONST(65),
    FOR_OF_LET(66),
    GET(15),
    GET_CONTAINER_VARIABLE(48),
    GET_INDEX(16),
    GET_PROPERTY(17),
    GREATER_THAN(18),
    GREATER_THAN_EQUALS(19),
    IDENTITY_EQUALS(20),
    IDENTITY_NOT_EQUALS(21),
    IF(22),
    LESS_THAN(23),
    LESS_THAN_EQUALS(24),
    MODULUS(25),
    MULTIPLY(26),
    NEGATE(27),
    NOT(28),
    NOT_EQUALS(29),
    NULL(45),
    OR(30),
    PLUS_EQUALS(31),
    POST_DECREMENT(32),
    POST_INCREMENT(33),
    QUOTE(46),
    PRE_DECREMENT(34),
    PRE_INCREMENT(35),
    RETURN(36),
    SET_PROPERTY(43),
    SUBTRACT(37),
    SWITCH(38),
    TERNARY(39),
    TYPEOF(40),
    UNDEFINED(44),
    VAR(41),
    WHILE(42);
    

    /* renamed from: H0 */
    private static final Map<Integer, EnumC3902n0> f9515H0 = new HashMap();

    /* renamed from: c */
    private final int f9568c;

    static {
        EnumC3902n0[] values;
        for (EnumC3902n0 enumC3902n0 : values()) {
            f9515H0.put(Integer.valueOf(enumC3902n0.f9568c), enumC3902n0);
        }
    }

    EnumC3902n0(int i) {
        this.f9568c = i;
    }

    /* renamed from: a */
    public static EnumC3902n0 m29366a(int i) {
        return f9515H0.get(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final Integer m29365b() {
        return Integer.valueOf(this.f9568c);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.valueOf(this.f9568c).toString();
    }
}
