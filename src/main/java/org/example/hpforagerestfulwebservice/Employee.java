package org.example.hpforagerestfulwebservice;

public record Employee(
        String employee_id,
        String first_name,
        String last_name,
        String email,
        String title
) {
}
