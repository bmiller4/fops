ant -buildfile fops.ant &&
cd bin &&
java -cp .:gson-2.2.4.jar tests.GsonTest &&
cd ..
