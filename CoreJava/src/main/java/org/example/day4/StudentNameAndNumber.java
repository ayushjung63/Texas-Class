package org.example.day4;

class StudentNameAndNumber{
        private String name;
        private String contactNumber;

        public StudentNameAndNumber(String name, String contactNumber) {
            this.name = name;
            this.contactNumber = contactNumber;
        }
        public StudentNameAndNumber() {}

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
        public String toString() {
            return "StudentNameAndNumber{" +
                    "name='" + name + '\'' +
                    ", contactNumber='" + contactNumber + '\'' +
                    '}';
        }
    }