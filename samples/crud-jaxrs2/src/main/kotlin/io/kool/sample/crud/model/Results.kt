package io.kool.sample.crud

import java.util.ArrayList
import java.util.List
import javax.ws.rs.Produces

Produces("application/json")
public open class Results<T>(val list: List<T>) {
}
