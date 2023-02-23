package ai.kudi.dip.library.bottomSheets.models;

import ai.kudi.agent.payments.domain.wiki.MPOSPaymentMethod;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
/* compiled from: Field.kt */
@Keep
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bQ\b\u0087\b\u0018\u00002\u00020\u0001Bý\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u001eJ\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\rHÆ\u0003J\t\u0010J\u001a\u00020\rHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0011\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nHÆ\u0003J\t\u0010N\u001a\u00020\rHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\rHÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010,J\u000f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00000\nHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\\\u001a\u00020\rHÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\u0098\u0002\u0010^\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n2\b\b\u0002\u0010\u0016\u001a\u00020\r2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010_J\u0013\u0010`\u001a\u00020\r2\b\u0010a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010b\u001a\u00020\u0003HÖ\u0001J\t\u0010c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0011\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010/\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010/\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001a\u0010\u0016\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010 \"\u0004\b7\u00108R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\"R\u001a\u0010\u0019\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010 \"\u0004\b;\u00108R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b<\u0010 R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b?\u0010>R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\"R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\bA\u0010,R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u00106R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bC\u0010 R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\n¢\u0006\b\n\u0000\u001a\u0004\bD\u00103R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\"R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\"¨\u0006d"}, m10421d2 = {"Lai/kudi/dip/library/bottomSheets/models/Field;", "", "id", "", "name", "", "hint", "type", "parentId", "subFields", "", "value", MPOSPaymentMethod.STATE_REQUIRED, "", "rank", "key", "lookupRequired", "allowMultiSelect", "min", "Ljava/math/BigDecimal;", "max", "documentTypes", "isChecked", "associatedFieldExcelId", "associationCode", "lastField", "associationParentId", "associationRank", "associationChildTitle", "associationChildHint", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;ZILjava/lang/String;ZZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getAllowMultiSelect", "()Z", "getAssociatedFieldExcelId", "()Ljava/lang/String;", "setAssociatedFieldExcelId", "(Ljava/lang/String;)V", "getAssociationChildHint", "setAssociationChildHint", "getAssociationChildTitle", "setAssociationChildTitle", "getAssociationCode", "setAssociationCode", "getAssociationParentId", "()Ljava/lang/Integer;", "setAssociationParentId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getAssociationRank", "setAssociationRank", "getDocumentTypes", "()Ljava/util/List;", "getHint", "getId", "()I", "setChecked", "(Z)V", "getKey", "getLastField", "setLastField", "getLookupRequired", "getMax", "()Ljava/math/BigDecimal;", "getMin", "getName", "getParentId", "getRank", "getRequired", "getSubFields", "getType", "getValue", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;ZILjava/lang/String;ZZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lai/kudi/dip/library/bottomSheets/models/Field;", "equals", "other", "hashCode", "toString", "kudi-dip-library_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class Field {
    private final boolean allowMultiSelect;
    private String associatedFieldExcelId;
    private String associationChildHint;
    private String associationChildTitle;
    private String associationCode;
    private Integer associationParentId;
    private Integer associationRank;
    private final List<String> documentTypes;
    private final String hint;

    /* renamed from: id */
    private final int f2123id;
    private boolean isChecked;
    private final String key;
    private boolean lastField;
    private final boolean lookupRequired;
    private final BigDecimal max;
    private final BigDecimal min;
    private final String name;
    private final Integer parentId;
    private final int rank;
    private final boolean required;
    private final List<Field> subFields;
    private final String type;
    private final String value;

    public Field(int i, String str, String str2, String str3, Integer num, List<Field> list, String str4, boolean z, int i2, String str5, boolean z2, boolean z3, BigDecimal bigDecimal, BigDecimal bigDecimal2, List<String> list2, boolean z4, String str6, String str7, boolean z5, Integer num2, Integer num3, String str8, String str9) {
        l.f(str, "name");
        l.f(str3, "type");
        l.f(list, "subFields");
        l.f(str5, "key");
        this.f2123id = i;
        this.name = str;
        this.hint = str2;
        this.type = str3;
        this.parentId = num;
        this.subFields = list;
        this.value = str4;
        this.required = z;
        this.rank = i2;
        this.key = str5;
        this.lookupRequired = z2;
        this.allowMultiSelect = z3;
        this.min = bigDecimal;
        this.max = bigDecimal2;
        this.documentTypes = list2;
        this.isChecked = z4;
        this.associatedFieldExcelId = str6;
        this.associationCode = str7;
        this.lastField = z5;
        this.associationParentId = num2;
        this.associationRank = num3;
        this.associationChildTitle = str8;
        this.associationChildHint = str9;
    }

    public final int component1() {
        return this.f2123id;
    }

    public final String component10() {
        return this.key;
    }

    public final boolean component11() {
        return this.lookupRequired;
    }

    public final boolean component12() {
        return this.allowMultiSelect;
    }

    public final BigDecimal component13() {
        return this.min;
    }

    public final BigDecimal component14() {
        return this.max;
    }

    public final List<String> component15() {
        return this.documentTypes;
    }

    public final boolean component16() {
        return this.isChecked;
    }

    public final String component17() {
        return this.associatedFieldExcelId;
    }

    public final String component18() {
        return this.associationCode;
    }

    public final boolean component19() {
        return this.lastField;
    }

    public final String component2() {
        return this.name;
    }

    public final Integer component20() {
        return this.associationParentId;
    }

    public final Integer component21() {
        return this.associationRank;
    }

    public final String component22() {
        return this.associationChildTitle;
    }

    public final String component23() {
        return this.associationChildHint;
    }

    public final String component3() {
        return this.hint;
    }

    public final String component4() {
        return this.type;
    }

    public final Integer component5() {
        return this.parentId;
    }

    public final List<Field> component6() {
        return this.subFields;
    }

    public final String component7() {
        return this.value;
    }

    public final boolean component8() {
        return this.required;
    }

    public final int component9() {
        return this.rank;
    }

    public final Field copy(int i, String str, String str2, String str3, Integer num, List<Field> list, String str4, boolean z, int i2, String str5, boolean z2, boolean z3, BigDecimal bigDecimal, BigDecimal bigDecimal2, List<String> list2, boolean z4, String str6, String str7, boolean z5, Integer num2, Integer num3, String str8, String str9) {
        l.f(str, "name");
        l.f(str3, "type");
        l.f(list, "subFields");
        l.f(str5, "key");
        return new Field(i, str, str2, str3, num, list, str4, z, i2, str5, z2, z3, bigDecimal, bigDecimal2, list2, z4, str6, str7, z5, num2, num3, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Field) {
            Field field = (Field) obj;
            return this.f2123id == field.f2123id && l.b(this.name, field.name) && l.b(this.hint, field.hint) && l.b(this.type, field.type) && l.b(this.parentId, field.parentId) && l.b(this.subFields, field.subFields) && l.b(this.value, field.value) && this.required == field.required && this.rank == field.rank && l.b(this.key, field.key) && this.lookupRequired == field.lookupRequired && this.allowMultiSelect == field.allowMultiSelect && l.b(this.min, field.min) && l.b(this.max, field.max) && l.b(this.documentTypes, field.documentTypes) && this.isChecked == field.isChecked && l.b(this.associatedFieldExcelId, field.associatedFieldExcelId) && l.b(this.associationCode, field.associationCode) && this.lastField == field.lastField && l.b(this.associationParentId, field.associationParentId) && l.b(this.associationRank, field.associationRank) && l.b(this.associationChildTitle, field.associationChildTitle) && l.b(this.associationChildHint, field.associationChildHint);
        }
        return false;
    }

    public final boolean getAllowMultiSelect() {
        return this.allowMultiSelect;
    }

    public final String getAssociatedFieldExcelId() {
        return this.associatedFieldExcelId;
    }

    public final String getAssociationChildHint() {
        return this.associationChildHint;
    }

    public final String getAssociationChildTitle() {
        return this.associationChildTitle;
    }

    public final String getAssociationCode() {
        return this.associationCode;
    }

    public final Integer getAssociationParentId() {
        return this.associationParentId;
    }

    public final Integer getAssociationRank() {
        return this.associationRank;
    }

    public final List<String> getDocumentTypes() {
        return this.documentTypes;
    }

    public final String getHint() {
        return this.hint;
    }

    public final int getId() {
        return this.f2123id;
    }

    public final String getKey() {
        return this.key;
    }

    public final boolean getLastField() {
        return this.lastField;
    }

    public final boolean getLookupRequired() {
        return this.lookupRequired;
    }

    public final BigDecimal getMax() {
        return this.max;
    }

    public final BigDecimal getMin() {
        return this.min;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getParentId() {
        return this.parentId;
    }

    public final int getRank() {
        return this.rank;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final List<Field> getSubFields() {
        return this.subFields;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f2123id * 31) + this.name.hashCode()) * 31;
        String str = this.hint;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.type.hashCode()) * 31;
        Integer num = this.parentId;
        int hashCode3 = (((hashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.subFields.hashCode()) * 31;
        String str2 = this.value;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.required;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode5 = (((((hashCode4 + i) * 31) + this.rank) * 31) + this.key.hashCode()) * 31;
        boolean z2 = this.lookupRequired;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode5 + i2) * 31;
        boolean z3 = this.allowMultiSelect;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        BigDecimal bigDecimal = this.min;
        int hashCode6 = (i5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.max;
        int hashCode7 = (hashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        List<String> list = this.documentTypes;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        boolean z4 = this.isChecked;
        int i6 = z4;
        if (z4 != 0) {
            i6 = 1;
        }
        int i7 = (hashCode8 + i6) * 31;
        String str3 = this.associatedFieldExcelId;
        int hashCode9 = (i7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.associationCode;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z5 = this.lastField;
        int i8 = (hashCode10 + (z5 ? 1 : z5 ? 1 : 0)) * 31;
        Integer num2 = this.associationParentId;
        int hashCode11 = (i8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.associationRank;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str5 = this.associationChildTitle;
        int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.associationChildHint;
        return hashCode13 + (str6 != null ? str6.hashCode() : 0);
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final void setAssociatedFieldExcelId(String str) {
        this.associatedFieldExcelId = str;
    }

    public final void setAssociationChildHint(String str) {
        this.associationChildHint = str;
    }

    public final void setAssociationChildTitle(String str) {
        this.associationChildTitle = str;
    }

    public final void setAssociationCode(String str) {
        this.associationCode = str;
    }

    public final void setAssociationParentId(Integer num) {
        this.associationParentId = num;
    }

    public final void setAssociationRank(Integer num) {
        this.associationRank = num;
    }

    public final void setChecked(boolean z) {
        this.isChecked = z;
    }

    public final void setLastField(boolean z) {
        this.lastField = z;
    }

    public String toString() {
        return "Field(id=" + this.f2123id + ", name=" + this.name + ", hint=" + ((Object) this.hint) + ", type=" + this.type + ", parentId=" + this.parentId + ", subFields=" + this.subFields + ", value=" + ((Object) this.value) + ", required=" + this.required + ", rank=" + this.rank + ", key=" + this.key + ", lookupRequired=" + this.lookupRequired + ", allowMultiSelect=" + this.allowMultiSelect + ", min=" + this.min + ", max=" + this.max + ", documentTypes=" + this.documentTypes + ", isChecked=" + this.isChecked + ", associatedFieldExcelId=" + ((Object) this.associatedFieldExcelId) + ", associationCode=" + ((Object) this.associationCode) + ", lastField=" + this.lastField + ", associationParentId=" + this.associationParentId + ", associationRank=" + this.associationRank + ", associationChildTitle=" + ((Object) this.associationChildTitle) + ", associationChildHint=" + ((Object) this.associationChildHint) + ')';
    }

    public /* synthetic */ Field(int i, String str, String str2, String str3, Integer num, List list, String str4, boolean z, int i2, String str5, boolean z2, boolean z3, BigDecimal bigDecimal, BigDecimal bigDecimal2, List list2, boolean z4, String str6, String str7, boolean z5, Integer num2, Integer num3, String str8, String str9, int i3, g gVar) {
        this(i, str, (i3 & 4) != 0 ? null : str2, str3, (i3 & 16) != 0 ? null : num, list, (i3 & 64) != 0 ? null : str4, z, i2, str5, z2, z3, (i3 & 4096) != 0 ? null : bigDecimal, (i3 & 8192) != 0 ? null : bigDecimal2, (i3 & 16384) != 0 ? null : list2, (32768 & i3) != 0 ? false : z4, (65536 & i3) != 0 ? null : str6, (131072 & i3) != 0 ? null : str7, (262144 & i3) != 0 ? false : z5, (524288 & i3) != 0 ? null : num2, (1048576 & i3) != 0 ? null : num3, (2097152 & i3) != 0 ? null : str8, (i3 & 4194304) != 0 ? null : str9);
    }
}
