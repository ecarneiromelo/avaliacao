package com.avalicao.util;

import lombok.Value;

@Value
public class SelectItem<T> {

  T value;

  String label;

}
